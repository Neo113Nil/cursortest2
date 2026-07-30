package com.baidu.mapapi.common;

import android.content.Context;
import com.baidu.mapsdkplatform.comapi.util.f;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import java.io.File;

/* loaded from: classes2.dex */
public class EnvironmentUtilities {

    /* renamed from: a, reason: collision with root package name */
    static String f5431a;

    /* renamed from: b, reason: collision with root package name */
    static String f5432b;

    /* renamed from: c, reason: collision with root package name */
    static String f5433c;

    /* renamed from: d, reason: collision with root package name */
    static int f5434d;

    /* renamed from: e, reason: collision with root package name */
    static int f5435e;

    /* renamed from: f, reason: collision with root package name */
    static int f5436f;

    /* renamed from: g, reason: collision with root package name */
    static int f5437g;

    /* renamed from: h, reason: collision with root package name */
    private static f f5438h;

    public static String getAppCachePath() {
        return f5432b;
    }

    public static String getAppSDCardPath() {
        String str = f5431a + "/BaiduMapSDKNew";
        if (str.length() != 0) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str;
    }

    public static String getAppSecondCachePath() {
        return f5433c;
    }

    public static int getDomTmpStgMax() {
        return f5435e;
    }

    public static int getItsTmpStgMax() {
        return f5436f;
    }

    public static int getMapTmpStgMax() {
        return f5434d;
    }

    public static String getSDCardPath() {
        return f5431a;
    }

    public static int getSsgTmpStgMax() {
        return f5437g;
    }

    public static void initAppDirectory(Context context) {
        if (f5438h == null) {
            f b8 = f.b();
            f5438h = b8;
            b8.b(context);
        }
        String str = f5431a;
        if (str != null && str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f5431a);
            String str2 = File.separator;
            sb.append(str2);
            sb.append("BaiduMapSDKNew");
            sb.append(str2);
            sb.append("cache");
            f5432b = sb.toString();
        } else if (f5438h.a() != null) {
            f5431a = f5438h.a().c();
            f5432b = f5438h.a().b();
        }
        if (f5438h.a() != null) {
            f5433c = f5438h.a().d();
        }
        f5434d = 52428800;
        f5435e = 52428800;
        f5436f = BmLocated.ALIGN_LEFT_TOP;
        f5437g = 52428800;
    }

    public static void setSDCardPath(String str) {
        f5431a = str;
    }
}
