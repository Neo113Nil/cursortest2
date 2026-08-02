package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzjd;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle extends zzjd {
    public final Toggle value;

    public PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle(Toggle toggle) {
        toggle.getClass();
        this.value = toggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle) && Intrinsics.areEqual(this.value, ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Toggle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Toggle(value=" + this.value + ")";
    }
}
