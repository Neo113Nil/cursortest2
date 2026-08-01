package X0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static int z0(Iterable iterable) {
        g1.d.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
