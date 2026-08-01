package com.bytedance.sdk.openadsdk.component.reward;

import android.text.TextUtils;

/* compiled from: SpCache.java */
/* loaded from: classes2.dex */
class Ju {
    private final String pvs;

    Ju(String str) {
        this.pvs = TextUtils.isEmpty(str) ? "" : str;
    }

    private String NB(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return this.pvs + "_cache_" + str;
    }

    String pvs(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD(NB(str), "material_data", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    long icD(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs(NB(str), "create_time", 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    boolean vG(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs(NB(str), "has_played", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    void pvs(String str, String str2) {
        try {
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs(NB(str), "has_played", Boolean.FALSE);
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs(NB(str), "create_time", Long.valueOf(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs(NB(str), "material_data", str2);
        } catch (Throwable unused) {
        }
    }

    void Jd(String str) {
        try {
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs(NB(str));
        } catch (Throwable unused) {
        }
    }
}
