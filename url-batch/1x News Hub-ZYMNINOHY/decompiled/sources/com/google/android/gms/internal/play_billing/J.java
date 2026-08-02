package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class J implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f2750a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2751b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2752c;

    public J(Iterator it) {
        it.getClass();
        this.f2750a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2751b || this.f2750a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f2751b) {
            return this.f2750a.next();
        }
        Object obj = this.f2752c;
        this.f2751b = false;
        this.f2752c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f2751b) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f2750a.remove();
    }
}
