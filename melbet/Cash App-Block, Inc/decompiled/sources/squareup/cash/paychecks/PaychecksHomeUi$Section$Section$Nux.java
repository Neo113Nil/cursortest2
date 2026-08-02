package squareup.cash.paychecks;

import com.squareup.cash.money.loadable.LoadableStateKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Section$Section$Nux extends LoadableStateKt {
    public final PaychecksHomeUi.DistributionNUXSection value;

    public PaychecksHomeUi$Section$Section$Nux(PaychecksHomeUi.DistributionNUXSection distributionNUXSection) {
        distributionNUXSection.getClass();
        this.value = distributionNUXSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaychecksHomeUi$Section$Section$Nux) && Intrinsics.areEqual(this.value, ((PaychecksHomeUi$Section$Section$Nux) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Nux(value=" + this.value + ")";
    }
}
