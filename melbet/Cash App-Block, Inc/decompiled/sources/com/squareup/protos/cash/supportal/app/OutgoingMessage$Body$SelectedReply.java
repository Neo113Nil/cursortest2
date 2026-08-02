package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OutgoingMessage$Body$SelectedReply extends zzln {
    public final OutgoingMessage.SelectedReply value;

    public OutgoingMessage$Body$SelectedReply(OutgoingMessage.SelectedReply selectedReply) {
        selectedReply.getClass();
        this.value = selectedReply;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutgoingMessage$Body$SelectedReply) && Intrinsics.areEqual(this.value, ((OutgoingMessage$Body$SelectedReply) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectedReply(value=" + this.value + ")";
    }
}
