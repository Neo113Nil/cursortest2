package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891p3 extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8980d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8981e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f8982a;

    /* renamed from: b, reason: collision with root package name */
    public final C0968s3 f8983b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0689h8 f8984c;

    public C0891p3(int i2, ECommerceCartItem eCommerceCartItem) {
        this(i2, new C0968s3(eCommerceCartItem), new C0917q3());
    }

    public final InterfaceC0689h8 a() {
        return this.f8984c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i2 = this.f8982a;
        return i2 != 4 ? i2 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f8984c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f8982a + ", cartItem=" + this.f8983b + ", converter=" + this.f8984c + '}';
    }

    public C0891p3(int i2, C0968s3 c0968s3, InterfaceC0689h8 interfaceC0689h8) {
        this.f8982a = i2;
        this.f8983b = c0968s3;
        this.f8984c = interfaceC0689h8;
    }
}
