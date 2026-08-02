package squareup.cash.ui.arcade.elements;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;

/* loaded from: classes10.dex */
public final class ButtonDefaultGroup$Direction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ButtonDefaultGroup.Direction.Companion.getClass();
        if (i == 0) {
            return ButtonDefaultGroup.Direction.CLIENT_COULD_NOT_PARSE_DIRECTION;
        }
        if (i == 1) {
            return ButtonDefaultGroup.Direction.HORIZONTAL;
        }
        if (i != 2) {
            return null;
        }
        return ButtonDefaultGroup.Direction.VERTICAL;
    }
}
