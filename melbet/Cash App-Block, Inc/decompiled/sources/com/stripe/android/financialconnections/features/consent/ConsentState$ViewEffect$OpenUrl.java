package com.stripe.android.financialconnections.features.consent;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ConsentState$ViewEffect$OpenUrl {
    public final long id;
    public final String url;

    public ConsentState$ViewEffect$OpenUrl(String str, long j) {
        str.getClass();
        this.url = str;
        this.id = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentState$ViewEffect$OpenUrl)) {
            return false;
        }
        ConsentState$ViewEffect$OpenUrl consentState$ViewEffect$OpenUrl = (ConsentState$ViewEffect$OpenUrl) obj;
        return Intrinsics.areEqual(this.url, consentState$ViewEffect$OpenUrl.url) && this.id == consentState$ViewEffect$OpenUrl.id;
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
