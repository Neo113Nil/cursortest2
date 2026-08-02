package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$Type$OpenDialog extends zzkk {
    public final CardModule.CardElementAction.OpenDialog value;

    public CardModule$CardElementAction$Type$OpenDialog(CardModule.CardElementAction.OpenDialog openDialog) {
        openDialog.getClass();
        this.value = openDialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$CardElementAction$Type$OpenDialog) && Intrinsics.areEqual(this.value, ((CardModule$CardElementAction$Type$OpenDialog) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OpenDialog(value=" + this.value + ")";
    }
}
