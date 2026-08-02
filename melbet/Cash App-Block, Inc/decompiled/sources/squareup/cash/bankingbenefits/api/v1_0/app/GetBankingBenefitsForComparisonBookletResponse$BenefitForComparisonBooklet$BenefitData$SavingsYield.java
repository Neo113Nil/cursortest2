package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield extends FullscreenAdViewKt {
    public final GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield value;

    public GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield(GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield savingsYield) {
        savingsYield.getClass();
        this.value = savingsYield;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield) && Intrinsics.areEqual(this.value, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SavingsYield(value=" + this.value + ")";
    }
}
