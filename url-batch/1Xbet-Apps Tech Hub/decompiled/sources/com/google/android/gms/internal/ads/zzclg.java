package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzclg implements zzfaj {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzckm zzd;
    private final zzclg zze = this;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;
    private final zzhec zzi;
    private final zzhec zzj;
    private final zzhec zzk;

    /* synthetic */ zzclg(zzckm zzckmVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzclf zzclfVar) {
        zzhec zzhecVar;
        zzhec zzhecVar2;
        zzhec zzhecVar3;
        this.zzd = zzckmVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzhdp zza = zzhdq.zza(context);
        this.zzf = zza;
        zzhdp zza2 = zzhdq.zza(zzqVar);
        this.zzg = zza2;
        zzhecVar = zzckmVar.zzn;
        zzhec zzc = zzhdo.zzc(new zzenn(zzhecVar));
        this.zzh = zzc;
        zzhec zzc2 = zzhdo.zzc(zzens.zza());
        this.zzi = zzc2;
        zzhec zzc3 = zzhdo.zzc(zzddf.zza());
        this.zzj = zzc3;
        zzhecVar2 = zzckmVar.zzo;
        zzhecVar3 = zzckmVar.zzU;
        this.zzk = zzhdo.zzc(new zzfah(zza, zzhecVar2, zza2, zzhecVar3, zzc, zzc2, zzfes.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final zzems zza() {
        zzcit zzcitVar;
        zzhec zzhecVar;
        zzfag zzfagVar = (zzfag) this.zzk.zzb();
        zzenm zzenmVar = (zzenm) this.zzh.zzb();
        zzcitVar = this.zzd.zza;
        zzcbt zzd = zzcitVar.zzd();
        zzhdx.zzb(zzd);
        zzhecVar = this.zzd.zzZ;
        return new zzems(this.zza, this.zzb, this.zzc, zzfagVar, zzenmVar, zzd, (zzdtp) zzhecVar.zzb());
    }
}
