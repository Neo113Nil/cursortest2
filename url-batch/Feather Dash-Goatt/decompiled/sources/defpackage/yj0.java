package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yj0 extends c0 {
    public final xj0 d;

    public yj0(xj0 xj0Var) {
        this.d = xj0Var;
    }

    @Override // defpackage.h0
    public final int a() {
        return this.d.m;
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

    @Override // defpackage.c0
    public final boolean b(Map.Entry entry) {
        entry.getClass();
        xj0 xj0Var = this.d;
        xj0Var.getClass();
        int f = xj0Var.f(entry.getKey());
        if (f < 0) {
            return false;
        }
        Object[] objArr = xj0Var.e;
        objArr.getClass();
        return Intrinsics.a(objArr[f], entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.d.d(collection);
    }

    @Override // defpackage.c0
    public final boolean d(Map.Entry entry) {
        entry.getClass();
        xj0 xj0Var = this.d;
        xj0Var.getClass();
        entry.getClass();
        xj0Var.b();
        int f = xj0Var.f(entry.getKey());
        if (f < 0) {
            return false;
        }
        Object[] objArr = xj0Var.e;
        objArr.getClass();
        if (!Intrinsics.a(objArr[f], entry.getValue())) {
            return false;
        }
        xj0Var.j(f);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        xj0 xj0Var = this.d;
        xj0Var.getClass();
        return new uj0(xj0Var, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.d.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.d.b();
        return super.retainAll(collection);
    }
}
