package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* compiled from: AdPreference.java */
/* loaded from: classes2.dex */
public class vG {
    private static volatile vG pvs;

    private vG() {
    }

    public static vG pvs(Context context) {
        if (pvs == null) {
            synchronized (vG.class) {
                if (pvs == null) {
                    pvs = new vG();
                }
            }
        }
        return pvs;
    }

    public void pvs(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("ttopenadsdk", str, str2);
    }

    public String icD(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("ttopenadsdk", str, str2);
    }

    public void pvs(String str, int i) {
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("ttopenadsdk", str, Integer.valueOf(i));
    }

    public int icD(String str, int i) {
        return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("ttopenadsdk", str, i);
    }

    public void pvs(String str, long j) {
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("ttopenadsdk", str, Long.valueOf(j));
    }

    public Long icD(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("ttopenadsdk", str, j));
    }
}
