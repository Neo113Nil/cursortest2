package squareup.cash.overdraft;

import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Action$Action$ActivateOverdraftAction extends MoneyTabBookletKt {
    public final OverdraftStatus.Action.ActivateOverdraftAction value;

    public OverdraftStatus$Action$Action$ActivateOverdraftAction(OverdraftStatus.Action.ActivateOverdraftAction activateOverdraftAction) {
        activateOverdraftAction.getClass();
        this.value = activateOverdraftAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftStatus$Action$Action$ActivateOverdraftAction) && Intrinsics.areEqual(this.value, ((OverdraftStatus$Action$Action$ActivateOverdraftAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActivateOverdraftAction(value=" + this.value + ")";
    }
}
