package zc;

import java.math.BigDecimal;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends com.onesignal.common.modeling.i {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, BigDecimal bigDecimal) {
        this();
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        setSku(str);
        setIso(str2);
        setAmount(bigDecimal);
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

    public g() {
        super(null, null, 3, null);
    }
}
