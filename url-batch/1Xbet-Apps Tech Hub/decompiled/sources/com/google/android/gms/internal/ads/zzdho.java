package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdho implements zzhdp {
    private final zzdhb zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzdho(zzdhb zzdhbVar, zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzdhbVar;
        this.zzb = zzhecVar;
        this.zzc = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbza zzb() {
        return new zzbza(((zzciw) this.zzb).zza(), ((zzcxy) this.zzc).zza().zzf);
    }
}
