package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* compiled from: MultiGlobalInfo.java */
/* loaded from: classes2.dex */
public class icD {
    public static Boolean pvs;

    public static void pvs() {
        pvs = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_info", "is_support_multi_process", Boolean.TRUE);
    }

    public static void icD() {
        pvs = Boolean.FALSE;
        BinderPoolService.pvs = true;
    }

    public static boolean vG() {
        Boolean bool = pvs;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!Ju.NB()) {
            return false;
        }
        if (pvs == null) {
            pvs = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_info", "is_support_multi_process", false));
        }
        return pvs.booleanValue();
    }
}
