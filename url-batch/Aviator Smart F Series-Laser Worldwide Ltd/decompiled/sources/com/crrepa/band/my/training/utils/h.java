package com.crrepa.band.my.training.utils;

import android.content.Context;
import com.crrepa.band.my.training.model.LocationCityInfo;
import com.crrepa.band.my.training.model.MapType;
import io.reactivex.Observable;

/* loaded from: classes3.dex */
public class h {
    private h() {
    }

    public static Observable<LocationCityInfo> getLocationAddress(Context context) {
        return new com.crrepa.band.my.training.map.google.c(context).getLocationAddress();
    }

    public static MapType getMapType(Context context) {
        return MapType.GOOGLE;
    }

    public static boolean isGooglePlayServices(Context context) {
        return com.crrepa.band.my.training.map.google.a.isGooglePlayServicesAvailable(context);
    }
}
