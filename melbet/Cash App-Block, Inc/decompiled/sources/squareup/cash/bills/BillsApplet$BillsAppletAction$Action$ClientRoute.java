package squareup.cash.bills;

import com.squareup.cash.money.booklet.HeaderSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class BillsApplet$BillsAppletAction$Action$ClientRoute extends HeaderSectionKt {
    public final BillsApplet.BillsAppletAction.ClientRoute value;

    public BillsApplet$BillsAppletAction$Action$ClientRoute(BillsApplet.BillsAppletAction.ClientRoute clientRoute) {
        clientRoute.getClass();
        this.value = clientRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillsApplet$BillsAppletAction$Action$ClientRoute) && Intrinsics.areEqual(this.value, ((BillsApplet$BillsAppletAction$Action$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ClientRoute(value=" + this.value + ")";
    }
}
