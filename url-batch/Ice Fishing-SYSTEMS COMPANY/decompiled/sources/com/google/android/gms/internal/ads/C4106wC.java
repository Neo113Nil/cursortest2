package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4106wC extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC2917aC f34960n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC2917aC f34961u;

    public C4106wC(AbstractC2917aC abstractC2917aC, AbstractC2917aC abstractC2917aC2) {
        this.f34960n = abstractC2917aC;
        this.f34961u = abstractC2917aC2;
    }

    public final int a() {
        return Math.min(this.f34960n.size(), this.f34961u.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f34960n.contains(obj) && this.f34961u.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f34960n.containsAll(collection) && this.f34961u.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z8 = set instanceof C4106wC;
                int a9 = z8 ? ((C4106wC) set).a() : set.size();
                if (a9 >= 0) {
                    if (z8) {
                        ((C4106wC) set).getClass();
                        size = 0;
                    } else {
                        size = set.size();
                    }
                    if (a() >= size) {
                        C3081dC c3081dC = new C3081dC(this, this.f34960n, this.f34961u);
                        int i = 0;
                        while (true) {
                            if (c3081dC.hasNext()) {
                                try {
                                    if (!set.contains(c3081dC.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i != a9) {
                                if (i >= size) {
                                    Iterator it = set.iterator();
                                    int i4 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i4++;
                                        if (i4 > i) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f34961u, this.f34960n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3081dC(this, this.f34960n, this.f34961u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f34960n.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f34961u.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
