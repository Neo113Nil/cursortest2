package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpz extends kpq {
    private final kpy a;

    public kpz(kpy kpyVar) {
        this.a = kpyVar;
    }

    @Override // defpackage.kpg
    public final int a() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.kpq
    public final boolean b(Map.Entry entry) {
        return this.a.i(entry);
    }

    @Override // defpackage.kpq
    public final boolean c(Map.Entry entry) {
        entry.getClass();
        kpy kpyVar = this.a;
        kpyVar.f();
        int b = kpyVar.b(entry.getKey());
        if (b < 0) {
            return false;
        }
        Object[] objArr = kpyVar.c;
        objArr.getClass();
        if (!ksp.b(objArr[b], entry.getValue())) {
            return false;
        }
        kpyVar.g(b);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.h(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new kpu(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.f();
        return super.retainAll(collection);
    }
}
