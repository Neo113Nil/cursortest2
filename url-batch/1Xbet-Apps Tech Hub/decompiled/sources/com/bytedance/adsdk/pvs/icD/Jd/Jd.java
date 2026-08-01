package com.bytedance.adsdk.pvs.icD.Jd;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Symbol.java */
/* loaded from: classes.dex */
public enum Jd implements NB {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, Jd> sUS;
    private final String yiw;

    static {
        HashMap hashMap = new HashMap(128);
        sUS = hashMap;
        for (Jd jd : hashMap.values()) {
            sUS.put(jd.pvs(), jd);
        }
    }

    Jd(String str) {
        this.yiw = str;
    }

    public static boolean pvs(NB nb) {
        return nb instanceof Jd;
    }

    public String pvs() {
        return this.yiw;
    }
}
