package squareup.cash.paychecks;

import com.squareup.cash.money.loadable.LoadableStateKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Section$Section$KybEligibilityWarning extends LoadableStateKt {
    public final PaychecksHomeUi.KYBEligibilityWarningSection value;

    public PaychecksHomeUi$Section$Section$KybEligibilityWarning(PaychecksHomeUi.KYBEligibilityWarningSection kYBEligibilityWarningSection) {
        kYBEligibilityWarningSection.getClass();
        this.value = kYBEligibilityWarningSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaychecksHomeUi$Section$Section$KybEligibilityWarning) && Intrinsics.areEqual(this.value, ((PaychecksHomeUi$Section$Section$KybEligibilityWarning) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "KybEligibilityWarning(value=" + this.value + ")";
    }
}
