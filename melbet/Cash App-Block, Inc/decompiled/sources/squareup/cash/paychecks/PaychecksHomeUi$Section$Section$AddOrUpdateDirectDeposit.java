package squareup.cash.paychecks;

import com.squareup.cash.money.loadable.LoadableStateKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit extends LoadableStateKt {
    public final PaychecksHomeUi.AddOrUpdateDirectDepositSection value;

    public PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit(PaychecksHomeUi.AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection) {
        addOrUpdateDirectDepositSection.getClass();
        this.value = addOrUpdateDirectDepositSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) && Intrinsics.areEqual(this.value, ((PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AddOrUpdateDirectDeposit(value=" + this.value + ")";
    }
}
