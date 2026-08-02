package U;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: U.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0074j c0074j = (C0074j) obj;
        C0074j c0074j2 = (C0074j) obj2;
        RecyclerView recyclerView = c0074j.f1431d;
        if ((recyclerView == null) == (c0074j2.f1431d == null)) {
            boolean z = c0074j.f1428a;
            if (z == c0074j2.f1428a) {
                int i3 = c0074j2.f1429b - c0074j.f1429b;
                if (i3 != 0) {
                    return i3;
                }
                int i4 = c0074j.f1430c - c0074j2.f1430c;
                if (i4 != 0) {
                    return i4;
                }
                return 0;
            }
            if (z) {
                return -1;
            }
        } else if (recyclerView != null) {
            return -1;
        }
        return 1;
    }
}
