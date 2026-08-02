package squareup.cash.paychecks;

import com.squareup.cash.money.loadable.LoadableStateKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Section$Section$Activity extends LoadableStateKt {
    public final PaychecksHomeUi.ActivitySection value;

    public PaychecksHomeUi$Section$Section$Activity(PaychecksHomeUi.ActivitySection activitySection) {
        activitySection.getClass();
        this.value = activitySection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaychecksHomeUi$Section$Section$Activity) && Intrinsics.areEqual(this.value, ((PaychecksHomeUi$Section$Section$Activity) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Activity(value=" + this.value + ")";
    }
}
