package com.squareup.protos.cash.cashface.api;

import app.cash.local.primitives.ScopedModifierTokensKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Activity$Activity$SelfviewText extends ScopedModifierTokensKt {
    public final String value;

    public Activity$Activity$SelfviewText(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Activity$Activity$SelfviewText) && Intrinsics.areEqual(this.value, ((Activity$Activity$SelfviewText) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelfviewText(value=", this.value, ")");
    }
}
