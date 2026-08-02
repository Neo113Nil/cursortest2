package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$TrustElements extends LocalTextsKt {
    public final GenericProfileElement.TrustElements value;

    public GenericProfileElement$Element$TrustElements(GenericProfileElement.TrustElements trustElements) {
        trustElements.getClass();
        this.value = trustElements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$TrustElements) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$TrustElements) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TrustElements(value=" + this.value + ")";
    }
}
