package com.squareup.lending;

import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent extends zztc {
    public final PrepurchaseCashCardAppletData.UnknownContent value;

    public PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent(PrepurchaseCashCardAppletData.UnknownContent unknownContent) {
        unknownContent.getClass();
        this.value = unknownContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$LoadableSubtitle$SubtitleUnknownContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubtitleUnknownContent(value=" + this.value + ")";
    }
}
