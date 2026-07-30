package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzjx implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzjy zza;
    private volatile boolean zzb;
    private volatile zzeq zzc;

    protected zzjx(zzjy zzjyVar) {
        this.zza = zzjyVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzt.zzaB().zzp(new zzju(this, (zzek) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzeu zzl = this.zza.zzt.zzl();
        if (zzl != null) {
            zzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzt.zzaB().zzp(new zzjw(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i8) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzt.zzaA().zzc().zza("Service connection suspended");
        this.zza.zzt.zzaB().zzp(new zzjv(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjx zzjxVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzt.zzaA().zzd().zza("Service connected with null binder");
                return;
            }
            zzek zzekVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzekVar = queryLocalInterface instanceof zzek ? (zzek) queryLocalInterface : new zzei(iBinder);
                    this.zza.zzt.zzaA().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzt.zzaA().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzt.zzaA().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if (zzekVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzaw = this.zza.zzt.zzaw();
                    zzjxVar = this.zza.zza;
                    connectionTracker.unbindService(zzaw, zzjxVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzt.zzaB().zzp(new zzjs(this, zzekVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzt.zzaA().zzc().zza("Service disconnected");
        this.zza.zzt.zzaB().zzp(new zzjt(this, componentName));
    }

    @WorkerThread
    public final void zzb(Intent intent) {
        zzjx zzjxVar;
        this.zza.zzg();
        Context zzaw = this.zza.zzt.zzaw();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzt.zzaA().zzj().zza("Connection attempt already in progress");
                    return;
                }
                this.zza.zzt.zzaA().zzj().zza("Using local app measurement service");
                this.zzb = true;
                zzjxVar = this.zza.zza;
                connectionTracker.bindService(zzaw, intent, zzjxVar, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzc() {
        this.zza.zzg();
        Context zzaw = this.zza.zzt.zzaw();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzt.zzaA().zzj().zza("Connection attempt already in progress");
                    return;
                }
                if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                    this.zza.zzt.zzaA().zzj().zza("Already awaiting connection attempt");
                    return;
                }
                this.zzc = new zzeq(zzaw, Looper.getMainLooper(), this, this);
                this.zza.zzt.zzaA().zzj().zza("Connecting to remote service");
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzd() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}
