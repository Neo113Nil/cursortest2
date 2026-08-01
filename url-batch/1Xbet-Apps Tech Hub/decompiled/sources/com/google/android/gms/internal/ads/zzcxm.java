package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcxm implements zzhdp {
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
    private final zzhec zzk;
    private final zzhec zzl;

    public zzcxm(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7, zzhec zzhecVar8, zzhec zzhecVar9, zzhec zzhecVar10, zzhec zzhecVar11, zzhec zzhecVar12) {
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
        this.zzk = zzhecVar11;
        this.zzl = zzhecVar12;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxl zzb() {
        zzfiu zzfiuVar = (zzfiu) this.zza.zzb();
        zzcbt zza = ((zzcji) this.zzb).zza();
        ApplicationInfo zzb = ((zzdxz) this.zzc).zzb();
        String zzb2 = ((zzdye) this.zzd).zzb();
        zzbcu zzbcuVar = zzbdc.zza;
        return new zzcxl(zzfiuVar, zza, zzb, zzb2, com.google.android.gms.ads.internal.client.zzba.zza().zza(), (PackageInfo) this.zzf.zzb(), zzhdo.zza(this.zzg), ((zzciu) this.zzh).zzb(), (String) this.zzi.zzb(), ((zzevc) this.zzj).zzb(), ((zzcxy) this.zzk).zza(), (zzddq) this.zzl.zzb());
    }
}
