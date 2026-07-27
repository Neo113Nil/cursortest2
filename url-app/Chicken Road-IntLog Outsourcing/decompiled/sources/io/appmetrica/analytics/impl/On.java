package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class On implements InterfaceC0735j3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7230a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0735j3 f7231b;

    public On(Object obj, InterfaceC0735j3 interfaceC0735j3) {
        this.f7230a = obj;
        this.f7231b = interfaceC0735j3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0735j3
    public final int getBytesTruncated() {
        return this.f7231b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f7230a + ", metaInfo=" + this.f7231b + '}';
    }
}
