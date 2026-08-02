package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzje;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState extends zzje {
    public final PrepurchaseAfterpayAppletData.ButtonData.UnknownState value;

    public PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState(PrepurchaseAfterpayAppletData.ButtonData.UnknownState unknownState) {
        unknownState.getClass();
        this.value = unknownState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState) && this.value == ((PrepurchaseAfterpayAppletData$ButtonData$State$UnknownState) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UnknownState(value=" + this.value + ")";
    }
}
