package com.bytedance.adsdk.fs;

import java.util.Map;

/* loaded from: classes8.dex */
public class iqz {
    private boolean fs;
    private final Map<String, String> zmn;

    public String zmn(String str) {
        return str;
    }

    public String zmn(String str, String str2) {
        return zmn(str2);
    }

    public final String fs(String str, String str2) {
        if (this.fs && this.zmn.containsKey(str2)) {
            return this.zmn.get(str2);
        }
        String zmn = zmn(str, str2);
        if (this.fs) {
            this.zmn.put(str2, zmn);
        }
        return zmn;
    }
}
