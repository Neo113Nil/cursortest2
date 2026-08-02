package squareup.cash.paychecks;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.paychecks.UiState;

/* loaded from: classes10.dex */
public final class UiState$AppletState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UiState.AppletState.Companion.getClass();
        if (i == 0) {
            return UiState.AppletState.DO_NOT_USE_CLIENT_COULD_NOT_PARSE_ENUM;
        }
        if (i == 1) {
            return UiState.AppletState.NULL_STATE;
        }
        if (i == 2) {
            return UiState.AppletState.ACTIVE_STATE;
        }
        if (i != 3) {
            return null;
        }
        return UiState.AppletState.HIDDEN;
    }
}
