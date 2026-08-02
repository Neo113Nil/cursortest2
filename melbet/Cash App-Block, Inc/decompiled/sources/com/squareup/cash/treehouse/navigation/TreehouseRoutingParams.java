package com.squareup.cash.treehouse.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes7.dex */
public final class TreehouseRoutingParams {
    public static final Companion Companion = new Companion();
    public final ClientRouteUrl exitScreen;
    public final ClientRouteUrl origin;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/navigation/TreehouseRoutingParams$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/navigation/TreehouseRoutingParams;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return TreehouseRoutingParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TreehouseRoutingParams(int i, ClientRouteUrl clientRouteUrl, ClientRouteUrl clientRouteUrl2) {
        if ((i & 1) == 0) {
            this.origin = null;
        } else {
            this.origin = clientRouteUrl;
        }
        if ((i & 2) == 0) {
            this.exitScreen = null;
        } else {
            this.exitScreen = clientRouteUrl2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreehouseRoutingParams)) {
            return false;
        }
        TreehouseRoutingParams treehouseRoutingParams = (TreehouseRoutingParams) obj;
        return Intrinsics.areEqual(this.origin, treehouseRoutingParams.origin) && Intrinsics.areEqual(this.exitScreen, treehouseRoutingParams.exitScreen);
    }

    public final int hashCode() {
        ClientRouteUrl clientRouteUrl = this.origin;
        int hashCode = (clientRouteUrl == null ? 0 : clientRouteUrl.url.hashCode()) * 31;
        ClientRouteUrl clientRouteUrl2 = this.exitScreen;
        return hashCode + (clientRouteUrl2 != null ? clientRouteUrl2.url.hashCode() : 0);
    }

    public final String toString() {
        return "TreehouseRoutingParams(origin=" + this.origin + ", exitScreen=" + this.exitScreen + ")";
    }
}
