package squareup.cash.bankingbenefits.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class PathProgress$Progress$Spend {
    public final SpendPathProgress value;

    public PathProgress$Progress$Spend(SpendPathProgress spendPathProgress) {
        spendPathProgress.getClass();
        this.value = spendPathProgress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PathProgress$Progress$Spend) && Intrinsics.areEqual(this.value, ((PathProgress$Progress$Spend) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Spend(value=" + this.value + ")";
    }
}
