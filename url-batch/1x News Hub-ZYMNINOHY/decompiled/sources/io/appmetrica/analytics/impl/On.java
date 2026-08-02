package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class On implements InterfaceC0584j3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6419a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0584j3 f6420b;

    public On(Object obj, InterfaceC0584j3 interfaceC0584j3) {
        this.f6419a = obj;
        this.f6420b = interfaceC0584j3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0584j3
    public final int getBytesTruncated() {
        return this.f6420b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f6419a + ", metaInfo=" + this.f6420b + '}';
    }
}
