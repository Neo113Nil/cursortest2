package Q0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class f extends e {
    public static int v0(Iterable iterable) {
        X0.e.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
