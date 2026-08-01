package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzclq implements zzdur {
    private final Long zza;
    private final String zzb;
    private final zzckm zzc;
    private final zzclu zzd;
    private final zzclq zze = this;

    /* synthetic */ zzclq(zzckm zzckmVar, zzclu zzcluVar, Long l, String str, zzclp zzclpVar) {
        this.zzc = zzckmVar;
        this.zzd = zzcluVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdur
    public final zzdvb zza() {
        Context context;
        zzduu zzc;
        zzclu zzcluVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcluVar.zza;
        zzc = zzduv.zzc(zzcluVar.zzb);
        return zzdvc.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdur
    public final zzdvf zzb() {
        Context context;
        zzduu zzc;
        zzclu zzcluVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzcluVar.zza;
        zzc = zzduv.zzc(zzcluVar.zzb);
        return zzdvg.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
