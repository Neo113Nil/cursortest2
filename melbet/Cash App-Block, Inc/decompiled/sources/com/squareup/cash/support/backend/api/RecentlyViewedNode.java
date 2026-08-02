package com.squareup.cash.support.backend.api;

import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/support/backend/api/RecentlyViewedNode;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RecentlyViewedNode {
    public final String token;

    public RecentlyViewedNode(String str) {
        str.getClass();
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecentlyViewedNode) && Intrinsics.areEqual(this.token, ((RecentlyViewedNode) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecentlyViewedNode(token=", this.token, ")");
    }
}
