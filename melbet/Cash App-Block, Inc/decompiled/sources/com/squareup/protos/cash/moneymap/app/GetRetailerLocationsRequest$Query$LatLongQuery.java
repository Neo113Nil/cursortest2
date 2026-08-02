package com.squareup.protos.cash.moneymap.app;

import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetRetailerLocationsRequest$Query$LatLongQuery {
    public final GetRetailerLocationsRequest.LatLongQuery value;

    public GetRetailerLocationsRequest$Query$LatLongQuery(GetRetailerLocationsRequest.LatLongQuery latLongQuery) {
        latLongQuery.getClass();
        this.value = latLongQuery;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetRetailerLocationsRequest$Query$LatLongQuery) && Intrinsics.areEqual(this.value, ((GetRetailerLocationsRequest$Query$LatLongQuery) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LatLongQuery(value=" + this.value + ")";
    }
}
