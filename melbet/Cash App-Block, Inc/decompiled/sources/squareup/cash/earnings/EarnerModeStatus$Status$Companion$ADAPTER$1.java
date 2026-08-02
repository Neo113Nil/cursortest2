package squareup.cash.earnings;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.earnings.EarnerModeStatus;

/* loaded from: classes10.dex */
public final class EarnerModeStatus$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EarnerModeStatus.Status.Companion.getClass();
        if (i == 0) {
            return EarnerModeStatus.Status.STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return EarnerModeStatus.Status.STATUS_ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return EarnerModeStatus.Status.STATUS_INACTIVE;
    }
}
