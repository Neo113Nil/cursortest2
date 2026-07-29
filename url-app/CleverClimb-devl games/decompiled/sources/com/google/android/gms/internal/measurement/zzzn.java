package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzzn {
    private static final zzzl zzbvs = zzun();
    private static final zzzl zzbvt = new zzzm();

    static zzzl zzul() {
        return zzbvs;
    }

    static zzzl zzum() {
        return zzbvt;
    }

    private static zzzl zzun() {
        try {
            return (zzzl) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
