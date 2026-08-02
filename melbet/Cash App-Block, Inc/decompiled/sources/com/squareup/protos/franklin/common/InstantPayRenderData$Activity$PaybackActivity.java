package com.squareup.protos.franklin.common;

import com.google.android.gms.internal.mlkit_vision_face.zzdw;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class InstantPayRenderData$Activity$PaybackActivity extends zzdw {
    public final InstantPayRenderData.PaybackActivity value;

    public InstantPayRenderData$Activity$PaybackActivity(InstantPayRenderData.PaybackActivity paybackActivity) {
        paybackActivity.getClass();
        this.value = paybackActivity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstantPayRenderData$Activity$PaybackActivity) && Intrinsics.areEqual(this.value, ((InstantPayRenderData$Activity$PaybackActivity) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaybackActivity(value=" + this.value + ")";
    }
}
