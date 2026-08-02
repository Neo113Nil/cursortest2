package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$Type$DoClientScenario extends zzkk {
    public final CardModule.CardElementAction.DoClientScenario value;

    public CardModule$CardElementAction$Type$DoClientScenario(CardModule.CardElementAction.DoClientScenario doClientScenario) {
        doClientScenario.getClass();
        this.value = doClientScenario;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$CardElementAction$Type$DoClientScenario) && Intrinsics.areEqual(this.value, ((CardModule$CardElementAction$Type$DoClientScenario) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DoClientScenario(value=" + this.value + ")";
    }
}
