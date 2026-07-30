package com.google.maps.android;

import com.github.mikephil.charting.utils.i;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* loaded from: classes4.dex */
public class PolyUtil {
    public static final double DEFAULT_TOLERANCE = 0.1d;

    private PolyUtil() {
    }

    public static boolean containsLocation(LatLng latLng, List<LatLng> list, boolean z7) {
        return containsLocation(latLng.latitude, latLng.longitude, list, z7);
    }

    public static List<LatLng> decode(String str) {
        int i8;
        int i9;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = 1;
            int i14 = 1;
            int i15 = 0;
            while (true) {
                i8 = i10 + 1;
                int charAt = str.charAt(i10) - '@';
                i14 += charAt << i15;
                i15 += 5;
                if (charAt < 31) {
                    break;
                }
                i10 = i8;
            }
            int i16 = ((i14 & 1) != 0 ? ~(i14 >> 1) : i14 >> 1) + i11;
            int i17 = 0;
            while (true) {
                i9 = i8 + 1;
                int charAt2 = str.charAt(i8) - '@';
                i13 += charAt2 << i17;
                i17 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i8 = i9;
            }
            i12 += (i13 & 1) != 0 ? ~(i13 >> 1) : i13 >> 1;
            arrayList.add(new LatLng(i16 * 1.0E-5d, i12 * 1.0E-5d));
            i11 = i16;
            i10 = i9;
        }
        return arrayList;
    }

    public static double distanceToLine(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double radians5 = Math.toRadians(latLng3.latitude);
        double radians6 = Math.toRadians(latLng3.longitude);
        double cos = Math.cos(radians3);
        double d8 = radians5 - radians3;
        double d9 = (radians6 - radians4) * cos;
        double d10 = (((radians - radians3) * d8) + (((radians2 - radians4) * cos) * d9)) / ((d8 * d8) + (d9 * d9));
        if (d10 <= i.DOUBLE_EPSILON) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng2);
        }
        if (d10 >= 1.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng3);
        }
        double d11 = latLng2.latitude;
        double d12 = d11 + ((latLng3.latitude - d11) * d10);
        double d13 = latLng2.longitude;
        return SphericalUtil.computeDistanceBetween(latLng, new LatLng(d12, d13 + (d10 * (latLng3.longitude - d13))));
    }

    public static String encode(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j8 = 0;
        long j9 = 0;
        for (LatLng latLng : list) {
            long round = Math.round(latLng.latitude * 100000.0d);
            long round2 = Math.round(latLng.longitude * 100000.0d);
            encode(round - j8, stringBuffer);
            encode(round2 - j9, stringBuffer);
            j8 = round;
            j9 = round2;
        }
        return stringBuffer.toString();
    }

    private static boolean intersects(double d8, double d9, double d10, double d11, double d12, boolean z7) {
        if ((d12 >= i.DOUBLE_EPSILON && d12 >= d10) || ((d12 < i.DOUBLE_EPSILON && d12 < d10) || d11 <= -1.5707963267948966d || d8 <= -1.5707963267948966d || d9 <= -1.5707963267948966d || d8 >= 1.5707963267948966d || d9 >= 1.5707963267948966d || d10 <= -3.141592653589793d)) {
            return false;
        }
        double d13 = (((d10 - d12) * d8) + (d9 * d12)) / d10;
        if (d8 >= i.DOUBLE_EPSILON && d9 >= i.DOUBLE_EPSILON && d11 < d13) {
            return false;
        }
        if ((d8 <= i.DOUBLE_EPSILON && d9 <= i.DOUBLE_EPSILON && d11 >= d13) || d11 >= 1.5707963267948966d) {
            return true;
        }
        if (z7) {
            if (Math.tan(d11) < tanLatGC(d8, d9, d10, d12)) {
                return false;
            }
        } else if (MathUtil.mercator(d11) < mercatorLatRhumb(d8, d9, d10, d12)) {
            return false;
        }
        return true;
    }

    public static boolean isClosedPolygon(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z7, double d8) {
        return isLocationOnEdgeOrPath(latLng, list, true, z7, d8);
    }

    private static boolean isLocationOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z7, boolean z8, double d8) {
        return locationIndexOnEdgeOrPath(latLng, list, z7, z8, d8) >= 0;
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z7, double d8) {
        return isLocationOnEdgeOrPath(latLng, list, false, z7, d8);
    }

    private static boolean isOnSegmentGC(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        double havDistance = MathUtil.havDistance(d8, d12, d9 - d13);
        if (havDistance <= d14) {
            return true;
        }
        double havDistance2 = MathUtil.havDistance(d10, d12, d11 - d13);
        if (havDistance2 <= d14) {
            return true;
        }
        double havFromSin = MathUtil.havFromSin(MathUtil.sinFromHav(havDistance) * sinDeltaBearing(d8, d9, d10, d11, d12, d13));
        if (havFromSin > d14) {
            return false;
        }
        double havDistance3 = MathUtil.havDistance(d8, d10, d9 - d11);
        double d15 = ((1.0d - (havDistance3 * 2.0d)) * havFromSin) + havDistance3;
        if (havDistance > d15 || havDistance2 > d15) {
            return false;
        }
        if (havDistance3 < 0.74d) {
            return true;
        }
        double d16 = 1.0d - (2.0d * havFromSin);
        return MathUtil.sinSumFromHav((havDistance - havFromSin) / d16, (havDistance2 - havFromSin) / d16) > i.DOUBLE_EPSILON;
    }

    public static int locationIndexOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z7, boolean z8, double d8) {
        List<LatLng> list2;
        int i8;
        int size = list.size();
        if (size == 0) {
            return -1;
        }
        double d9 = d8 / 6371009.0d;
        double hav = MathUtil.hav(d9);
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        if (z7) {
            i8 = size - 1;
            list2 = list;
        } else {
            list2 = list;
            i8 = 0;
        }
        LatLng latLng2 = list2.get(i8);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        if (z8) {
            double d10 = radians3;
            double d11 = radians4;
            int i9 = 0;
            for (LatLng latLng3 : list) {
                double radians5 = Math.toRadians(latLng3.latitude);
                double radians6 = Math.toRadians(latLng3.longitude);
                if (isOnSegmentGC(d10, d11, radians5, radians6, radians, radians2, hav)) {
                    return Math.max(0, i9 - 1);
                }
                i9++;
                d10 = radians5;
                d11 = radians6;
            }
            return -1;
        }
        double d12 = radians - d9;
        double d13 = radians + d9;
        double mercator = MathUtil.mercator(radians3);
        double mercator2 = MathUtil.mercator(radians);
        double[] dArr = new double[3];
        int i10 = 0;
        for (LatLng latLng4 : list) {
            double d14 = mercator2;
            double radians7 = Math.toRadians(latLng4.latitude);
            double mercator3 = MathUtil.mercator(radians7);
            double radians8 = Math.toRadians(latLng4.longitude);
            if (Math.max(radians3, radians7) >= d12 && Math.min(radians3, radians7) <= d13) {
                double wrap = MathUtil.wrap(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                double wrap2 = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                dArr[0] = wrap2;
                dArr[1] = wrap2 + 6.283185307179586d;
                dArr[2] = wrap2 - 6.283185307179586d;
                for (int i11 = 0; i11 < 3; i11++) {
                    double d15 = dArr[i11];
                    double d16 = mercator3 - mercator;
                    double d17 = (wrap * wrap) + (d16 * d16);
                    double d18 = i.DOUBLE_EPSILON;
                    if (d17 > i.DOUBLE_EPSILON) {
                        d18 = MathUtil.clamp(((d15 * wrap) + ((d14 - mercator) * d16)) / d17, i.DOUBLE_EPSILON, 1.0d);
                    }
                    if (MathUtil.havDistance(radians, MathUtil.inverseMercator(mercator + (d18 * d16)), d15 - (d18 * wrap)) < hav) {
                        return Math.max(0, i10 - 1);
                    }
                }
            }
            i10++;
            radians4 = radians8;
            radians3 = radians7;
            mercator2 = d14;
            mercator = mercator3;
        }
        return -1;
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z7, double d8) {
        return locationIndexOnEdgeOrPath(latLng, list, false, z7, d8);
    }

    private static double mercatorLatRhumb(double d8, double d9, double d10, double d11) {
        return ((MathUtil.mercator(d8) * (d10 - d11)) + (MathUtil.mercator(d9) * d11)) / d10;
    }

    public static List<LatLng> simplify(List<LatLng> list, double d8) {
        LatLng latLng;
        int size = list.size();
        if (size < 1) {
            throw new IllegalArgumentException("Polyline must have at least 1 point");
        }
        double d9 = i.DOUBLE_EPSILON;
        if (d8 <= i.DOUBLE_EPSILON) {
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        boolean isClosedPolygon = isClosedPolygon(list);
        if (isClosedPolygon) {
            latLng = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(new LatLng(latLng.latitude + 1.0E-11d, latLng.longitude + 1.0E-11d));
        } else {
            latLng = null;
        }
        Stack stack = new Stack();
        double[] dArr = new double[size];
        int i8 = 0;
        dArr[0] = 1.0d;
        int i9 = size - 1;
        dArr[i9] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i9});
            int i10 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                double d10 = d9;
                for (int i11 = iArr[0] + 1; i11 < iArr[1]; i11++) {
                    double distanceToLine = distanceToLine(list.get(i11), list.get(iArr[0]), list.get(iArr[1]));
                    if (distanceToLine > d10) {
                        d10 = distanceToLine;
                        i10 = i11;
                    }
                }
                if (d10 > d8) {
                    dArr[i10] = d10;
                    stack.push(new int[]{iArr[0], i10});
                    stack.push(new int[]{i10, iArr[1]});
                }
                d9 = i.DOUBLE_EPSILON;
            }
        }
        if (isClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(latLng);
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng2 : list) {
            if (dArr[i8] != i.DOUBLE_EPSILON) {
                arrayList.add(latLng2);
            }
            i8++;
        }
        return arrayList;
    }

    private static double sinDeltaBearing(double d8, double d9, double d10, double d11, double d12, double d13) {
        double sin = Math.sin(d8);
        double cos = Math.cos(d10);
        double cos2 = Math.cos(d12);
        double d14 = d13 - d9;
        double d15 = d11 - d9;
        double sin2 = Math.sin(d14) * cos2;
        double sin3 = Math.sin(d15) * cos;
        double d16 = sin * 2.0d;
        double sin4 = Math.sin(d12 - d8) + (cos2 * d16 * MathUtil.hav(d14));
        double sin5 = Math.sin(d10 - d8) + (d16 * cos * MathUtil.hav(d15));
        double d17 = ((sin2 * sin2) + (sin4 * sin4)) * ((sin3 * sin3) + (sin5 * sin5));
        if (d17 <= i.DOUBLE_EPSILON) {
            return 1.0d;
        }
        return ((sin2 * sin5) - (sin4 * sin3)) / Math.sqrt(d17);
    }

    private static double tanLatGC(double d8, double d9, double d10, double d11) {
        return ((Math.tan(d8) * Math.sin(d10 - d11)) + (Math.tan(d9) * Math.sin(d11))) / Math.sin(d10);
    }

    public static boolean containsLocation(double d8, double d9, List<LatLng> list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d8);
        double radians2 = Math.toRadians(d9);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.latitude);
        double radians4 = Math.toRadians(latLng.longitude);
        double d10 = radians3;
        int i8 = 0;
        for (LatLng latLng2 : list) {
            double wrap = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d10 && wrap == i.DOUBLE_EPSILON) {
                return true;
            }
            double radians5 = Math.toRadians(latLng2.latitude);
            double radians6 = Math.toRadians(latLng2.longitude);
            if (intersects(d10, radians5, MathUtil.wrap(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, wrap, z7)) {
                i8++;
            }
            d10 = radians5;
            radians4 = radians6;
        }
        return (i8 & 1) != 0;
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z7) {
        return isLocationOnEdge(latLng, list, z7, 0.1d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z7) {
        return isLocationOnPath(latLng, list, z7, 0.1d);
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z7) {
        return locationIndexOnPath(latLng, list, z7, 0.1d);
    }

    private static void encode(long j8, StringBuffer stringBuffer) {
        long j9 = j8 << 1;
        if (j8 < 0) {
            j9 = ~j9;
        }
        while (j9 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j9)) + 63)));
            j9 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j9 + 63)));
    }
}
