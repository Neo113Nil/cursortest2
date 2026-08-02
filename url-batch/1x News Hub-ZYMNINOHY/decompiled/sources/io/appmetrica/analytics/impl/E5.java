package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class E5 implements K8, X8 {

    /* renamed from: a, reason: collision with root package name */
    public final S6 f5945a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5946b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f5947c;

    public E5(S6 s6) {
        this.f5945a = s6;
        Set F3 = C2.b.F(Integer.valueOf(EnumC0567ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC0567ib.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC0567ib.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC0567ib.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC0567ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC0567ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC0567ib.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC0567ib.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f5946b = F3;
        this.f5947c = new AtomicLong(s6.a(F3));
        s6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a() {
        this.f5947c.set(this.f5945a.a(this.f5946b));
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        return this.f5947c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void b(List<Integer> list) {
        int i3 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f5946b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i3 = i3 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f5947c.addAndGet(-i3);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a(List<Integer> list) {
        int i3 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f5946b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i3 = i3 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f5947c.addAndGet(i3);
    }
}
