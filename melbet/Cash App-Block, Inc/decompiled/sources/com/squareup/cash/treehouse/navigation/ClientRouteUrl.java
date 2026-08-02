package com.squareup.cash.treehouse.navigation;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public final class ClientRouteUrl {
    public static final Companion Companion = new Companion();
    public final String url;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/navigation/ClientRouteUrl$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/navigation/ClientRouteUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ClientRouteUrl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ClientRouteUrl(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, ClientRouteUrl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientRouteUrl) && Intrinsics.areEqual(this.url, ((ClientRouteUrl) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteUrl(url=", this.url, ")");
    }
}
