package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.CartItemCounterViewModel;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$Action$Block extends CartItemCounterViewModel.Mode {
    public final GenericProfileElement.ButtonElement.BlockAction value;

    public GenericProfileElement$ButtonElement$Action$Block(GenericProfileElement.ButtonElement.BlockAction blockAction) {
        blockAction.getClass();
        this.value = blockAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$ButtonElement$Action$Block) && Intrinsics.areEqual(this.value, ((GenericProfileElement$ButtonElement$Action$Block) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Block(value=" + this.value + ")";
    }
}
