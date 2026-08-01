package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcqn implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzcqn(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzavm zzavmVar = (zzavm) this.zza.zzb();
        zzbpd zzbpdVar = (zzbpd) this.zzb.zzb();
        zzgbl zza = zzfhh.zza();
        zzhdx.zzb(zza);
        return new zzcqg(zzavmVar.zzc(), zzbpdVar, zza);
    }
}
