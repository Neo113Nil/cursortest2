package uc;

import java.math.BigDecimal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {
    private final BigDecimal amount;
    private final String iso;
    private final String sku;

    public g(String str, String str2, BigDecimal bigDecimal) {
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        this.sku = str;
        this.iso = str2;
        this.amount = bigDecimal;
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
