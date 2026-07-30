package com.baidu.mapapi.util;

import android.text.TextUtils;
import com.baidu.mapapi.map.EncodePointType;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.util.g;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class EncryptSpatialRelationUtil {
    private static boolean a(LatLng latLng, String str, EncodePointType encodePointType) {
        ArrayList<LatLng> arrayList;
        if (encodePointType == null) {
            return false;
        }
        ArrayList<LatLng> a8 = g.a().a(str, encodePointType.ordinal());
        if (a8 == null || a8.size() == 0 || latLng == null) {
            return false;
        }
        for (int i8 = 0; i8 < a8.size(); i8++) {
            if (latLng.longitude == a8.get(i8).longitude && latLng.latitude == a8.get(i8).latitude) {
                return true;
            }
        }
        int size = a8.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            LatLng latLng2 = a8.get(i9);
            i9++;
            LatLng latLng3 = a8.get(i9 % size);
            double d8 = latLng2.latitude;
            double d9 = latLng3.latitude;
            if (d8 != d9 && latLng.latitude >= Math.min(d8, d9) && latLng.latitude < Math.max(latLng2.latitude, latLng3.latitude)) {
                double d10 = latLng.latitude;
                double d11 = latLng2.latitude;
                double d12 = latLng3.longitude;
                arrayList = a8;
                double d13 = latLng2.longitude;
                double d14 = (((d10 - d11) * (d12 - d13)) / (latLng3.latitude - d11)) + d13;
                double d15 = latLng.longitude;
                if (d14 == d15) {
                    return true;
                }
                if (d14 < d15) {
                    i10++;
                }
            } else {
                arrayList = a8;
            }
            a8 = arrayList;
        }
        return i10 % 2 == 1;
    }

    public static boolean isEncodedGeoPointsContainsPoint(LatLng latLng, String str, EncodePointType encodePointType) {
        if (latLng == null || TextUtils.isEmpty(str) || encodePointType == null) {
            return false;
        }
        return a(latLng, str, encodePointType);
    }
}
