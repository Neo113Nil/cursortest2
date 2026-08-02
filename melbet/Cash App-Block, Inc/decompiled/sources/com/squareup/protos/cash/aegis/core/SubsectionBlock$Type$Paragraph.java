package com.squareup.protos.cash.aegis.core;

import app.cash.local.primitives.BrandCardDetailsKt;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubsectionBlock$Type$Paragraph extends BrandCardDetailsKt {
    public final LocalizedString value;

    public SubsectionBlock$Type$Paragraph(LocalizedString localizedString) {
        localizedString.getClass();
        this.value = localizedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubsectionBlock$Type$Paragraph) && Intrinsics.areEqual(this.value, ((SubsectionBlock$Type$Paragraph) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Paragraph(value=" + this.value + ")";
    }
}
