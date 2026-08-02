package com.squareup.cash.support.backend.api;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public final class SupportSearchService$DefaultNodes {
    public final List recentlyViewed;
    public final List suggested;

    public SupportSearchService$DefaultNodes(ArrayList arrayList) {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.suggested = emptyList;
        this.recentlyViewed = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportSearchService$DefaultNodes)) {
            return false;
        }
        SupportSearchService$DefaultNodes supportSearchService$DefaultNodes = (SupportSearchService$DefaultNodes) obj;
        return this.suggested.equals(supportSearchService$DefaultNodes.suggested) && this.recentlyViewed.equals(supportSearchService$DefaultNodes.recentlyViewed);
    }

    public final int hashCode() {
        return this.recentlyViewed.hashCode() + (this.suggested.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultNodes(suggested=" + this.suggested + ", recentlyViewed=" + this.recentlyViewed + ")";
    }
}
