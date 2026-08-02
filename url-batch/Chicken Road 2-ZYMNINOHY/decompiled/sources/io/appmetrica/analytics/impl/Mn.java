package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mn implements InterfaceC0500b3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10676a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0500b3 f10677b;

    public Mn(Object obj, InterfaceC0500b3 interfaceC0500b3) {
        this.f10676a = obj;
        this.f10677b = interfaceC0500b3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0500b3
    public final int getBytesTruncated() {
        return this.f10677b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f10676a + ", metaInfo=" + this.f10677b + '}';
    }
}
