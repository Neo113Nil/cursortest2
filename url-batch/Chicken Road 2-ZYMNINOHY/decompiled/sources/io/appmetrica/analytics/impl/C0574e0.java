package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574e0 implements Cn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0600f0 f11719a;

    public C0574e0(C0600f0 c0600f0) {
        this.f11719a = c0600f0;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final Thread a() {
        return this.f11719a.f11817b;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final StackTraceElement[] b() {
        C0600f0 c0600f0 = this.f11719a;
        return (StackTraceElement[]) c0600f0.f11816a.get(c0600f0.f11817b);
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f11719a.f11816a;
    }
}
