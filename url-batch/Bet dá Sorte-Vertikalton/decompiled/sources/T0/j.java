package T0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class j extends i {
    public static int l0(Iterable iterable) {
        b1.d.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
