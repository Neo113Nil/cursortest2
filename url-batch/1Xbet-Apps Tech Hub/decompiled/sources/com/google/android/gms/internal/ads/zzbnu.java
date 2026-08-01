package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbnu implements Runnable {
    final /* synthetic */ zzbof zza;
    final /* synthetic */ zzbnb zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbog zze;

    zzbnu(zzbog zzbogVar, zzbof zzbofVar, zzbnb zzbnbVar, ArrayList arrayList, long j) {
        this.zze = zzbogVar;
        this.zza = zzbofVar;
        this.zzb = zzbnbVar;
        this.zzc = arrayList;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        String str;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        obj = this.zze.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzgbl zzgblVar = zzcca.zze;
                final zzbnb zzbnbVar = this.zzb;
                zzgblVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnb.this.zzc();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzd));
                int zze = this.zza.zze();
                i = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.zzc.get(0));
                }
                com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i + str + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
