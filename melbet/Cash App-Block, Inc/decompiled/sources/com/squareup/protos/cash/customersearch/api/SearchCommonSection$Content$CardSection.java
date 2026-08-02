package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.LoaderAndroidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchCommonSection$Content$CardSection extends LoaderAndroidKt {
    public final SearchCommonCardSection value;

    public SearchCommonSection$Content$CardSection(SearchCommonCardSection searchCommonCardSection) {
        searchCommonCardSection.getClass();
        this.value = searchCommonCardSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchCommonSection$Content$CardSection) && Intrinsics.areEqual(this.value, ((SearchCommonSection$Content$CardSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CardSection(value=" + this.value + ")";
    }
}
