package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$CaptionSection extends Uri_androidKt {
    public final CaptionSection value;

    public Section$Content$CaptionSection(CaptionSection captionSection) {
        captionSection.getClass();
        this.value = captionSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$CaptionSection) && Intrinsics.areEqual(this.value, ((Section$Content$CaptionSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CaptionSection(value=" + this.value + ")";
    }
}
