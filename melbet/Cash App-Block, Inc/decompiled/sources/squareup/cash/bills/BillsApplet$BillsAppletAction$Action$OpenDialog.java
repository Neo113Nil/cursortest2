package squareup.cash.bills;

import com.squareup.cash.money.booklet.HeaderSectionKt;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class BillsApplet$BillsAppletAction$Action$OpenDialog extends HeaderSectionKt {
    public final BillsApplet.BillsAppletAction.OpenDialog value;

    public BillsApplet$BillsAppletAction$Action$OpenDialog(BillsApplet.BillsAppletAction.OpenDialog openDialog) {
        openDialog.getClass();
        this.value = openDialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillsApplet$BillsAppletAction$Action$OpenDialog) && Intrinsics.areEqual(this.value, ((BillsApplet$BillsAppletAction$Action$OpenDialog) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenDialog(value=" + this.value + ")";
    }
}
