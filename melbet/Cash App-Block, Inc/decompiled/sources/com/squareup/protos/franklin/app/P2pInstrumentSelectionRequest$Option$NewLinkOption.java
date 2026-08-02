package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzde;
import com.squareup.protos.franklin.app.P2pInstrumentSelectionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class P2pInstrumentSelectionRequest$Option$NewLinkOption extends zzde {
    public final P2pInstrumentSelectionRequest.NewLinkOption value;

    public P2pInstrumentSelectionRequest$Option$NewLinkOption(P2pInstrumentSelectionRequest.NewLinkOption newLinkOption) {
        newLinkOption.getClass();
        this.value = newLinkOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P2pInstrumentSelectionRequest$Option$NewLinkOption) && Intrinsics.areEqual(this.value, ((P2pInstrumentSelectionRequest$Option$NewLinkOption) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "NewLinkOption(value=" + this.value + ")";
    }
}
