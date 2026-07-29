package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzaz implements ServiceConnection {
    final /* synthetic */ zzax zzwk;
    private volatile zzci zzwl;
    private volatile boolean zzwm;

    protected zzaz(zzax zzaxVar) {
        this.zzwk = zzaxVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzaz zzazVar;
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            try {
                if (iBinder == null) {
                    this.zzwk.zzu("Service connected with null binder");
                    return;
                }
                zzci zzciVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                            zzciVar = queryLocalInterface instanceof zzci ? (zzci) queryLocalInterface : new zzcj(iBinder);
                        }
                        this.zzwk.zzq("Bound to IAnalyticsService interface");
                    } else {
                        this.zzwk.zze("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException unused) {
                    this.zzwk.zzu("Service connect failed to get IAnalyticsService");
                }
                if (zzciVar == null) {
                    try {
                        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                        Context context = this.zzwk.getContext();
                        zzazVar = this.zzwk.zzwg;
                        connectionTracker.unbindService(context, zzazVar);
                    } catch (IllegalArgumentException unused2) {
                    }
                } else if (this.zzwm) {
                    this.zzwl = zzciVar;
                } else {
                    this.zzwk.zzt("onServiceConnected received after the timeout limit");
                    this.zzwk.zzbw().zza(new zzba(this, zzciVar));
                }
            } finally {
                notifyAll();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
        this.zzwk.zzbw().zza(new zzbb(this, componentName));
    }

    public final zzci zzcw() {
        zzaz zzazVar;
        zzk.zzab();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context context = this.zzwk.getContext();
        intent.putExtra(Constants.KEY_APP_PACKAGE_NAME, context.getPackageName());
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            this.zzwl = null;
            this.zzwm = true;
            zzazVar = this.zzwk.zzwg;
            boolean bindService = connectionTracker.bindService(context, intent, zzazVar, GmsClientSupervisor.DEFAULT_BIND_FLAGS);
            this.zzwk.zza("Bind to service requested", Boolean.valueOf(bindService));
            if (!bindService) {
                this.zzwm = false;
                return null;
            }
            try {
                wait(zzcc.zzzq.get().longValue());
            } catch (InterruptedException unused) {
                this.zzwk.zzt("Wait for service connect was interrupted");
            }
            this.zzwm = false;
            zzci zzciVar = this.zzwl;
            this.zzwl = null;
            if (zzciVar == null) {
                this.zzwk.zzu("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzciVar;
        }
    }
}
