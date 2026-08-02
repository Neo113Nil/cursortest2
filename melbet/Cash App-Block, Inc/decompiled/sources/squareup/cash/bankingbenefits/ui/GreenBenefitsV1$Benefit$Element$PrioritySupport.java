package squareup.cash.bankingbenefits.ui;

import com.squareup.cash.money.booklet.DisclosureSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$Element$PrioritySupport extends DisclosureSectionKt {
    public final GreenBenefitsV1.Benefit.PrioritySupportBenefit value;

    public GreenBenefitsV1$Benefit$Element$PrioritySupport(GreenBenefitsV1.Benefit.PrioritySupportBenefit prioritySupportBenefit) {
        prioritySupportBenefit.getClass();
        this.value = prioritySupportBenefit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GreenBenefitsV1$Benefit$Element$PrioritySupport) && Intrinsics.areEqual(this.value, ((GreenBenefitsV1$Benefit$Element$PrioritySupport) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PrioritySupport(value=" + this.value + ")";
    }
}
