package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$BoostElement extends LocalTextsKt {
    public final GenericProfileElement.BoostElement value;

    public GenericProfileElement$Element$BoostElement(GenericProfileElement.BoostElement boostElement) {
        boostElement.getClass();
        this.value = boostElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$BoostElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$BoostElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BoostElement(value=" + this.value + ")";
    }
}
