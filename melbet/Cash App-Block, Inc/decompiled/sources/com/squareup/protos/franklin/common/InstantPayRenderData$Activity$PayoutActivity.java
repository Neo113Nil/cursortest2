package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdw;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class InstantPayRenderData$Activity$PayoutActivity extends zzdw {
    public final InstantPayRenderData.PayoutActivity value;

    public InstantPayRenderData$Activity$PayoutActivity(InstantPayRenderData.PayoutActivity payoutActivity) {
        payoutActivity.getClass();
        this.value = payoutActivity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstantPayRenderData$Activity$PayoutActivity) && Intrinsics.areEqual(this.value, ((InstantPayRenderData$Activity$PayoutActivity) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PayoutActivity(value=" + this.value + ")";
    }
}
