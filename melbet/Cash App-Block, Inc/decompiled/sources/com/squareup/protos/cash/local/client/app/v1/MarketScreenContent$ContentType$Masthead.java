package com.squareup.protos.cash.local.client.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MarketScreenContent$ContentType$Masthead extends zzhh {
    public final MarketScreenMasthead value;

    public MarketScreenContent$ContentType$Masthead(MarketScreenMasthead marketScreenMasthead) {
        marketScreenMasthead.getClass();
        this.value = marketScreenMasthead;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketScreenContent$ContentType$Masthead) && Intrinsics.areEqual(this.value, ((MarketScreenContent$ContentType$Masthead) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Masthead(value=" + this.value + ")";
    }
}
