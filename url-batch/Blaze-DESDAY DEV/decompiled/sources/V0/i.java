package V0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class i extends h {
    public static int x0(Iterable iterable) {
        g1.d.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
