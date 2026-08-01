package X0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class m extends l {
    public static int m0(Iterable iterable) {
        j1.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
