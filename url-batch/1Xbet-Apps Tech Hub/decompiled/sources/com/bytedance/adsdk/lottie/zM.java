package com.bytedance.adsdk.lottie;

import java.util.Map;

/* compiled from: TextDelegate.java */
/* loaded from: classes.dex */
public class zM {
    private boolean icD;
    private final Map<String, String> pvs;

    public String pvs(String str) {
        return str;
    }

    public String pvs(String str, String str2) {
        return pvs(str2);
    }

    public final String icD(String str, String str2) {
        if (this.icD && this.pvs.containsKey(str2)) {
            return this.pvs.get(str2);
        }
        String pvs = pvs(str, str2);
        if (this.icD) {
            this.pvs.put(str2, pvs);
        }
        return pvs;
    }
}
