package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzhia implements zzhjq {
    private static final zzhia zza = new zzhia();

    private zzhia() {
    }

    public static zzhia zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhjq
    public final boolean zzb(Class cls) {
        return zzhih.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzhjq
    public final zzhjp zzc(Class cls) {
        if (!zzhih.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            String.valueOf(name);
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(name)));
        }
        try {
            return (zzhjp) zzhih.zzbt(cls.asSubclass(zzhih.class)).zzbs();
        } catch (Exception e) {
            String name2 = cls.getName();
            String.valueOf(name2);
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(name2)), e);
        }
    }
}
