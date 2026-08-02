package com.squareup.protos.franklin.common;

import com.datadog.android.rum.model.ResourceEvent;
import com.squareup.protos.franklin.common.AfterPayRenderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AfterPayRenderData$RowType$Summary extends ResourceEvent.Companion {
    public final AfterPayRenderData.Summary value;

    public AfterPayRenderData$RowType$Summary(AfterPayRenderData.Summary summary) {
        summary.getClass();
        this.value = summary;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterPayRenderData$RowType$Summary) && Intrinsics.areEqual(this.value, ((AfterPayRenderData$RowType$Summary) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Summary(value=" + this.value + ")";
    }
}
