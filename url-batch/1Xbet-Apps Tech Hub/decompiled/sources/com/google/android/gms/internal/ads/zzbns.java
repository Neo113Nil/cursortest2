package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbns implements zzbkd {
    final /* synthetic */ zzbnb zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcc zzb;
    final /* synthetic */ zzbog zzc;

    zzbns(zzbog zzbogVar, zzasi zzasiVar, zzbnb zzbnbVar, com.google.android.gms.ads.internal.util.zzcc zzccVar) {
        this.zzc = zzbogVar;
        this.zza = zzbnbVar;
        this.zzb = zzccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbkd, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            zzcbn.zzi("JS Engine is requesting an update");
            i = this.zzc.zzi;
            if (i == 0) {
                zzcbn.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
