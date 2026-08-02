package com.squareup.protos.cash.discover.api.app.v2.api;

import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SectionPageResponse$Page$RowSection {
    public final RowSection.Page value;

    public SectionPageResponse$Page$RowSection(RowSection.Page page) {
        page.getClass();
        this.value = page;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SectionPageResponse$Page$RowSection) && Intrinsics.areEqual(this.value, ((SectionPageResponse$Page$RowSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RowSection(value=" + this.value + ")";
    }
}
