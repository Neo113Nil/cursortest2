package com.squareup.protos.cash.plasma.common;

import com.datadog.android.rum.model.ErrorEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InstrumentSelectionOption$SelectionOption$NewLink extends ErrorEvent.Csp.Companion {
    public final NewLinkSelectionOption value;

    public InstrumentSelectionOption$SelectionOption$NewLink(NewLinkSelectionOption newLinkSelectionOption) {
        newLinkSelectionOption.getClass();
        this.value = newLinkSelectionOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentSelectionOption$SelectionOption$NewLink) && Intrinsics.areEqual(this.value, ((InstrumentSelectionOption$SelectionOption$NewLink) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "NewLink(value=" + this.value + ")";
    }
}
