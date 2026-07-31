package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzgs implements zzhm {
    private static final zzgz zza = new zzgq();
    private final zzgz zzb;

    public zzgs() {
        zzfp zza2 = zzfp.zza();
        int i4 = zzei.zza;
        zzgr zzgrVar = new zzgr(zza2, zza);
        byte[] bArr = zzga.zzb;
        this.zzb = zzgrVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final zzhl zza(Class cls) {
        int i4 = zzhn.zza;
        if (!zzfu.class.isAssignableFrom(cls)) {
            int i5 = zzei.zza;
        }
        zzgy zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i6 = zzei.zza;
            return zzhf.zzc(zzhn.zzn(), zzfk.zza(), zzb.zza());
        }
        int i7 = zzei.zza;
        return zzhe.zzl(cls, zzb, zzhh.zza(), zzgl.zza(), zzhn.zzn(), zzb.zzc() + (-1) != 1 ? zzfk.zza() : null, zzgx.zza());
    }
}
