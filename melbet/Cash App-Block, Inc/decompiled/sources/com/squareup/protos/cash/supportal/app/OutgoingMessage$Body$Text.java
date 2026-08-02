package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OutgoingMessage$Body$Text extends zzln {
    public final OutgoingMessage.TextBody value;

    public OutgoingMessage$Body$Text(OutgoingMessage.TextBody textBody) {
        textBody.getClass();
        this.value = textBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutgoingMessage$Body$Text) && Intrinsics.areEqual(this.value, ((OutgoingMessage$Body$Text) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Text(value=" + this.value + ")";
    }
}
