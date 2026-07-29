package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzyq {
    private static final zzyo<?> zzbuc = new zzyp();
    private static final zzyo<?> zzbud = zztx();

    private static zzyo<?> zztx() {
        try {
            return (zzyo) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static zzyo<?> zzty() {
        return zzbuc;
    }

    static zzyo<?> zztz() {
        if (zzbud != null) {
            return zzbud;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
