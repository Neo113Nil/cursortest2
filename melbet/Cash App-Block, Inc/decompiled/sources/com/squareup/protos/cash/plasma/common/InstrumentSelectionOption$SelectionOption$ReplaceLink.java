package com.squareup.protos.cash.plasma.common;

import com.datadog.android.rum.model.ErrorEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InstrumentSelectionOption$SelectionOption$ReplaceLink extends ErrorEvent.Csp.Companion {
    public final ReplaceLinkSelectionOption value;

    public InstrumentSelectionOption$SelectionOption$ReplaceLink(ReplaceLinkSelectionOption replaceLinkSelectionOption) {
        replaceLinkSelectionOption.getClass();
        this.value = replaceLinkSelectionOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentSelectionOption$SelectionOption$ReplaceLink) && Intrinsics.areEqual(this.value, ((InstrumentSelectionOption$SelectionOption$ReplaceLink) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ReplaceLink(value=" + this.value + ")";
    }
}
