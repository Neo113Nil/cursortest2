package com.squareup.cash.threedsdataonly.backend.api;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.ui.HtmlUtils;

/* loaded from: classes6.dex */
public final class ThreeDsSpanAction$EndBlockerSpan extends HtmlUtils {
    public final boolean sdkPreInitialized;

    public ThreeDsSpanAction$EndBlockerSpan(boolean z) {
        this.sdkPreInitialized = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDsSpanAction$EndBlockerSpan) && this.sdkPreInitialized == ((ThreeDsSpanAction$EndBlockerSpan) obj).sdkPreInitialized;
    }

    public final boolean getSdkPreInitialized() {
        return this.sdkPreInitialized;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.sdkPreInitialized);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("EndBlockerSpan(sdkPreInitialized=", ")", this.sdkPreInitialized);
    }
}
