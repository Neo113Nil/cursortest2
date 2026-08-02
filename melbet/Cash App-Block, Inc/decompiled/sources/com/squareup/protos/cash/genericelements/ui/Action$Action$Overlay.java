package com.squareup.protos.cash.genericelements.ui;

import coil3.network.internal.UtilsKt;
import com.squareup.protos.cash.genericelements.ui.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Action$Overlay extends UtilsKt {
    public final Action.OverlayAction value;

    public Action$Action$Overlay(Action.OverlayAction overlayAction) {
        overlayAction.getClass();
        this.value = overlayAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Action$Overlay) && Intrinsics.areEqual(this.value, ((Action$Action$Overlay) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Overlay(value=" + this.value + ")";
    }
}
