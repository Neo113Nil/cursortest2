package com.squareup.protos.cash.plasma.common;

import com.datadog.android.rum.model.ErrorEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InstrumentSelectionOption$SelectionOption$ExistingCustom extends ErrorEvent.Csp.Companion {
    public final ExistingCustomSelectionOption value;

    public InstrumentSelectionOption$SelectionOption$ExistingCustom(ExistingCustomSelectionOption existingCustomSelectionOption) {
        existingCustomSelectionOption.getClass();
        this.value = existingCustomSelectionOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentSelectionOption$SelectionOption$ExistingCustom) && Intrinsics.areEqual(this.value, ((InstrumentSelectionOption$SelectionOption$ExistingCustom) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ExistingCustom(value=" + this.value + ")";
    }
}
