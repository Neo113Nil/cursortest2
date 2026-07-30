package S5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: d, reason: collision with root package name */
    public final i f2542d;

    public j(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f2542d = backing;
    }

    @Override // kotlin.collections.AbstractC0630i
    public final int a() {
        return this.f2542d.f2537q;
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

    @Override // S5.a
    public final boolean b(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f2542d.f(element);
    }

    @Override // S5.a
    public final boolean c(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        i iVar = this.f2542d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        iVar.c();
        int h7 = iVar.h(entry.getKey());
        if (h7 < 0) {
            return false;
        }
        Object[] objArr = iVar.f2530e;
        Intrinsics.b(objArr);
        if (!Intrinsics.a(objArr[h7], entry.getValue())) {
            return false;
        }
        iVar.l(h7);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2542d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f2542d.e(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2542d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i map = this.f2542d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new g(map, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f2542d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f2542d.c();
        return super.retainAll(elements);
    }
}
