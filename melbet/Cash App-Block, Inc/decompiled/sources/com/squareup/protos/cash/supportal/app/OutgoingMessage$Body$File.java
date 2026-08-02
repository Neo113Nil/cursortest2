package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OutgoingMessage$Body$File extends zzln {
    public final OutgoingMessage.FileBody value;

    public OutgoingMessage$Body$File(OutgoingMessage.FileBody fileBody) {
        fileBody.getClass();
        this.value = fileBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutgoingMessage$Body$File) && Intrinsics.areEqual(this.value, ((OutgoingMessage$Body$File) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "File(value=" + this.value + ")";
    }
}
