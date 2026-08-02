package com.squareup.protos.cash.cryptoinvestflow.service;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.zipline.internal.JsonEngineKt;

/* loaded from: classes7.dex */
public final class ExchangeRequest$Amount$TargetAmount extends JsonEngineKt {
    public final long value;

    public ExchangeRequest$Amount$TargetAmount(long j) {
        this.value = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExchangeRequest$Amount$TargetAmount) && this.value == ((ExchangeRequest$Amount$TargetAmount) obj).value;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.value, "TargetAmount(value=", ")");
    }
}
