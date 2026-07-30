package i5;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    public final c f4941f;

    public f(List list, Comparator comparator) {
        Map map = Collections.EMPTY_MAP;
        this.f4941f = list.size() < 25 ? b.C(list, map, comparator) : g3.k.o(list, map, comparator);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f4941f.equals(((f) obj).f4941f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4941f.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f4941f.iterator(), 0);
    }

    public f(c cVar) {
        this.f4941f = cVar;
    }
}
