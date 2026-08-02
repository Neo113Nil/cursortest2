package com.squareup.protos.cash.local.client.v1;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BrandBanner$Title$TitleText {
    public final String value;

    public BrandBanner$Title$TitleText(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrandBanner$Title$TitleText) && Intrinsics.areEqual(this.value, ((BrandBanner$Title$TitleText) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TitleText(value=", this.value, ")");
    }
}
