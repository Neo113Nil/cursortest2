package com.squareup.protos.cash.plasma.common;

import com.datadog.android.rum.model.ErrorEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InstrumentSelectionOption$SelectionOption$ExistingLink extends ErrorEvent.Csp.Companion {
    public final ExistingLinkSelectionOption value;

    public InstrumentSelectionOption$SelectionOption$ExistingLink(ExistingLinkSelectionOption existingLinkSelectionOption) {
        existingLinkSelectionOption.getClass();
        this.value = existingLinkSelectionOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentSelectionOption$SelectionOption$ExistingLink) && Intrinsics.areEqual(this.value, ((InstrumentSelectionOption$SelectionOption$ExistingLink) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ExistingLink(value=" + this.value + ")";
    }
}
