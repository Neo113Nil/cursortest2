package d1;

import java.util.List;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f1283a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1284b;

    public c(List list, int i) {
        this.f1283a = list;
        this.f1284b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i + "', bounds = '" + new m3.c(0, list.size() - 1, 1) + "'.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1284b == cVar.f1284b && i3.d.a(this.f1283a, cVar.f1283a);
    }

    public final int hashCode() {
        return this.f1283a.hashCode() + (this.f1284b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f1284b + ", mergedHistory=" + this.f1283a + ')';
    }

    public c() {
        this(q.f3887f, -1);
    }
}
