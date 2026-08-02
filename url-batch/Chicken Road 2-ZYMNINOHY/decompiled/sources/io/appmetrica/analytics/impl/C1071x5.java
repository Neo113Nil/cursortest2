package io.appmetrica.analytics.impl;

import i2.AbstractC0457a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071x5 implements F8, S8 {

    /* renamed from: a, reason: collision with root package name */
    public final L6 f13011a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f13012b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f13013c;

    public C1071x5(L6 l6) {
        this.f13011a = l6;
        Set B4 = AbstractC0457a.B(Integer.valueOf(EnumC0508bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC0508bb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC0508bb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC0508bb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC0508bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC0508bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC0508bb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC0508bb.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f13012b = B4;
        this.f13013c = new AtomicLong(l6.a(B4));
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a() {
        this.f13013c.set(this.f13011a.a(this.f13012b));
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        return this.f13013c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void b(List<Integer> list) {
        int i4 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f13012b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i4 = i4 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f13013c.addAndGet(-i4);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a(List<Integer> list) {
        int i4 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f13012b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i4 = i4 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f13013c.addAndGet(i4);
    }
}
