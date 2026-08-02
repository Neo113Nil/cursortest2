package com.squareup.protos.cash.local.client.v1;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BrandBanner$Subtitle$SubtitleText {
    public final String value;

    public BrandBanner$Subtitle$SubtitleText(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrandBanner$Subtitle$SubtitleText) && Intrinsics.areEqual(this.value, ((BrandBanner$Subtitle$SubtitleText) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubtitleText(value=", this.value, ")");
    }
}
