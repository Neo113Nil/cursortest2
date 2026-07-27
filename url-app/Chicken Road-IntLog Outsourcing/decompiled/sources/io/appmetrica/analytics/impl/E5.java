package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class E5 implements K8, X8 {

    /* renamed from: a, reason: collision with root package name */
    public final S6 f6734a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f6735b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f6736c;

    public E5(S6 s6) {
        this.f6734a = s6;
        Set x5 = e5.g.x(Integer.valueOf(EnumC0718ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC0718ib.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC0718ib.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC0718ib.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC0718ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC0718ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC0718ib.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC0718ib.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f6735b = x5;
        this.f6736c = new AtomicLong(s6.a(x5));
        s6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a() {
        this.f6736c.set(this.f6734a.a(this.f6735b));
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        return this.f6736c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void b(List<Integer> list) {
        int i2 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f6735b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f6736c.addAndGet(-i2);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a(List<Integer> list) {
        int i2 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f6735b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f6736c.addAndGet(i2);
    }
}
