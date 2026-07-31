package s4;

import a0.q;
import d6.u;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f6705a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6706b;

    public d(int i, List list) {
        this.f6705a = list;
        this.f6706b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder l3 = q.l("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        l3.append(new v6.d(0, list.size() - 1, 1));
        l3.append("'.");
        throw new IllegalArgumentException(l3.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6706b == dVar.f6706b && q6.i.a(this.f6705a, dVar.f6705a);
    }

    public final int hashCode() {
        return this.f6705a.hashCode() + (this.f6706b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f6706b + ", mergedHistory=" + this.f6705a + ')';
    }

    public d() {
        this(-1, u.f2326d);
    }
}
