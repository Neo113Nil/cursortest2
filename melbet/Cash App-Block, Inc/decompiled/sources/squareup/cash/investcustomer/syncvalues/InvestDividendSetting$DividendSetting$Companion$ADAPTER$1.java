package squareup.cash.investcustomer.syncvalues;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.investcustomer.syncvalues.InvestDividendSetting;

/* loaded from: classes3.dex */
public final class InvestDividendSetting$DividendSetting$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestDividendSetting.DividendSetting.Companion.getClass();
        if (i == 1) {
            return InvestDividendSetting.DividendSetting.PAYOUT;
        }
        if (i != 2) {
            return null;
        }
        return InvestDividendSetting.DividendSetting.REINVEST;
    }
}
