package com.squareup.protos.cash.local.client.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MarketScreenContent$ContentType$LargeCell extends zzhh {
    public final MarketScreenLargeCell value;

    public MarketScreenContent$ContentType$LargeCell(MarketScreenLargeCell marketScreenLargeCell) {
        marketScreenLargeCell.getClass();
        this.value = marketScreenLargeCell;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketScreenContent$ContentType$LargeCell) && Intrinsics.areEqual(this.value, ((MarketScreenContent$ContentType$LargeCell) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LargeCell(value=" + this.value + ")";
    }
}
