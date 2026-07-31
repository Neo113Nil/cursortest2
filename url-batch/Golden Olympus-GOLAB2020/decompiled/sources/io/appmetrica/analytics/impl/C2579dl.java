package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2579dl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Uf f38856a;

    /* renamed from: b, reason: collision with root package name */
    public final Kg f38857b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3034v8 f38858c;

    public C2579dl(@NonNull ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Uf(eCommerceProduct), eCommerceReferrer == null ? null : new Kg(eCommerceReferrer), new C2605el());
    }

    @NonNull
    public final InterfaceC3034v8 a() {
        return this.f38858c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f38858c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f38856a + ", referrer=" + this.f38857b + ", converter=" + this.f38858c + '}';
    }

    public C2579dl(@NonNull Uf uf, Kg kg, @NonNull InterfaceC3034v8 interfaceC3034v8) {
        this.f38856a = uf;
        this.f38857b = kg;
        this.f38858c = interfaceC3034v8;
    }
}
