package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC2713io;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f37086a;

    /* renamed from: b, reason: collision with root package name */
    private final BigDecimal f37087b;

    /* renamed from: c, reason: collision with root package name */
    private final ECommercePrice f37088c;

    /* renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f37089d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j4) {
        this(eCommerceProduct, eCommercePrice, AbstractC2713io.a(j4));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f37086a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f37087b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f37089d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f37088c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f37089d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f37086a + ", quantity=" + this.f37087b + ", revenue=" + this.f37088c + ", referrer=" + this.f37089d + '}';
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d4) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC2713io.a(d4)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f37086a = eCommerceProduct;
        this.f37087b = bigDecimal;
        this.f37088c = eCommercePrice;
    }
}
