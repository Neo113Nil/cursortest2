package com.facebook.appevents.iap;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.ni1;
import defpackage.oi;
import defpackage.oi1;
import defpackage.s11;
import defpackage.t11;
import defpackage.zv;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseBillingClientWrapperV5V7 implements InAppPurchaseBillingClientWrapper {
    private static InAppPurchaseBillingClientWrapperV5V7 instance;
    private final Object billingClient;
    private final Class<?> billingClientClazz;
    private final Method billingClientStartConnectionMethod;
    private final Class<?> billingClientStateListenerClazz;
    private final Class<?> billingResultClazz;
    private final Method billingResultGetResponseCodeMethod;
    private final Class<?> productDetailsClazz;
    private final Class<?> productDetailsResponseListenerClazz;
    private final Method productDetailsToStringMethod;
    private final Class<?> purchaseClazz;
    private final Method purchaseGetOriginalJsonMethod;
    private final Class<?> purchaseHistoryRecordClazz;
    private final Method purchaseHistoryRecordGetOriginalJsonMethod;
    private final Class<?> purchaseHistoryResponseListenerClazz;
    private final Class<?> purchasesResponseListenerClazz;
    private final Method queryProductDetailsAsyncMethod;
    private final Method queryProductDetailsParamsBuilderBuildMethod;
    private final Class<?> queryProductDetailsParamsBuilderClazz;
    private final Method queryProductDetailsParamsBuilderSetProductListMethod;
    private final Class<?> queryProductDetailsParamsClazz;
    private final Method queryProductDetailsParamsNewBuilderMethod;
    private final Method queryProductDetailsParamsProductBuilderBuildMethod;
    private final Class<?> queryProductDetailsParamsProductBuilderClazz;
    private final Method queryProductDetailsParamsProductBuilderSetProductIdMethod;
    private final Method queryProductDetailsParamsProductBuilderSetProductTypeMethod;
    private final Class<?> queryProductDetailsParamsProductClazz;
    private final Method queryProductDetailsParamsProductNewBuilderMethod;
    private final Method queryPurchaseHistoryAsyncMethod;
    private final Method queryPurchaseHistoryParamsBuilderBuildMethod;
    private final Class<?> queryPurchaseHistoryParamsBuilderClazz;
    private final Method queryPurchaseHistoryParamsBuilderSetProductTypeMethod;
    private final Class<?> queryPurchaseHistoryParamsClazz;
    private final Method queryPurchaseHistoryParamsNewBuilderMethod;
    private final Method queryPurchasesAsyncMethod;
    private final Method queryPurchasesParamsBuilderBuildMethod;
    private final Class<?> queryPurchasesParamsBuilderClazz;
    private final Method queryPurchasesParamsBuilderSetProductTypeMethod;
    private final Class<?> queryPurchasesParamsClazz;
    private final Method queryPurchasesParamsNewBuilderMethod;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = InAppPurchaseBillingClientWrapperV5V7.class.getCanonicalName();
    private static final AtomicBoolean isServiceConnected = new AtomicBoolean(false);
    private static final Map<String, JSONObject> iapPurchaseDetailsMap = new ConcurrentHashMap();
    private static final Map<String, JSONObject> subsPurchaseDetailsMap = new ConcurrentHashMap();
    private static final Map<String, JSONObject> productDetailsMap = new ConcurrentHashMap();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class ListenerWrapper implements InvocationHandler {
        private Object[] wrapperArgs;

        public ListenerWrapper(Object[] objArr) {
            this.wrapperArgs = objArr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            obj.getClass();
            method.getClass();
            String name = method.getName();
            if (name == null) {
                return null;
            }
            switch (name.hashCode()) {
                case -1642587947:
                    if (name.equals(InAppPurchaseConstants.METHOD_ON_PURCHASE_HISTORY_RESPONSE)) {
                        InAppPurchaseBillingClientWrapperV5V7.access$onPurchaseHistoryResponse(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                        break;
                    }
                    break;
                case -1599362358:
                    if (name.equals(InAppPurchaseConstants.METHOD_ON_QUERY_PURCHASES_RESPONSE)) {
                        InAppPurchaseBillingClientWrapperV5V7.access$onQueryPurchasesResponse(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                        break;
                    }
                    break;
                case -79406125:
                    if (name.equals(InAppPurchaseConstants.METHOD_ON_BILLING_SETUP_FINISHED)) {
                        InAppPurchaseBillingClientWrapperV5V7.access$onBillingSetupFinished(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                        break;
                    }
                    break;
                case 1227540564:
                    if (name.equals(InAppPurchaseConstants.METHOD_ON_BILLING_SERVICE_DISCONNECTED)) {
                        InAppPurchaseBillingClientWrapperV5V7.access$onBillingServiceDisconnected(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                        break;
                    }
                    break;
                case 1940131955:
                    if (name.equals(InAppPurchaseConstants.METHOD_ON_PRODUCT_DETAILS_RESPONSE)) {
                        InAppPurchaseBillingClientWrapperV5V7.access$onProductDetailsResponse(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, objArr);
                        break;
                    }
                    break;
            }
            return null;
        }
    }

    private InAppPurchaseBillingClientWrapperV5V7(Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Class<?> cls8, Class<?> cls9, Class<?> cls10, Class<?> cls11, Class<?> cls12, Class<?> cls13, Class<?> cls14, Class<?> cls15, Class<?> cls16, Class<?> cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseClazz = cls2;
        this.productDetailsClazz = cls3;
        this.purchaseHistoryRecordClazz = cls4;
        this.queryProductDetailsParamsProductClazz = cls5;
        this.billingResultClazz = cls6;
        this.queryProductDetailsParamsClazz = cls7;
        this.queryPurchaseHistoryParamsClazz = cls8;
        this.queryPurchasesParamsClazz = cls9;
        this.queryProductDetailsParamsBuilderClazz = cls10;
        this.queryPurchaseHistoryParamsBuilderClazz = cls11;
        this.queryPurchasesParamsBuilderClazz = cls12;
        this.queryProductDetailsParamsProductBuilderClazz = cls13;
        this.billingClientStateListenerClazz = cls14;
        this.productDetailsResponseListenerClazz = cls15;
        this.purchasesResponseListenerClazz = cls16;
        this.purchaseHistoryResponseListenerClazz = cls17;
        this.queryPurchasesAsyncMethod = method;
        this.queryPurchasesParamsNewBuilderMethod = method2;
        this.queryPurchasesParamsBuilderBuildMethod = method3;
        this.queryPurchasesParamsBuilderSetProductTypeMethod = method4;
        this.purchaseGetOriginalJsonMethod = method5;
        this.queryPurchaseHistoryAsyncMethod = method6;
        this.queryPurchaseHistoryParamsNewBuilderMethod = method7;
        this.queryPurchaseHistoryParamsBuilderBuildMethod = method8;
        this.queryPurchaseHistoryParamsBuilderSetProductTypeMethod = method9;
        this.purchaseHistoryRecordGetOriginalJsonMethod = method10;
        this.queryProductDetailsAsyncMethod = method11;
        this.queryProductDetailsParamsNewBuilderMethod = method12;
        this.queryProductDetailsParamsBuilderBuildMethod = method13;
        this.queryProductDetailsParamsBuilderSetProductListMethod = method14;
        this.queryProductDetailsParamsProductNewBuilderMethod = method15;
        this.queryProductDetailsParamsProductBuilderBuildMethod = method16;
        this.queryProductDetailsParamsProductBuilderSetProductIdMethod = method17;
        this.queryProductDetailsParamsProductBuilderSetProductTypeMethod = method18;
        this.productDetailsToStringMethod = method19;
        this.billingClientStartConnectionMethod = method20;
        this.billingResultGetResponseCodeMethod = method21;
    }

    public static final /* synthetic */ Map access$getIapPurchaseDetailsMap$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return iapPurchaseDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    public static final /* synthetic */ InAppPurchaseBillingClientWrapperV5V7 access$getInstance$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getProductDetailsMap$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return productDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    public static final /* synthetic */ Map access$getSubsPurchaseDetailsMap$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return subsPurchaseDetailsMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean access$isServiceConnected$cp() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return isServiceConnected;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$onBillingServiceDisconnected(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.onBillingServiceDisconnected(objArr, objArr2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    public static final /* synthetic */ void access$onBillingSetupFinished(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.onBillingSetupFinished(objArr, objArr2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    public static final /* synthetic */ void access$onProductDetailsResponse(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.onProductDetailsResponse(objArr, objArr2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    public static final /* synthetic */ void access$onPurchaseHistoryResponse(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.onPurchaseHistoryResponse(objArr, objArr2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    public static final /* synthetic */ void access$onQueryPurchasesResponse(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.onQueryPurchasesResponse(objArr, objArr2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            instance = inAppPurchaseBillingClientWrapperV5V7;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
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

    public static final synchronized InAppPurchaseBillingClientWrapperV5V7 getOrCreateInstance(Context context) {
        synchronized (InAppPurchaseBillingClientWrapperV5V7.class) {
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
                return null;
            }
            try {
                return Companion.getOrCreateInstance(context);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
                return null;
            }
        }
    }

    private final Object getQueryProductDetailsParams(InAppPurchaseUtils.IAPProductType iAPProductType, List<String> list) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderBuildMethod, InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderSetProductTypeMethod, InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderSetProductIdMethod, InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsProductClazz, this.queryProductDetailsParamsProductNewBuilderMethod, null, new Object[0]), str), iAPProductType.getType()), new Object[0]);
                if (invokeMethod != null) {
                    arrayList.add(invokeMethod);
                }
            }
            return InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsBuilderClazz, this.queryProductDetailsParamsBuilderBuildMethod, InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsBuilderClazz, this.queryProductDetailsParamsBuilderSetProductListMethod, InAppPurchaseUtils.invokeMethod(this.queryProductDetailsParamsClazz, this.queryProductDetailsParamsNewBuilderMethod, null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Object getQueryPurchaseHistoryParams(InAppPurchaseUtils.IAPProductType iAPProductType) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return InAppPurchaseUtils.invokeMethod(this.queryPurchaseHistoryParamsBuilderClazz, this.queryPurchaseHistoryParamsBuilderBuildMethod, InAppPurchaseUtils.invokeMethod(this.queryPurchaseHistoryParamsBuilderClazz, this.queryPurchaseHistoryParamsBuilderSetProductTypeMethod, InAppPurchaseUtils.invokeMethod(this.queryPurchaseHistoryParamsClazz, this.queryPurchaseHistoryParamsNewBuilderMethod, null, new Object[0]), iAPProductType.getType()), new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Object getQueryPurchasesParams(InAppPurchaseUtils.IAPProductType iAPProductType) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.queryPurchasesParamsClazz, this.queryPurchasesParamsNewBuilderMethod, null, new Object[0]);
            if (invokeMethod == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(this.queryPurchasesParamsBuilderClazz, this.queryPurchasesParamsBuilderBuildMethod, InAppPurchaseUtils.invokeMethod(this.queryPurchasesParamsBuilderClazz, this.queryPurchasesParamsBuilderSetProductTypeMethod, invokeMethod, iAPProductType.getType()), new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void onBillingServiceDisconnected(Object[] objArr, Object[] objArr2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            isServiceConnected.set(false);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void onBillingSetupFinished(Object[] objArr, Object[] objArr2) {
        Runnable runnable;
        if (CrashShieldHandler.isObjectCrashing(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (Intrinsics.b(InAppPurchaseUtils.invokeMethod(this.billingResultClazz, this.billingResultGetResponseCodeMethod, objArr2[0], new Object[0]), 0)) {
                isServiceConnected.set(true);
                if (objArr != null && objArr.length != 0) {
                    Object obj = objArr[0];
                    if (!(obj instanceof Runnable) || (runnable = (Runnable) obj) == null) {
                        return;
                    }
                    runnable.run();
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void onProductDetailsResponse(Object[] objArr, Object[] objArr2) {
        Object t;
        String originalJson;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (objArr != null) {
            try {
                t = oi.t(0, objArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        } else {
            t = null;
        }
        Object t2 = objArr2 != null ? oi.t(1, objArr2) : null;
        if (t2 != null && (t2 instanceof List)) {
            Iterator it = ((List) t2).iterator();
            while (it.hasNext()) {
                try {
                    Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.productDetailsClazz, this.productDetailsToStringMethod, it.next(), new Object[0]);
                    String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                    if (str != null && (originalJson = getOriginalJson(str)) != null) {
                        JSONObject jSONObject = new JSONObject(originalJson);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            Map<String, JSONObject> map = productDetailsMap;
                            string.getClass();
                            map.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (t == null || !(t instanceof Runnable)) {
                return;
            }
            ((Runnable) t).run();
        }
    }

    private final void onPurchaseHistoryResponse(Object[] objArr, Object[] objArr2) {
        Object t;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (objArr != null) {
            try {
                t = oi.t(0, objArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        } else {
            t = null;
        }
        if (t != null && (t instanceof InAppPurchaseUtils.IAPProductType)) {
            Object t2 = oi.t(1, objArr);
            if (t2 instanceof Runnable) {
                Object t3 = objArr2 != null ? oi.t(1, objArr2) : null;
                if (t3 != null && (t3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) t3).iterator();
                    while (it.hasNext()) {
                        try {
                            Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.purchaseHistoryRecordClazz, this.purchaseHistoryRecordGetOriginalJsonMethod, it.next(), new Object[0]);
                            String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!productDetailsMap.containsKey(string)) {
                                        string.getClass();
                                        arrayList.add(string);
                                    }
                                    if (t == InAppPurchaseUtils.IAPProductType.INAPP) {
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
                        } catch (Exception unused) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) t2).run();
                    } else {
                        queryProductDetailsAsync((InAppPurchaseUtils.IAPProductType) t, arrayList, (Runnable) t2);
                    }
                }
            }
        }
    }

    private final void onQueryPurchasesResponse(Object[] objArr, Object[] objArr2) {
        Object t;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (objArr != null) {
            try {
                t = oi.t(0, objArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        } else {
            t = null;
        }
        if (t != null && (t instanceof InAppPurchaseUtils.IAPProductType)) {
            Object t2 = oi.t(1, objArr);
            if (t2 instanceof Runnable) {
                Object t3 = objArr2 != null ? oi.t(1, objArr2) : null;
                if (t3 != null && (t3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) t3).iterator();
                    while (it.hasNext()) {
                        Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.purchaseClazz, this.purchaseGetOriginalJsonMethod, it.next(), new Object[0]);
                        String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                if (!productDetailsMap.containsKey(string)) {
                                    string.getClass();
                                    arrayList.add(string);
                                }
                                if (t == InAppPurchaseUtils.IAPProductType.INAPP) {
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
                    if (arrayList.isEmpty()) {
                        ((Runnable) t2).run();
                    } else {
                        queryProductDetailsAsync((InAppPurchaseUtils.IAPProductType) t, arrayList, (Runnable) t2);
                    }
                }
            }
        }
    }

    private final void queryProductDetailsAsync(InAppPurchaseUtils.IAPProductType iAPProductType, List<String> list, Runnable runnable) {
        InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7 = this;
            try {
                inAppPurchaseBillingClientWrapperV5V7.executeServiceRequest(new s11(inAppPurchaseBillingClientWrapperV5V7, runnable, iAPProductType, list, 1));
            } catch (Throwable th) {
                th = th;
                CrashShieldHandler.handleThrowable(th, inAppPurchaseBillingClientWrapperV5V7);
            }
        } catch (Throwable th2) {
            th = th2;
            inAppPurchaseBillingClientWrapperV5V7 = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsync$lambda$2(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Runnable runnable, InAppPurchaseUtils.IAPProductType iAPProductType, List list) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.getClass();
            runnable.getClass();
            iAPProductType.getClass();
            list.getClass();
            Object newProxyInstance = Proxy.newProxyInstance(inAppPurchaseBillingClientWrapperV5V7.productDetailsResponseListenerClazz.getClassLoader(), new Class[]{inAppPurchaseBillingClientWrapperV5V7.productDetailsResponseListenerClazz}, inAppPurchaseBillingClientWrapperV5V7.new ListenerWrapper(new Object[]{runnable}));
            Object queryProductDetailsParams = inAppPurchaseBillingClientWrapperV5V7.getQueryProductDetailsParams(iAPProductType, list);
            if (queryProductDetailsParams != null) {
                InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV5V7.billingClientClazz, inAppPurchaseBillingClientWrapperV5V7.queryProductDetailsAsyncMethod, inAppPurchaseBillingClientWrapperV5V7.getBillingClient(), queryProductDetailsParams, newProxyInstance);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchaseHistory$lambda$1(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.getClass();
            iAPProductType.getClass();
            runnable.getClass();
            InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV5V7.billingClientClazz, inAppPurchaseBillingClientWrapperV5V7.queryPurchaseHistoryAsyncMethod, inAppPurchaseBillingClientWrapperV5V7.getBillingClient(), inAppPurchaseBillingClientWrapperV5V7.getQueryPurchaseHistoryParams(iAPProductType), Proxy.newProxyInstance(inAppPurchaseBillingClientWrapperV5V7.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{inAppPurchaseBillingClientWrapperV5V7.purchaseHistoryResponseListenerClazz}, inAppPurchaseBillingClientWrapperV5V7.new ListenerWrapper(new Object[]{iAPProductType, runnable})));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchases$lambda$0(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.getClass();
            iAPProductType.getClass();
            runnable.getClass();
            InAppPurchaseUtils.invokeMethod(inAppPurchaseBillingClientWrapperV5V7.billingClientClazz, inAppPurchaseBillingClientWrapperV5V7.queryPurchasesAsyncMethod, inAppPurchaseBillingClientWrapperV5V7.getBillingClient(), inAppPurchaseBillingClientWrapperV5V7.getQueryPurchasesParams(iAPProductType), Proxy.newProxyInstance(inAppPurchaseBillingClientWrapperV5V7.purchasesResponseListenerClazz.getClassLoader(), new Class[]{inAppPurchaseBillingClientWrapperV5V7.purchasesResponseListenerClazz}, inAppPurchaseBillingClientWrapperV5V7.new ListenerWrapper(new Object[]{iAPProductType, runnable})));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    private final void startConnection(Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.billingClientStartConnectionMethod, getBillingClient(), Proxy.newProxyInstance(this.billingClientStateListenerClazz.getClassLoader(), new Class[]{this.billingClientStateListenerClazz}, new ListenerWrapper(new Object[]{runnable})));
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

    public final String getOriginalJson(String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                str.getClass();
                Matcher matcher = new Regex("jsonString='(.*?)'").m.matcher(str);
                matcher.getClass();
                oi1 oi1Var = !matcher.find(0) ? null : new oi1(matcher, str);
                if (oi1Var != null) {
                    if (oi1Var.d == null) {
                        oi1Var.d = new ni1(oi1Var);
                    }
                    ni1 ni1Var = oi1Var.d;
                    ni1Var.getClass();
                    return (String) zv.w(1, ni1Var);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
        return null;
    }

    @Override // com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper
    public void queryPurchaseHistory(InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            iAPProductType.getClass();
            runnable.getClass();
            executeServiceRequest(new t11(this, iAPProductType, runnable, 1));
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
            executeServiceRequest(new t11(this, iAPProductType, runnable, 0));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion implements InvocationHandler {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object createBillingClient(Context context, Class<?> cls, Class<?> cls2, Class<?> cls3) {
            Object invokeMethod;
            Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_NEW_BUILDER, Context.class);
            Method method2 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_SET_LISTENER, cls3);
            Method method3 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_ENABLE_PENDING_PURCHASES, new Class[0]);
            Method method4 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            if (method4 == null || method2 == null || method == null || method3 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(cls2, method2, InAppPurchaseUtils.invokeMethod(cls, method, null, context), Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, this))) == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(cls2, method4, InAppPurchaseUtils.invokeMethod(cls2, method3, invokeMethod, new Object[0]), new Object[0]);
        }

        private final InAppPurchaseBillingClientWrapperV5V7 createInstance(Context context) {
            Class<?> cls = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT);
            Class<?> cls2 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE);
            Class<?> cls3 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PRODUCT_DETAILS);
            Class<?> cls4 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE_HISTORY_RECORD);
            Class<?> cls5 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_PRODUCT);
            Class<?> cls6 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_RESULT);
            Class<?> cls7 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS);
            Class<?> cls8 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASE_HISTORY_PARAMS);
            Class<?> cls9 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASES_PARAMS);
            Class<?> cls10 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_BUILDER);
            Class<?> cls11 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASE_HISTORY_PARAMS_BUILDER);
            Class<?> cls12 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASES_PARAMS_BUILDER);
            Class<?> cls13 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_PRODUCT_BUILDER);
            Class<?> cls14 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT_BUILDER);
            Class<?> cls15 = InAppPurchaseUtils.getClass("com.android.billingclient.api.PurchasesUpdatedListener");
            Class<?> cls16 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT_STATE_LISTENER);
            Class<?> cls17 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PRODUCT_DETAILS_RESPONSE_LISTENER);
            Class<?> cls18 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASES_RESPONSE_LISTENER);
            Class<?> cls19 = InAppPurchaseUtils.getClass(InAppPurchaseConstants.CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER);
            if (cls == null || cls2 == null || cls3 == null || cls4 == null || cls5 == null || cls6 == null || cls7 == null || cls8 == null || cls9 == null || cls10 == null || cls11 == null || cls12 == null || cls13 == null || cls14 == null || cls15 == null || cls16 == null || cls17 == null || cls18 == null || cls19 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.access$getTAG$cp(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method method = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_PURCHASES_ASYNC, cls9, cls18);
            Method method2 = InAppPurchaseUtils.getMethod(cls9, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
            Method method3 = InAppPurchaseUtils.getMethod(cls12, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            Method method4 = InAppPurchaseUtils.getMethod(cls12, InAppPurchaseConstants.METHOD_SET_PRODUCT_TYPE, String.class);
            Method method5 = InAppPurchaseUtils.getMethod(cls2, InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            Method method6 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, cls8, cls19);
            Method method7 = InAppPurchaseUtils.getMethod(cls8, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
            Method method8 = InAppPurchaseUtils.getMethod(cls11, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            Method method9 = InAppPurchaseUtils.getMethod(cls11, InAppPurchaseConstants.METHOD_SET_PRODUCT_TYPE, String.class);
            Method method10 = InAppPurchaseUtils.getMethod(cls4, InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, new Class[0]);
            Method method11 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_QUERY_PRODUCT_DETAILS_ASYNC, cls7, cls17);
            Method method12 = InAppPurchaseUtils.getMethod(cls7, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
            Method method13 = InAppPurchaseUtils.getMethod(cls10, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            Method method14 = InAppPurchaseUtils.getMethod(cls10, InAppPurchaseConstants.METHOD_SET_PRODUCT_LIST, List.class);
            Method method15 = InAppPurchaseUtils.getMethod(cls5, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
            Method method16 = InAppPurchaseUtils.getMethod(cls13, InAppPurchaseConstants.METHOD_BUILD, new Class[0]);
            Method method17 = InAppPurchaseUtils.getMethod(cls13, InAppPurchaseConstants.METHOD_SET_PRODUCT_ID, String.class);
            Method method18 = InAppPurchaseUtils.getMethod(cls13, InAppPurchaseConstants.METHOD_SET_PRODUCT_TYPE, String.class);
            Method method19 = InAppPurchaseUtils.getMethod(cls3, InAppPurchaseConstants.METHOD_TO_STRING, new Class[0]);
            Method method20 = InAppPurchaseUtils.getMethod(cls, InAppPurchaseConstants.METHOD_START_CONNECTION, cls16);
            Method method21 = InAppPurchaseUtils.getMethod(cls6, InAppPurchaseConstants.METHOD_GET_RESPONSE_CODE, new Class[0]);
            if (method == null || method2 == null || method3 == null || method4 == null || method5 == null || method6 == null || method7 == null || method8 == null || method9 == null || method10 == null || method11 == null || method12 == null || method13 == null || method14 == null || method15 == null || method16 == null || method17 == null || method18 == null || method19 == null || method20 == null || method21 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.access$getTAG$cp(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object createBillingClient = createBillingClient(context, cls, cls14, cls15);
            if (createBillingClient == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.access$getTAG$cp(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            InAppPurchaseBillingClientWrapperV5V7.access$setInstance$cp(new InAppPurchaseBillingClientWrapperV5V7(createBillingClient, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls16, cls17, cls18, cls19, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21, null));
            return InAppPurchaseBillingClientWrapperV5V7.access$getInstance$cp();
        }

        public final Map<String, JSONObject> getIapPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.access$getIapPurchaseDetailsMap$cp();
        }

        public final synchronized InAppPurchaseBillingClientWrapperV5V7 getOrCreateInstance(Context context) {
            InAppPurchaseBillingClientWrapperV5V7 access$getInstance$cp;
            context.getClass();
            access$getInstance$cp = InAppPurchaseBillingClientWrapperV5V7.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                access$getInstance$cp = createInstance(context);
            }
            return access$getInstance$cp;
        }

        public final Map<String, JSONObject> getProductDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.access$getProductDetailsMap$cp();
        }

        public final Map<String, JSONObject> getSubsPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.access$getSubsPurchaseDetailsMap$cp();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            obj.getClass();
            method.getClass();
            return null;
        }

        public final AtomicBoolean isServiceConnected() {
            return InAppPurchaseBillingClientWrapperV5V7.access$isServiceConnected$cp();
        }

        private Companion() {
        }
    }

    public /* synthetic */ InAppPurchaseBillingClientWrapperV5V7(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }
}
