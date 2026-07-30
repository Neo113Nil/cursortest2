package com.baidu.mapapi.common;

import android.text.TextUtils;
import b5.b;
import com.baidu.mapsdkplatform.comapi.util.g;

/* loaded from: classes2.dex */
public class SysOSUtil {
    public static String getAuthToken() {
        return g.a();
    }

    public static float getDensity() {
        return g.f8302y;
    }

    public static int getDensityDpi() {
        return g.d();
    }

    public static String getDeviceID() {
        String c8 = g.c();
        return TextUtils.isEmpty(c8) ? c8 : c8.substring(0, c8.indexOf(b.VERTICAL));
    }

    public static String getModuleFileName() {
        return g.e();
    }

    public static String getNetType() {
        return g.f();
    }

    public static String getPhoneType() {
        return g.l();
    }

    public static int getScreenSizeX() {
        return g.m();
    }

    public static int getScreenSizeY() {
        return g.n();
    }

    public static void updateCuid() {
        g.c();
    }
}
