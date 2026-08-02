package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452e0 implements En {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0478f0 f7208a;

    public C0452e0(C0478f0 c0478f0) {
        this.f7208a = c0478f0;
    }

    @Override // io.appmetrica.analytics.impl.En
    public final Thread a() {
        return this.f7208a.f7295b;
    }

    @Override // io.appmetrica.analytics.impl.En
    public final StackTraceElement[] b() {
        C0478f0 c0478f0 = this.f7208a;
        return (StackTraceElement[]) c0478f0.f7294a.get(c0478f0.f7295b);
    }

    @Override // io.appmetrica.analytics.impl.En
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f7208a.f7294a;
    }
}
