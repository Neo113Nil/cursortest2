package com.bytedance.adsdk.ugeno.pvs;

import android.text.TextUtils;

/* compiled from: UGMethodParser.java */
/* loaded from: classes.dex */
public class Jd {
    public static Object pvs(com.bytedance.adsdk.pvs.icD.pvs.pvs pvsVar) {
        icD pvs;
        if (pvsVar == null || (pvs = pvs(pvsVar.pvs())) == null) {
            return null;
        }
        return pvs.icD(pvsVar.icD());
    }

    public static icD pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        if (str.equals("find")) {
            return new pvs();
        }
        return null;
    }
}
