package squareup.cash.savings.action;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.savings.action.Card;

/* loaded from: classes10.dex */
public final class Card$TextAlignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Card.TextAlignment.Companion.getClass();
        if (i == 1) {
            return Card.TextAlignment.LEFT;
        }
        if (i != 2) {
            return null;
        }
        return Card.TextAlignment.CENTER;
    }
}
