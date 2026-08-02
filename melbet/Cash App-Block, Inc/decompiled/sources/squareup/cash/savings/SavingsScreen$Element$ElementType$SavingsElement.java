package squareup.cash.savings;

import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class SavingsScreen$Element$ElementType$SavingsElement extends AnalyticsMappersKt {
    public final SavingsElement value;

    public SavingsScreen$Element$ElementType$SavingsElement(SavingsElement savingsElement) {
        savingsElement.getClass();
        this.value = savingsElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsScreen$Element$ElementType$SavingsElement) && Intrinsics.areEqual(this.value, ((SavingsScreen$Element$ElementType$SavingsElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SavingsElement(value=" + this.value + ")";
    }
}
