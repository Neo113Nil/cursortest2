package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcmi implements zzfdo {
    private final zzckm zza;
    private final zzcmi zzb = this;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;
    private final zzhec zzi;
    private final zzhec zzj;

    /* synthetic */ zzcmi(zzckm zzckmVar, Context context, String str, zzcmh zzcmhVar) {
        zzhec zzhecVar;
        zzhec zzhecVar2;
        zzhec zzhecVar3;
        zzhec zzhecVar4;
        zzhec zzhecVar5;
        zzhec zzhecVar6;
        zzhec zzhecVar7;
        zzhec zzhecVar8;
        this.zza = zzckmVar;
        zzhdp zza = zzhdq.zza(context);
        this.zzc = zza;
        zzhecVar = zzckmVar.zzaG;
        zzhecVar2 = zzckmVar.zzaH;
        zzfbo zzfboVar = new zzfbo(zza, zzhecVar, zzhecVar2);
        this.zzd = zzfboVar;
        zzhecVar3 = zzckmVar.zzaG;
        zzhec zzc = zzhdo.zzc(new zzfcy(zzhecVar3));
        this.zze = zzc;
        zzhec zzc2 = zzhdo.zzc(zzfen.zza());
        this.zzf = zzc2;
        zzhecVar4 = zzckmVar.zzo;
        zzhecVar5 = zzckmVar.zzU;
        zzhec zzc3 = zzhdo.zzc(new zzfdi(zza, zzhecVar4, zzhecVar5, zzfboVar, zzc, zzfes.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzhdo.zzc(new zzfds(zzc3, zzc, zzc2));
        zzhdp zzc4 = zzhdq.zzc(str);
        this.zzi = zzc4;
        zzhecVar6 = zzckmVar.zzh;
        zzhecVar7 = zzckmVar.zzV;
        zzhecVar8 = zzckmVar.zzZ;
        this.zzj = zzhdo.zzc(new zzfdm(zzc4, zzc3, zza, zzc, zzc2, zzhecVar6, zzhecVar7, zzhecVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzfdo
    public final zzfdl zza() {
        return (zzfdl) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfdo
    public final zzfdr zzb() {
        return (zzfdr) this.zzh.zzb();
    }
}
