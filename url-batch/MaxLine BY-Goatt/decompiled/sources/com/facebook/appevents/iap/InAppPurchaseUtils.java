package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseUtils {
    public static final InAppPurchaseUtils INSTANCE = new InAppPurchaseUtils();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum BillingClientVersion {
        NONE(IntegrityManager.INTEGRITY_TYPE_NONE),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");

        private final String type;

        BillingClientVersion(String str) {
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum IAPProductType {
        INAPP("inapp"),
        SUBS("subs");

        private final String type;

        IAPProductType(String str) {
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }

    private InAppPurchaseUtils() {
    }

    public static final Class<?> getClass(String str) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            str.getClass();
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    public static final Class<?> getClassFromContext$facebook_core_release(Context context, String str) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            context.getClass();
            str.getClass();
            try {
                return context.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    public static final Method getDeclaredMethod$facebook_core_release(Class<?> cls, String str, Class<?>... clsArr) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            cls.getClass();
            str.getClass();
            clsArr.getClass();
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    public static final Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            cls.getClass();
            str.getClass();
            clsArr.getClass();
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    public static final Object invokeMethod(Class<?> cls, Method method, Object obj, Object... objArr) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            cls.getClass();
            method.getClass();
            objArr.getClass();
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }
}
