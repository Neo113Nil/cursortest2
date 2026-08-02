package d3;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class k extends j {
    public static int Y(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
