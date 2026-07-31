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
    public final B f5109d;

    public n0(B b3) {
        this.f5109d = b3;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final C a() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object e(int i3) {
        return this.f5109d.f4982e.get(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final List g() {
        return Collections.unmodifiableList(this.f5109d.f4982e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        return (String) this.f5109d.get(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void h(C0253g c0253g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m0 m0Var = new m0();
        m0Var.f5106d = this.f5109d.iterator();
        return m0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        l0 l0Var = new l0();
        l0Var.f5104d = this.f5109d.listIterator(i3);
        return l0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5109d.size();
    }
}
