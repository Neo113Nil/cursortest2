package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetInlineMessageResponse$Response$Empty extends TransactorKt {
    public final Empty value;

    public GetInlineMessageResponse$Response$Empty(Empty empty) {
        empty.getClass();
        this.value = empty;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetInlineMessageResponse$Response$Empty) && Intrinsics.areEqual(this.value, ((GetInlineMessageResponse$Response$Empty) obj).value);
    }

    public final Empty getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Empty(value=" + this.value + ")";
    }
}
