package c2;

import b2.C0190d;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class q extends android.support.v4.media.session.a {
    public static int Z(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map a0(C0190d pair) {
        kotlin.jvm.internal.j.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f2547a, pair.f2548b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }
}
