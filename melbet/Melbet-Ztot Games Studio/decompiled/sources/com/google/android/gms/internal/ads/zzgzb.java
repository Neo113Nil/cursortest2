package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzgzb implements zzhaf {
    private static final zzgzh zza = new zzgyz();
    private final zzgzh zzb;

    public zzgzb() {
        zzgzh zzgzhVar = zza;
        int i = zzgzt.zza;
        zzgza zzgzaVar = new zzgza(zzgxr.zza(), zzgzhVar);
        byte[] bArr = zzgyl.zzb;
        this.zzb = zzgzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhaf
    public final zzhae zza(Class cls) {
        int i = zzhag.zza;
        if (!zzgxy.class.isAssignableFrom(cls)) {
            int i2 = zzgzt.zza;
        }
        zzgzg zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i3 = zzgzt.zza;
            return zzgzn.zzc(zzhag.zzm(), zzgxl.zza(), zzb.zza());
        }
        int i4 = zzgzt.zza;
        return zzgzm.zzm(cls, zzb, zzgzq.zza(), zzgyx.zza(), zzhag.zzm(), zzb.zzc() + (-1) != 1 ? zzgxl.zza() : null, zzgzf.zza());
    }
}
