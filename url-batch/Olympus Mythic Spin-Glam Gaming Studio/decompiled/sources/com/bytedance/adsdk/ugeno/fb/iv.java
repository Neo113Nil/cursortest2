package com.bytedance.adsdk.ugeno.fb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class iv {
    private static Map<String, nps> zmn = new HashMap();

    public static void zmn(List<nps> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (nps npsVar : list) {
            if (npsVar != null) {
                zmn.put(npsVar.zmn(), npsVar);
            }
        }
    }

    public static nps zmn(String str) {
        return zmn.get(str);
    }
}
