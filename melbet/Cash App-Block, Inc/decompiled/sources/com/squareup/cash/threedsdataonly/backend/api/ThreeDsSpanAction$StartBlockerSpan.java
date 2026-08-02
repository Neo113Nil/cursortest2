package com.squareup.cash.threedsdataonly.backend.api;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.ui.HtmlUtils;

/* loaded from: classes7.dex */
public final class ThreeDsSpanAction$StartBlockerSpan extends HtmlUtils {
    public final boolean issuerMode;

    public ThreeDsSpanAction$StartBlockerSpan(boolean z) {
        this.issuerMode = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDsSpanAction$StartBlockerSpan) && this.issuerMode == ((ThreeDsSpanAction$StartBlockerSpan) obj).issuerMode;
    }

    public final boolean getIssuerMode() {
        return this.issuerMode;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.issuerMode);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("StartBlockerSpan(issuerMode=", ")", this.issuerMode);
    }
}
