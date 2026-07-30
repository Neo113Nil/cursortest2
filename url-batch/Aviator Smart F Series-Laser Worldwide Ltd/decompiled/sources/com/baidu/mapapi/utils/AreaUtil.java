package com.baidu.mapapi.utils;

import com.baidu.mapapi.model.LatLng;
import com.github.mikephil.charting.utils.i;
import java.util.List;

/* loaded from: classes2.dex */
public class AreaUtil {
    public static double calculateArea(LatLng latLng, LatLng latLng2) {
        if (latLng != null && latLng2 != null) {
            LatLng latLng3 = new LatLng(latLng.latitude, latLng2.longitude);
            double distance = DistanceUtil.getDistance(latLng3, latLng2);
            double distance2 = DistanceUtil.getDistance(latLng, latLng3);
            if (distance != i.DOUBLE_EPSILON && distance2 != i.DOUBLE_EPSILON) {
                return distance * distance2;
            }
        }
        return i.DOUBLE_EPSILON;
    }

    public static double calculateArea(List<LatLng> list) {
        double d8 = i.DOUBLE_EPSILON;
        if (list == null || list.size() < 3) {
            return i.DOUBLE_EPSILON;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            LatLng latLng = list.get(i8);
            i8++;
            LatLng latLng2 = list.get(i8 % size);
            d8 += (((latLng.longitude * 111319.49079327358d) * Math.cos(latLng.latitude * 0.017453292519943295d)) * (latLng2.latitude * 111319.49079327358d)) - ((latLng.latitude * 111319.49079327358d) * ((latLng2.longitude * 111319.49079327358d) * Math.cos(latLng2.latitude * 0.017453292519943295d)));
        }
        return (float) Math.abs(d8 / 2.0d);
    }
}
