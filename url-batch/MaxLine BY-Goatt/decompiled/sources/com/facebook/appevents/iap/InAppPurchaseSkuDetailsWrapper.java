package com.facebook.appevents.iap;

import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseSkuDetailsWrapper {
    private static final String CLASSNAME_SKU_DETAILS_PARAMS = "com.android.billingclient.api.SkuDetailsParams";
    private static final String CLASSNAME_SKU_DETAILS_PARAMS_BUILDER = "com.android.billingclient.api.SkuDetailsParams$Builder";
    public static final Companion Companion = new Companion(null);
    private static final String METHOD_BUILD = "build";
    private static final String METHOD_NEW_BUILDER = "newBuilder";
    private static final String METHOD_SET_SKU_LIST = "setSkusList";
    private static final String METHOD_SET_TYPE = "setType";
    private static InAppPurchaseSkuDetailsWrapper instance;
    private final Method buildMethod;
    private final Class<?> builderClazz;
    private final Method newBuilderMethod;
    private final Method setSkusListMethod;
    private final Method setTypeMethod;
    private final Class<?> skuDetailsParamsClazz;

    public InAppPurchaseSkuDetailsWrapper(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        cls.getClass();
        cls2.getClass();
        method.getClass();
        method2.getClass();
        method3.getClass();
        method4.getClass();
        this.skuDetailsParamsClazz = cls;
        this.builderClazz = cls2;
        this.newBuilderMethod = method;
        this.setTypeMethod = method2;
        this.setSkusListMethod = method3;
        this.buildMethod = method4;
    }

    public static final /* synthetic */ InAppPurchaseSkuDetailsWrapper access$getInstance$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseSkuDetailsWrapper.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseSkuDetailsWrapper.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseSkuDetailsWrapper.class)) {
            return;
        }
        try {
            instance = inAppPurchaseSkuDetailsWrapper;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseSkuDetailsWrapper.class);
        }
    }

    public static final synchronized InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
        synchronized (InAppPurchaseSkuDetailsWrapper.class) {
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseSkuDetailsWrapper.class)) {
                return null;
            }
            try {
                return Companion.getOrCreateInstance();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, InAppPurchaseSkuDetailsWrapper.class);
                return null;
            }
        }
    }

    public final Object getSkuDetailsParams(InAppPurchaseUtils.IAPProductType iAPProductType, List<String> list) {
        Object invokeMethod;
        Object invokeMethod2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            iAPProductType.getClass();
            Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(this.skuDetailsParamsClazz, this.newBuilderMethod, null, new Object[0]);
            if (invokeMethod3 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setTypeMethod, invokeMethod3, iAPProductType.getType())) == null || (invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setSkusListMethod, invokeMethod, list)) == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(this.builderClazz, this.buildMethod, invokeMethod2, new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Class<?> getSkuDetailsParamsClazz() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.skuDetailsParamsClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final InAppPurchaseSkuDetailsWrapper createInstance() {
            Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseSkuDetailsWrapper.CLASSNAME_SKU_DETAILS_PARAMS);
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseSkuDetailsWrapper.CLASSNAME_SKU_DETAILS_PARAMS_BUILDER);
            if (cls == null || cls2 == null) {
                return null;
            }
            Method method = InAppPurchaseUtils.getMethod(cls, "newBuilder", new Class[0]);
            Method method2 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseSkuDetailsWrapper.METHOD_SET_TYPE, String.class);
            Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseSkuDetailsWrapper.METHOD_SET_SKU_LIST, List.class);
            Method method4 = InAppPurchaseUtils.getMethod(cls2, "build", new Class[0]);
            if (method == null || method2 == null || method3 == null || method4 == null) {
                return null;
            }
            InAppPurchaseSkuDetailsWrapper.access$setInstance$cp(new InAppPurchaseSkuDetailsWrapper(cls, cls2, method, method2, method3, method4));
            return InAppPurchaseSkuDetailsWrapper.access$getInstance$cp();
        }

        public final synchronized InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
            InAppPurchaseSkuDetailsWrapper access$getInstance$cp;
            access$getInstance$cp = InAppPurchaseSkuDetailsWrapper.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                access$getInstance$cp = createInstance();
            }
            return access$getInstance$cp;
        }

        private Companion() {
        }
    }
}
