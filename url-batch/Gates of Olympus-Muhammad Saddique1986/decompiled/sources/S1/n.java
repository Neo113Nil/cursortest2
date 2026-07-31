package S1;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class n extends m {
    public static int E0(Iterable iterable, int i3) {
        f2.j.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i3;
    }
}
