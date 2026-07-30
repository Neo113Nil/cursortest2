package com.baidu.ar;

/* loaded from: classes.dex */
public class a9 {
    public static int a(Object obj, int i8) {
        if (obj == null) {
            return i8;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return i8;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
            return i8;
        }
    }

    public static long a(Object obj, long j8) {
        if (obj == null) {
            return j8;
        }
        if ((obj instanceof Long) || (obj instanceof Float)) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return j8;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
            return j8;
        }
    }

    public static String a(Object obj, String str) {
        return obj != null ? String.valueOf(obj) : str;
    }
}
