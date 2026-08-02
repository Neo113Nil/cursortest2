package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976te implements S8, InterfaceC1002ue {

    /* renamed from: a, reason: collision with root package name */
    public final L6 f12781a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f12782b;

    public C0976te(L6 l6) {
        this.f12781a = l6;
        this.f12782b = new AtomicLong(l6.a());
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a(List<Integer> list) {
        this.f12782b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void b(List<Integer> list) {
        this.f12782b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a() {
        this.f12782b.set(this.f12781a.a());
    }

    public final long b() {
        return this.f12782b.get();
    }
}
