package Y0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends X0.g implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f1418b;

    /* renamed from: a, reason: collision with root package name */
    public final f f1419a;

    static {
        f fVar = f.f1404n;
        f1418b = new i(f.f1404n);
    }

    public i(f fVar) {
        j1.h.e(fVar, "backing");
        this.f1419a = fVar;
    }

    @Override // X0.g
    public final int a() {
        return this.f1419a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f1419a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        j1.h.e(collection, "elements");
        this.f1419a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f1419a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1419a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1419a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f1419a;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f1419a;
        fVar.c();
        int h2 = fVar.h(obj);
        if (h2 < 0) {
            return false;
        }
        fVar.l(h2);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        j1.h.e(collection, "elements");
        this.f1419a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        j1.h.e(collection, "elements");
        this.f1419a.c();
        return super.retainAll(collection);
    }

    public i() {
        this(new f());
    }
}
