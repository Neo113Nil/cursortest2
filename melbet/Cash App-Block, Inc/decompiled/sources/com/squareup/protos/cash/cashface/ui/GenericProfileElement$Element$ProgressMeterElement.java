package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Element$ProgressMeterElement extends LocalTextsKt {
    public final GenericProfileElement.ProgressMeterElement value;

    public GenericProfileElement$Element$ProgressMeterElement(GenericProfileElement.ProgressMeterElement progressMeterElement) {
        progressMeterElement.getClass();
        this.value = progressMeterElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$Element$ProgressMeterElement) && Intrinsics.areEqual(this.value, ((GenericProfileElement$Element$ProgressMeterElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ProgressMeterElement(value=" + this.value + ")";
    }
}
