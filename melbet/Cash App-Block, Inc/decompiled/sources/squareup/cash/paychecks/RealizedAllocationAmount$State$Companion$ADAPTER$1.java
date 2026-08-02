package squareup.cash.paychecks;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.paychecks.RealizedAllocationAmount;

/* loaded from: classes10.dex */
public final class RealizedAllocationAmount$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RealizedAllocationAmount.State.Companion.getClass();
        if (i == 1) {
            return RealizedAllocationAmount.State.PENDING;
        }
        if (i == 2) {
            return RealizedAllocationAmount.State.COMPLETED;
        }
        if (i != 3) {
            return null;
        }
        return RealizedAllocationAmount.State.ERRORED;
    }
}
