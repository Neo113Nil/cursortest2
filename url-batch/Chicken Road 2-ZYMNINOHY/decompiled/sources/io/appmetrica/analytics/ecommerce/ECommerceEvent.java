package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.C0518bl;
import io.appmetrica.analytics.impl.C0570dl;
import io.appmetrica.analytics.impl.C0621fl;
import io.appmetrica.analytics.impl.C0655h3;
import io.appmetrica.analytics.impl.C0821ne;
import io.appmetrica.analytics.impl.Kf;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ECommerceEvent implements Kf {
    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0655h3(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C0821ne(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C0821ne(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0655h3(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C0518bl(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new C0570dl(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C0621fl(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public abstract /* synthetic */ List toProto();
}
