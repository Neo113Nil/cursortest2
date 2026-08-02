package squareup.cash.savings;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes10.dex */
public final class SavingsExternalReference$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SavingsExternalReference.Companion.getClass();
        if (i == 0) {
            return SavingsExternalReference.DO_NOT_USE_CLIENT_DOES_NOT_RECOGNIZE;
        }
        if (i == 1) {
            return SavingsExternalReference.SAVINGS_ROUND_UPS;
        }
        if (i == 2) {
            return SavingsExternalReference.SAVINGS_PAYCHECKS;
        }
        if (i != 3) {
            return null;
        }
        return SavingsExternalReference.SAVINGS_RECURRING_TRANSFERS;
    }
}
