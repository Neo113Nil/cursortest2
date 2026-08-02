package squareup.cash.overdraft;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$PermanentlyDisabled$Reason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OverdraftStatus.PermanentlyDisabled.Reason.Companion.getClass();
        if (i == 0) {
            return OverdraftStatus.PermanentlyDisabled.Reason.UNKNOWN;
        }
        if (i == 1) {
            return OverdraftStatus.PermanentlyDisabled.Reason.PERMANENT_DELINQUENCY;
        }
        if (i != 2) {
            return null;
        }
        return OverdraftStatus.PermanentlyDisabled.Reason.PERMANENT_EXCEEDED_VELOCITY;
    }
}
