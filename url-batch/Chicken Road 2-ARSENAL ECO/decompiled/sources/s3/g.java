package s3;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class g extends com.onesignal.common.modeling.i {
    public g() {
        super(null, null, 3, null);
    }

    private final void setAmount(BigDecimal bigDecimal) {
        com.onesignal.common.modeling.i.setBigDecimalProperty$default(this, "amount", bigDecimal, null, false, 12, null);
    }

    private final void setIso(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "iso", str, null, false, 12, null);
    }

    private final void setSku(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "sku", str, null, false, 12, null);
    }

    public final BigDecimal getAmount() {
        return com.onesignal.common.modeling.i.getBigDecimalProperty$default(this, "amount", null, 2, null);
    }

    public final String getIso() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "iso", null, 2, null);
    }

    public final String getSku() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "sku", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String sku, String iso, BigDecimal amount) {
        this();
        kotlin.jvm.internal.i.e(sku, "sku");
        kotlin.jvm.internal.i.e(iso, "iso");
        kotlin.jvm.internal.i.e(amount, "amount");
        setSku(sku);
        setIso(iso);
        setAmount(amount);
    }
}
