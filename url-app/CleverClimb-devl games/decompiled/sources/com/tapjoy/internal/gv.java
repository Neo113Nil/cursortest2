package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class gv {
    public static String a(String str) {
        String trim;
        if (str == null || str.length() == 0 || (trim = str.trim()) == null || trim.length() == 0) {
            return null;
        }
        return trim;
    }

    public static String b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim;
    }

    public static String a(String str, String str2, String str3) {
        if (str == null) {
            gx.a(str2, str3, "must not be null");
            return null;
        }
        if (str.length() == 0) {
            gx.a(str2, str3, "must not be empty");
            return null;
        }
        String trim = str.trim();
        if (trim.length() != 0) {
            return trim;
        }
        gx.a(str2, str3, "must not be blank");
        return null;
    }
}
