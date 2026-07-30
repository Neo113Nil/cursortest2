package com.baidu.mapsdkplatform.comapi.map;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.Point;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f {
    private static double a(double d8) {
        return (d8 / 3.141592653589793d) * 180.0d;
    }

    private static double b(double d8) {
        return (d8 * 3.141592653589793d) / 180.0d;
    }

    public static double c(LatLng latLng, LatLng latLng2) {
        if (latLng != null && latLng2 != null) {
            Point ll2point = CoordUtil.ll2point(latLng);
            Point ll2point2 = CoordUtil.ll2point(latLng2);
            if (ll2point != null && ll2point2 != null) {
                return CoordUtil.getDistance(ll2point, ll2point2);
            }
        }
        return -1.0d;
    }

    private static double a(LatLng latLng, LatLng latLng2) {
        double b8 = b(latLng.latitude);
        double b9 = b(latLng2.latitude);
        double b10 = b(latLng.longitude);
        return Math.acos((Math.sin(b8) * Math.sin(b9)) + (Math.cos(b8) * Math.cos(b9) * Math.cos(Math.abs(b(latLng2.longitude) - b10))));
    }

    public static List<LatLng> b(LatLng latLng, LatLng latLng2) {
        double c8 = c(latLng, latLng2);
        ArrayList arrayList = new ArrayList();
        if (150000.0d > c8 || c8 < 250000.0d) {
            arrayList.add(latLng);
            arrayList.add(latLng2);
            return arrayList;
        }
        double round = Math.round(c8 / 150000.0d);
        double a8 = a(latLng, latLng2);
        arrayList.add(latLng);
        for (double d8 = 0.0d; d8 < round; d8 += 1.0d) {
            arrayList.add(a(latLng, latLng2, d8 / round, a8));
        }
        arrayList.add(latLng2);
        return arrayList;
    }

    private static LatLng a(LatLng latLng, LatLng latLng2, double d8, double d9) {
        double d10 = latLng.latitude;
        double d11 = latLng2.latitude;
        double d12 = latLng.longitude;
        double d13 = latLng2.longitude;
        double sin = Math.sin((1.0d - d8) * d9) / Math.sin(d9);
        double sin2 = Math.sin(d8 * d9) / Math.sin(d9);
        double b8 = b(d10);
        double b9 = b(d11);
        double b10 = b(d12);
        double b11 = b(d13);
        double cos = (Math.cos(b8) * sin * Math.cos(b10)) + (Math.cos(b9) * sin2 * Math.cos(b11));
        double cos2 = (Math.cos(b8) * sin * Math.sin(b10)) + (Math.cos(b9) * sin2 * Math.sin(b11));
        return new LatLng(a(Math.atan2((sin * Math.sin(b8)) + (sin2 * Math.sin(b9)), Math.sqrt(Math.pow(cos, 2.0d) + Math.pow(cos2, 2.0d)))), a(Math.atan2(cos2, cos)));
    }
}
