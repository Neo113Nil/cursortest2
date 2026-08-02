package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit extends FullscreenAdViewKt {
    public final GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit value;

    public GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit(GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit paperMoneyDeposit) {
        paperMoneyDeposit.getClass();
        this.value = paperMoneyDeposit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit) && Intrinsics.areEqual(this.value, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaperMoneyDeposit(value=" + this.value + ")";
    }
}
