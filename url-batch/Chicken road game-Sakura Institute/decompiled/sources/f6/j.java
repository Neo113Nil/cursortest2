package f6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends e6.g implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final j f3435g;

    /* renamed from: f, reason: collision with root package name */
    public final g f3436f;

    static {
        g gVar = g.f3417s;
        f3435g = new j(g.f3417s);
    }

    public j(g gVar) {
        k.f(gVar, "backing");
        this.f3436f = gVar;
    }

    @Override // e6.g
    public final int a() {
        return this.f3436f.f3426n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f3436f.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        k.f(collection, "elements");
        this.f3436f.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f3436f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3436f.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3436f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f3436f;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.f3436f;
        gVar.c();
        int h3 = gVar.h(obj);
        if (h3 < 0) {
            return false;
        }
        gVar.l(h3);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        k.f(collection, "elements");
        this.f3436f.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        k.f(collection, "elements");
        this.f3436f.c();
        return super.retainAll(collection);
    }

    public j() {
        this(new g());
    }
}
