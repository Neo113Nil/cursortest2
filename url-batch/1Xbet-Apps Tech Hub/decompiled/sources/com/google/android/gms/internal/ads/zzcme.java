package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcme implements zzfca {
    private final zzckm zza;
    private final zzcme zzb = this;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;
    private final zzhec zzi;

    /* synthetic */ zzcme(zzckm zzckmVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcmd zzcmdVar) {
        zzhec zzhecVar;
        zzhec zzhecVar2;
        zzhec zzhecVar3;
        zzhec zzhecVar4;
        zzhec zzhecVar5;
        zzhec zzhecVar6;
        zzhec zzhecVar7;
        this.zza = zzckmVar;
        zzhdp zza = zzhdq.zza(context);
        this.zzc = zza;
        zzhdp zza2 = zzhdq.zza(zzqVar);
        this.zzd = zza2;
        zzhdp zza3 = zzhdq.zza(str);
        this.zze = zza3;
        zzhecVar = zzckmVar.zzn;
        zzhec zzc = zzhdo.zzc(new zzenn(zzhecVar));
        this.zzf = zzc;
        zzhecVar2 = zzckmVar.zzaG;
        zzhec zzc2 = zzhdo.zzc(new zzfcy(zzhecVar2));
        this.zzg = zzc2;
        zzhecVar3 = zzckmVar.zzo;
        zzhecVar4 = zzckmVar.zzU;
        zzhec zzc3 = zzhdo.zzc(new zzfby(zza, zzhecVar3, zzhecVar4, zzc, zzc2, zzfes.zza()));
        this.zzh = zzc3;
        zzhecVar5 = zzckmVar.zzh;
        zzhecVar6 = zzckmVar.zzV;
        zzhecVar7 = zzckmVar.zzZ;
        this.zzi = zzhdo.zzc(new zzenv(zza, zza2, zza3, zzc3, zzc, zzc2, zzhecVar5, zzhecVar6, zzhecVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzfca
    public final zzenu zza() {
        return (zzenu) this.zzi.zzb();
    }
}
