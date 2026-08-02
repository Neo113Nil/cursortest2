package com.squareup.protos.cash.cashface.delegates;

import app.cash.local.sharedui.LocalComposeUiKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$Origin$DiscoverTab extends LocalComposeUiKt {
    public final ContextWrapper.Origin.DiscoverTab value;

    public ContextWrapper$Origin$Origin$DiscoverTab(ContextWrapper.Origin.DiscoverTab discoverTab) {
        discoverTab.getClass();
        this.value = discoverTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContextWrapper$Origin$Origin$DiscoverTab) && Intrinsics.areEqual(this.value, ((ContextWrapper$Origin$Origin$DiscoverTab) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DiscoverTab(value=" + this.value + ")";
    }
}
