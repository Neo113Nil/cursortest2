package com.google.android.gms.internal.drive;

/* loaded from: classes3.dex */
final class zzjw {
    private static final Class<?> zzok = zzce();

    private static Class<?> zzce() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzjx zzcf() {
        if (zzok != null) {
            try {
                return zzn("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzjx.zzoo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzjx zzcg() {
        zzjx zzn;
        if (zzok != null) {
            try {
                zzn = zzn("loadGeneratedRegistry");
            } catch (Exception unused) {
            }
            if (zzn == null) {
                zzn = zzjx.zzcg();
            }
            return zzn != null ? zzcf() : zzn;
        }
        zzn = null;
        if (zzn == null) {
        }
        if (zzn != null) {
        }
    }

    private static final zzjx zzn(String str) throws Exception {
        return (zzjx) zzok.getDeclaredMethod(str, null).invoke(null, null);
    }
}
