package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdf;
import com.squareup.protos.franklin.app.SelectTransferOptionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SelectTransferOptionRequest$Action$SelectOption extends zzdf {
    public final SelectTransferOptionRequest.SelectOptionAction value;

    public SelectTransferOptionRequest$Action$SelectOption(SelectTransferOptionRequest.SelectOptionAction selectOptionAction) {
        selectOptionAction.getClass();
        this.value = selectOptionAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectTransferOptionRequest$Action$SelectOption) && Intrinsics.areEqual(this.value, ((SelectTransferOptionRequest$Action$SelectOption) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectOption(value=" + this.value + ")";
    }
}
