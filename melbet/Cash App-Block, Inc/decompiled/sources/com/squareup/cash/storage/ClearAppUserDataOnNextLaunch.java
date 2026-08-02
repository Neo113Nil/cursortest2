package com.squareup.cash.storage;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class ClearAppUserDataOnNextLaunch {
    public final boolean value;

    public /* synthetic */ ClearAppUserDataOnNextLaunch(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClearAppUserDataOnNextLaunch) {
            return this.value == ((ClearAppUserDataOnNextLaunch) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("ClearAppUserDataOnNextLaunch(value=", ")", this.value);
    }
}
