package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2525bl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Uf f38739a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final C2890pj f38740b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3034v8 f38741c;

    public C2525bl(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new Uf(eCommerceProduct), new C2890pj(eCommerceScreen), new C2552cl());
    }

    @NonNull
    public final InterfaceC3034v8 a() {
        return this.f38741c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f38741c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f38739a + ", screen=" + this.f38740b + ", converter=" + this.f38741c + '}';
    }

    public C2525bl(@NonNull Uf uf, @NonNull C2890pj c2890pj, @NonNull InterfaceC3034v8 interfaceC3034v8) {
        this.f38739a = uf;
        this.f38740b = c2890pj;
        this.f38741c = interfaceC3034v8;
    }
}
