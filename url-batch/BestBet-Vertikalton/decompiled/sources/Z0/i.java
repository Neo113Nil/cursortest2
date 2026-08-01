package Z0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends Y0.f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f1553b;

    /* renamed from: a, reason: collision with root package name */
    public final f f1554a;

    static {
        f fVar = f.f1539n;
        f1553b = new i(f.f1539n);
    }

    public i(f fVar) {
        k1.e.e(fVar, "backing");
        this.f1554a = fVar;
    }

    @Override // Y0.f
    public final int a() {
        return this.f1554a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f1554a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        k1.e.e(collection, "elements");
        this.f1554a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f1554a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f1554a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1554a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f1554a;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f1554a;
        fVar.c();
        int h = fVar.h(obj);
        if (h < 0) {
            return false;
        }
        fVar.l(h);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        k1.e.e(collection, "elements");
        this.f1554a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        k1.e.e(collection, "elements");
        this.f1554a.c();
        return super.retainAll(collection);
    }

    public i() {
        this(new f());
    }
}
