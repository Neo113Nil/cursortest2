package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lx1;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
final class kx1 extends lx1.d<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f28349b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Set f28350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kx1(uj0 uj0Var, uj0 uj0Var2) {
        super();
        this.f28349b = uj0Var;
        this.f28350c = uj0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f28349b.contains(obj) && this.f28350c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f28349b.containsAll(collection) && this.f28350c.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f28350c, this.f28349b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jx1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f28349b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f28350c.contains(it.next())) {
                i4++;
            }
        }
        return i4;
    }
}
