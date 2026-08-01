package com.bytedance.adsdk.pvs.icD.Jd;

import java.util.HashMap;
import java.util.Map;

/* compiled from: KeyWord.java */
/* loaded from: classes.dex */
public enum pvs implements NB {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, pvs> Jd = new HashMap(128);

    static {
        for (pvs pvsVar : values()) {
            Jd.put(pvsVar.name().toLowerCase(), pvsVar);
        }
    }

    public static pvs pvs(String str) {
        return Jd.get(str.toLowerCase());
    }
}
