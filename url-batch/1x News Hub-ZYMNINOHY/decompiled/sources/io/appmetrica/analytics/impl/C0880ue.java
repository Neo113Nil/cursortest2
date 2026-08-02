package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880ue extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8454d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8455e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f8456a;

    /* renamed from: b, reason: collision with root package name */
    public final C0932we f8457b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0538h8 f8458c;

    public C0880ue(int i3, ECommerceOrder eCommerceOrder) {
        this(i3, new C0932we(eCommerceOrder), new C0906ve());
    }

    public final InterfaceC0538h8 a() {
        return this.f8458c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f8458c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f8456a + ", order=" + this.f8457b + ", converter=" + this.f8458c + '}';
    }

    public C0880ue(int i3, C0932we c0932we, InterfaceC0538h8 interfaceC0538h8) {
        this.f8456a = i3;
        this.f8457b = c0932we;
        this.f8458c = interfaceC0538h8;
    }
}
