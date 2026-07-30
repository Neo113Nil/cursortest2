package g0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0429i c0429i = (C0429i) obj;
        C0429i c0429i2 = (C0429i) obj2;
        RecyclerView recyclerView = c0429i.f4937d;
        if ((recyclerView == null) == (c0429i2.f4937d == null)) {
            boolean z7 = c0429i.f4934a;
            if (z7 == c0429i2.f4934a) {
                int i2 = c0429i2.f4935b - c0429i.f4935b;
                if (i2 != 0) {
                    return i2;
                }
                int i5 = c0429i.f4936c - c0429i2.f4936c;
                if (i5 != 0) {
                    return i5;
                }
                return 0;
            }
            if (z7) {
                return -1;
            }
        } else if (recyclerView != null) {
            return -1;
        }
        return 1;
    }
}
