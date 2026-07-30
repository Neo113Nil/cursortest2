package S5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC0628g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends AbstractC0628g {

    /* renamed from: d, reason: collision with root package name */
    public final i f2544d;

    public l(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f2544d = backing;
    }

    @Override // kotlin.collections.AbstractC0628g
    public final int a() {
        return this.f2544d.f2537q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f2544d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2544d.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f2544d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        i map = this.f2544d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new g(map, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        i iVar = this.f2544d;
        iVar.c();
        int i2 = iVar.i(obj);
        if (i2 < 0) {
            return false;
        }
        iVar.l(i2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f2544d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f2544d.c();
        return super.retainAll(elements);
    }
}
