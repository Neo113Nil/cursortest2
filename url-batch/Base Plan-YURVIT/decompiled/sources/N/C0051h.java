package N;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: N.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0053j c0053j = (C0053j) obj;
        C0053j c0053j2 = (C0053j) obj2;
        RecyclerView recyclerView = c0053j.f747d;
        if ((recyclerView == null) == (c0053j2.f747d == null)) {
            boolean z2 = c0053j.f744a;
            if (z2 == c0053j2.f744a) {
                int i2 = c0053j2.f745b - c0053j.f745b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c0053j.f746c - c0053j2.f746c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
            if (z2) {
                return -1;
            }
        } else if (recyclerView != null) {
            return -1;
        }
        return 1;
    }
}
