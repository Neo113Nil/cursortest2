package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbkk implements zzgax {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbko zzd;

    zzbkk(zzbko zzbkoVar, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str) {
        this.zzd = zzbkoVar;
        this.zza = zzaVar;
        this.zzb = map;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        Map map = this.zzb;
        String str = this.zzc;
        this.zzd.zzh((String) obj, zzaVar, map, str);
    }
}
