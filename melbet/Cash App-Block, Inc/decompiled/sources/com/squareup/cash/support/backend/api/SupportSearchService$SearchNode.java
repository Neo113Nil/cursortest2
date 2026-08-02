package com.squareup.cash.support.backend.api;

import com.squareup.cash.support.backend.api.articles.Link;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportSearchService$SearchNode {
    public final Link link;
    public final String token;

    public SupportSearchService$SearchNode(String str, Link link) {
        str.getClass();
        this.token = str;
        this.link = link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportSearchService$SearchNode)) {
            return false;
        }
        SupportSearchService$SearchNode supportSearchService$SearchNode = (SupportSearchService$SearchNode) obj;
        return Intrinsics.areEqual(this.token, supportSearchService$SearchNode.token) && this.link.equals(supportSearchService$SearchNode.link);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.link.hashCode() + (this.token.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SearchNode(token=" + this.token + ", link=" + this.link + ", excludeFromRecentlyViewed=false)";
    }
}
