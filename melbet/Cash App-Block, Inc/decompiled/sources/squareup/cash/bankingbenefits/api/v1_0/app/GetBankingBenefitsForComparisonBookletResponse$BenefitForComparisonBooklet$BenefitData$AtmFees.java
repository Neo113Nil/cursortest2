package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees extends FullscreenAdViewKt {
    public final GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees value;

    public GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees(GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees atmFees) {
        atmFees.getClass();
        this.value = atmFees;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees) && Intrinsics.areEqual(this.value, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AtmFees(value=" + this.value + ")";
    }
}
