package com.bytedance.adsdk.pvs.icD.Jd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.Marker;

/* compiled from: Operator.java */
/* loaded from: classes.dex */
public enum vG implements NB {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS(Marker.ANY_NON_NULL_MARKER, 3),
    MINUS("-", 3),
    MULTI(Marker.ANY_MARKER, 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final String cR;
    private final int zM;
    private static final Map<String, vG> mnm = new HashMap(128);
    private static final Set<vG> vA = new HashSet();

    static {
        for (vG vGVar : values()) {
            mnm.put(vGVar.pvs(), vGVar);
            vA.add(vGVar);
        }
    }

    vG(String str, int i) {
        this.cR = str;
        this.zM = i;
    }

    public static vG pvs(String str) {
        return mnm.get(str);
    }

    public static boolean pvs(NB nb) {
        return nb instanceof vG;
    }

    public String pvs() {
        return this.cR;
    }

    public int icD() {
        return this.zM;
    }
}
