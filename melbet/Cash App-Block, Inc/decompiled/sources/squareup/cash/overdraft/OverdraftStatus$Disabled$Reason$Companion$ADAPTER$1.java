package squareup.cash.overdraft;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Disabled$Reason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OverdraftStatus.Disabled.Reason.Companion.getClass();
        if (i == 0) {
            return OverdraftStatus.Disabled.Reason.UNKNOWN;
        }
        if (i == 1) {
            return OverdraftStatus.Disabled.Reason.TEMPORARY_DELINQUENCY;
        }
        if (i == 2) {
            return OverdraftStatus.Disabled.Reason.USER_DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return OverdraftStatus.Disabled.Reason.LOST_ELIGIBILITY;
    }
}
