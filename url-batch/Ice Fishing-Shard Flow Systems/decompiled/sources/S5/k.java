package S5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC0630i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends AbstractC0630i {

    /* renamed from: d, reason: collision with root package name */
    public final i f2543d;

    public k(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f2543d = backing;
    }

    @Override // kotlin.collections.AbstractC0630i
    public final int a() {
        return this.f2543d.f2537q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2543d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2543d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2543d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i map = this.f2543d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new g(map, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        i iVar = this.f2543d;
        iVar.c();
        int h7 = iVar.h(obj);
        if (h7 < 0) {
            return false;
        }
        iVar.l(h7);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f2543d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f2543d.c();
        return super.retainAll(elements);
    }
}
