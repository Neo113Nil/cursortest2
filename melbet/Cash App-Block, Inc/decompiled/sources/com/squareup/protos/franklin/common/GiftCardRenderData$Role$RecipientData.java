package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdv;
import com.squareup.protos.franklin.common.GiftCardRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GiftCardRenderData$Role$RecipientData extends zzdv {
    public final GiftCardRenderData.RecipientData value;

    public GiftCardRenderData$Role$RecipientData(GiftCardRenderData.RecipientData recipientData) {
        recipientData.getClass();
        this.value = recipientData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftCardRenderData$Role$RecipientData) && Intrinsics.areEqual(this.value, ((GiftCardRenderData$Role$RecipientData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RecipientData(value=" + this.value + ")";
    }
}
