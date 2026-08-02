package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$LinkAccountTidal extends DrawableUtils {
    public final Action.LinkAccountTidal value;

    public Action$Details$LinkAccountTidal(Action.LinkAccountTidal linkAccountTidal) {
        linkAccountTidal.getClass();
        this.value = linkAccountTidal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$LinkAccountTidal) && Intrinsics.areEqual(this.value, ((Action$Details$LinkAccountTidal) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LinkAccountTidal(value=" + this.value + ")";
    }
}
