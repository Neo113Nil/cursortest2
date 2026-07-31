package com.bytedance.sdk.component.utils;

/* loaded from: classes6.dex */
public class cn {
    private static int fs = 4;
    private static boolean zmn = false;
    private static String zn = "";

    public static void zmn(String str) {
        zn = str;
    }

    public static void zmn(int i) {
        fs = i;
    }

    public static void zmn() {
        zmn = true;
        zmn(3);
    }

    public static void fs() {
        zmn = false;
        zmn(7);
    }

    public static boolean zn() {
        return zmn;
    }
}
