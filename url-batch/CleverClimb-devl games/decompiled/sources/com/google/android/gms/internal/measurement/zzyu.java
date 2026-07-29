package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzyu implements zzzp {
    private static final zzyu zzbuj = new zzyu();

    private zzyu() {
    }

    public static zzyu zzud() {
        return zzbuj;
    }

    @Override // com.google.android.gms.internal.measurement.zzzp
    public final boolean zzd(Class<?> cls) {
        return zzyv.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzzp
    public final zzzo zze(Class<?> cls) {
        if (!zzyv.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzzo) zzyv.zzf(cls.asSubclass(zzyv.class)).zza(3, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
