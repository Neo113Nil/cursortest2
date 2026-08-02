package squareup.cash.bankingbenefits.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.bankingbenefits.ui.CashGreenV1;

/* loaded from: classes10.dex */
public final class CashGreenV1$StatusMethod$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashGreenV1.StatusMethod.Companion.getClass();
        if (i == 0) {
            return CashGreenV1.StatusMethod.STATUS_METHOD_UNSPECIFIED;
        }
        if (i == 1) {
            return CashGreenV1.StatusMethod.SPEND;
        }
        if (i != 2) {
            return null;
        }
        return CashGreenV1.StatusMethod.DIRECT_DEPOSIT;
    }
}
