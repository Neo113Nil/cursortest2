package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.Uri_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section$Content$GraphSection extends Uri_androidKt {
    public final GraphSection value;

    public Section$Content$GraphSection(GraphSection graphSection) {
        graphSection.getClass();
        this.value = graphSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Section$Content$GraphSection) && Intrinsics.areEqual(this.value, ((Section$Content$GraphSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GraphSection(value=" + this.value + ")";
    }
}
