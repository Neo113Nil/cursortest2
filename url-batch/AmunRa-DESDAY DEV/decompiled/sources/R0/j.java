package R0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class j extends i {
    public static int m0(Iterable iterable) {
        Z0.d.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
