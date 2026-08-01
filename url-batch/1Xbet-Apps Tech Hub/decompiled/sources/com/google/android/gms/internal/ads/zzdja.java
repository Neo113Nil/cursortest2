package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdja implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;

    public zzdja(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
        this.zzf = zzhecVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzciq zzciqVar = (zzciq) this.zza.zzb();
        zzcxp zza = ((zzcxz) this.zzb).zza();
        zzddy zza2 = ((zzdes) this.zzc).zza();
        zzdip zza3 = ((zzdir) this.zzd).zza();
        zzdaw zzb = ((zzcro) this.zze).zzb();
        zzejp zzejpVar = (zzejp) this.zzf.zzb();
        zzcsl zze = zzciqVar.zze();
        zze.zzi(zza.zzj());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzelv(null));
        zze.zzg(new zzctj(zzb, null));
        zze.zzc(new zzcrm(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdt)).booleanValue()) {
            zze.zzj(zzejy.zzb(zzejpVar));
        }
        zzctu zzc = zze.zzh().zzc();
        zzhdx.zzb(zzc);
        return zzc;
    }
}
