package com.squareup.moshi;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.maps.viewmodels.LatLng;
import com.squareup.cash.maps.viewmodels.LatLngBounds;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import java.lang.reflect.Type;
import kotlin.collections.EmptyList;
import kotlin.math.Constants;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.jvm.internal.ReflectProperties$LazySoftVal;
import kotlin.reflect.jvm.internal.types.AbstractKType;

/* loaded from: classes6.dex */
public abstract class _MoshiKotlinExtensionsKt {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JsonAdapter adapter(Moshi moshi, KType kType) {
        Type computeJavaType;
        moshi.getClass();
        kType.getClass();
        if (kType instanceof AbstractKType) {
            ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = ((AbstractKType) kType).computeJavaType;
            computeJavaType = reflectProperties$LazySoftVal != null ? (Type) reflectProperties$LazySoftVal.invoke() : null;
        }
        computeJavaType = TypesJVMKt.computeJavaType(kType, false);
        JsonAdapter adapter = moshi.adapter(computeJavaType);
        if ((adapter instanceof NullSafeJsonAdapter) || (adapter instanceof NonNullJsonAdapter)) {
            return adapter;
        }
        if (kType.isMarkedNullable()) {
            JsonAdapter nullSafe = adapter.nullSafe();
            nullSafe.getClass();
            return nullSafe;
        }
        JsonAdapter nonNull = adapter.nonNull();
        nonNull.getClass();
        return nonNull;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCustomerInvestingProfile.deepLinkSpecs;
    }

    public static final LatLngBounds toLatLngBounds(BrandCollection.GeoFence geoFence) {
        Double d;
        if (geoFence == null || (d = geoFence.max_latitude) == null) {
            return null;
        }
        double doubleValue = d.doubleValue();
        Double d2 = geoFence.max_longitude;
        if (d2 == null) {
            return null;
        }
        LatLng latLng = new LatLng(doubleValue, d2.doubleValue());
        Double d3 = geoFence.min_latitude;
        if (d3 == null) {
            return null;
        }
        double doubleValue2 = d3.doubleValue();
        Double d4 = geoFence.min_longitude;
        if (d4 != null) {
            return new LatLngBounds(latLng, new LatLng(doubleValue2, d4.doubleValue()));
        }
        return null;
    }

    public static final LocationViewModel toLocationModel(BrandCollection.GeoFence geoFence) {
        Double d;
        if (geoFence == null || (d = geoFence.min_longitude) == null) {
            return null;
        }
        double doubleValue = d.doubleValue();
        Double d2 = geoFence.max_longitude;
        if (d2 == null) {
            return null;
        }
        double doubleValue2 = d2.doubleValue();
        Double d3 = geoFence.min_latitude;
        if (d3 == null) {
            return null;
        }
        double doubleValue3 = d3.doubleValue();
        Double d4 = geoFence.max_latitude;
        if (d4 == null) {
            return null;
        }
        double doubleValue4 = d4.doubleValue();
        return new LocationViewModel((doubleValue3 + doubleValue4) / 2.0d, (doubleValue + doubleValue2) / 2.0d, Math.min((float) (Math.log(2.0d / Math.max(((doubleValue2 - doubleValue) * 2.2300000190734863d) / 360.0d, ((doubleValue4 - doubleValue3) * 1.0d) / 180.0d)) / Constants.LN2), 14.0f));
    }
}
