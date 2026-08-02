package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.RefreshTrigger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RefreshTrigger$Trigger$BoostContentUpdate {
    public final RefreshTrigger.BoostContentUpdateTrigger value;

    public RefreshTrigger$Trigger$BoostContentUpdate(RefreshTrigger.BoostContentUpdateTrigger boostContentUpdateTrigger) {
        boostContentUpdateTrigger.getClass();
        this.value = boostContentUpdateTrigger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshTrigger$Trigger$BoostContentUpdate) && Intrinsics.areEqual(this.value, ((RefreshTrigger$Trigger$BoostContentUpdate) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BoostContentUpdate(value=" + this.value + ")";
    }
}
