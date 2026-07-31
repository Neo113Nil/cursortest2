package com.bytedance.adsdk.zmn.fs.btk;

/* loaded from: classes5.dex */
public class zmn {
    public static boolean fb(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }

    public static boolean fs(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean zmn(char c) {
        return c == ' ';
    }

    public static boolean zn(char c) {
        return c >= '0' && c <= '9';
    }
}
