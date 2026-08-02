package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$ValueUnitElement extends LocalTextsKt {
    public final GenericProfileElement.ValueUnitElement value;

    public GenericProfileElement$Element$ValueUnitElement(GenericProfileElement.ValueUnitElement valueUnitElement) {
        valueUnitElement.getClass();
        this.value = valueUnitElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$ValueUnitElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$ValueUnitElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ValueUnitElement(value=" + this.value + ")";
    }
}
