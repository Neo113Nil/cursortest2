package l1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: l1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1260g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1261h c1261h = (C1261h) obj;
        C1261h c1261h2 = (C1261h) obj2;
        RecyclerView recyclerView = c1261h.f14232d;
        if ((recyclerView == null) == (c1261h2.f14232d == null)) {
            boolean z = c1261h.f14229a;
            if (z == c1261h2.f14229a) {
                int i4 = c1261h2.f14230b - c1261h.f14230b;
                if (i4 != 0) {
                    return i4;
                }
                int i5 = c1261h.f14231c - c1261h2.f14231c;
                if (i5 != 0) {
                    return i5;
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
