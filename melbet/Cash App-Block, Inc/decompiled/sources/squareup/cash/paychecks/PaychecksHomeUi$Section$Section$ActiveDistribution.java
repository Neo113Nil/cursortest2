package squareup.cash.paychecks;

import com.squareup.cash.money.loadable.LoadableStateKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Section$Section$ActiveDistribution extends LoadableStateKt {
    public final PaychecksHomeUi.ActiveDistributionSection value;

    public PaychecksHomeUi$Section$Section$ActiveDistribution(PaychecksHomeUi.ActiveDistributionSection activeDistributionSection) {
        activeDistributionSection.getClass();
        this.value = activeDistributionSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaychecksHomeUi$Section$Section$ActiveDistribution) && Intrinsics.areEqual(this.value, ((PaychecksHomeUi$Section$Section$ActiveDistribution) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActiveDistribution(value=" + this.value + ")";
    }
}
