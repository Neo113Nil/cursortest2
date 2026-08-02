package com.squareup.protos.cash.cryptoinvestflow.service;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.zipline.internal.JsonEngineKt;

/* loaded from: classes7.dex */
public final class ExchangeRequest$Amount$SourceAmount extends JsonEngineKt {
    public final long value;

    public ExchangeRequest$Amount$SourceAmount(long j) {
        this.value = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExchangeRequest$Amount$SourceAmount) && this.value == ((ExchangeRequest$Amount$SourceAmount) obj).value;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.value, "SourceAmount(value=", ")");
    }
}
