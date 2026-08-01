package S0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class i extends h {
    public static int z0(Iterable iterable) {
        d1.d.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
