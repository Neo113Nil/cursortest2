package T1;

import f2.j;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends S1.g implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f4370e;

    /* renamed from: d, reason: collision with root package name */
    public final f f4371d;

    static {
        f fVar = f.f4354q;
        f4370e = new h(f.f4354q);
    }

    public h(f fVar) {
        j.f(fVar, "backing");
        this.f4371d = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f4371d.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        j.f(collection, "elements");
        this.f4371d.c();
        return super.addAll(collection);
    }

    @Override // S1.g
    public final int b() {
        return this.f4371d.f4363l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4371d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4371d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4371d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f4371d;
        fVar.getClass();
        return new c(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f4371d;
        fVar.c();
        int h3 = fVar.h(obj);
        if (h3 < 0) {
            return false;
        }
        fVar.l(h3);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        j.f(collection, "elements");
        this.f4371d.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        j.f(collection, "elements");
        this.f4371d.c();
        return super.retainAll(collection);
    }

    public h() {
        this(new f());
    }
}
