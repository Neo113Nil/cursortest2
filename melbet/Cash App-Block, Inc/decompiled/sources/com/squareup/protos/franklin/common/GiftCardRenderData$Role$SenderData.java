package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdv;
import com.squareup.protos.franklin.common.GiftCardRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GiftCardRenderData$Role$SenderData extends zzdv {
    public final GiftCardRenderData.SenderData value;

    public GiftCardRenderData$Role$SenderData(GiftCardRenderData.SenderData senderData) {
        senderData.getClass();
        this.value = senderData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftCardRenderData$Role$SenderData) && Intrinsics.areEqual(this.value, ((GiftCardRenderData$Role$SenderData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SenderData(value=" + this.value + ")";
    }
}
