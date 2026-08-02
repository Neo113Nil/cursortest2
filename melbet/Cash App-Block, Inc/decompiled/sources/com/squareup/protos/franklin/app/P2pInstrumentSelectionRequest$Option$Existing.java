package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzde;
import com.squareup.protos.franklin.app.P2pInstrumentSelectionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class P2pInstrumentSelectionRequest$Option$Existing extends zzde {
    public final P2pInstrumentSelectionRequest.ExistingInstrumentOption value;

    public P2pInstrumentSelectionRequest$Option$Existing(P2pInstrumentSelectionRequest.ExistingInstrumentOption existingInstrumentOption) {
        existingInstrumentOption.getClass();
        this.value = existingInstrumentOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P2pInstrumentSelectionRequest$Option$Existing) && Intrinsics.areEqual(this.value, ((P2pInstrumentSelectionRequest$Option$Existing) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Existing(value=" + this.value + ")";
    }
}
