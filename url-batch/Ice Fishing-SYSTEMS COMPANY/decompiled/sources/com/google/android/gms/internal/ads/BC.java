package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class BC implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f24008n;

    public BC(Iterator it) {
        it.getClass();
        this.f24008n = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24008n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f24008n.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f24008n.remove();
    }
}
