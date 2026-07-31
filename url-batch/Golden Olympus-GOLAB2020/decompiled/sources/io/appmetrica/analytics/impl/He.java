package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class He implements InterfaceC2776l9, Ie {

    /* renamed from: a, reason: collision with root package name */
    public final C2645g7 f37636a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f37637b;

    public He(@NotNull C2645g7 c2645g7) {
        this.f37636a = c2645g7;
        this.f37637b = new AtomicLong(c2645g7.b());
        c2645g7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2776l9
    public final void a(@NotNull List<Integer> list) {
        this.f37637b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2776l9
    public final void b(@NotNull List<Integer> list) {
        this.f37637b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2776l9
    public final void a() {
        this.f37637b.set(this.f37636a.b());
    }

    public final long b() {
        return this.f37637b.get();
    }
}
