package squareup.cash.savings.action;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.savings.action.Card;

/* loaded from: classes10.dex */
public final class Card$Image$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Card.Image.Companion.getClass();
        switch (i) {
            case 1:
                return Card.Image.SAVINGS_YIELD;
            case 2:
                return Card.Image.CASH_CARD;
            case 3:
                return Card.Image.PIGGY_BANK;
            case 4:
                return Card.Image.RAKE;
            case 5:
                return Card.Image.KEYS;
            case 6:
                return Card.Image.PROPOGATION;
            case 7:
                return Card.Image.PERCENTAGE;
            default:
                return null;
        }
    }
}
