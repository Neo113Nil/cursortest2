package com.google.android.gms.iid;

import android.util.Log;

/* loaded from: classes.dex */
final class zzj implements Runnable {
    private final /* synthetic */ zzg zzbj;
    private final /* synthetic */ zzi zzbk;

    zzj(zzi zziVar, zzg zzgVar) {
        this.zzbk = zziVar;
        this.zzbj = zzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zze zzeVar;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        zzeVar = this.zzbk.zzbi;
        zzeVar.handleIntent(this.zzbj.intent);
        this.zzbj.finish();
    }
}
