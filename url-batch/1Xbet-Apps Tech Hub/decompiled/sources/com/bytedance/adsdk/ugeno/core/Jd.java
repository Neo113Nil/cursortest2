package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ComponentRegistrar.java */
/* loaded from: classes.dex */
public class Jd {
    private static Map<String, icD> pvs = new HashMap();

    public static void pvs(List<icD> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (icD icd : list) {
            if (icd != null) {
                pvs.put(icd.pvs(), icd);
            }
        }
    }

    public static icD pvs(String str) {
        return pvs.get(str);
    }
}
