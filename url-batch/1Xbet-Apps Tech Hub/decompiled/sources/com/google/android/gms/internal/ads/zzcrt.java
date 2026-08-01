package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcrt implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;
    private final zzhec zzi;
    private final zzhec zzj;

    public zzcrt(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7, zzhec zzhecVar8, zzhec zzhecVar9, zzhec zzhecVar10) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
        this.zzf = zzhecVar6;
        this.zzg = zzhecVar7;
        this.zzh = zzhecVar8;
        this.zzi = zzhecVar9;
        this.zzj = zzhecVar10;
    }

    public static zzcrs zzc(zzctq zzctqVar, Context context, zzfdv zzfdvVar, View view, zzcgv zzcgvVar, zzctp zzctpVar, zzdkv zzdkvVar, zzdgg zzdggVar, zzhdj zzhdjVar, Executor executor) {
        return new zzcrs(zzctqVar, context, zzfdvVar, view, zzcgvVar, zzctpVar, zzdkvVar, zzdggVar, zzhdjVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcrs zzb() {
        return new zzcrs(((zzcwb) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcrz) this.zzc).zza(), ((zzcry) this.zzd).zza(), ((zzcsk) this.zze).zza(), ((zzcsa) this.zzf).zza(), ((zzdis) this.zzg).zza(), (zzdgg) this.zzh.zzb(), zzhdo.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
