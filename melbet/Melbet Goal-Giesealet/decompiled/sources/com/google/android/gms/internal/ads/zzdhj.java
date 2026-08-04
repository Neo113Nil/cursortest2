package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdhj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;

    private zzdhj(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
        this.zzf = zzhqgVar6;
    }

    public static zzdhj zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6) {
        return new zzdhj(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgv zzcgvVar = (zzcgv) this.zza.zzb();
        zzcva zza = ((zzcvk) this.zzb).zza();
        zzdbs zza2 = ((zzdcn) this.zzc).zza();
        zzdgy zza3 = ((zzdha) this.zzd).zza();
        zzcyt zzb = ((zzcoj) this.zze).zzb();
        zzehk zzehkVar = (zzehk) this.zzf.zzb();
        zzcpo zzg = zzcgvVar.zzg();
        zzg.zzl(zza.zze());
        zzg.zzm(zza2);
        zzg.zzd(zza3);
        zzg.zzk(new zzejp(null));
        zzg.zzg(new zzcqk(zzb, null));
        zzg.zze(new zzcoh(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzec)).booleanValue()) {
            zzg.zzf(zzeht.zza(zzehkVar));
        }
        zzcqv zzd = zzg.zzh().zzd();
        zzhqf.zzb(zzd);
        return zzd;
    }
}
