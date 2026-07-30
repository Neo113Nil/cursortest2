package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class YB extends QB {

    /* renamed from: u, reason: collision with root package name */
    public final transient C3026cC f28811u;

    public YB(C3026cC c3026cC) {
        this.f28811u = c3026cC;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final CC a() {
        return new XB(this.f28811u);
    }

    @Override // com.google.android.gms.internal.ads.QB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28811u.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int h(Object[] objArr, int i) {
        SB listIterator = ((UB) this.f28811u.f29649w.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((QB) listIterator.next()).h(objArr, i);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new XB(this.f28811u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f28811u.f29650x;
    }
}
