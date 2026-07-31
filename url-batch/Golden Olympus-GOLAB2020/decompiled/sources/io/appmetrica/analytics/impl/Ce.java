package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* loaded from: classes3.dex */
public final class Ce extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f37296d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37297e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f37298a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Ee f37299b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3034v8 f37300c;

    public Ce(int i4, @NonNull ECommerceOrder eCommerceOrder) {
        this(i4, new Ee(eCommerceOrder), new De());
    }

    @NonNull
    public final InterfaceC3034v8 a() {
        return this.f37300c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f37300c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f37298a + ", order=" + this.f37299b + ", converter=" + this.f37300c + '}';
    }

    public Ce(int i4, @NonNull Ee ee, @NonNull InterfaceC3034v8 interfaceC3034v8) {
        this.f37298a = i4;
        this.f37299b = ee;
        this.f37300c = interfaceC3034v8;
    }
}
