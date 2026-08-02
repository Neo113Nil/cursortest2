package com.squareup.protos.cash.postcard;

import com.datadog.android.rum.model.ErrorEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardHomeAction$Action$LockDevices extends ErrorEvent.Dd.Companion {
    public final LockDevices value;

    public CardHomeAction$Action$LockDevices(LockDevices lockDevices) {
        lockDevices.getClass();
        this.value = lockDevices;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardHomeAction$Action$LockDevices) && Intrinsics.areEqual(this.value, ((CardHomeAction$Action$LockDevices) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LockDevices(value=" + this.value + ")";
    }
}
