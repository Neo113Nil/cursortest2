package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbnr implements zzbkd {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbof zzb;
    final /* synthetic */ zzbnb zzc;
    final /* synthetic */ zzbog zzd;

    zzbnr(zzbog zzbogVar, long j, zzbof zzbofVar, zzbnb zzbnbVar) {
        this.zzd = zzbogVar;
        this.zza = j;
        this.zzb = zzbofVar;
        this.zzc = zzbnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zza) + " ms.");
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzbnb zzbnbVar = this.zzc;
                zzbnbVar.zzq("/log", zzbkc.zzg);
                zzbnbVar.zzq("/result", zzbkc.zzo);
                this.zzb.zzh(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
            }
        }
    }
}
