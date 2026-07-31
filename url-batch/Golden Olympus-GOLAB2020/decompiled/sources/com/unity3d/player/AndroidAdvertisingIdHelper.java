package com.unity3d.player;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.b9;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class AndroidAdvertisingIdHelper {
    AndroidAdvertisingIdHelper() {
    }

    private static native void nativeOnAndroidAdvertisingIdResult(String str);

    public static void requestGoogleAdId(Context context) {
        try {
            Method method = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class);
            if (method == null) {
                nativeOnAndroidAdvertisingIdResult(null);
                return;
            }
            Object invoke = method.invoke(null, context);
            if (invoke == null) {
                nativeOnAndroidAdvertisingIdResult(null);
                return;
            }
            Class<?> cls = invoke.getClass();
            Method method2 = cls.getMethod("getId", null);
            if (method2 == null) {
                nativeOnAndroidAdvertisingIdResult(null);
                return;
            }
            String str = (String) method2.invoke(invoke, null);
            Method method3 = cls.getMethod(b9.i.f15531M, null);
            if (method3 == null) {
                nativeOnAndroidAdvertisingIdResult(null);
            } else if (((Boolean) method3.invoke(invoke, null)).booleanValue()) {
                nativeOnAndroidAdvertisingIdResult(null);
            } else {
                nativeOnAndroidAdvertisingIdResult(str);
            }
        } catch (Exception unused) {
            nativeOnAndroidAdvertisingIdResult(null);
        }
    }
}
