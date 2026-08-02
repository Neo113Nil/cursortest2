package squareup.cash.savings.bespoke_elements;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.savings.bespoke_elements.TransferButtons;

/* loaded from: classes10.dex */
public final class TransferButtons$AlternativeButtonBehavior$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TransferButtons.AlternativeButtonBehavior.Companion.getClass();
        if (i == 0) {
            return TransferButtons.AlternativeButtonBehavior.CLIENT_COULD_NOT_PARSE_ALT_BUTTON_BEHAVIOR;
        }
        if (i != 1) {
            return null;
        }
        return TransferButtons.AlternativeButtonBehavior.SHAKE_BALANCE;
    }
}
