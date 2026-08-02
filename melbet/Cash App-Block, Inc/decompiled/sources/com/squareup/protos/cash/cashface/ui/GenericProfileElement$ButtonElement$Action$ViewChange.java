package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.CartItemCounterViewModel;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$Action$ViewChange extends CartItemCounterViewModel.Mode {
    public final GenericProfileElement.ButtonElement.ViewChangeAction value;

    public GenericProfileElement$ButtonElement$Action$ViewChange(GenericProfileElement.ButtonElement.ViewChangeAction viewChangeAction) {
        viewChangeAction.getClass();
        this.value = viewChangeAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$ButtonElement$Action$ViewChange) && Intrinsics.areEqual(this.value, ((GenericProfileElement$ButtonElement$Action$ViewChange) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ViewChange(value=" + this.value + ")";
    }
}
