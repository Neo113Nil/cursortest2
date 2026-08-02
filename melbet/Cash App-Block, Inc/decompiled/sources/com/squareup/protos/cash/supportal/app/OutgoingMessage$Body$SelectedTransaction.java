package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class OutgoingMessage$Body$SelectedTransaction extends zzln {
    public final OutgoingMessage.SelectedTransaction value;

    public OutgoingMessage$Body$SelectedTransaction(OutgoingMessage.SelectedTransaction selectedTransaction) {
        selectedTransaction.getClass();
        this.value = selectedTransaction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutgoingMessage$Body$SelectedTransaction) && Intrinsics.areEqual(this.value, ((OutgoingMessage$Body$SelectedTransaction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SelectedTransaction(value=" + this.value + ")";
    }
}
