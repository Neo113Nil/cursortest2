package com.bykv.vk.openvk.component.video.api.sUS;

/* compiled from: VLogger.java */
/* loaded from: classes.dex */
public class vG {
    private static int icD = 4;
    private static boolean pvs = false;
    private static String vG = "";

    public static void pvs(String str) {
        vG = str;
    }

    public static void pvs(int i) {
        icD = i;
    }

    public static void pvs() {
        pvs = true;
        pvs(3);
    }

    public static void icD() {
        pvs = false;
        pvs(7);
    }

    public static boolean vG() {
        return pvs;
    }
}
