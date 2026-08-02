package com.squareup.protos.lending;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjd;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive extends zzjd {
    public final boolean value;

    public PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive) && this.value == ((PrepurchaseAfterpayAppletData$ButtonData$Content$Action$Destructive) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("Destructive(value=", ")", this.value);
    }
}
