package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.zC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4268zC extends C4160xC implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f35127n).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f35127n.iterator();
        it.getClass();
        InterfaceC2916aB interfaceC2916aB = this.f35128u;
        interfaceC2916aB.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC2916aB.b(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C4268zC(((SortedSet) this.f35127n).headSet(obj), this.f35128u);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f35127n;
        while (true) {
            Object last = sortedSet.last();
            if (this.f35128u.b(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C4268zC(((SortedSet) this.f35127n).subSet(obj, obj2), this.f35128u);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C4268zC(((SortedSet) this.f35127n).tailSet(obj), this.f35128u);
    }
}
