package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class T5 implements Y8, InterfaceC2776l9 {

    /* renamed from: a, reason: collision with root package name */
    public final C2645g7 f38294a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f38295b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f38296c;

    public T5(@NotNull C2645g7 c2645g7) {
        this.f38294a = c2645g7;
        Set h4 = kotlin.collections.T.h(Integer.valueOf(EnumC3063wb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC3063wb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC3063wb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC3063wb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC3063wb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC3063wb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC3063wb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC3063wb.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f38295b = h4;
        this.f38296c = new AtomicLong(c2645g7.a(h4));
        c2645g7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2776l9
    public final void a() {
        this.f38296c.set(this.f38294a.a(this.f38295b));
    }

    @Override // io.appmetrica.analytics.impl.Y8
    public final boolean b() {
        return this.f38296c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2776l9
    public final void b(@NotNull List<Integer> list) {
        int i4 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f38295b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i4 = i4 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.f38296c.addAndGet(-i4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2776l9
    public final void a(@NotNull List<Integer> list) {
        int i4 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f38295b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i4 = i4 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.f38296c.addAndGet(i4);
    }
}
