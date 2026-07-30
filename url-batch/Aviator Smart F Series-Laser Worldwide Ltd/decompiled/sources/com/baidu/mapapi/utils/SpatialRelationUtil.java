package com.baidu.mapapi.utils;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.Point;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class SpatialRelationUtil {
    private static Point a(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && point != null && list.size() != 0) {
            if (list.size() >= 2) {
                Point point3 = list.get(0);
                int size = list.size();
                int i8 = 1;
                while (true) {
                    int i9 = size - 1;
                    if (i8 > i9) {
                        break;
                    }
                    Point point4 = list.get(i8);
                    if ((i8 == i9 && point4.equals(point)) || point3.equals(point)) {
                        return point;
                    }
                    Point a8 = a(point.doubleX, point.doubleY, point3.doubleX, point3.doubleY, point4.doubleX, point4.doubleY);
                    i8++;
                    size = size;
                    point3 = point4;
                    point2 = a8;
                }
            } else {
                return null;
            }
        }
        return point2;
    }

    public static LatLng getNearestDistancePointFromLine(List<LatLng> list, LatLng latLng) {
        if (list != null && list.size() != 0 && latLng != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<LatLng> it = list.iterator();
            while (it != null && it.hasNext()) {
                LatLng next = it.next();
                arrayList.add(new Point(next.longitude, next.latitude));
                if (next.equals(latLng)) {
                    return next;
                }
            }
            Point a8 = a(arrayList, new Point(latLng.longitude, latLng.latitude));
            if (a8 != null) {
                return new LatLng(a8.doubleY, a8.doubleX);
            }
        }
        return null;
    }

    public static LatLng getNearestPointFromLine(List<LatLng> list, LatLng latLng) {
        LatLng latLng2 = null;
        if (list != null && list.size() != 0 && latLng != null) {
            int i8 = 0;
            while (i8 < list.size() - 1) {
                int i9 = i8 + 1;
                LatLng a8 = a(list.get(i8), list.get(i9), latLng);
                if ((a8.latitude - list.get(i8).latitude) * (a8.latitude - list.get(i9).latitude) > i.DOUBLE_EPSILON || (a8.longitude - list.get(i8).longitude) * (a8.longitude - list.get(i9).longitude) > i.DOUBLE_EPSILON) {
                    a8 = DistanceUtil.getDistance(latLng, list.get(i8)) < DistanceUtil.getDistance(latLng, list.get(i9)) ? list.get(i8) : list.get(i9);
                }
                if (latLng2 == null || DistanceUtil.getDistance(latLng, a8) < DistanceUtil.getDistance(latLng, latLng2)) {
                    latLng2 = a8;
                }
                i8 = i9;
            }
        }
        return latLng2;
    }

    public static boolean isCircleContainsPoint(LatLng latLng, int i8, LatLng latLng2) {
        return (latLng == null || i8 == 0 || latLng2 == null || DistanceUtil.getDistance(latLng, latLng2) > ((double) i8)) ? false : true;
    }

    public static boolean isPolygonContainsPoint(List<LatLng> list, LatLng latLng) {
        int i8;
        if (list == null || list.size() == 0 || latLng == null) {
            return false;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (latLng.longitude == list.get(i9).longitude && latLng.latitude == list.get(i9).latitude) {
                return true;
            }
        }
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            LatLng latLng2 = list.get(i10);
            i10++;
            LatLng latLng3 = list.get(i10 % size);
            double d8 = latLng2.latitude;
            double d9 = latLng3.latitude;
            if (d8 != d9 && latLng.latitude >= Math.min(d8, d9) && latLng.latitude < Math.max(latLng2.latitude, latLng3.latitude)) {
                double d10 = latLng.latitude;
                double d11 = latLng2.latitude;
                double d12 = latLng3.longitude;
                i8 = size;
                double d13 = latLng2.longitude;
                double d14 = (((d10 - d11) * (d12 - d13)) / (latLng3.latitude - d11)) + d13;
                double d15 = latLng.longitude;
                if (d14 == d15) {
                    return true;
                }
                if (d14 < d15) {
                    i11++;
                }
            } else {
                i8 = size;
            }
            size = i8;
        }
        return i11 % 2 == 1;
    }

    private static Point a(double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14 = d12 - d10;
        double d15 = d13 - d11;
        double d16 = ((d8 - d10) * d14) + ((d9 - d11) * d15);
        if (d16 <= i.DOUBLE_EPSILON) {
            return new Point(d10, d11);
        }
        double d17 = (d14 * d14) + (d15 * d15);
        if (d16 >= d17) {
            return new Point(d12, d13);
        }
        double d18 = d16 / d17;
        return new Point(d10 + (d14 * d18), d11 + (d15 * d18));
    }

    private static LatLng a(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(latLng2);
        GeoPoint ll2mc3 = CoordUtil.ll2mc(latLng3);
        double sqrt = Math.sqrt(((ll2mc2.getLongitudeE6() - ll2mc.getLongitudeE6()) * (ll2mc2.getLongitudeE6() - ll2mc.getLongitudeE6())) + ((ll2mc2.getLatitudeE6() - ll2mc.getLatitudeE6()) * (ll2mc2.getLatitudeE6() - ll2mc.getLatitudeE6())));
        double longitudeE6 = (((ll2mc2.getLongitudeE6() - ll2mc.getLongitudeE6()) * (ll2mc3.getLongitudeE6() - ll2mc.getLongitudeE6())) + ((ll2mc2.getLatitudeE6() - ll2mc.getLatitudeE6()) * (ll2mc3.getLatitudeE6() - ll2mc.getLatitudeE6()))) / (sqrt * sqrt);
        return CoordUtil.mc2ll(new GeoPoint(ll2mc.getLatitudeE6() + ((ll2mc2.getLatitudeE6() - ll2mc.getLatitudeE6()) * longitudeE6), ll2mc.getLongitudeE6() + ((ll2mc2.getLongitudeE6() - ll2mc.getLongitudeE6()) * longitudeE6)));
    }
}
