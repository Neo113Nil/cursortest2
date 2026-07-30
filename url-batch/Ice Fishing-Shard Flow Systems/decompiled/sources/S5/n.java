package S5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC0630i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends AbstractC0630i implements Set, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final m f2545e = new m(null);

    /* renamed from: i, reason: collision with root package name */
    public static final n f2546i;

    /* renamed from: d, reason: collision with root package name */
    public final i f2547d;

    static {
        i.f2527v.getClass();
        f2546i = new n(i.f2528w);
    }

    public n(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f2547d = backing;
    }

    @Override // kotlin.collections.AbstractC0630i
    public final int a() {
        return this.f2547d.f2537q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f2547d.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f2547d.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2547d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2547d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2547d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i map = this.f2547d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new g(map, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        i iVar = this.f2547d;
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
        this.f2547d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f2547d.c();
        return super.retainAll(elements);
    }

    public n() {
        this(new i());
    }
}
