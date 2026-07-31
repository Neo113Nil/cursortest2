package F0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends E0.b implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final i f493f;

    /* renamed from: e, reason: collision with root package name */
    public final f f494e;

    static {
        f fVar = f.f476r;
        f493f = new i(f.f476r);
    }

    public i(f fVar) {
        P0.h.e(fVar, "backing");
        this.f494e = fVar;
    }

    @Override // E0.b
    public final int a() {
        return this.f494e.f485m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f494e.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        P0.h.e(collection, "elements");
        this.f494e.b();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f494e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f494e.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f494e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f494e;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f494e;
        fVar.b();
        int g2 = fVar.g(obj);
        if (g2 < 0) {
            return false;
        }
        fVar.k(g2);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        P0.h.e(collection, "elements");
        this.f494e.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        P0.h.e(collection, "elements");
        this.f494e.b();
        return super.retainAll(collection);
    }
}
