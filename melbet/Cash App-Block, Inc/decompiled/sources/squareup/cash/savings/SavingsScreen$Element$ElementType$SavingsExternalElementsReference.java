package squareup.cash.savings;

import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class SavingsScreen$Element$ElementType$SavingsExternalElementsReference extends AnalyticsMappersKt {
    public final SavingsExternalElementsReference value;

    public SavingsScreen$Element$ElementType$SavingsExternalElementsReference(SavingsExternalElementsReference savingsExternalElementsReference) {
        savingsExternalElementsReference.getClass();
        this.value = savingsExternalElementsReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsScreen$Element$ElementType$SavingsExternalElementsReference) && Intrinsics.areEqual(this.value, ((SavingsScreen$Element$ElementType$SavingsExternalElementsReference) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SavingsExternalElementsReference(value=" + this.value + ")";
    }
}
