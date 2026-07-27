package A2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: d, reason: collision with root package name */
    public final e f839d;

    public i(e backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f839d = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f839d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f839d.e(elements);
    }

    @Override // z2.AbstractC1430n
    public final int e() {
        return this.f839d.f827o;
    }

    @Override // A2.a
    public final boolean h(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f839d.f(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f839d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e map = this.f839d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new f(map, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f839d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f839d.c();
        return super.retainAll(elements);
    }

    @Override // A2.a
    public final boolean s(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        e eVar = this.f839d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        eVar.c();
        int h4 = eVar.h(entry.getKey());
        if (h4 < 0) {
            return false;
        }
        Object[] objArr = eVar.f820e;
        Intrinsics.c(objArr);
        if (!Intrinsics.a(objArr[h4], entry.getValue())) {
            return false;
        }
        eVar.n(h4);
        return true;
    }
}
