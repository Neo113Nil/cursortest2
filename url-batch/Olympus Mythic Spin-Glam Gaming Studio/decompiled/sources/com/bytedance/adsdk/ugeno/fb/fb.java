package com.bytedance.adsdk.ugeno.fb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class fb {
    private static Map<String, fs> zmn = new HashMap();

    public static void zmn(List<fs> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (fs fsVar : list) {
            if (fsVar != null) {
                zmn.put(fsVar.zmn(), fsVar);
            }
        }
    }

    public static fs zmn(String str) {
        return zmn.get(str);
    }
}
