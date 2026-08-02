package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow extends FullscreenAdViewKt {
    public final GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow value;

    public GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow(GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow borrow) {
        borrow.getClass();
        this.value = borrow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow) && Intrinsics.areEqual(this.value, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Borrow(value=" + this.value + ")";
    }
}
