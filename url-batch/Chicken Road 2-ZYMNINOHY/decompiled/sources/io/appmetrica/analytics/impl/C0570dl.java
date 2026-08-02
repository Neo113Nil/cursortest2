package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570dl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f11684a;

    /* renamed from: b, reason: collision with root package name */
    public final C1082xg f11685b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0505b8 f11686c;

    public C0570dl(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Hf(eCommerceProduct), eCommerceReferrer == null ? null : new C1082xg(eCommerceReferrer), new C0595el());
    }

    public final InterfaceC0505b8 a() {
        return this.f11686c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f11686c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f11684a + ", referrer=" + this.f11685b + ", converter=" + this.f11686c + '}';
    }

    public C0570dl(Hf hf, C1082xg c1082xg, InterfaceC0505b8 interfaceC0505b8) {
        this.f11684a = hf;
        this.f11685b = c1082xg;
        this.f11686c = interfaceC0505b8;
    }
}
