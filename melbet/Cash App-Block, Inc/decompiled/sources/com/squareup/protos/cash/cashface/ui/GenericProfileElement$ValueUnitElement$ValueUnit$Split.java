package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocationStatus;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ValueUnitElement$ValueUnit$Split extends LocationStatus {
    public final GenericProfileElement.ValueUnitElement.Split value;

    public GenericProfileElement$ValueUnitElement$ValueUnit$Split(GenericProfileElement.ValueUnitElement.Split split) {
        split.getClass();
        this.value = split;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$ValueUnitElement$ValueUnit$Split) && Intrinsics.areEqual(this.value, ((GenericProfileElement$ValueUnitElement$ValueUnit$Split) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Split(value=" + this.value + ")";
    }
}
