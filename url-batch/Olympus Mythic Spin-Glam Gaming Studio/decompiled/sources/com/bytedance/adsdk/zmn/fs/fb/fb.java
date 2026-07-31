package com.bytedance.adsdk.zmn.fs.fb;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public enum fb implements btk {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(X3.j.d),
    RIGHT_BRACKET(X3.j.e),
    COMMA(StringUtils.COMMA);

    private static final Map<String, fb> hhw;
    private final String nps;

    static {
        HashMap hashMap = new HashMap(128);
        hhw = hashMap;
        for (fb fbVar : hashMap.values()) {
            hhw.put(fbVar.zmn(), fbVar);
        }
    }

    fb(String str) {
        this.nps = str;
    }

    public static boolean zmn(btk btkVar) {
        return btkVar instanceof fb;
    }

    public String zmn() {
        return this.nps;
    }
}
