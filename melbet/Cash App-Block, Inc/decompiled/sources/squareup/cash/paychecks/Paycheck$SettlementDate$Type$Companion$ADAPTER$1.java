package squareup.cash.paychecks;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes10.dex */
public final class Paycheck$SettlementDate$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Paycheck.SettlementDate.Type.Companion.getClass();
        if (i == 0) {
            return Paycheck.SettlementDate.Type.EXPECTED;
        }
        if (i == 1) {
            return Paycheck.SettlementDate.Type.PENDING;
        }
        if (i != 2) {
            return null;
        }
        return Paycheck.SettlementDate.Type.COMPLETED;
    }
}
