package com.squareup.protos.cash.cashapproxy.api;

import app.cash.local.primitives.LocalErrorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayHubRowItem$DetailContent$ActionButton extends LocalErrorKt {
    public final Button value;

    public AfterpayHubRowItem$DetailContent$ActionButton(Button button) {
        button.getClass();
        this.value = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayHubRowItem$DetailContent$ActionButton) && Intrinsics.areEqual(this.value, ((AfterpayHubRowItem$DetailContent$ActionButton) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActionButton(value=" + this.value + ")";
    }
}
