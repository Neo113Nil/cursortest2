package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdf;
import com.squareup.protos.franklin.app.SelectTransferOptionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SelectTransferOptionRequest$Action$Back extends zzdf {
    public final SelectTransferOptionRequest.BackAction value;

    public SelectTransferOptionRequest$Action$Back(SelectTransferOptionRequest.BackAction backAction) {
        backAction.getClass();
        this.value = backAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectTransferOptionRequest$Action$Back) && Intrinsics.areEqual(this.value, ((SelectTransferOptionRequest$Action$Back) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Back(value=" + this.value + ")";
    }
}
