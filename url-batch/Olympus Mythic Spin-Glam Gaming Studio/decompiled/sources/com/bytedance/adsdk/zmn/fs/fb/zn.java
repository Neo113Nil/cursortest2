package com.bytedance.adsdk.zmn.fs.fb;

import com.safedk.android.analytics.brandsafety.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public enum zn implements btk {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR(m.ac, 1),
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

    private final String kgc;
    private final int kw;
    private static final Map<String, zn> cyb = new HashMap(128);
    private static final Set<zn> olo = new HashSet();

    static {
        for (zn znVar : values()) {
            cyb.put(znVar.zmn(), znVar);
            olo.add(znVar);
        }
    }

    zn(String str, int i) {
        this.kgc = str;
        this.kw = i;
    }

    public static zn zmn(String str) {
        return cyb.get(str);
    }

    public static boolean zmn(btk btkVar) {
        return btkVar instanceof zn;
    }

    public String zmn() {
        return this.kgc;
    }

    public int fs() {
        return this.kw;
    }
}
