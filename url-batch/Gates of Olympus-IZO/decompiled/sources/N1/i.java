package N1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends M1.g implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final i f2890e;

    /* renamed from: d, reason: collision with root package name */
    public final g f2891d;

    static {
        g gVar = g.f2875q;
        f2890e = new i(g.f2875q);
    }

    public i(g gVar) {
        Z1.i.f(gVar, "backing");
        this.f2891d = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f2891d.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Z1.i.f(collection, "elements");
        this.f2891d.c();
        return super.addAll(collection);
    }

    @Override // M1.g
    public final int b() {
        return this.f2891d.f2884l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2891d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2891d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2891d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f2891d;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.f2891d;
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
        Z1.i.f(collection, "elements");
        this.f2891d.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Z1.i.f(collection, "elements");
        this.f2891d.c();
        return super.retainAll(collection);
    }

    public i() {
        this(new g());
    }
}
