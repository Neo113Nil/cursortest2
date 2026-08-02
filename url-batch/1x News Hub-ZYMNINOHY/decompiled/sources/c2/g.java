package c2;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class g extends f {
    public static int N(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
