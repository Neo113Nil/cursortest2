package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518bl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f11551a;

    /* renamed from: b, reason: collision with root package name */
    public final C0542cj f11552b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0505b8 f11553c;

    public C0518bl(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new Hf(eCommerceProduct), new C0542cj(eCommerceScreen), new C0544cl());
    }

    public final InterfaceC0505b8 a() {
        return this.f11553c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f11553c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f11551a + ", screen=" + this.f11552b + ", converter=" + this.f11553c + '}';
    }

    public C0518bl(Hf hf, C0542cj c0542cj, InterfaceC0505b8 interfaceC0505b8) {
        this.f11551a = hf;
        this.f11552b = c0542cj;
        this.f11553c = interfaceC0505b8;
    }
}
