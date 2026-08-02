package com.squareup.protos.cash.cashface.delegates;

import app.cash.local.sharedui.LocalComposeUiKt;
import com.squareup.protos.cash.cashface.delegates.ContextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContextWrapper$Origin$Origin$ActivityTab extends LocalComposeUiKt {
    public final ContextWrapper.Origin.ActivityTab value;

    public ContextWrapper$Origin$Origin$ActivityTab(ContextWrapper.Origin.ActivityTab activityTab) {
        activityTab.getClass();
        this.value = activityTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContextWrapper$Origin$Origin$ActivityTab) && Intrinsics.areEqual(this.value, ((ContextWrapper$Origin$Origin$ActivityTab) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ActivityTab(value=" + this.value + ")";
    }
}
