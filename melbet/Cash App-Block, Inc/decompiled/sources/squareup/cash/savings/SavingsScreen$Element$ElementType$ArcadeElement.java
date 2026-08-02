package squareup.cash.savings;

import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class SavingsScreen$Element$ElementType$ArcadeElement extends AnalyticsMappersKt {
    public final ArcadeElement value;

    public SavingsScreen$Element$ElementType$ArcadeElement(ArcadeElement arcadeElement) {
        arcadeElement.getClass();
        this.value = arcadeElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsScreen$Element$ElementType$ArcadeElement) && Intrinsics.areEqual(this.value, ((SavingsScreen$Element$ElementType$ArcadeElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ArcadeElement(value=" + this.value + ")";
    }
}
