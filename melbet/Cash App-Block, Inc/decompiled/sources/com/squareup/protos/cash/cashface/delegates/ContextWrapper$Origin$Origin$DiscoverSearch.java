package com.squareup.protos.cash.cashface.delegates;

import app.cash.local.sharedui.LocalComposeUiKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$Origin$DiscoverSearch extends LocalComposeUiKt {
    public final ContextWrapper.Origin.DiscoverSearch value;

    public ContextWrapper$Origin$Origin$DiscoverSearch(ContextWrapper.Origin.DiscoverSearch discoverSearch) {
        discoverSearch.getClass();
        this.value = discoverSearch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContextWrapper$Origin$Origin$DiscoverSearch) && Intrinsics.areEqual(this.value, ((ContextWrapper$Origin$Origin$DiscoverSearch) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DiscoverSearch(value=" + this.value + ")";
    }
}
