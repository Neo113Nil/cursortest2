package com.google.maps.android;

import com.github.mikephil.charting.utils.i;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes4.dex */
public class SphericalUtil {
    private SphericalUtil() {
    }

    static double computeAngleBetween(LatLng latLng, LatLng latLng2) {
        return distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
    }

    public static double computeArea(List<LatLng> list) {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }

    public static double computeHeading(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude) - radians2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4)))), -180.0d, 180.0d);
    }

    public static double computeLength(List<LatLng> list) {
        int size = list.size();
        double d8 = i.DOUBLE_EPSILON;
        if (size < 2) {
            return i.DOUBLE_EPSILON;
        }
        LatLng latLng = null;
        for (LatLng latLng2 : list) {
            if (latLng != null) {
                d8 += distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
            }
            latLng = latLng2;
        }
        return d8 * 6371009.0d;
    }

    public static LatLng computeOffset(LatLng latLng, double d8, double d9) {
        double d10 = d8 / 6371009.0d;
        double radians = Math.toRadians(d9);
        double radians2 = Math.toRadians(latLng.latitude);
        double radians3 = Math.toRadians(latLng.longitude);
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    public static LatLng computeOffsetOrigin(LatLng latLng, double d8, double d9) {
        double radians = Math.toRadians(d9);
        double d10 = d8 / 6371009.0d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10) * Math.cos(radians);
        double sin2 = Math.sin(d10) * Math.sin(radians);
        double sin3 = Math.sin(Math.toRadians(latLng.latitude));
        double d11 = cos * cos;
        double d12 = sin * sin;
        double d13 = ((d12 * d11) + (d11 * d11)) - ((d11 * sin3) * sin3);
        if (d13 < i.DOUBLE_EPSILON) {
            return null;
        }
        double d14 = sin * sin3;
        double d15 = d11 + d12;
        double sqrt = (d14 + Math.sqrt(d13)) / d15;
        double d16 = (sin3 - (sin * sqrt)) / cos;
        double atan2 = Math.atan2(d16, sqrt);
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            atan2 = Math.atan2(d16, (d14 - Math.sqrt(d13)) / d15);
        }
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(atan2), Math.toDegrees(Math.toRadians(latLng.longitude) - Math.atan2(sin2, (cos * Math.cos(atan2)) - (sin * Math.sin(atan2)))));
    }

    public static double computeSignedArea(List<LatLng> list) {
        return computeSignedArea(list, 6371009.0d);
    }

    private static double distanceRadians(double d8, double d9, double d10, double d11) {
        return MathUtil.arcHav(MathUtil.havDistance(d8, d10, d9 - d11));
    }

    public static LatLng interpolate(LatLng latLng, LatLng latLng2, double d8) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        double computeAngleBetween = computeAngleBetween(latLng, latLng2);
        double sin = Math.sin(computeAngleBetween);
        if (sin < 1.0E-6d) {
            double d9 = latLng.latitude;
            double d10 = d9 + ((latLng2.latitude - d9) * d8);
            double d11 = latLng.longitude;
            return new LatLng(d10, d11 + ((latLng2.longitude - d11) * d8));
        }
        double sin2 = Math.sin((1.0d - d8) * computeAngleBetween) / sin;
        double sin3 = Math.sin(computeAngleBetween * d8) / sin;
        double d12 = cos * sin2;
        double d13 = cos2 * sin3;
        double cos3 = (Math.cos(radians2) * d12) + (Math.cos(radians4) * d13);
        double sin4 = (d12 * Math.sin(radians2)) + (d13 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((sin2 * Math.sin(radians)) + (Math.sin(radians3) * sin3), Math.sqrt((cos3 * cos3) + (sin4 * sin4)))), Math.toDegrees(Math.atan2(sin4, cos3)));
    }

    private static double polarTriangleArea(double d8, double d9, double d10, double d11) {
        double d12 = d9 - d11;
        double d13 = d8 * d10;
        return Math.atan2(Math.sin(d12) * d13, (d13 * Math.cos(d12)) + 1.0d) * 2.0d;
    }

    static double computeSignedArea(List<LatLng> list, double d8) {
        int size = list.size();
        double d9 = i.DOUBLE_EPSILON;
        if (size < 3) {
            return i.DOUBLE_EPSILON;
        }
        LatLng latLng = list.get(size - 1);
        double tan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.latitude)) / 2.0d);
        double radians = Math.toRadians(latLng.longitude);
        double d10 = tan;
        double d11 = radians;
        for (LatLng latLng2 : list) {
            double tan2 = Math.tan((1.5707963267948966d - Math.toRadians(latLng2.latitude)) / 2.0d);
            double radians2 = Math.toRadians(latLng2.longitude);
            d9 += polarTriangleArea(tan2, radians2, d10, d11);
            d10 = tan2;
            d11 = radians2;
        }
        return d9 * d8 * d8;
    }
}
