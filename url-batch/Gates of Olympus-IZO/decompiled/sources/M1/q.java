package M1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q extends p {
    public static void h0(List list, Comparator comparator) {
        Z1.i.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
