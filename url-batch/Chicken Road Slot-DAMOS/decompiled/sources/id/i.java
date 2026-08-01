package id;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: d, reason: collision with root package name */
    public final h f4706d;

    public i(h hVar) {
        this.f4706d = hVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.n
    public final int b() {
        return this.f4706d.f4702w;
    }

    @Override // id.a
    public final boolean c(Map.Entry entry) {
        entry.getClass();
        h hVar = this.f4706d;
        hVar.getClass();
        int g = hVar.g(entry.getKey());
        if (g < 0) {
            return false;
        }
        Object[] objArr = hVar.f4695e;
        objArr.getClass();
        return Intrinsics.a(objArr[g], entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4706d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f4706d.e(collection);
    }

    @Override // id.a
    public final boolean e(Map.Entry entry) {
        entry.getClass();
        h hVar = this.f4706d;
        hVar.getClass();
        entry.getClass();
        hVar.c();
        int g = hVar.g(entry.getKey());
        if (g < 0) {
            return false;
        }
        Object[] objArr = hVar.f4695e;
        objArr.getClass();
        if (!Intrinsics.a(objArr[g], entry.getValue())) {
            return false;
        }
        hVar.k(g);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4706d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        h hVar = this.f4706d;
        hVar.getClass();
        return new f(hVar, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f4706d.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f4706d.c();
        return super.retainAll(collection);
    }
}
