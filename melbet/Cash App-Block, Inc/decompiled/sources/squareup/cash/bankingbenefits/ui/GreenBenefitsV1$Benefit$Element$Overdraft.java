package squareup.cash.bankingbenefits.ui;

import com.squareup.cash.money.booklet.DisclosureSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$Element$Overdraft extends DisclosureSectionKt {
    public final GreenBenefitsV1.Benefit.OverdraftBenefit value;

    public GreenBenefitsV1$Benefit$Element$Overdraft(GreenBenefitsV1.Benefit.OverdraftBenefit overdraftBenefit) {
        overdraftBenefit.getClass();
        this.value = overdraftBenefit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GreenBenefitsV1$Benefit$Element$Overdraft) && Intrinsics.areEqual(this.value, ((GreenBenefitsV1$Benefit$Element$Overdraft) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Overdraft(value=" + this.value + ")";
    }
}
