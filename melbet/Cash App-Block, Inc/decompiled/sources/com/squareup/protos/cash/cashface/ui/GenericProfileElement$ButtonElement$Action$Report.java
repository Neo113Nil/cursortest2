package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.CartItemCounterViewModel;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$Action$Report extends CartItemCounterViewModel.Mode {
    public final GenericProfileElement.ButtonElement.ReportAction value;

    public GenericProfileElement$ButtonElement$Action$Report(GenericProfileElement.ButtonElement.ReportAction reportAction) {
        reportAction.getClass();
        this.value = reportAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericProfileElement$ButtonElement$Action$Report) && Intrinsics.areEqual(this.value, ((GenericProfileElement$ButtonElement$Action$Report) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Report(value=" + this.value + ")";
    }
}
