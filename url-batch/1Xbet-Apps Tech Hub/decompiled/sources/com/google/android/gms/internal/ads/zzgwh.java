package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgwh implements zzgxu {
    private static final zzgwh zza = new zzgwh();

    private zzgwh() {
    }

    public static zzgwh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final zzgxt zzb(Class cls) {
        if (!zzgwm.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzgxt) zzgwm.zzaC(cls.asSubclass(zzgwm.class)).zzb(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final boolean zzc(Class cls) {
        return zzgwm.class.isAssignableFrom(cls);
    }
}
