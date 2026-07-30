package com.crrepa.band.my.training.utils;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

/* loaded from: classes3.dex */
public class j {
    private j() {
    }

    public static double calculateDistanceOfGoogle(double d8, double d9, double d10, double d11) {
        return SphericalUtil.computeDistanceBetween(new LatLng(d8, d9), new LatLng(d10, d11));
    }

    public static double calculateLineDistance(double d8, double d9, double d10, double d11) {
        return SphericalUtil.computeDistanceBetween(new LatLng(d8, d9), new LatLng(d10, d11));
    }
}
