package squareup.cash.savings;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes10.dex */
public enum SavingsExternalReference implements WireEnum {
    DO_NOT_USE_CLIENT_DOES_NOT_RECOGNIZE(0),
    SAVINGS_ROUND_UPS(1),
    SAVINGS_PAYCHECKS(2),
    SAVINGS_RECURRING_TRANSFERS(3);

    public static final SavingsExternalReference$Companion$ADAPTER$1 ADAPTER;
    public static final POPMatchingFactory Companion;
    public final int value;

    static {
        SavingsExternalReference savingsExternalReference = DO_NOT_USE_CLIENT_DOES_NOT_RECOGNIZE;
        Companion = new POPMatchingFactory(28);
        ADAPTER = new SavingsExternalReference$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SavingsExternalReference.class), Syntax.PROTO_2, savingsExternalReference);
    }

    SavingsExternalReference(int i) {
        this.value = i;
    }

    public static final SavingsExternalReference fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return DO_NOT_USE_CLIENT_DOES_NOT_RECOGNIZE;
        }
        if (i == 1) {
            return SAVINGS_ROUND_UPS;
        }
        if (i == 2) {
            return SAVINGS_PAYCHECKS;
        }
        if (i != 3) {
            return null;
        }
        return SAVINGS_RECURRING_TRANSFERS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
