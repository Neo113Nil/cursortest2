package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgxo implements zzgyq {
    private static final zzgxu zza = new zzgxm();
    private final zzgxu zzb;

    public zzgxo() {
        zzgxu zzgxuVar;
        zzgxu[] zzgxuVarArr = new zzgxu[2];
        zzgxuVarArr[0] = zzgwh.zza();
        try {
            zzgxuVar = (zzgxu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgxuVar = zza;
        }
        zzgxuVarArr[1] = zzgxuVar;
        zzgxn zzgxnVar = new zzgxn(zzgxuVarArr);
        byte[] bArr = zzgww.zzd;
        this.zzb = zzgxnVar;
    }

    private static boolean zzb(zzgxt zzgxtVar) {
        return zzgxtVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    public final zzgyp zza(Class cls) {
        zzgyr.zzr(cls);
        zzgxt zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzgwm.class.isAssignableFrom(cls) ? zzgya.zzc(zzgyr.zzn(), zzgwb.zzb(), zzb.zza()) : zzgya.zzc(zzgyr.zzm(), zzgwb.zza(), zzb.zza()) : zzgwm.class.isAssignableFrom(cls) ? zzb(zzb) ? zzgxz.zzl(cls, zzb, zzgyc.zzb(), zzgxk.zze(), zzgyr.zzn(), zzgwb.zzb(), zzgxs.zzb()) : zzgxz.zzl(cls, zzb, zzgyc.zzb(), zzgxk.zze(), zzgyr.zzn(), null, zzgxs.zzb()) : zzb(zzb) ? zzgxz.zzl(cls, zzb, zzgyc.zza(), zzgxk.zzd(), zzgyr.zzm(), zzgwb.zza(), zzgxs.zza()) : zzgxz.zzl(cls, zzb, zzgyc.zza(), zzgxk.zzd(), zzgyr.zzm(), null, zzgxs.zza());
    }
}
