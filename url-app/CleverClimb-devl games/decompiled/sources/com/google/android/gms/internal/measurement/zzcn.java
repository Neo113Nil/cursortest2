package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
class zzcn extends BroadcastReceiver {

    @VisibleForTesting
    private static final String zzaar = "com.google.android.gms.internal.measurement.zzcn";
    private boolean zzaas;
    private boolean zzaat;
    private final zzat zzvi;

    zzcn(zzat zzatVar) {
        Preconditions.checkNotNull(zzatVar);
        this.zzvi = zzatVar;
    }

    private final void zzeu() {
        this.zzvi.zzbu();
        this.zzvi.zzby();
    }

    @VisibleForTesting
    private final boolean zzew() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzvi.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    public final boolean isConnected() {
        if (!this.zzaas) {
            this.zzvi.zzbu().zzt("Connectivity unknown. Receiver not registered");
        }
        return this.zzaat;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zzeu();
        String action = intent.getAction();
        this.zzvi.zzbu().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zzew = zzew();
            if (this.zzaat != zzew) {
                this.zzaat = zzew;
                zzai zzby = this.zzvi.zzby();
                zzby.zza("Network connectivity status changed", Boolean.valueOf(zzew));
                zzby.zzbw().zza(new zzak(zzby, zzew));
                return;
            }
            return;
        }
        if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.zzvi.zzbu().zzd("NetworkBroadcastReceiver received unknown action", action);
        } else {
            if (intent.hasExtra(zzaar)) {
                return;
            }
            zzai zzby2 = this.zzvi.zzby();
            zzby2.zzq("Radio powered up");
            zzby2.zzbo();
        }
    }

    public final void unregister() {
        if (this.zzaas) {
            this.zzvi.zzbu().zzq("Unregistering connectivity change receiver");
            this.zzaas = false;
            this.zzaat = false;
            try {
                this.zzvi.getContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zzvi.zzbu().zze("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void zzet() {
        zzeu();
        if (this.zzaas) {
            return;
        }
        Context context = this.zzvi.getContext();
        context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(context.getPackageName());
        context.registerReceiver(this, intentFilter);
        this.zzaat = zzew();
        this.zzvi.zzbu().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzaat));
        this.zzaas = true;
    }

    @VisibleForTesting
    public final void zzev() {
        Context context = this.zzvi.getContext();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(zzaar, true);
        context.sendOrderedBroadcast(intent, null);
    }
}
