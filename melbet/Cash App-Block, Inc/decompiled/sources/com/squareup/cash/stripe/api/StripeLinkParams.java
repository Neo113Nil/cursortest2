package com.squareup.cash.stripe.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class StripeLinkParams {
    public final String clientSecret;
    public final String publishableKey;

    public StripeLinkParams(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.clientSecret = str;
        this.publishableKey = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeLinkParams)) {
            return false;
        }
        StripeLinkParams stripeLinkParams = (StripeLinkParams) obj;
        return Intrinsics.areEqual(this.clientSecret, stripeLinkParams.clientSecret) && Intrinsics.areEqual(this.publishableKey, stripeLinkParams.publishableKey);
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final int hashCode() {
        return this.publishableKey.hashCode() + (this.clientSecret.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StripeLinkParams(clientSecret=", this.clientSecret, ", publishableKey=", this.publishableKey, ")");
    }
}
