package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603e0 implements En {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0629f0 f8067a;

    public C0603e0(C0629f0 c0629f0) {
        this.f8067a = c0629f0;
    }

    @Override // io.appmetrica.analytics.impl.En
    public final Thread a() {
        return this.f8067a.f8162b;
    }

    @Override // io.appmetrica.analytics.impl.En
    public final StackTraceElement[] b() {
        C0629f0 c0629f0 = this.f8067a;
        return (StackTraceElement[]) c0629f0.f8161a.get(c0629f0.f8162b);
    }

    @Override // io.appmetrica.analytics.impl.En
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f8067a.f8161a;
    }
}
