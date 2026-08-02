package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzld;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SearchSection$Content$RecentlyViewedSection extends zzld {
    public final RecentlyViewedSection value;

    public SearchSection$Content$RecentlyViewedSection(RecentlyViewedSection recentlyViewedSection) {
        recentlyViewedSection.getClass();
        this.value = recentlyViewedSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSection$Content$RecentlyViewedSection) && Intrinsics.areEqual(this.value, ((SearchSection$Content$RecentlyViewedSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RecentlyViewedSection(value=" + this.value + ")";
    }
}
