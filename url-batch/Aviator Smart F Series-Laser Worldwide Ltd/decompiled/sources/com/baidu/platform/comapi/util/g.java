package com.baidu.platform.comapi.util;

import android.text.TextUtils;
import com.baidu.mapapi.map.EncodePointType;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.map.t;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class g {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static g f9833a = new g();
    }

    public static g a() {
        return a.f9833a;
    }

    private ArrayList<LatLng> c(String str) {
        return new t().e(str);
    }

    public ArrayList<LatLng> b(String str) {
        return new t().d(str);
    }

    public ArrayList<LatLng> a(String str, int i8) {
        if (TextUtils.isEmpty(str) || i8 == EncodePointType.NONE.ordinal()) {
            return null;
        }
        if (i8 == EncodePointType.BUILDINGINFO.ordinal()) {
            return b(str);
        }
        if (i8 == EncodePointType.AOI.ordinal()) {
            return a(str);
        }
        if (i8 == EncodePointType.RECOGNIZE_AOI.ordinal()) {
            return c(str);
        }
        return null;
    }

    private ArrayList<LatLng> a(String str) {
        return new t().b(str);
    }
}
