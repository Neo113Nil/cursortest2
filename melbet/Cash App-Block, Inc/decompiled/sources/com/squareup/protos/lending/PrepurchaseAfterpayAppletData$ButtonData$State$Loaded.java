package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzje;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$ButtonData$State$Loaded extends zzje {
    public final PrepurchaseAfterpayAppletData.ButtonData.Content value;

    public PrepurchaseAfterpayAppletData$ButtonData$State$Loaded(PrepurchaseAfterpayAppletData.ButtonData.Content content) {
        content.getClass();
        this.value = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$ButtonData$State$Loaded) && Intrinsics.areEqual(this.value, ((PrepurchaseAfterpayAppletData$ButtonData$State$Loaded) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Loaded(value=" + this.value + ")";
    }
}
