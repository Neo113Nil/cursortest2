package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$ButtonElement extends LocalTextsKt {
    public final GenericProfileElement.ButtonElement value;

    public GenericProfileElement$Element$ButtonElement(GenericProfileElement.ButtonElement buttonElement) {
        buttonElement.getClass();
        this.value = buttonElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$ButtonElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$ButtonElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ButtonElement(value=" + this.value + ")";
    }
}
