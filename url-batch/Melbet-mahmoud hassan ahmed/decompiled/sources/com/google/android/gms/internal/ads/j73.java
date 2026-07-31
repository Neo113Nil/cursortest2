package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class j73 extends h93 {

    /* renamed from: f, reason: collision with root package name */
    final Iterator<? extends z63> f7009f;

    /* renamed from: g, reason: collision with root package name */
    Iterator f7010g = r73.f11045i;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ n73 f7011h;

    j73(n73 n73Var) {
        this.f7011h = n73Var;
        this.f7009f = ((e73) n73Var.f8970i.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7010g.hasNext() || this.f7009f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f7010g.hasNext()) {
            this.f7010g = this.f7009f.next().iterator();
        }
        return this.f7010g.next();
    }
}
