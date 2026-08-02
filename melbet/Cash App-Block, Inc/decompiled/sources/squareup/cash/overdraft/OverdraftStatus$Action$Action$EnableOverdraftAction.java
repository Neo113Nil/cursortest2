package squareup.cash.overdraft;

import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Action$Action$EnableOverdraftAction extends MoneyTabBookletKt {
    public final OverdraftStatus.Action.EnableOverdraftAction value;

    public OverdraftStatus$Action$Action$EnableOverdraftAction(OverdraftStatus.Action.EnableOverdraftAction enableOverdraftAction) {
        enableOverdraftAction.getClass();
        this.value = enableOverdraftAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftStatus$Action$Action$EnableOverdraftAction) && Intrinsics.areEqual(this.value, ((OverdraftStatus$Action$Action$EnableOverdraftAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EnableOverdraftAction(value=" + this.value + ")";
    }
}
