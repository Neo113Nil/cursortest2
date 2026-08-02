package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
    public static int mapCapacity(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map mapOf(Pair pair) {
        pair.getClass();
        Map singletonMap = Collections.singletonMap(pair.first, pair.second);
        singletonMap.getClass();
        return singletonMap;
    }
}
