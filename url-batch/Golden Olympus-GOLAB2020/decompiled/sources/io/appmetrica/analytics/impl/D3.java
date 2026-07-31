package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes3.dex */
public final class D3 extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f37336d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37337e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f37338a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final G3 f37339b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3034v8 f37340c;

    public D3(int i4, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i4, new G3(eCommerceCartItem), new E3());
    }

    @NonNull
    public final InterfaceC3034v8 a() {
        return this.f37340c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i4 = this.f37338a;
        return i4 != 4 ? i4 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f37340c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f37338a + ", cartItem=" + this.f37339b + ", converter=" + this.f37340c + '}';
    }

    public D3(int i4, @NonNull G3 g32, @NonNull InterfaceC3034v8 interfaceC3034v8) {
        this.f37338a = i4;
        this.f37339b = g32;
        this.f37340c = interfaceC3034v8;
    }
}
