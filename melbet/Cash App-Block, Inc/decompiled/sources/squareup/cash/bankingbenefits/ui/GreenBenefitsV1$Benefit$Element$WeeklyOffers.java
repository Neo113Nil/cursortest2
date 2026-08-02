package squareup.cash.bankingbenefits.ui;

import com.squareup.cash.money.booklet.DisclosureSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$Element$WeeklyOffers extends DisclosureSectionKt {
    public final GreenBenefitsV1.Benefit.WeeklyOffersBenefit value;

    public GreenBenefitsV1$Benefit$Element$WeeklyOffers(GreenBenefitsV1.Benefit.WeeklyOffersBenefit weeklyOffersBenefit) {
        weeklyOffersBenefit.getClass();
        this.value = weeklyOffersBenefit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GreenBenefitsV1$Benefit$Element$WeeklyOffers) && Intrinsics.areEqual(this.value, ((GreenBenefitsV1$Benefit$Element$WeeklyOffers) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "WeeklyOffers(value=" + this.value + ")";
    }
}
