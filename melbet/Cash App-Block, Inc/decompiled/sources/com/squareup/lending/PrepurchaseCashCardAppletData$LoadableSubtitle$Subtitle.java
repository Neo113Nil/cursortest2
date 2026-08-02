package com.squareup.lending;

import com.google.android.gms.internal.mlkit_vision_barcode.zztc;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle extends zztc {
    public final LocalizedString value;

    public PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle(LocalizedString localizedString) {
        localizedString.getClass();
        this.value = localizedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$LoadableSubtitle$Subtitle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Subtitle(value=" + this.value + ")";
    }
}
