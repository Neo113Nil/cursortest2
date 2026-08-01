package Y0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static int z0(Iterable iterable) {
        k1.e.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
