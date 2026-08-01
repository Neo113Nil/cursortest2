package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzegl implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzegl(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzcrd zzcrdVar = (zzcrd) this.zzb.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzegk(context, zzcrdVar, zzgblVar);
    }
}
