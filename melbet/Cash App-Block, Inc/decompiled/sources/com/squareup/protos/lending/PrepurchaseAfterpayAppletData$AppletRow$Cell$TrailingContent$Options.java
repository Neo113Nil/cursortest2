package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zzja;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options extends zzja {
    public final PrepurchaseAfterpayAppletData.AppletRow.Cell.Options value;

    public PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options(PrepurchaseAfterpayAppletData.AppletRow.Cell.Options options) {
        options.getClass();
        this.value = options;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options) && Intrinsics.areEqual(this.value, ((PrepurchaseAfterpayAppletData$AppletRow$Cell$TrailingContent$Options) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Options(value=" + this.value + ")";
    }
}
