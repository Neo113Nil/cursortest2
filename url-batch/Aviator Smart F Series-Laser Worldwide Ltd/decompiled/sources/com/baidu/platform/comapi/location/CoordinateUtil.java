package com.baidu.platform.comapi.location;

import android.os.Bundle;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.basestruct.a;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comjni.tools.ParcelItem;
import com.moyoung.dafit.module.common.utils.u;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CoordinateUtil {
    public static native Point bd09llTobd09mc(double d8, double d9);

    public static native Point bd09llTogcj02ll(double d8, double d9);

    public static native Point bd09mcTobd09ll(double d8, double d9);

    public static Point bd09mcTogcj02ll(double d8, double d9) {
        Point bd09mcTobd09ll = bd09mcTobd09ll(d8, d9);
        if (bd09mcTobd09ll != null) {
            return bd09llTogcj02ll(bd09mcTobd09ll.getDoubleX(), bd09mcTobd09ll.getDoubleY());
        }
        return null;
    }

    public static Point complexPtToPoint(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        return nativeComplexPtToPoint(str);
    }

    public static native Point gcj02Tobd09ll(double d8, double d9);

    public static Point gcj02Tobd09mc(double d8, double d9) {
        Point gcj02Tobd09ll = gcj02Tobd09ll(d8, d9);
        if (gcj02Tobd09ll != null) {
            return bd09llTobd09mc(gcj02Tobd09ll.getDoubleX(), gcj02Tobd09ll.getDoubleY());
        }
        return null;
    }

    public static a geoStringToComplexPt(String str) {
        if (str != null && !str.equals("")) {
            Bundle bundle = new Bundle();
            if (nativeGeoStringToComplexPt(str, bundle)) {
                a aVar = new a();
                Bundle bundle2 = bundle.getBundle("map_bound");
                if (bundle2 != null) {
                    Bundle bundle3 = bundle2.getBundle("ll");
                    if (bundle3 != null) {
                        aVar.f8792b = new Point((int) bundle3.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTX), (int) bundle3.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTY));
                    }
                    Bundle bundle4 = bundle2.getBundle(u.LANGUAGE_RU);
                    if (bundle4 != null) {
                        aVar.f8793c = new Point((int) bundle4.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTX), (int) bundle4.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTY));
                    }
                }
                for (ParcelItem parcelItem : (ParcelItem[]) bundle.getParcelableArray("poly_line")) {
                    if (aVar.f8794d == null) {
                        aVar.f8794d = new ArrayList<>();
                    }
                    Bundle bundle5 = parcelItem.getBundle();
                    if (bundle5 != null) {
                        ParcelItem[] parcelItemArr = (ParcelItem[]) bundle5.getParcelableArray("point_array");
                        ArrayList<Point> arrayList = new ArrayList<>();
                        for (ParcelItem parcelItem2 : parcelItemArr) {
                            Bundle bundle6 = parcelItem2.getBundle();
                            if (bundle6 != null) {
                                arrayList.add(new Point((int) bundle6.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTX), (int) bundle6.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTY)));
                            }
                        }
                        arrayList.trimToSize();
                        aVar.f8794d.add(arrayList);
                    }
                }
                aVar.f8794d.trimToSize();
                aVar.f8791a = (int) bundle.getDouble("type");
                return aVar;
            }
        }
        return null;
    }

    public static a geoStringToComplexPtBound(String str) {
        if (str != null && !str.equals("")) {
            Bundle bundle = new Bundle();
            if (nativeGeoStringToComplexPtBound(str, bundle)) {
                a aVar = new a();
                Bundle bundle2 = bundle.getBundle("map_bound");
                if (bundle2 != null) {
                    Bundle bundle3 = bundle2.getBundle("ll");
                    if (bundle3 != null) {
                        aVar.f8792b = new Point((int) bundle3.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTX), (int) bundle3.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTY));
                    }
                    Bundle bundle4 = bundle2.getBundle(u.LANGUAGE_RU);
                    if (bundle4 != null) {
                        aVar.f8793c = new Point((int) bundle4.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTX), (int) bundle4.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTY));
                    }
                }
                aVar.f8791a = (int) bundle.getDouble("type");
                return aVar;
            }
        }
        return null;
    }

    public static Point geoStringToPoint(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        return nativeGeoStringToPoint(str);
    }

    public static native double getDistanceByMc(double d8, double d9, double d10, double d11);

    public static native Point getIntermediatePointByMC(double d8, double d9, double d10, double d11, double d12);

    private static native Point nativeComplexPtToPoint(String str);

    private static native boolean nativeGeoStringToComplexPt(String str, Bundle bundle);

    private static native boolean nativeGeoStringToComplexPtBound(String str, Bundle bundle);

    private static native Point nativeGeoStringToPoint(String str);

    private static native String nativePointToGeoString(double d8, double d9);

    public static String pointToGeoString(Point point) {
        return point == null ? "" : nativePointToGeoString(point.getDoubleX(), point.getDoubleY());
    }

    public static Point wgs84Tobd09ll(double d8, double d9) {
        Point wgs84Togcj02 = wgs84Togcj02(d8, d9);
        if (wgs84Togcj02 != null) {
            return gcj02Tobd09ll(wgs84Togcj02.getDoubleX(), wgs84Togcj02.getDoubleY());
        }
        return null;
    }

    public static Point wgs84Tobd09mc(double d8, double d9) {
        Point gcj02Tobd09ll;
        Point wgs84Togcj02 = wgs84Togcj02(d8, d9);
        if (wgs84Togcj02 == null || (gcj02Tobd09ll = gcj02Tobd09ll(wgs84Togcj02.getDoubleX(), wgs84Togcj02.getDoubleY())) == null) {
            return null;
        }
        return bd09llTobd09mc(gcj02Tobd09ll.getDoubleX(), gcj02Tobd09ll.getDoubleY());
    }

    public static native Point wgs84Togcj02(double d8, double d9);
}
