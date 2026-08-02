package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationalSheetButton$Action$Shortlink extends zzhs {
    public final ShortlinkAction value;

    public EducationalSheetButton$Action$Shortlink(ShortlinkAction shortlinkAction) {
        shortlinkAction.getClass();
        this.value = shortlinkAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetButton$Action$Shortlink) && Intrinsics.areEqual(this.value, ((EducationalSheetButton$Action$Shortlink) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Shortlink(value=" + this.value + ")";
    }
}
