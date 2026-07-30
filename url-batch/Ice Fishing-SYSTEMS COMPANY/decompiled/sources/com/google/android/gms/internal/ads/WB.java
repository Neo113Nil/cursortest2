package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class WB extends CC {

    /* renamed from: u, reason: collision with root package name */
    public final SB f28370u;

    /* renamed from: v, reason: collision with root package name */
    public Object f28371v;

    /* renamed from: w, reason: collision with root package name */
    public CC f28372w;

    public WB(C3026cC c3026cC) {
        super(0);
        Objects.requireNonNull(c3026cC);
        this.f28370u = c3026cC.f29649w.entrySet().f().listIterator(0);
        this.f28371v = null;
        this.f28372w = C3135eC.f30332x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28372w.hasNext() || this.f28370u.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.CC, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f28372w.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f28370u.next();
            this.f28371v = entry.getKey();
            this.f28372w = ((QB) entry.getValue()).a();
        }
        Object obj = this.f28371v;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f28372w.next());
    }
}
