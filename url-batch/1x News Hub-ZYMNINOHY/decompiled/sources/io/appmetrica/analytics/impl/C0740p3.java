package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740p3 extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8056d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8057e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f8058a;

    /* renamed from: b, reason: collision with root package name */
    public final C0817s3 f8059b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0538h8 f8060c;

    public C0740p3(int i3, ECommerceCartItem eCommerceCartItem) {
        this(i3, new C0817s3(eCommerceCartItem), new C0766q3());
    }

    public final InterfaceC0538h8 a() {
        return this.f8060c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i3 = this.f8058a;
        return i3 != 4 ? i3 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f8060c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f8058a + ", cartItem=" + this.f8059b + ", converter=" + this.f8060c + '}';
    }

    public C0740p3(int i3, C0817s3 c0817s3, InterfaceC0538h8 interfaceC0538h8) {
        this.f8058a = i3;
        this.f8059b = c0817s3;
        this.f8060c = interfaceC0538h8;
    }
}
