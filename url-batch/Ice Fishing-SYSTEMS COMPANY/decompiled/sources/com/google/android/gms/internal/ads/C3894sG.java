package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.sG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3894sG implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f34224n;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f34225u;

    public /* synthetic */ C3894sG(Iterator it, Iterator it2) {
        this.f34224n = it;
        this.f34225u = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34224n.hasNext() || this.f34225u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f34224n;
        return it.hasNext() ? it.next() : this.f34225u.next();
    }
}
