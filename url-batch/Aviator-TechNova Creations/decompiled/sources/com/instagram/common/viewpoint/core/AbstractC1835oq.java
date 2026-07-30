package com.instagram.common.viewpoint.core;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: com.facebook.ads.redexgen.X.oq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1835oq<E> extends AbstractSet<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oq != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c) {
        return AbstractC1839ou.A0A(this, c);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oq != com.google.common.collect.Sets$ImprovedAbstractSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c) {
        return super.retainAll((Collection) AbstractC1501jA.A04(c));
    }
}
