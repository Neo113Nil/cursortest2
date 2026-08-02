package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.C0499fl;
import io.appmetrica.analytics.impl.C0551hl;
import io.appmetrica.analytics.impl.C0602jl;
import io.appmetrica.analytics.impl.C0740p3;
import io.appmetrica.analytics.impl.C0880ue;
import io.appmetrica.analytics.impl.Pf;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ECommerceEvent implements Pf {
    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0740p3(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C0880ue(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C0880ue(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0740p3(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C0499fl(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new C0551hl(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C0602jl(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.Pf
    public abstract /* synthetic */ List toProto();
}
