package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$CardSection extends Uri_androidKt {
    public final CardSection value;

    public Section$Content$CardSection(CardSection cardSection) {
        cardSection.getClass();
        this.value = cardSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$CardSection) && Intrinsics.areEqual(this.value, ((Section$Content$CardSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardSection(value=" + this.value + ")";
    }
}
