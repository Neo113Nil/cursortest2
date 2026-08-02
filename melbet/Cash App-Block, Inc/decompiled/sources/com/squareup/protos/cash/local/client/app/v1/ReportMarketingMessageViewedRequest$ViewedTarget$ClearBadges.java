package com.squareup.protos.cash.local.client.app.v1;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzhi;

/* loaded from: classes7.dex */
public final class ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges extends zzhi {
    public final boolean value;

    public ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges) && this.value == ((ReportMarketingMessageViewedRequest$ViewedTarget$ClearBadges) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("ClearBadges(value=", ")", this.value);
    }
}
