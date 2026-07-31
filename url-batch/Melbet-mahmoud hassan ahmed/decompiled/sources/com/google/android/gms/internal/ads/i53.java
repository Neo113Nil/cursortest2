package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class i53 implements Iterator<Map.Entry> {

    /* renamed from: f, reason: collision with root package name */
    final Iterator<Map.Entry> f6540f;

    /* renamed from: g, reason: collision with root package name */
    Collection f6541g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ j53 f6542h;

    i53(j53 j53Var) {
        this.f6542h = j53Var;
        this.f6540f = j53Var.f6980h.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6540f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        Map.Entry next = this.f6540f.next();
        this.f6541g = (Collection) next.getValue();
        return this.f6542h.b(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        q43.g(this.f6541g != null, "no calls to next() since the last call to remove()");
        this.f6540f.remove();
        x53 x53Var = this.f6542h.f6981i;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 - this.f6541g.size();
        this.f6541g.clear();
        this.f6541g = null;
    }
}
