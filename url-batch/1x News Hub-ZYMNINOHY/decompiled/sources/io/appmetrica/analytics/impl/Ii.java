package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ii implements InterfaceC0584j3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6160a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0584j3 f6161b;

    public Ii(Object obj, InterfaceC0584j3 interfaceC0584j3) {
        this.f6160a = obj;
        this.f6161b = interfaceC0584j3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0584j3
    public final int getBytesTruncated() {
        return this.f6161b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f6160a + ", metaInfo=" + this.f6161b + '}';
    }
}
