package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821ne extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f12452d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12453e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f12454a;

    /* renamed from: b, reason: collision with root package name */
    public final C0873pe f12455b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0505b8 f12456c;

    public C0821ne(int i4, ECommerceOrder eCommerceOrder) {
        this(i4, new C0873pe(eCommerceOrder), new C0847oe());
    }

    public final InterfaceC0505b8 a() {
        return this.f12456c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f12456c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f12454a + ", order=" + this.f12455b + ", converter=" + this.f12456c + '}';
    }

    public C0821ne(int i4, C0873pe c0873pe, InterfaceC0505b8 interfaceC0505b8) {
        this.f12454a = i4;
        this.f12455b = c0873pe;
        this.f12456c = interfaceC0505b8;
    }
}
