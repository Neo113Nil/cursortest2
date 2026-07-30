package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbrq implements zzboh {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbsk zzb;
    final /* synthetic */ zzbrg zzc;
    final /* synthetic */ zzbsl zzd;

    zzbrq(zzbsl zzbslVar, long j, zzbsk zzbskVar, zzbrg zzbrgVar) {
        this.zza = j;
        this.zzb = zzbskVar;
        this.zzc = zzbrgVar;
        Objects.requireNonNull(zzbslVar);
        this.zzd = zzbslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(currentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(currentTimeMillis);
        sb.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbsl zzbslVar = this.zzd;
        synchronized (zzbslVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbsk zzbskVar = this.zzb;
            if (zzbskVar.zzi() != -1 && zzbskVar.zzi() != 1) {
                zzbslVar.zzl(0);
                zzbrg zzbrgVar = this.zzc;
                zzbrg zzbrgVar2 = zzbrgVar;
                zzbrgVar.zzm("/log", zzbog.zzg);
                zzbrgVar.zzm("/result", zzbog.zzo);
                zzbskVar.zzf(zzbrgVar);
                zzbslVar.zzj(zzbskVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
