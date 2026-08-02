package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport extends FullscreenAdViewKt {
    public final GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport value;

    public GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport(GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport phoneSupport) {
        phoneSupport.getClass();
        this.value = phoneSupport;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport) && Intrinsics.areEqual(this.value, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PhoneSupport(value=" + this.value + ")";
    }
}
