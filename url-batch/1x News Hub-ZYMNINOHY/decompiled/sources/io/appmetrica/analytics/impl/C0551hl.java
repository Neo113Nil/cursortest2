package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551hl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f7460a;

    /* renamed from: b, reason: collision with root package name */
    public final Cg f7461b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0538h8 f7462c;

    public C0551hl(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Mf(eCommerceProduct), eCommerceReferrer == null ? null : new Cg(eCommerceReferrer), new C0576il());
    }

    public final InterfaceC0538h8 a() {
        return this.f7462c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f7462c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f7460a + ", referrer=" + this.f7461b + ", converter=" + this.f7462c + '}';
    }

    public C0551hl(Mf mf, Cg cg, InterfaceC0538h8 interfaceC0538h8) {
        this.f7460a = mf;
        this.f7461b = cg;
        this.f7462c = interfaceC0538h8;
    }
}
