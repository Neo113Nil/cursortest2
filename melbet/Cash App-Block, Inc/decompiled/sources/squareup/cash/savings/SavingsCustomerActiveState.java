package squareup.cash.savings;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes10.dex */
public enum SavingsCustomerActiveState implements WireEnum {
    SAVINGS_CUSTOMER_ACTIVE_STATE_UNSPECIFIED(0),
    SAVINGS_CUSTOMER_ACTIVE_STATE_UNADOPTED(1),
    SAVINGS_CUSTOMER_ACTIVE_STATE_ADOPTED(2);

    public static final SavingsCustomerActiveState$Companion$ADAPTER$1 ADAPTER;
    public static final KClasses$$Lambda$1 Companion;
    public final int value;

    static {
        SavingsCustomerActiveState savingsCustomerActiveState = SAVINGS_CUSTOMER_ACTIVE_STATE_UNSPECIFIED;
        Companion = new KClasses$$Lambda$1(27);
        ADAPTER = new SavingsCustomerActiveState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SavingsCustomerActiveState.class), Syntax.PROTO_2, savingsCustomerActiveState);
    }

    SavingsCustomerActiveState(int i) {
        this.value = i;
    }

    public static final SavingsCustomerActiveState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return SAVINGS_CUSTOMER_ACTIVE_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return SAVINGS_CUSTOMER_ACTIVE_STATE_UNADOPTED;
        }
        if (i != 2) {
            return null;
        }
        return SAVINGS_CUSTOMER_ACTIVE_STATE_ADOPTED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
