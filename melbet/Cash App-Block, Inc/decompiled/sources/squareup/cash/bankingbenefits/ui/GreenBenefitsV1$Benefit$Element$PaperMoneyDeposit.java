package squareup.cash.bankingbenefits.ui;

import com.squareup.cash.money.booklet.DisclosureSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit extends DisclosureSectionKt {
    public final GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit value;

    public GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit(GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit paperMoneyDepositBenefit) {
        paperMoneyDepositBenefit.getClass();
        this.value = paperMoneyDepositBenefit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit) && Intrinsics.areEqual(this.value, ((GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaperMoneyDeposit(value=" + this.value + ")";
    }
}
