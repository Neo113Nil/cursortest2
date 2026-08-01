package id;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends n implements Set, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final k f4709e = new k(null);

    /* renamed from: i, reason: collision with root package name */
    public static final l f4710i;

    /* renamed from: d, reason: collision with root package name */
    public final h f4711d;

    static {
        h.B.getClass();
        f4710i = new l(h.C);
    }

    public l() {
        this.f4711d = new h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f4711d.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.f4711d.c();
        return super.addAll(collection);
    }

    @Override // kotlin.collections.n
    public final int b() {
        return this.f4711d.f4702w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4711d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4711d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4711d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        h hVar = this.f4711d;
        hVar.getClass();
        return new f(hVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        h hVar = this.f4711d;
        hVar.c();
        int g = hVar.g(obj);
        if (g < 0) {
            return false;
        }
        hVar.k(g);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f4711d.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f4711d.c();
        return super.retainAll(collection);
    }

    public l(h hVar) {
        hVar.getClass();
        this.f4711d = hVar;
    }
}
