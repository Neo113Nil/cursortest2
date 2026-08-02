package squareup.cash.investcore.trading.syncvalues;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.investcore.trading.syncvalues.TradingState;

/* loaded from: classes10.dex */
public final class TradingState$DividendSetting$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TradingState.DividendSetting.Companion.getClass();
        if (i == 0) {
            return TradingState.DividendSetting.UNDEFINED;
        }
        if (i == 1) {
            return TradingState.DividendSetting.SAVE;
        }
        if (i != 2) {
            return null;
        }
        return TradingState.DividendSetting.REINVEST;
    }
}
