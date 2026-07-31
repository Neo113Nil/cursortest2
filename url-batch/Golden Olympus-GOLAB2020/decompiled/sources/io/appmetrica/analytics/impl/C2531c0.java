package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2531c0 implements InterfaceC3153zn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2558d0 f38757a;

    public C2531c0(C2558d0 c2558d0) {
        this.f38757a = c2558d0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3153zn
    @NotNull
    public final Thread a() {
        return this.f38757a.f38810b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3153zn
    @Nullable
    public final StackTraceElement[] b() {
        C2558d0 c2558d0 = this.f38757a;
        return (StackTraceElement[]) c2558d0.f38809a.get(c2558d0.f38810b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3153zn
    @NotNull
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f38757a.f38809a;
    }
}
