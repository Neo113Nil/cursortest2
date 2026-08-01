package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdyw implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;

    public zzdyw(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7, zzhec zzhecVar8) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
        this.zzf = zzhecVar6;
        this.zzg = zzhecVar7;
        this.zzh = zzhecVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdyv zzb() {
        zzciq zzciqVar = (zzciq) this.zza.zzb();
        Context zza = ((zzciw) this.zzb).zza();
        zzcbt zza2 = ((zzcji) this.zzc).zza();
        zzfeq zza3 = ((zzcxy) this.zzd).zza();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzdyv(zzciqVar, zza, zza2, zza3, zzgblVar, (String) this.zzf.zzb(), (zzfkh) this.zzg.zzb(), (zzdtk) this.zzh.zzb());
    }
}
