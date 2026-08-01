package O0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class j extends i {
    public static int d0(Iterable iterable) {
        X0.f.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
