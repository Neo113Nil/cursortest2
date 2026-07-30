package com.baidu.platform.comapi.util;

import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.platform.comjni.base.sdkauth.NASDKAuth;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile h f9834a;

    /* renamed from: b, reason: collision with root package name */
    private NASDKAuth f9835b = new NASDKAuth();

    private h() {
    }

    public static void a() {
        if (f9834a != null) {
            synchronized (h.class) {
                try {
                    if (f9834a != null) {
                        f9834a.c();
                        f9834a = null;
                    }
                } finally {
                }
            }
        }
    }

    public static h b() {
        if (f9834a == null) {
            synchronized (h.class) {
                try {
                    if (f9834a == null) {
                        f9834a = new h();
                    }
                } finally {
                }
            }
        }
        return f9834a;
    }

    private void c() {
        this.f9835b.dispose();
    }

    public boolean a(String str, int i8) {
        if (str == null) {
            return false;
        }
        com.baidu.platform.comjni.base.sdkauth.a aVar = com.baidu.platform.comjni.base.sdkauth.a.ParkingSpace;
        if ((aVar.a() & i8) != 0) {
            this.f9835b.a(str, aVar.a());
        }
        com.baidu.platform.comjni.base.sdkauth.a aVar2 = com.baidu.platform.comjni.base.sdkauth.a.WaterMark;
        if ((i8 & aVar2.a()) == 0) {
            return true;
        }
        String str2 = "token=" + AppMD5.encodeUrlParamsValue(str);
        this.f9835b.a("https://api.map.baidu.com/sdkproxy/lbs_androidsdk/api_watermark/sdk_get_auth?" + (str2 + "&sign=" + AppMD5.getSignMD5String(str2)), aVar2.a());
        return true;
    }
}
