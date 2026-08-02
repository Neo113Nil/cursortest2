package com.squareup.protos.cash.genericelements.ui;

import coil3.network.internal.UtilsKt;
import com.squareup.protos.cash.genericelements.ui.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Action$OpenUrl extends UtilsKt {
    public final Action.OpenUrlAction value;

    public Action$Action$OpenUrl(Action.OpenUrlAction openUrlAction) {
        openUrlAction.getClass();
        this.value = openUrlAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Action$OpenUrl) && Intrinsics.areEqual(this.value, ((Action$Action$OpenUrl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenUrl(value=" + this.value + ")";
    }
}
