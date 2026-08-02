package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.protocol.host.NodeReuseKt;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreditLineSectionHeader$Subtitle$TextSubtitle extends NodeReuseKt {
    public final LocalizedString value;

    public CreditLineSectionHeader$Subtitle$TextSubtitle(LocalizedString localizedString) {
        localizedString.getClass();
        this.value = localizedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditLineSectionHeader$Subtitle$TextSubtitle) && Intrinsics.areEqual(this.value, ((CreditLineSectionHeader$Subtitle$TextSubtitle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextSubtitle(value=" + this.value + ")";
    }
}
