package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class XB extends CC {

    /* renamed from: u, reason: collision with root package name */
    public final SB f28617u;

    /* renamed from: v, reason: collision with root package name */
    public CC f28618v;

    public XB(C3026cC c3026cC) {
        super(0);
        Objects.requireNonNull(c3026cC);
        this.f28617u = ((UB) c3026cC.f29649w.values()).listIterator(0);
        this.f28618v = C3135eC.f30332x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28618v.hasNext() || this.f28617u.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.CC, java.util.Iterator
    public final Object next() {
        if (!this.f28618v.hasNext()) {
            this.f28618v = ((QB) this.f28617u.next()).a();
        }
        return this.f28618v.next();
    }
}
