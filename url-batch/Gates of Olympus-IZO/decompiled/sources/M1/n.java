package M1;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class n extends m {
    public static int g0(Iterable iterable, int i3) {
        Z1.i.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i3;
    }
}
