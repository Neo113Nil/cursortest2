package squareup.cash.savings.bespoke_elements;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes10.dex */
public final class CardImage$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardImage.Companion.getClass();
        switch (i) {
            case 1:
                return CardImage.CARD_IMAGE_UNRECOGNIZED;
            case 2:
                return CardImage.CASH_CARD;
            case 3:
                return CardImage.PIGGY_BANK;
            case 4:
                return CardImage.RAKE;
            case 5:
                return CardImage.KEYS;
            case 6:
                return CardImage.PROPAGATION;
            case 7:
                return CardImage.PERCENTAGE;
            default:
                return null;
        }
    }
}
