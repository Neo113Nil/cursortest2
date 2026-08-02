package com.squareup.util.compose;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class StableHolder {
    public final Object model;

    public StableHolder(Object obj) {
        this.model = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StableHolder) && Intrinsics.areEqual(this.model, ((StableHolder) obj).model);
    }

    public final int hashCode() {
        Object obj = this.model;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StableHolder(model=", ")", this.model);
    }
}
