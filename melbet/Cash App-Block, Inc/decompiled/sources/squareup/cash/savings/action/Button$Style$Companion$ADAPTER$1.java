package squareup.cash.savings.action;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.savings.action.Button;

/* loaded from: classes10.dex */
public final class Button$Style$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button.Style.Companion.getClass();
        if (i == 1) {
            return Button.Style.PRIMARY;
        }
        if (i == 2) {
            return Button.Style.SECONDARY;
        }
        if (i != 3) {
            return null;
        }
        return Button.Style.TERTIARY;
    }
}
