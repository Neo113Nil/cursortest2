package com.baidu.mapsdkplatform.comjni.tools;

import android.os.Bundle;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comjni.tools.ParcelItem;
import com.moyoung.dafit.module.common.utils.u;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a {
    public static com.baidu.platform.comapi.basestruct.a a(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("strkey", str);
        JNITools.TransGeoStr2ComplexPt(bundle);
        com.baidu.platform.comapi.basestruct.a aVar = new com.baidu.platform.comapi.basestruct.a();
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

    public static String b() {
        return JNITools.GetToken();
    }

    public static double a(Point point, Point point2) {
        Bundle bundle = new Bundle();
        bundle.putDouble("x1", point.f8789x);
        bundle.putDouble("y1", point.f8790y);
        bundle.putDouble("x2", point2.f8789x);
        bundle.putDouble("y2", point2.f8790y);
        JNITools.GetDistanceByMC(bundle);
        return bundle.getDouble("distance");
    }

    public static void a(boolean z7, int i8) {
        JNITools.openLogEnable(z7, i8);
    }

    public static void a() {
        JNITools.initClass(new Bundle(), 0);
    }
}
