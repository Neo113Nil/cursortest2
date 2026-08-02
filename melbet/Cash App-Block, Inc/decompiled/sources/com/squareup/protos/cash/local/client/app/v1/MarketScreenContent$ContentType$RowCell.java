package com.squareup.protos.cash.local.client.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MarketScreenContent$ContentType$RowCell extends zzhh {
    public final MarketScreenRowCell value;

    public MarketScreenContent$ContentType$RowCell(MarketScreenRowCell marketScreenRowCell) {
        marketScreenRowCell.getClass();
        this.value = marketScreenRowCell;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketScreenContent$ContentType$RowCell) && Intrinsics.areEqual(this.value, ((MarketScreenContent$ContentType$RowCell) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowCell(value=" + this.value + ")";
    }
}
