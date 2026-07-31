package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC2713io;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f37084a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37085b;

    public ECommerceAmount(long j4, @NonNull String str) {
        this(AbstractC2713io.a(j4), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f37084a;
    }

    @NonNull
    public String getUnit() {
        return this.f37085b;
    }

    @NonNull
    public String toString() {
        return "ECommerceAmount{amount=" + this.f37084a + ", unit='" + this.f37085b + "'}";
    }

    public ECommerceAmount(double d4, @NonNull String str) {
        this(new BigDecimal(AbstractC2713io.a(d4)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f37084a = bigDecimal;
        this.f37085b = str;
    }
}
