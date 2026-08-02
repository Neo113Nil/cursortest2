package squareup.cash.overdraft;

import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Action$Action$DisableOverdraftAction extends MoneyTabBookletKt {
    public final OverdraftStatus.Action.DisableOverdraftAction value;

    public OverdraftStatus$Action$Action$DisableOverdraftAction(OverdraftStatus.Action.DisableOverdraftAction disableOverdraftAction) {
        disableOverdraftAction.getClass();
        this.value = disableOverdraftAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftStatus$Action$Action$DisableOverdraftAction) && Intrinsics.areEqual(this.value, ((OverdraftStatus$Action$Action$DisableOverdraftAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DisableOverdraftAction(value=" + this.value + ")";
    }
}
