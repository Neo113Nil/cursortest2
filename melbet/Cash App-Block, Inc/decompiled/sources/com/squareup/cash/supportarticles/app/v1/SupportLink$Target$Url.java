package com.squareup.cash.supportarticles.app.v1;

import androidx.media3.muxer.AnnexBUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportLink$Target$Url extends AnnexBUtils {
    public final String value;

    public SupportLink$Target$Url(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportLink$Target$Url) && Intrinsics.areEqual(this.value, ((SupportLink$Target$Url) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Url(value=", this.value, ")");
    }
}
