package s4;

import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f8423a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8424b;

    public e(int i3, List list) {
        this.f8423a = list;
        this.f8424b = i3;
        if (list.isEmpty() && i3 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i3 >= 0 && i3 < size) {
                return;
            }
        }
        i0.i(l.i(i3, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), new IntRange(0, list.size() - 1, 1), "'.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8424b == eVar.f8424b && Intrinsics.a(this.f8423a, eVar.f8423a);
    }

    public final int hashCode() {
        return this.f8423a.hashCode() + (this.f8424b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f8424b + ", mergedHistory=" + this.f8423a + ')';
    }

    public e() {
        this(-1, j0.f5574d);
    }
}
