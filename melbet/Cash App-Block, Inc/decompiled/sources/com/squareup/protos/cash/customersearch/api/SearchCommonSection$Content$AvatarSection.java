package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.LoaderAndroidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SearchCommonSection$Content$AvatarSection extends LoaderAndroidKt {
    public final SearchCommonAvatarSection value;

    public SearchCommonSection$Content$AvatarSection(SearchCommonAvatarSection searchCommonAvatarSection) {
        searchCommonAvatarSection.getClass();
        this.value = searchCommonAvatarSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchCommonSection$Content$AvatarSection) && Intrinsics.areEqual(this.value, ((SearchCommonSection$Content$AvatarSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AvatarSection(value=" + this.value + ")";
    }
}
