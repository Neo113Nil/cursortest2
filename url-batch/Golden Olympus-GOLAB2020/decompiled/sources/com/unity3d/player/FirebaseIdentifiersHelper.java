package com.unity3d.player;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
class FirebaseIdentifiersHelper {
    FirebaseIdentifiersHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnFirebaseAppInstanceIdResult(String str);

    public static void requestFirebaseIdentifiers(Context context) {
        try {
            Method method = FirebaseAnalytics.class.getMethod("getInstance", Context.class);
            if (!validateGetInstanceMethod(method, FirebaseAnalytics.class)) {
                nativeOnFirebaseAppInstanceIdResult(null);
                return;
            }
            Object invoke = method.invoke(null, context);
            if (invoke == null) {
                nativeOnFirebaseAppInstanceIdResult(null);
                return;
            }
            Method method2 = FirebaseAnalytics.class.getMethod("getAppInstanceId", null);
            if (validateGetAppInstanceIdMethod(method2)) {
                ((Task) method2.invoke(invoke, null)).addOnCompleteListener(new C1768p());
            } else {
                nativeOnFirebaseAppInstanceIdResult(null);
            }
        } catch (Exception unused) {
            nativeOnFirebaseAppInstanceIdResult(null);
        }
    }

    private static boolean validateGetAppInstanceIdMethod(Method method) {
        Type genericReturnType;
        if (method != null && w1.a(method) == 0 && (genericReturnType = method.getGenericReturnType()) != null && (genericReturnType instanceof ParameterizedType)) {
            ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
            if (parameterizedType.getRawType() != Task.class) {
                return false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                return true;
            }
        }
        return false;
    }

    private static boolean validateGetInstanceMethod(Method method, Class cls) {
        return method != null && method.getReturnType() == cls;
    }
}
