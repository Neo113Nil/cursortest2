package com.squareup.protos.cash.cashface.delegates;

import app.cash.local.sharedui.LocalComposeUiKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$Origin$BlockedBusinesses extends LocalComposeUiKt {
    public final ContextWrapper.Origin.BlockedBusinesses value;

    public ContextWrapper$Origin$Origin$BlockedBusinesses(ContextWrapper.Origin.BlockedBusinesses blockedBusinesses) {
        blockedBusinesses.getClass();
        this.value = blockedBusinesses;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContextWrapper$Origin$Origin$BlockedBusinesses) && Intrinsics.areEqual(this.value, ((ContextWrapper$Origin$Origin$BlockedBusinesses) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BlockedBusinesses(value=" + this.value + ")";
    }
}
