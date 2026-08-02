package squareup.cash.paychecks;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaychecksHomeUi.SectionVisibilityPredicate.Companion.getClass();
        switch (i) {
            case 0:
                return PaychecksHomeUi.SectionVisibilityPredicate.DO_NOT_USE_CLIENT_COULD_NOT_PARSE_ENUM;
            case 1:
                return PaychecksHomeUi.SectionVisibilityPredicate.ALWAYS_VISIBLE;
            case 2:
                return PaychecksHomeUi.SectionVisibilityPredicate.CURRENT_DISTRIBUTION_SET;
            case 3:
                return PaychecksHomeUi.SectionVisibilityPredicate.NO_CURRENT_DISTRIBUTION_SET;
            case 4:
                return PaychecksHomeUi.SectionVisibilityPredicate.CUSTOMER_DDA_IS_NOT_LOCKED;
            case 5:
                return PaychecksHomeUi.SectionVisibilityPredicate.CUSTOMER_IS_NOT_DENYLISTED;
            case 6:
                return PaychecksHomeUi.SectionVisibilityPredicate.CUSTOMER_HAS_KYB_ELIGIBILITY_WARNING;
            default:
                return null;
        }
    }
}
