package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* compiled from: PropSwitchUtils.java */
/* loaded from: classes2.dex */
public class OT {
    public static boolean pvs = pvs();

    private static boolean pvs() {
        SharedPreferences sharedPreferences;
        try {
            if (com.bytedance.sdk.openadsdk.core.mnm.pvs() != null && (sharedPreferences = com.bytedance.sdk.openadsdk.core.mnm.pvs().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
        }
        return true;
    }

    public static void pvs(int i) {
        try {
            SharedPreferences.Editor edit = com.bytedance.sdk.openadsdk.core.mnm.pvs().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            edit.putInt("perf_con_use_prop", i);
            edit.apply();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
        }
    }
}
