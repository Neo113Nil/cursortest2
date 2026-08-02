package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.LoaderAndroidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchCommonSection$Content$PlaceholderSection extends LoaderAndroidKt {
    public final SearchCommonPlaceholderSection value;

    public SearchCommonSection$Content$PlaceholderSection(SearchCommonPlaceholderSection searchCommonPlaceholderSection) {
        searchCommonPlaceholderSection.getClass();
        this.value = searchCommonPlaceholderSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchCommonSection$Content$PlaceholderSection) && Intrinsics.areEqual(this.value, ((SearchCommonSection$Content$PlaceholderSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PlaceholderSection(value=" + this.value + ")";
    }
}
