package squareup.cash.earnings;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes10.dex */
public final class EarningsAppletState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EarningsAppletState.Companion.getClass();
        if (i == 0) {
            return EarningsAppletState.EARNINGS_APPLET_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return EarningsAppletState.EARNINGS_APPLET_STATE_NULL;
        }
        if (i == 2) {
            return EarningsAppletState.EARNINGS_APPLET_STATE_ACTIVE;
        }
        if (i != 3) {
            return null;
        }
        return EarningsAppletState.EARNINGS_APPLET_STATE_HIDDEN;
    }
}
