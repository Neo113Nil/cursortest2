package squareup.cash.savings;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes10.dex */
public final class SavingsCustomerActiveState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SavingsCustomerActiveState.Companion.getClass();
        if (i == 0) {
            return SavingsCustomerActiveState.SAVINGS_CUSTOMER_ACTIVE_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return SavingsCustomerActiveState.SAVINGS_CUSTOMER_ACTIVE_STATE_UNADOPTED;
        }
        if (i != 2) {
            return null;
        }
        return SavingsCustomerActiveState.SAVINGS_CUSTOMER_ACTIVE_STATE_ADOPTED;
    }
}
