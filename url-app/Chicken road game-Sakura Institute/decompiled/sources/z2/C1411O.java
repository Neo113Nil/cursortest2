package z2;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1411O extends C1410N {
    public static int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f7485d, pair.f7486e);
        Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
        return singletonMap;
    }
}
