package com.baidu.platform.comapi.h.t;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/* loaded from: classes2.dex */
public class b {
    public static GeoPoint a(double d8, double d9) {
        LatLng a8 = a(new LatLng(d9, d8), "wgs84");
        return new GeoPoint((int) (a8.latitude * 100000.0d), (int) (a8.longitude * 100000.0d));
    }

    private static LatLng a(LatLng latLng, String str) {
        if (latLng == null) {
            return null;
        }
        return CoordUtil.Coordinate_encryptEx((float) latLng.longitude, (float) latLng.latitude, str);
    }
}
