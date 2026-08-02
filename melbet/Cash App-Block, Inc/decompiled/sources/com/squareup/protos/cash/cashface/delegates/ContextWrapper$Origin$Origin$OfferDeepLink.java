package com.squareup.protos.cash.cashface.delegates;

import app.cash.local.sharedui.LocalComposeUiKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$Origin$OfferDeepLink extends LocalComposeUiKt {
    public final ContextWrapper.Origin.OfferDeepLink value;

    public ContextWrapper$Origin$Origin$OfferDeepLink(ContextWrapper.Origin.OfferDeepLink offerDeepLink) {
        offerDeepLink.getClass();
        this.value = offerDeepLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContextWrapper$Origin$Origin$OfferDeepLink) && Intrinsics.areEqual(this.value, ((ContextWrapper$Origin$Origin$OfferDeepLink) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OfferDeepLink(value=" + this.value + ")";
    }
}
