package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$CardElement extends LocalTextsKt {
    public final GenericProfileElement.CardElement value;

    public GenericProfileElement$Element$CardElement(GenericProfileElement.CardElement cardElement) {
        cardElement.getClass();
        this.value = cardElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$CardElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$CardElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardElement(value=" + this.value + ")";
    }
}
