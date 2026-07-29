package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzym {
    private static final Class<?> zzbtx = zztt();

    private static final zzyn zzfm(String str) throws Exception {
        return (zzyn) zzbtx.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    private static Class<?> zztt() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzyn zztu() {
        if (zzbtx != null) {
            try {
                return zzfm("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzyn.zzbua;
    }
}
