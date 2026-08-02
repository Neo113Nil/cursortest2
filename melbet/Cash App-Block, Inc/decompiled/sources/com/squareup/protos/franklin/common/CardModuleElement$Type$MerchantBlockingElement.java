package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzds;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CardModuleElement$Type$MerchantBlockingElement extends zzds {
    public final MerchantBlockingElement value;

    public CardModuleElement$Type$MerchantBlockingElement(MerchantBlockingElement merchantBlockingElement) {
        merchantBlockingElement.getClass();
        this.value = merchantBlockingElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModuleElement$Type$MerchantBlockingElement) && Intrinsics.areEqual(this.value, ((CardModuleElement$Type$MerchantBlockingElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MerchantBlockingElement(value=" + this.value + ")";
    }
}
