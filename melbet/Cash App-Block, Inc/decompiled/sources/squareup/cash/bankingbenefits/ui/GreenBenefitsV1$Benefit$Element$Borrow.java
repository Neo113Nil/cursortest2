package squareup.cash.bankingbenefits.ui;

import com.squareup.cash.money.booklet.DisclosureSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$Element$Borrow extends DisclosureSectionKt {
    public final GreenBenefitsV1.Benefit.BorrowBenefit value;

    public GreenBenefitsV1$Benefit$Element$Borrow(GreenBenefitsV1.Benefit.BorrowBenefit borrowBenefit) {
        borrowBenefit.getClass();
        this.value = borrowBenefit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GreenBenefitsV1$Benefit$Element$Borrow) && Intrinsics.areEqual(this.value, ((GreenBenefitsV1$Benefit$Element$Borrow) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Borrow(value=" + this.value + ")";
    }
}
