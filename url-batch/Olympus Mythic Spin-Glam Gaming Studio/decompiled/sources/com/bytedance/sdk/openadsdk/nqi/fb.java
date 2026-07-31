package com.bytedance.sdk.openadsdk.nqi;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public enum fb {
    UTF8(26, "UTF-8");

    private final String[] btk;
    private final int[] fb;
    private static final Map<Integer, fb> fs = new HashMap();
    private static final Map<String, fb> zn = new HashMap();

    static {
        for (fb fbVar : values()) {
            if (Charset.isSupported(fbVar.name())) {
                for (int i : fbVar.fb) {
                    fs.put(Integer.valueOf(i), fbVar);
                }
                zn.put(fbVar.name(), fbVar);
                for (String str : fbVar.btk) {
                    zn.put(str, fbVar);
                }
            }
        }
    }

    fb(int i, String... strArr) {
        this.fb = new int[]{i};
        this.btk = strArr;
    }

    public int zmn() {
        return this.fb[0];
    }

    public static fb zmn(Charset charset) {
        return zn.get(charset.name());
    }
}
