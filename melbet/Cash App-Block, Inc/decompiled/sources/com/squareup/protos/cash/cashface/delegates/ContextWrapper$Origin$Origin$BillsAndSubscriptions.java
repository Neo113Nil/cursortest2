package com.squareup.protos.cash.cashface.delegates;

import app.cash.local.sharedui.LocalComposeUiKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$Origin$BillsAndSubscriptions extends LocalComposeUiKt {
    public final ContextWrapper.Origin.BillsAndSubscriptions value;

    public ContextWrapper$Origin$Origin$BillsAndSubscriptions(ContextWrapper.Origin.BillsAndSubscriptions billsAndSubscriptions) {
        billsAndSubscriptions.getClass();
        this.value = billsAndSubscriptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContextWrapper$Origin$Origin$BillsAndSubscriptions) && Intrinsics.areEqual(this.value, ((ContextWrapper$Origin$Origin$BillsAndSubscriptions) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BillsAndSubscriptions(value=" + this.value + ")";
    }
}
