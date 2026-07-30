package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class li1 extends ki1 {
    public static int a(int i) {
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

    public static Map b(Pair pair) {
        pair.getClass();
        Map singletonMap = Collections.singletonMap(pair.m, pair.n);
        singletonMap.getClass();
        return singletonMap;
    }
}
