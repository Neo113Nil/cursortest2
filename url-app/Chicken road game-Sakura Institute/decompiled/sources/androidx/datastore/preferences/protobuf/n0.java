package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n0 extends AbstractList implements C, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final B f5383d;

    public n0(B b4) {
        this.f5383d = b4;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final C c() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return (String) this.f5383d.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m0 m0Var = new m0();
        m0Var.f5380d = this.f5383d.iterator();
        return m0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        l0 l0Var = new l0();
        l0Var.f5378d = this.f5383d.listIterator(i2);
        return l0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object n(int i2) {
        return this.f5383d.f5256e.get(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final List r() {
        return Collections.unmodifiableList(this.f5383d.f5256e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5383d.size();
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void v(C0442g c0442g) {
        throw new UnsupportedOperationException();
    }
}
