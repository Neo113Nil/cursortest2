package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzibk implements zzida {
    private static final zzibk zza = new zzibk();

    private zzibk() {
    }

    public static zzibk zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzb(Class cls) {
        return zzibr.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzicz zzc(Class cls) {
        if (!zzibr.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            String.valueOf(name);
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(name)));
        }
        try {
            return (zzicz) zzibr.zzbt(cls.asSubclass(zzibr.class)).zzbs();
        } catch (Exception e) {
            String name2 = cls.getName();
            String.valueOf(name2);
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(name2)), e);
        }
    }
}
