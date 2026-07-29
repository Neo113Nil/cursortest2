package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzzx {
    private static final zzzv zzbvz = zzuu();
    private static final zzzv zzbwa = new zzzw();

    static zzzv zzus() {
        return zzbvz;
    }

    static zzzv zzut() {
        return zzbwa;
    }

    private static zzzv zzuu() {
        try {
            return (zzzv) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
