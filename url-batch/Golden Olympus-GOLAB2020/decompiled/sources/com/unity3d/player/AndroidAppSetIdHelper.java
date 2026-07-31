package com.unity3d.player;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
class AndroidAppSetIdHelper {
    AndroidAppSetIdHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnAndroidAppSetIdResult(String str);

    public static void requestAppSetId(Context context) {
        try {
            Object invoke = AppSet.class.getMethod("getClient", Context.class).invoke(AppSet.class, context);
            if (invoke == null) {
                nativeOnAndroidAppSetIdResult(null);
                return;
            }
            Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", null).invoke(invoke, null);
            if (invoke2 == null) {
                nativeOnAndroidAppSetIdResult(null);
            } else {
                invoke2.getClass().getMethod("addOnSuccessListener", OnSuccessListener.class).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new C1725a()));
            }
        } catch (Exception unused) {
            nativeOnAndroidAppSetIdResult(null);
        }
    }
}
