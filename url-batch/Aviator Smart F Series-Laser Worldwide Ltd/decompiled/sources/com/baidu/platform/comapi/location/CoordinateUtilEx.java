package com.baidu.platform.comapi.location;

import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.basestruct.a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CoordinateUtilEx {
    public static Point Coordinate_encryptEx(float f8, float f9, String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("")) {
            str = "bd09ll";
        }
        switch (str) {
        }
        return null;
    }

    public static ArrayList<Point> Coordinate_encryptExArray(ArrayList<Point> arrayList, String str) {
        int i8;
        Point bd09llTobd09mc;
        String str2 = str;
        Point point = null;
        if (str2 == null) {
            return null;
        }
        if (str2.equals("")) {
            str2 = "bd09ll";
        }
        if (!str2.equals("bd09ll") && !str2.equals("bd09mc") && !str2.equals("gcj02") && !str2.equals("wgs84")) {
            return null;
        }
        int size = arrayList.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            fArr[i9] = arrayList.get(i9).getIntX() / 100000.0f;
            fArr2[i9] = arrayList.get(i9).getIntY() / 100000.0f;
        }
        ArrayList<Point> arrayList2 = new ArrayList<>();
        int i10 = 0;
        while (i10 < size) {
            switch (str2) {
                case "bd09ll":
                    i8 = size;
                    bd09llTobd09mc = CoordinateUtil.bd09llTobd09mc(fArr[i10], fArr2[i10]);
                    break;
                case "bd09mc":
                    i8 = size;
                    bd09llTobd09mc = new Point(fArr[i10], fArr2[i10]);
                    break;
                case "gcj02":
                    bd09llTobd09mc = CoordinateUtil.gcj02Tobd09mc(fArr[i10], fArr2[i10]);
                    i8 = size;
                    break;
                case "wgs84":
                    bd09llTobd09mc = CoordinateUtil.wgs84Tobd09mc(fArr[i10], fArr2[i10]);
                    i8 = size;
                    break;
                default:
                    bd09llTobd09mc = point;
                    i8 = size;
                    break;
            }
            if (bd09llTobd09mc != null) {
                arrayList2.add(bd09llTobd09mc);
            }
            i10++;
            size = i8;
            point = null;
        }
        return arrayList2;
    }

    public static double getDistanceByMc(Point point, Point point2) {
        return CoordinateUtil.getDistanceByMc(point.getDoubleX(), point.getDoubleY(), point2.getDoubleX(), point2.getDoubleY());
    }

    @Deprecated
    public static a getGeoComplexPointFromString(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        return CoordinateUtil.geoStringToComplexPt(str);
    }

    @Deprecated
    public static a getGeoComplexPtBoundFromString(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        return CoordinateUtil.geoStringToComplexPtBound(str);
    }

    public static Point getGeoPointFromString(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        return CoordinateUtil.geoStringToPoint(str);
    }

    public static Point getIntermediatePointByMC(Point point, Point point2, double d8) {
        return CoordinateUtil.getIntermediatePointByMC(point.getDoubleX(), point.getDoubleY(), point2.getDoubleX(), point2.getDoubleY(), d8);
    }

    public static String getStringFromGeoPoint(Point point) {
        return CoordinateUtil.pointToGeoString(point);
    }

    public static double getDistanceByMc(GeoPoint geoPoint, GeoPoint geoPoint2) {
        return CoordinateUtil.getDistanceByMc(geoPoint.getLongitude(), geoPoint.getLatitude(), geoPoint2.getLongitude(), geoPoint2.getLatitude());
    }

    public static Point getIntermediatePointByMC(GeoPoint geoPoint, GeoPoint geoPoint2, double d8) {
        return CoordinateUtil.getIntermediatePointByMC(geoPoint.getLongitude(), geoPoint.getLatitude(), geoPoint2.getLongitude(), geoPoint2.getLatitude(), d8);
    }
}
