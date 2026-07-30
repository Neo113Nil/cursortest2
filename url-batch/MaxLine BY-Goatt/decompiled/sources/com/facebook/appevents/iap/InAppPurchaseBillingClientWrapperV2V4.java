package com.facebook.appevents.iap;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.oi;
import defpackage.r11;
import defpackage.s11;
import defpackage.tp2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseBillingClientWrapperV2V4 implements InAppPurchaseBillingClientWrapper {
    private static InAppPurchaseBillingClientWrapperV2V4 instance;
    private final Object billingClient;
    private final Class<?> billingClientClazz;
    private final Method getOriginalJsonMethod;
    private final Method getOriginalJsonPurchaseHistoryMethod;
    private final Method getOriginalJsonSkuMethod;
    private final Method getPurchaseListMethod;
    private final InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper;
    private final Class<?> purchaseClazz;
    private final Class<?> purchaseHistoryRecordClazz;
    private final Class<?> purchaseHistoryResponseListenerClazz;
    private final Class<?> purchaseResultClazz;
    private final Method queryPurchaseHistoryAsyncMethod;
    private final Method queryPurchasesMethod;
    private final Method querySkuDetailsAsyncMethod;
    private final Class<?> skuDetailsClazz;
    private final Class<?> skuDetailsResponseListenerClazz;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = InAppPurchaseBillingClientWrapperV2V4.class.getCanonicalName();
    private static final AtomicBoolean isServiceConnected = new AtomicBoolean(false);
    private static final Map<String, JSONObject> iapPurchaseDetailsMap = new ConcurrentHashMap();
    private static final Map<String, JSONObject> subsPurchaseDetailsMap = new ConcurrentHashMap();
    private static final Map<String, JSONObject> skuDetailsMap = new ConcurrentHashMap();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class BillingClientStateListenerWrapper implements InvocationHandler {
        private final Runnable runnable;

        public BillingClientStateListenerWrapper(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Method method2;
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    obj.getClass();
                    method.getClass();
                    if (Intrinsics.b(method.getName(), InAppPurchaseConstants.METHOD_ON_BILLING_SETUP_FINISHED)) {
                        Object t = objArr != null ? oi.t(0, objArr) : null;
                        Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_RESULT);
                        if (cls != null && (method2 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_GET_RESPONSE_CODE, new Class[0])) != null && Intrinsics.b(InAppPurchaseUtils.invokeMethod(cls, method2, t, new Object[0]), 0)) {
                            InAppPurchaseBillingClientWrapperV2V4.Companion.isServiceConnected().set(true);
                            Runnable runnable = this.runnable;
                            if (runnable != null) {
                                runnable.run();
                                return null;
                            }
                        }
                    } else {
                        String name = method.getName();
                        name.getClass();
                        if (tp2.h(name, InAppPurchaseConstants.METHOD_ON_BILLING_SERVICE_DISCONNECTED, false)) {
                            InAppPurchaseBillingClientWrapperV2V4.Companion.isServiceConnected().set(false);
                        }
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return null;
                }
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class PurchasesUpdatedListenerWrapper implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                obj.getClass();
                method.getClass();
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    private InAppPurchaseBillingClientWrapperV2V4(Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.purchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = inAppPurchaseSkuDetailsWrapper;
    }

    public static final /* synthetic */ Method access$getGetOriginalJsonPurchaseHistoryMethod$p(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapperV2V4.getOriginalJsonPurchaseHistoryMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ Method access$getGetOriginalJsonSkuMethod$p(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapperV2V4.getOriginalJsonSkuMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getIapPurchaseDetailsMap$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return iapPurchaseDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ InAppPurchaseBillingClientWrapperV2V4 access$getInstance$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ Class access$getPurchaseHistoryRecordClazz$p(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapperV2V4.purchaseHistoryRecordClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ Class access$getSkuDetailsClazz$p(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapperV2V4.skuDetailsClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getSkuDetailsMap$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return skuDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getSubsPurchaseDetailsMap$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return subsPurchaseDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$isServiceConnected$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return isServiceConnected;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$querySkuDetailsAsync(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, InAppPurchaseUtils.IAPProductType iAPProductType, List list, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV2V4.querySkuDetailsAsync(iAPProductType, list, runnable);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            instance = inAppPurchaseBillingClientWrapperV2V4;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    private final void executeServiceRequest(Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isServiceConnected.get()) {
                runnable.run();
            } else {
                startConnection(runnable);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final synchronized InAppPurchaseBillingClientWrapperV2V4 getOrCreateInstance(Context context) {
        synchronized (InAppPurchaseBillingClientWrapperV2V4.class) {
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
                return null;
            }
            try {
                return Companion.getOrCreateInstance(context);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchaseHistory$lambda$2(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV2V4.getClass();
            iAPProductType.getClass();
            runnable.getClass();
            InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV2V4.billingClientClazz, inAppPurchaseBillingClientWrapperV2V4.queryPurchaseHistoryAsyncMethod, inAppPurchaseBillingClientWrapperV2V4.getBillingClient(), iAPProductType.getType(), Proxy.newProxyInstance(inAppPurchaseBillingClientWrapperV2V4.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{inAppPurchaseBillingClientWrapperV2V4.purchaseHistoryResponseListenerClazz}, new PurchaseHistoryResponseListenerWrapper(inAppPurchaseBillingClientWrapperV2V4, iAPProductType, runnable)));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchases$lambda$0(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV2V4.getClass();
            iAPProductType.getClass();
            runnable.getClass();
            Object invokeMethod = InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV2V4.purchaseResultClazz, inAppPurchaseBillingClientWrapperV2V4.getPurchaseListMethod, InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV2V4.billingClientClazz, inAppPurchaseBillingClientWrapperV2V4.queryPurchasesMethod, inAppPurchaseBillingClientWrapperV2V4.getBillingClient(), iAPProductType.getType()), new Object[0]);
            List list = invokeMethod instanceof List ? (List) invokeMethod : null;
            try {
                ArrayList arrayList = new ArrayList();
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV2V4.purchaseClazz, inAppPurchaseBillingClientWrapperV2V4.getOriginalJsonMethod, it.next(), new Object[0]);
                    String str = invokeMethod2 instanceof String ? (String) invokeMethod2 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            arrayList.add(string);
                            if (iAPProductType == InAppPurchaseUtils.IAPProductType.INAPP) {
                                Map<String, JSONObject> map = iapPurchaseDetailsMap;
                                string.getClass();
                                map.put(string, jSONObject);
                            } else {
                                Map<String, JSONObject> map2 = subsPurchaseDetailsMap;
                                string.getClass();
                                map2.put(string, jSONObject);
                            }
                        }
                    }
                }
                inAppPurchaseBillingClientWrapperV2V4.querySkuDetailsAsync(iAPProductType, arrayList, runnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    private final void querySkuDetailsAsync(InAppPurchaseUtils.IAPProductType iAPProductType, List<String> list, Runnable runnable) {
        InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV2V4 = this;
            try {
                inAppPurchaseBillingClientWrapperV2V4.executeServiceRequest(new s11(inAppPurchaseBillingClientWrapperV2V4, runnable, iAPProductType, list, 0));
            } catch (Throwable th) {
                th = th;
                CrashShieldHandler.handleThrowable(th, inAppPurchaseBillingClientWrapperV2V4);
            }
        } catch (Throwable th2) {
            th = th2;
            inAppPurchaseBillingClientWrapperV2V4 = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void querySkuDetailsAsync$lambda$1(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, Runnable runnable, InAppPurchaseUtils.IAPProductType iAPProductType, List list) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV2V4.getClass();
            runnable.getClass();
            iAPProductType.getClass();
            list.getClass();
            Object newProxyInstance = Proxy.newProxyInstance(inAppPurchaseBillingClientWrapperV2V4.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{inAppPurchaseBillingClientWrapperV2V4.skuDetailsResponseListenerClazz}, new SkuDetailsResponseListenerWrapper(inAppPurchaseBillingClientWrapperV2V4, runnable));
            InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV2V4.billingClientClazz, inAppPurchaseBillingClientWrapperV2V4.querySkuDetailsAsyncMethod, inAppPurchaseBillingClientWrapperV2V4.getBillingClient(), inAppPurchaseBillingClientWrapperV2V4.inAppPurchaseSkuDetailsWrapper.getSkuDetailsParams(iAPProductType, list), newProxyInstance);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    private final void startConnection(Runnable runnable) {
        Method method;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT_STATE_LISTENER);
            if (cls == null || (method = InAppPurchaseUtils.getMethod(this.billingClientClazz, InAppPurchaseConstants.METHOD_START_CONNECTION, cls)) == null) {
                return;
            }
            InAppPurchaseUtils.invokeMethod(this.billingClientClazz, method, getBillingClient(), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new BillingClientStateListenerWrapper(runnable)));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper
    public Object getBillingClient() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.billingClient;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Override // com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper
    public void queryPurchaseHistory(InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            iAPProductType.getClass();
            runnable.getClass();
            executeServiceRequest(new r11(this, iAPProductType, runnable, 0));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper
    public void queryPurchases(InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            iAPProductType.getClass();
            runnable.getClass();
            executeServiceRequest(new r11(this, iAPProductType, runnable, 1));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object createBillingClient(Context context, Class<?> cls) {
            Object invokeMethod;
            Object invokeMethod2;
            Object invokeMethod3;
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT_BUILDER);
            Class<?> cls3 = InAppPurchaseUtils.getClass("com.android.billingclient.api.PurchasesUpdatedListener");
            if (cls2 != null && cls3 != null) {
                Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_NEW_BUILDER, Context.class);
                Method method2 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_ENABLE_PENDING_PURCHASES, new Class[0]);
                Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_SET_LISTENER, cls3);
                Method method4 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
                if (method == null || method2 == null || method3 == null || method4 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(cls, method, null, context)) == null || (invokeMethod2 = InAppPurchaseUtils.invokeMethod(cls2, method3, invokeMethod, Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new PurchasesUpdatedListenerWrapper()))) == null || (invokeMethod3 = InAppPurchaseUtils.invokeMethod(cls2, method2, invokeMethod2, new Object[0])) == null) {
                    return null;
                }
                return InAppPurchaseUtils.invokeMethod(cls2, method4, invokeMethod3, new Object[0]);
            }
            return null;
        }

        private final InAppPurchaseBillingClientWrapperV2V4 createInstance(Context context) {
            InAppPurchaseSkuDetailsWrapper orCreateInstance = InAppPurchaseSkuDetailsWrapper.Companion.getOrCreateInstance();
            if (orCreateInstance == null) {
                return null;
            }
            Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT);
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE);
            Class<?> cls3 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASES_RESULT);
            Class<?> cls4 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_SKU_DETAILS);
            Class<?> cls5 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE_HISTORY_RECORD);
            Class<?> cls6 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER);
            Class<?> cls7 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER);
            if (cls == null || cls3 == null || cls2 == null || cls4 == null || cls6 == null || cls5 == null || cls7 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV2V4.access$getTAG$cp(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_PURCHASES, String.class);
            Method method2 = InAppPurchaseUtils.getMethod(cls3, InAppPurchaseConstants.METHOD_GET_PURCHASE_LIST, new Class[0]);
            Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            Method method4 = InAppPurchaseUtils.getMethod(cls4, InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            Method method5 = InAppPurchaseUtils.getMethod(cls5, InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            Method method6 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_SKU_DETAILS_ASYNC, orCreateInstance.getSkuDetailsParamsClazz(), cls6);
            Method method7 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, String.class, cls7);
            if (method == null || method2 == null || method3 == null || method4 == null || method5 == null || method6 == null || method7 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV2V4.access$getTAG$cp(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object createBillingClient = createBillingClient(context, cls);
            if (createBillingClient == null) {
                Log.w(InAppPurchaseBillingClientWrapperV2V4.access$getTAG$cp(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            InAppPurchaseBillingClientWrapperV2V4.access$setInstance$cp(new InAppPurchaseBillingClientWrapperV2V4(createBillingClient, cls, cls3, cls2, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, orCreateInstance, null));
            return InAppPurchaseBillingClientWrapperV2V4.access$getInstance$cp();
        }

        public final Map<String, JSONObject> getIapPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV2V4.access$getIapPurchaseDetailsMap$cp();
        }

        public final synchronized InAppPurchaseBillingClientWrapperV2V4 getOrCreateInstance(Context context) {
            InAppPurchaseBillingClientWrapperV2V4 access$getInstance$cp;
            context.getClass();
            access$getInstance$cp = InAppPurchaseBillingClientWrapperV2V4.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                access$getInstance$cp = createInstance(context);
            }
            return access$getInstance$cp;
        }

        public final Map<String, JSONObject> getSkuDetailsMap() {
            return InAppPurchaseBillingClientWrapperV2V4.access$getSkuDetailsMap$cp();
        }

        public final Map<String, JSONObject> getSubsPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV2V4.access$getSubsPurchaseDetailsMap$cp();
        }

        public final AtomicBoolean isServiceConnected() {
            return InAppPurchaseBillingClientWrapperV2V4.access$isServiceConnected$cp();
        }

        private Companion() {
        }
    }

    public /* synthetic */ InAppPurchaseBillingClientWrapperV2V4(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, inAppPurchaseSkuDetailsWrapper);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class SkuDetailsResponseListenerWrapper implements InvocationHandler {
        private Runnable completionHandler;
        final /* synthetic */ InAppPurchaseBillingClientWrapperV2V4 this$0;

        public SkuDetailsResponseListenerWrapper(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, Runnable runnable) {
            runnable.getClass();
            this.this$0 = inAppPurchaseBillingClientWrapperV2V4;
            this.completionHandler = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public void invoke(Object obj, Method method, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                obj.getClass();
                method.getClass();
                if (Intrinsics.b(method.getName(), InAppPurchaseConstants.METHOD_ON_SKU_DETAILS_RESPONSE)) {
                    Object t = objArr != null ? oi.t(1, objArr) : null;
                    if (t != null && (t instanceof List)) {
                        Iterator it = ((List) t).iterator();
                        while (it.hasNext()) {
                            try {
                                Object invokeMethod = InAppPurchaseUtils.invokeMethod(InAppPurchaseBillingClientWrapperV2V4.access$getSkuDetailsClazz$p(this.this$0), InAppPurchaseBillingClientWrapperV2V4.access$getGetOriginalJsonSkuMethod$p(this.this$0), it.next(), new Object[0]);
                                String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        Map<String, JSONObject> skuDetailsMap = InAppPurchaseBillingClientWrapperV2V4.Companion.getSkuDetailsMap();
                                        string.getClass();
                                        skuDetailsMap.put(string, jSONObject);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        this.completionHandler.run();
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                invoke(obj, method, objArr);
                return Unit.a;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class PurchaseHistoryResponseListenerWrapper implements InvocationHandler {
        private Runnable completionHandler;
        private InAppPurchaseUtils.IAPProductType skuType;
        final /* synthetic */ InAppPurchaseBillingClientWrapperV2V4 this$0;

        public PurchaseHistoryResponseListenerWrapper(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
            iAPProductType.getClass();
            runnable.getClass();
            this.this$0 = inAppPurchaseBillingClientWrapperV2V4;
            this.skuType = iAPProductType;
            this.completionHandler = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public void invoke(Object obj, Method method, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                obj.getClass();
                method.getClass();
                if (Intrinsics.b(method.getName(), InAppPurchaseConstants.METHOD_ON_PURCHASE_HISTORY_RESPONSE)) {
                    Object t = objArr != null ? oi.t(1, objArr) : null;
                    if (t != null && (t instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) t).iterator();
                        while (it.hasNext()) {
                            try {
                                Object invokeMethod = InAppPurchaseUtils.invokeMethod(InAppPurchaseBillingClientWrapperV2V4.access$getPurchaseHistoryRecordClazz$p(this.this$0), InAppPurchaseBillingClientWrapperV2V4.access$getGetOriginalJsonPurchaseHistoryMethod$p(this.this$0), it.next(), new Object[0]);
                                String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        string.getClass();
                                        arrayList.add(string);
                                        if (this.skuType == InAppPurchaseUtils.IAPProductType.INAPP) {
                                            InAppPurchaseBillingClientWrapperV2V4.Companion.getIapPurchaseDetailsMap().put(string, jSONObject);
                                        } else {
                                            InAppPurchaseBillingClientWrapperV2V4.Companion.getSubsPurchaseDetailsMap().put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            this.completionHandler.run();
                        } else {
                            InAppPurchaseBillingClientWrapperV2V4.access$querySkuDetailsAsync(this.this$0, this.skuType, arrayList, this.completionHandler);
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                invoke(obj, method, objArr);
                return Unit.a;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }
}
