package com.squareup.protos.cash.local.client.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MarketScreenContent$ContentType$InformationalContent extends zzhh {
    public final MarketScreenInformationalContent value;

    public MarketScreenContent$ContentType$InformationalContent(MarketScreenInformationalContent marketScreenInformationalContent) {
        marketScreenInformationalContent.getClass();
        this.value = marketScreenInformationalContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketScreenContent$ContentType$InformationalContent) && Intrinsics.areEqual(this.value, ((MarketScreenContent$ContentType$InformationalContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InformationalContent(value=" + this.value + ")";
    }
}
