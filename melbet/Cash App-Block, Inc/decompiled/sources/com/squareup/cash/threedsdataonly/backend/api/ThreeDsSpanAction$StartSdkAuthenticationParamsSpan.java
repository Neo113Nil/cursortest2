package com.squareup.cash.threedsdataonly.backend.api;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.ui.HtmlUtils;

/* loaded from: classes7.dex */
public final class ThreeDsSpanAction$StartSdkAuthenticationParamsSpan extends HtmlUtils {
    public final boolean preAuthenticationParamsEnabled;

    public ThreeDsSpanAction$StartSdkAuthenticationParamsSpan(boolean z) {
        this.preAuthenticationParamsEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDsSpanAction$StartSdkAuthenticationParamsSpan) && this.preAuthenticationParamsEnabled == ((ThreeDsSpanAction$StartSdkAuthenticationParamsSpan) obj).preAuthenticationParamsEnabled;
    }

    public final boolean getPreAuthenticationParamsEnabled() {
        return this.preAuthenticationParamsEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.preAuthenticationParamsEnabled);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("StartSdkAuthenticationParamsSpan(preAuthenticationParamsEnabled=", ")", this.preAuthenticationParamsEnabled);
    }
}
