package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes3.dex */
final class zzkh implements zzlk {
    private static final zzkq zza = new zzkg();
    private final zzkq zzb;

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final <T> zzll<T> zza(Class<T> cls) {
        zzln.zza((Class<?>) cls);
        zzkr zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzkz.zza(zzln.zza(), zzja.zza(), zza2.zza());
        }
        return zzkx.zza(cls, zza2, zzld.zza(), zzkf.zza(), zzln.zza(), zzkj.zza[zza2.zzb().ordinal()] != 1 ? zzja.zza() : null, zzko.zza());
    }

    public zzkh() {
        this(new zzki(zzjl.zza(), zza));
    }

    private zzkh(zzkq zzkqVar) {
        this.zzb = (zzkq) zzjm.zza(zzkqVar, "messageInfoFactory");
    }
}
