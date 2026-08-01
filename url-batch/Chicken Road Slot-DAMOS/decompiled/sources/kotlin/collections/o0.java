package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class o0 extends n0 {
    public static int a(int i3) {
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

    public static Map b(Pair pair) {
        pair.getClass();
        Map singletonMap = Collections.singletonMap(pair.f5552d, pair.f5553e);
        singletonMap.getClass();
        return singletonMap;
    }
}
