package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcsh implements zzhdp {
    private final zzcrw zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzcsh(zzcrw zzcrwVar, zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzcrwVar;
        this.zzb = zzhecVar;
        this.zzc = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbza zzb() {
        return new zzbza(((zzciw) this.zzb).zza(), ((zzcxy) this.zzc).zza().zzf);
    }
}
