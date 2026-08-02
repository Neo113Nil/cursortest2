package com.stripe.android.financialconnections.features.streamlinedconsent;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class IDConsentContentState$ViewEffect$OpenUrl {
    public final String url;

    public IDConsentContentState$ViewEffect$OpenUrl(String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IDConsentContentState$ViewEffect$OpenUrl) && Intrinsics.areEqual(this.url, ((IDConsentContentState$ViewEffect$OpenUrl) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
    }
}
