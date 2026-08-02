package squareup.cash.savings.bespoke_elements;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes10.dex */
public enum CardImage implements WireEnum {
    CARD_IMAGE_UNRECOGNIZED(1),
    CASH_CARD(2),
    PIGGY_BANK(3),
    RAKE(4),
    KEYS(5),
    PROPAGATION(6),
    PERCENTAGE(7);

    public final int value;
    public static final y0 Companion = new y0();
    public static final CardImage$Companion$ADAPTER$1 ADAPTER = new CardImage$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CardImage.class), Syntax.PROTO_2, null);

    CardImage(int i) {
        this.value = i;
    }

    public static final CardImage fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 1:
                return CARD_IMAGE_UNRECOGNIZED;
            case 2:
                return CASH_CARD;
            case 3:
                return PIGGY_BANK;
            case 4:
                return RAKE;
            case 5:
                return KEYS;
            case 6:
                return PROPAGATION;
            case 7:
                return PERCENTAGE;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
