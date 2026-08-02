package com.stripe.android.financialconnections.features.networkinglinksignup;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NetworkingLinkSignupState$ViewEffect$OpenUrl {
    public final long id;
    public final String url;

    public NetworkingLinkSignupState$ViewEffect$OpenUrl(String str, long j) {
        str.getClass();
        this.url = str;
        this.id = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkingLinkSignupState$ViewEffect$OpenUrl)) {
            return false;
        }
        NetworkingLinkSignupState$ViewEffect$OpenUrl networkingLinkSignupState$ViewEffect$OpenUrl = (NetworkingLinkSignupState$ViewEffect$OpenUrl) obj;
        return Intrinsics.areEqual(this.url, networkingLinkSignupState$ViewEffect$OpenUrl.url) && this.id == networkingLinkSignupState$ViewEffect$OpenUrl.id;
    }

    public final int hashCode() {
        return Long.hashCode(this.id) + (this.url.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ", id=", this.id);
        m.append(")");
        return m.toString();
    }
}
