package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yh1 extends p0 {
    public final uh1 m;

    public yh1(uh1 uh1Var) {
        this.m = uh1Var;
    }

    @Override // defpackage.u0
    public final int a() {
        return this.m.u;
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

    @Override // defpackage.p0
    public final boolean b(Map.Entry entry) {
        entry.getClass();
        uh1 uh1Var = this.m;
        uh1Var.getClass();
        int g = uh1Var.g(entry.getKey());
        if (g < 0) {
            return false;
        }
        Object[] objArr = uh1Var.n;
        objArr.getClass();
        return Intrinsics.b(objArr[g], entry.getValue());
    }

    @Override // defpackage.p0
    public final boolean c(Map.Entry entry) {
        entry.getClass();
        uh1 uh1Var = this.m;
        uh1Var.getClass();
        entry.getClass();
        uh1Var.c();
        int g = uh1Var.g(entry.getKey());
        if (g < 0) {
            return false;
        }
        Object[] objArr = uh1Var.n;
        objArr.getClass();
        if (!Intrinsics.b(objArr[g], entry.getValue())) {
            return false;
        }
        uh1Var.k(g);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.m.e(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        uh1 uh1Var = this.m;
        uh1Var.getClass();
        return new vh1(uh1Var, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.m.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.m.c();
        return super.retainAll(collection);
    }
}
