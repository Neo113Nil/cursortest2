package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class om {
    public static boolean a(String str) {
        return "audio".equals(c(str));
    }

    public static boolean b(String str) {
        return "video".equals(c(str));
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            throw new IllegalArgumentException(str.length() != 0 ? "Invalid mime type: ".concat(str) : new String("Invalid mime type: "));
        }
        return str.substring(0, indexOf);
    }
}
