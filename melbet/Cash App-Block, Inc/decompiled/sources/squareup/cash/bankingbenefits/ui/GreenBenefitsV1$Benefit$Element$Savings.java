package squareup.cash.bankingbenefits.ui;

import com.squareup.cash.money.booklet.DisclosureSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$Element$Savings extends DisclosureSectionKt {
    public final GreenBenefitsV1.Benefit.SavingsBenefit value;

    public GreenBenefitsV1$Benefit$Element$Savings(GreenBenefitsV1.Benefit.SavingsBenefit savingsBenefit) {
        savingsBenefit.getClass();
        this.value = savingsBenefit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GreenBenefitsV1$Benefit$Element$Savings) && Intrinsics.areEqual(this.value, ((GreenBenefitsV1$Benefit$Element$Savings) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Savings(value=" + this.value + ")";
    }
}
