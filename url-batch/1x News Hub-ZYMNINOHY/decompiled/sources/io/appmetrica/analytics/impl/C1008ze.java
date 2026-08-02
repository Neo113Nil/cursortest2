package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1008ze implements X8, Ae {

    /* renamed from: a, reason: collision with root package name */
    public final S6 f8686a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f8687b;

    public C1008ze(S6 s6) {
        this.f8686a = s6;
        this.f8687b = new AtomicLong(s6.b());
        s6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a(List<Integer> list) {
        this.f8687b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void b(List<Integer> list) {
        this.f8687b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a() {
        this.f8687b.set(this.f8686a.b());
    }

    public final long b() {
        return this.f8687b.get();
    }
}
