package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655h3 extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f11965d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11966e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f11967a;

    /* renamed from: b, reason: collision with root package name */
    public final C0732k3 f11968b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0505b8 f11969c;

    public C0655h3(int i4, ECommerceCartItem eCommerceCartItem) {
        this(i4, new C0732k3(eCommerceCartItem), new C0681i3());
    }

    public final InterfaceC0505b8 a() {
        return this.f11969c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i4 = this.f11967a;
        return i4 != 4 ? i4 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f11969c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f11967a + ", cartItem=" + this.f11968b + ", converter=" + this.f11969c + '}';
    }

    public C0655h3(int i4, C0732k3 c0732k3, InterfaceC0505b8 interfaceC0505b8) {
        this.f11967a = i4;
        this.f11968b = c0732k3;
        this.f11969c = interfaceC0505b8;
    }
}
