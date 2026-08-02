package com.squareup.cash.support.backend.real;

import com.squareup.cash.support.backend.api.RecentlyViewedNode;
import com.squareup.preferences.KeyValue;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;

/* loaded from: classes.dex */
public final class RealSupportViewedArticlesStore {
    public final KeyValue keyValue;

    public RealSupportViewedArticlesStore(KeyValue keyValue) {
        this.keyValue = keyValue;
    }

    public final void add(RecentlyViewedNode recentlyViewedNode) {
        KeyValue keyValue = this.keyValue;
        keyValue.blockingSet(CollectionsKt.take(SetsKt___SetsKt.plus(SetsKt__SetsJVMKt.setOf(recentlyViewedNode), (Iterable) keyValue.blockingGet()), 10));
    }
}
