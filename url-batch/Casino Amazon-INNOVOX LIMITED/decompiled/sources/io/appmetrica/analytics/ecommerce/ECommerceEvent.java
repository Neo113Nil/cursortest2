package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.C0105cl;
import io.appmetrica.analytics.impl.C0156el;
import io.appmetrica.analytics.impl.C0208gl;
import io.appmetrica.analytics.impl.C0242i3;
import io.appmetrica.analytics.impl.C0405oe;
import io.appmetrica.analytics.impl.Lf;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ECommerceEvent implements Lf {
    protected ECommerceEvent() {
    }

    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0242i3(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C0405oe(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C0405oe(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0242i3(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C0105cl(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new C0156el(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C0208gl(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.Lf
    public abstract /* synthetic */ List toProto();
}
