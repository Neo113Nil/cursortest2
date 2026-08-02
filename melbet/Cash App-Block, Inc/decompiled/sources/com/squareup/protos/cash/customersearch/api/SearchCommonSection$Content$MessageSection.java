package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.LoaderAndroidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchCommonSection$Content$MessageSection extends LoaderAndroidKt {
    public final SearchCommonMessageSection value;

    public SearchCommonSection$Content$MessageSection(SearchCommonMessageSection searchCommonMessageSection) {
        searchCommonMessageSection.getClass();
        this.value = searchCommonMessageSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchCommonSection$Content$MessageSection) && Intrinsics.areEqual(this.value, ((SearchCommonSection$Content$MessageSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MessageSection(value=" + this.value + ")";
    }
}
