package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0135e0 implements Dn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0161f0 f1226a;

    public C0135e0(C0161f0 c0161f0) {
        this.f1226a = c0161f0;
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final Thread a() {
        return this.f1226a.b;
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final StackTraceElement[] b() {
        C0161f0 c0161f0 = this.f1226a;
        return (StackTraceElement[]) c0161f0.f1245a.get(c0161f0.b);
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f1226a.f1245a;
    }
}
