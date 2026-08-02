package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.LoaderAndroidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchCommonSection$Content$TextRowSection extends LoaderAndroidKt {
    public final SearchCommonTextRowSection value;

    public SearchCommonSection$Content$TextRowSection(SearchCommonTextRowSection searchCommonTextRowSection) {
        searchCommonTextRowSection.getClass();
        this.value = searchCommonTextRowSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchCommonSection$Content$TextRowSection) && Intrinsics.areEqual(this.value, ((SearchCommonSection$Content$TextRowSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextRowSection(value=" + this.value + ")";
    }
}
