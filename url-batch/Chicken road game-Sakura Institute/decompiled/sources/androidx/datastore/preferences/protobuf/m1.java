package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m1 extends AbstractList implements c0, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public final b0 f866f;

    public m1(b0 b0Var) {
        this.f866f = b0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f866f.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void h(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        l1 l1Var = new l1();
        l1Var.f862f = this.f866f.iterator();
        return l1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        k1 k1Var = new k1();
        k1Var.f854f = this.f866f.listIterator(i7);
        return k1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final Object p(int i7) {
        return this.f866f.f795g.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final List q() {
        return Collections.unmodifiableList(this.f866f.f795g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f866f.size();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final c0 l() {
        return this;
    }
}
