package com.squareup.protos.cash.cashface.delegates;

import app.cash.local.sharedui.LocalComposeUiKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$Origin$AccountLink extends LocalComposeUiKt {
    public final ContextWrapper.Origin.AccountLink value;

    public ContextWrapper$Origin$Origin$AccountLink(ContextWrapper.Origin.AccountLink accountLink) {
        accountLink.getClass();
        this.value = accountLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContextWrapper$Origin$Origin$AccountLink) && Intrinsics.areEqual(this.value, ((ContextWrapper$Origin$Origin$AccountLink) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AccountLink(value=" + this.value + ")";
    }
}
