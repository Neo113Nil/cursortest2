package squareup.cash.cryptocurrency;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public enum CryptoEligibilityStatus implements WireEnum {
    ELIGIBILITY_STATUS_UNSPECIFIED(0),
    PENDING_APPROVAL(1),
    CAN_BE_ELIGIBLE(2),
    ELIGIBLE(3),
    INELIGIBLE(4);

    public static final CryptoEligibilityStatus$Companion$ADAPTER$1 ADAPTER;
    public static final POPMatchingFactory Companion;
    public final int value;

    static {
        CryptoEligibilityStatus cryptoEligibilityStatus = ELIGIBILITY_STATUS_UNSPECIFIED;
        Companion = new POPMatchingFactory(25);
        ADAPTER = new CryptoEligibilityStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CryptoEligibilityStatus.class), Syntax.PROTO_3, cryptoEligibilityStatus);
    }

    CryptoEligibilityStatus(int i) {
        this.value = i;
    }

    public static final CryptoEligibilityStatus fromValue(int i) {
        Companion.getClass();
        return POPMatchingFactory.m4318fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
