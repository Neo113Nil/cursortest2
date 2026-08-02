package com.squareup.protos.cash.local.client.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MarketScreenContent$ContentType$SectionHeader extends zzhh {
    public final MarketScreenSectionHeader value;

    public MarketScreenContent$ContentType$SectionHeader(MarketScreenSectionHeader marketScreenSectionHeader) {
        marketScreenSectionHeader.getClass();
        this.value = marketScreenSectionHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketScreenContent$ContentType$SectionHeader) && Intrinsics.areEqual(this.value, ((MarketScreenContent$ContentType$SectionHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SectionHeader(value=" + this.value + ")";
    }
}
