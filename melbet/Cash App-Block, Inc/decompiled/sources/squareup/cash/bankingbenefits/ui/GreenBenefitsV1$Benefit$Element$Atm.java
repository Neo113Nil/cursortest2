package squareup.cash.bankingbenefits.ui;

import com.squareup.cash.money.booklet.DisclosureSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$Element$Atm extends DisclosureSectionKt {
    public final GreenBenefitsV1.Benefit.ATMBenefit value;

    public GreenBenefitsV1$Benefit$Element$Atm(GreenBenefitsV1.Benefit.ATMBenefit aTMBenefit) {
        aTMBenefit.getClass();
        this.value = aTMBenefit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GreenBenefitsV1$Benefit$Element$Atm) && Intrinsics.areEqual(this.value, ((GreenBenefitsV1$Benefit$Element$Atm) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Atm(value=" + this.value + ")";
    }
}
