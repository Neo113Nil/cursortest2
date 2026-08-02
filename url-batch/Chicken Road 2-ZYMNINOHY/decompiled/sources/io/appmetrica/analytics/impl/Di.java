package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Di implements InterfaceC0500b3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10202a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0500b3 f10203b;

    public Di(Object obj, InterfaceC0500b3 interfaceC0500b3) {
        this.f10202a = obj;
        this.f10203b = interfaceC0500b3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0500b3
    public final int getBytesTruncated() {
        return this.f10203b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f10202a + ", metaInfo=" + this.f10203b + '}';
    }
}
