package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.mnm;

/* compiled from: TTPathConst.java */
/* loaded from: classes2.dex */
public class Jd {
    public static String pvs = "com.bytedance.openadsdk";
    public static String icD = "content://" + pvs + ".TTMultiProvider";

    static {
        pvs();
    }

    public static void pvs() {
        if (mnm.pvs() != null) {
            pvs = mnm.pvs().getPackageName();
            icD = "content://" + pvs + ".TTMultiProvider";
        }
    }
}
