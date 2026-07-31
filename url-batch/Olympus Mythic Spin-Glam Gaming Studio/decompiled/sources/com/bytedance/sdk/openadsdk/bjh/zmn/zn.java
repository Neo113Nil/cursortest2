package com.bytedance.sdk.openadsdk.bjh.zmn;

import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes3.dex */
public class zn {
    public static int fs = 6;
    public static boolean zmn = false;
    public static String zn = "engaged_view";

    public static void zmn(nqi nqiVar) {
        fs zn2 = zn(nqiVar);
        if (zn2 == null) {
            return;
        }
        zn2.zmn();
    }

    public static void fs(nqi nqiVar) {
        fs zn2 = zn(nqiVar);
        if (zn2 == null) {
            return;
        }
        zn2.fs();
    }

    public static void zmn(nqi nqiVar, int i) {
        fs zn2 = zn(nqiVar);
        if (zn2 == null || zn2.zn()) {
            return;
        }
        zn2.zmn(i);
    }

    public static void zmn(nqi nqiVar, boolean z) {
        fs zn2 = zn(nqiVar);
        if (zn2 == null || zn2.zn()) {
            return;
        }
        zn2.zmn(z);
        zn2.zmn(z ? 4 : 8);
    }

    private static fs zn(nqi nqiVar) {
        if (nqiVar == null || !nqiVar.ld()) {
            return null;
        }
        return nqiVar.wet();
    }
}
