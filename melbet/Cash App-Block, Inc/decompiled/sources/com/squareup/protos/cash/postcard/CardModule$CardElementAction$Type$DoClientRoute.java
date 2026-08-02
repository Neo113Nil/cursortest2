package com.squareup.protos.cash.postcard;

import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardModule$CardElementAction$Type$DoClientRoute extends zzkk {
    public final CardModule.CardElementAction.DoClientRoute value;

    public CardModule$CardElementAction$Type$DoClientRoute(CardModule.CardElementAction.DoClientRoute doClientRoute) {
        doClientRoute.getClass();
        this.value = doClientRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardModule$CardElementAction$Type$DoClientRoute) && Intrinsics.areEqual(this.value, ((CardModule$CardElementAction$Type$DoClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DoClientRoute(value=" + this.value + ")";
    }
}
