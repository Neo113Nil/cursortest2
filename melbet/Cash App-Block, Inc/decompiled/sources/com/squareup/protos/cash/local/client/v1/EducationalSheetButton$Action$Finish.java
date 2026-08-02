package com.squareup.protos.cash.local.client.v1;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzhs;

/* loaded from: classes7.dex */
public final class EducationalSheetButton$Action$Finish extends zzhs {
    public final boolean value;

    public EducationalSheetButton$Action$Finish(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationalSheetButton$Action$Finish) && this.value == ((EducationalSheetButton$Action$Finish) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("Finish(value=", ")", this.value);
    }
}
