package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzckw implements zzeyv {
    private final zzckm zza;
    private final zzckw zzb = this;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;

    /* synthetic */ zzckw(zzckm zzckmVar, Context context, String str, zzckv zzckvVar) {
        zzhec zzhecVar;
        zzhec zzhecVar2;
        zzhec zzhecVar3;
        zzhec zzhecVar4;
        zzhec zzhecVar5;
        zzhec zzhecVar6;
        zzhec zzhecVar7;
        zzhec zzhecVar8;
        zzhec zzhecVar9;
        this.zza = zzckmVar;
        zzhdp zza = zzhdq.zza(context);
        this.zzc = zza;
        zzhdp zza2 = zzhdq.zza(str);
        this.zzd = zza2;
        zzhecVar = zzckmVar.zzaG;
        zzhecVar2 = zzckmVar.zzaH;
        zzfbn zzfbnVar = new zzfbn(zza, zzhecVar, zzhecVar2);
        this.zze = zzfbnVar;
        zzhecVar3 = zzckmVar.zzaG;
        zzhec zzc = zzhdo.zzc(new zzezt(zzhecVar3));
        this.zzf = zzc;
        zzhecVar4 = zzckmVar.zzo;
        zzhecVar5 = zzckmVar.zzU;
        zzfes zza3 = zzfes.zza();
        zzhecVar6 = zzckmVar.zzh;
        zzhec zzc2 = zzhdo.zzc(new zzezv(zza, zzhecVar4, zzhecVar5, zzfbnVar, zzc, zza3, zzhecVar6));
        this.zzg = zzc2;
        zzhecVar7 = zzckmVar.zzU;
        zzhecVar8 = zzckmVar.zzh;
        zzhecVar9 = zzckmVar.zzZ;
        this.zzh = zzhdo.zzc(new zzfab(zzhecVar7, zza, zza2, zzc2, zzc, zzhecVar8, zzhecVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final zzfaa zza() {
        return (zzfaa) this.zzh.zzb();
    }
}
