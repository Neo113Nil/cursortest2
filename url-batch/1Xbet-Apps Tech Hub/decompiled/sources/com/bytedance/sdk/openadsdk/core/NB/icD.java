package com.bytedance.sdk.openadsdk.core.NB;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SecSdkHelper.java */
/* loaded from: classes2.dex */
class icD {
    private static com.bytedance.sdk.openadsdk.core.NB.pvs pvs;
    private String icD;

    private icD() {
        this.icD = null;
        pvs = new com.bytedance.sdk.openadsdk.core.NB.pvs();
    }

    public void pvs(String str) {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar;
        if (TextUtils.isEmpty(str) || (pvsVar = pvs) == null) {
            return;
        }
        pvsVar.pvs(str);
    }

    public void icD(String str) {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar;
        if (TextUtils.isEmpty(str) || (pvsVar = pvs) == null) {
            return;
        }
        pvsVar.icD(str);
    }

    public void pvs() {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar = pvs;
        if (pvsVar != null) {
            pvsVar.vG();
        }
    }

    public static icD icD() {
        return pvs.pvs;
    }

    public void vG(String str) {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar = pvs;
        if (pvsVar != null) {
            pvsVar.vG(str);
        }
    }

    public boolean vG() {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar = pvs;
        if (pvsVar == null) {
            return false;
        }
        return pvsVar.icD();
    }

    public String Jd() {
        String Jd;
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar = pvs;
        return (pvsVar == null || (Jd = pvsVar.Jd()) == null) ? "" : Jd;
    }

    public Map<String, String> pvs(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar = pvs;
        if (pvsVar != null) {
            return pvsVar.pvs(str, bArr);
        }
        return new HashMap();
    }

    public String NB() {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar = pvs;
        return pvsVar != null ? pvsVar.NB() : "";
    }

    public int sUS() {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar = pvs;
        if (pvsVar != null) {
            return pvsVar.sUS();
        }
        return 1;
    }

    public void pvs(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.NB.pvs pvsVar = pvs;
        if (pvsVar != null) {
            pvsVar.pvs(motionEvent);
        }
    }

    /* compiled from: SecSdkHelper.java */
    private static class pvs {
        private static final icD pvs = new icD();
    }
}
