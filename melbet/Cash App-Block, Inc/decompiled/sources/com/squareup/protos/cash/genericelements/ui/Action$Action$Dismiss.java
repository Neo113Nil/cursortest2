package com.squareup.protos.cash.genericelements.ui;

import coil3.network.internal.UtilsKt;
import com.squareup.protos.cash.genericelements.ui.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Action$Dismiss extends UtilsKt {
    public final Action.DismissAction value;

    public Action$Action$Dismiss(Action.DismissAction dismissAction) {
        dismissAction.getClass();
        this.value = dismissAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Action$Dismiss) && Intrinsics.areEqual(this.value, ((Action$Action$Dismiss) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Dismiss(value=" + this.value + ")";
    }
}
