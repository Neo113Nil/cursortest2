package n3;

import java.math.BigDecimal;

/* renamed from: n3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549g {
    private final BigDecimal amount;
    private final String iso;
    private final String sku;

    public C0549g(String sku, String iso, BigDecimal amount) {
        kotlin.jvm.internal.i.e(sku, "sku");
        kotlin.jvm.internal.i.e(iso, "iso");
        kotlin.jvm.internal.i.e(amount, "amount");
        this.sku = sku;
        this.iso = iso;
        this.amount = amount;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getSku() {
        return this.sku;
    }
}
