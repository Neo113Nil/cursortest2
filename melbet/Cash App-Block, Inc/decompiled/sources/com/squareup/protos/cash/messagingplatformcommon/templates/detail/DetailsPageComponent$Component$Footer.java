package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Component$Footer extends zzjz {
    public final DetailsPageFooter value;

    public DetailsPageComponent$Component$Footer(DetailsPageFooter detailsPageFooter) {
        detailsPageFooter.getClass();
        this.value = detailsPageFooter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageComponent$Component$Footer) && Intrinsics.areEqual(this.value, ((DetailsPageComponent$Component$Footer) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Footer(value=" + this.value + ")";
    }
}
