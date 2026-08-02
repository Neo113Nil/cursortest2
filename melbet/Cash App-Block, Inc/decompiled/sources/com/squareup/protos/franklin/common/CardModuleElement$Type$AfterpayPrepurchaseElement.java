package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardModuleElement$Type$AfterpayPrepurchaseElement extends zzds {
    public final AfterpayPrepurchaseElement value;

    public CardModuleElement$Type$AfterpayPrepurchaseElement(AfterpayPrepurchaseElement afterpayPrepurchaseElement) {
        afterpayPrepurchaseElement.getClass();
        this.value = afterpayPrepurchaseElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModuleElement$Type$AfterpayPrepurchaseElement) && Intrinsics.areEqual(this.value, ((CardModuleElement$Type$AfterpayPrepurchaseElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AfterpayPrepurchaseElement(value=" + this.value + ")";
    }
}
