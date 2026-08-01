package com.bytedance.adsdk.pvs.icD.NB;

/* compiled from: CharType.java */
/* loaded from: classes.dex */
public class pvs {
    public static boolean Jd(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }

    public static boolean icD(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean pvs(char c) {
        return c == ' ';
    }

    public static boolean vG(char c) {
        return c >= '0' && c <= '9';
    }
}
