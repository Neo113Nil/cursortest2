package com.bytedance.adsdk.zmn.fs.fb;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public enum zmn implements btk {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, zmn> fb = new HashMap(128);

    static {
        for (zmn zmnVar : values()) {
            fb.put(zmnVar.name().toLowerCase(), zmnVar);
        }
    }

    public static zmn zmn(String str) {
        return fb.get(str.toLowerCase());
    }
}
