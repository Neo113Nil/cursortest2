package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwj {
    public static int a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap b(int i) {
        return new LinkedHashMap(a(i));
    }

    public static List c(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }
}
