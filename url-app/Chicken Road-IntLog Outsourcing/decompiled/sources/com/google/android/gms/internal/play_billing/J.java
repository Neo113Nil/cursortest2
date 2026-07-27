package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class J implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f5067a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5068b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5069c;

    public J(Iterator it) {
        it.getClass();
        this.f5067a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5068b || this.f5067a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f5068b) {
            return this.f5067a.next();
        }
        Object obj = this.f5069c;
        this.f5068b = false;
        this.f5069c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f5068b) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f5067a.remove();
    }
}
