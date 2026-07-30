package com.facebook.appevents.iap;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.up2;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseEventManager {
    private static final String AS_INTERFACE = "asInterface";
    private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
    private static final String DETAILS_LIST = "DETAILS_LIST";
    private static final String GET_PURCHASES = "getPurchases";
    private static final String GET_PURCHASE_HISTORY = "getPurchaseHistory";
    private static final String GET_SKU_DETAILS = "getSkuDetails";
    private static final String INAPP = "inapp";
    private static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    private static final String INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    private static final String IN_APP_BILLING_SERVICE = "com.android.vending.billing.IInAppBillingService";
    private static final String IN_APP_BILLING_SERVICE_STUB = "com.android.vending.billing.IInAppBillingService$Stub";
    private static final String IS_BILLING_SUPPORTED = "isBillingSupported";
    private static final String ITEM_ID_LIST = "ITEM_ID_LIST";
    private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
    private static final int MAX_QUERY_PURCHASE_NUM = 30;
    private static final int PURCHASE_EXPIRE_TIME_SEC = 86400;
    private static final int PURCHASE_STOP_QUERY_TIME_SEC = 1200;
    private static final String RESPONSE_CODE = "RESPONSE_CODE";
    private static final int SKU_DETAIL_EXPIRE_TIME_SEC = 43200;
    private static final String SUBSCRIPTION = "subs";
    public static final InAppPurchaseEventManager INSTANCE = new InAppPurchaseEventManager();
    private static final HashMap<String, Method> methodMap = new HashMap<>();
    private static final HashMap<String, Class<?>> classMap = new HashMap<>();
    private static final String PACKAGE_NAME = FacebookSdk.getApplicationContext().getPackageName();
    private static final String SKU_DETAILS_STORE = "com.facebook.internal.SKU_DETAILS";
    private static final SharedPreferences skuDetailSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences(SKU_DETAILS_STORE, 0);
    private static final String PURCHASE_INAPP_STORE = "com.facebook.internal.PURCHASE";
    private static final SharedPreferences purchaseInappSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences(PURCHASE_INAPP_STORE, 0);

    private InAppPurchaseEventManager() {
    }

    public static final Object asInterface(Context context, IBinder iBinder) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            context.getClass();
            return INSTANCE.invokeMethod(context, IN_APP_BILLING_SERVICE_STUB, AS_INTERFACE, null, new Object[]{iBinder});
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    public static final void clearSkuDetailsCache() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = skuDetailSharedPrefs;
            long j = sharedPreferences.getLong(LAST_CLEARED_TIME, 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
            } else if (currentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
        }
    }

    private final ArrayList<String> filterPurchases(ArrayList<String> arrayList) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = purchaseInappSharedPrefs.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                String str = arrayList.get(i);
                i++;
                String str2 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong(Constants.GP_IAP_PURCHASE_TIME);
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !Intrinsics.b(purchaseInappSharedPrefs.getString(string, BuildConfig.FLAVOR), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str2);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Class<?> getClass(Context context, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = classMap;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            Class<?> classFromContext$facebook_core_release = InAppPurchaseUtils.getClassFromContext$facebook_core_release(context, str);
            if (classFromContext$facebook_core_release == null) {
                return classFromContext$facebook_core_release;
            }
            hashMap.put(str, classFromContext$facebook_core_release);
            return classFromContext$facebook_core_release;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Method getMethod(Class<?> cls, String str) {
        Class[] clsArr;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = methodMap;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            int hashCode = str.hashCode();
            Class cls2 = Integer.TYPE;
            switch (hashCode) {
                case -1801122596:
                    if (str.equals(GET_PURCHASES)) {
                        cls2.getClass();
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (!str.equals(IS_BILLING_SUPPORTED)) {
                        clsArr = null;
                        break;
                    } else {
                        cls2.getClass();
                        clsArr = new Class[]{cls2, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals(AS_INTERFACE)) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals(GET_PURCHASE_HISTORY)) {
                        clsArr = null;
                        break;
                    } else {
                        cls2.getClass();
                        clsArr = new Class[]{cls2, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals(GET_SKU_DETAILS)) {
                        clsArr = null;
                        break;
                    } else {
                        cls2.getClass();
                        clsArr = new Class[]{cls2, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            Method declaredMethod$facebook_core_release = clsArr == null ? InAppPurchaseUtils.getDeclaredMethod$facebook_core_release(cls, str, null) : InAppPurchaseUtils.getDeclaredMethod$facebook_core_release(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (declaredMethod$facebook_core_release != null) {
                hashMap.put(str, declaredMethod$facebook_core_release);
            }
            return declaredMethod$facebook_core_release;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final ArrayList<String> getPurchaseHistory(Context context, Object obj, String str) {
        ArrayList<String> arrayList;
        ArrayList<String> stringArrayList;
        ArrayList<String> arrayList2 = null;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList3 = new ArrayList<>();
            if (isBillingSupported(context, obj, str)) {
                Object obj2 = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    Object invokeMethod = invokeMethod(context, IN_APP_BILLING_SERVICE, GET_PURCHASE_HISTORY, obj, new Object[]{6, PACKAGE_NAME, str, obj2, new Bundle()});
                    if (invokeMethod != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) invokeMethod;
                        if (bundle.getInt(RESPONSE_CODE) == 0 && (stringArrayList = bundle.getStringArrayList(INAPP_PURCHASE_DATA_LIST)) != null) {
                            int size = stringArrayList.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    arrayList = arrayList2;
                                    break;
                                }
                                String str2 = stringArrayList.get(i2);
                                i2++;
                                String str3 = str2;
                                try {
                                    arrayList = arrayList2;
                                    try {
                                        try {
                                        } catch (JSONException unused) {
                                            continue;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        CrashShieldHandler.handleThrowable(th, this);
                                        return arrayList;
                                    }
                                } catch (JSONException unused2) {
                                    arrayList = arrayList2;
                                }
                                if (currentTimeMillis - (new JSONObject(str3).getLong(Constants.GP_IAP_PURCHASE_TIME) / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList3.add(str3);
                                i++;
                                arrayList2 = arrayList;
                            }
                            obj2 = bundle.getString(INAPP_CONTINUATION_TOKEN);
                            if (i < MAX_QUERY_PURCHASE_NUM || obj2 == null || z) {
                                break;
                                break;
                            }
                            arrayList2 = arrayList;
                        }
                    }
                    arrayList = arrayList2;
                    obj2 = arrayList;
                    if (i < MAX_QUERY_PURCHASE_NUM) {
                        break;
                    }
                    arrayList2 = arrayList;
                }
            }
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            arrayList = arrayList2;
        }
    }

    public static final ArrayList<String> getPurchaseHistoryInapp(Context context, Object obj) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        Class<?> cls;
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            context.getClass();
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && (cls = (inAppPurchaseEventManager = INSTANCE).getClass(context, IN_APP_BILLING_SERVICE)) != null && inAppPurchaseEventManager.getMethod(cls, GET_PURCHASE_HISTORY) != null) {
                return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchaseHistory(context, obj, INAPP));
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    private final ArrayList<String> getPurchases(Context context, Object obj, String str) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && isBillingSupported(context, obj, str)) {
                int i = 0;
                String str2 = null;
                while (true) {
                    inAppPurchaseEventManager = this;
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object invokeMethod = inAppPurchaseEventManager.invokeMethod(context2, IN_APP_BILLING_SERVICE, GET_PURCHASES, obj2, new Object[]{3, PACKAGE_NAME, str, str2});
                        if (invokeMethod != null) {
                            Bundle bundle = (Bundle) invokeMethod;
                            if (bundle.getInt(RESPONSE_CODE) == 0) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList(INAPP_PURCHASE_DATA_LIST);
                                if (stringArrayList == null) {
                                    break;
                                }
                                i += stringArrayList.size();
                                arrayList.addAll(stringArrayList);
                                str2 = bundle.getString(INAPP_CONTINUATION_TOKEN);
                                if (i < MAX_QUERY_PURCHASE_NUM || str2 == null) {
                                    break;
                                    break;
                                }
                                this = inAppPurchaseEventManager;
                                context = context2;
                                obj = obj2;
                            }
                        }
                        str2 = null;
                        if (i < MAX_QUERY_PURCHASE_NUM) {
                            break;
                        }
                        this = inAppPurchaseEventManager;
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th) {
                        th = th;
                        CrashShieldHandler.handleThrowable(th, inAppPurchaseEventManager);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            inAppPurchaseEventManager = this;
        }
    }

    public static final ArrayList<String> getPurchasesInapp(Context context, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            context.getClass();
            InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
            return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchases(context, obj, INAPP));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    public static final ArrayList<String> getPurchasesSubs(Context context, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            context.getClass();
            InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
            return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchases(context, obj, SUBSCRIPTION));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    public static final Map<String, String> getSkuDetails(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            context.getClass();
            arrayList.getClass();
            Map<String, String> readSkuDetailsFromCache = INSTANCE.readSkuDetailsFromCache(arrayList);
            ArrayList<String> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                String str = arrayList.get(i);
                i++;
                String str2 = str;
                if (!readSkuDetailsFromCache.containsKey(str2)) {
                    arrayList2.add(str2);
                }
            }
            readSkuDetailsFromCache.putAll(INSTANCE.getSkuDetailsFromGoogle(context, arrayList2, obj, z));
            return readSkuDetailsFromCache;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseEventManager.class);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    private final Map<String, String> getSkuDetailsFromGoogle(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList(ITEM_ID_LIST, arrayList);
                inAppPurchaseEventManager = this;
                try {
                    Object invokeMethod = inAppPurchaseEventManager.invokeMethod(context, IN_APP_BILLING_SERVICE, GET_SKU_DETAILS, obj, new Object[]{3, PACKAGE_NAME, z ? SUBSCRIPTION : INAPP, bundle});
                    if (invokeMethod != null) {
                        Bundle bundle2 = (Bundle) invokeMethod;
                        if (bundle2.getInt(RESPONSE_CODE) == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList(DETAILS_LIST);
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    String str = arrayList.get(i);
                                    str.getClass();
                                    String str2 = stringArrayList.get(i);
                                    str2.getClass();
                                    linkedHashMap.put(str, str2);
                                }
                            }
                            inAppPurchaseEventManager.writeSkuDetailsToCache(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    CrashShieldHandler.handleThrowable(th, inAppPurchaseEventManager);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
            inAppPurchaseEventManager = this;
        }
    }

    private final Object invokeMethod(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method method;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Class<?> cls = getClass(context, str);
            if (cls == null || (method = getMethod(cls, str2)) == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(cls, method, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean isBillingSupported(Context context, Object obj, String str) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        if (CrashShieldHandler.isObjectCrashing(this) || obj == null) {
            return false;
        }
        try {
            inAppPurchaseEventManager = this;
        } catch (Throwable th) {
            th = th;
            inAppPurchaseEventManager = this;
        }
        try {
            Object invokeMethod = inAppPurchaseEventManager.invokeMethod(context, IN_APP_BILLING_SERVICE, IS_BILLING_SUPPORTED, obj, new Object[]{3, PACKAGE_NAME, str});
            if (invokeMethod != null) {
                if (((Integer) invokeMethod).intValue() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            CrashShieldHandler.handleThrowable(th, inAppPurchaseEventManager);
            return false;
        }
    }

    private final Map<String, String> readSkuDetailsFromCache(ArrayList<String> arrayList) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                String str = arrayList.get(i);
                i++;
                String str2 = str;
                String string = skuDetailSharedPrefs.getString(str2, null);
                if (string != null) {
                    List F = up2.F(2, 2, string, new String[]{";"});
                    if (currentTimeMillis - Long.parseLong((String) F.get(0)) < 43200) {
                        str2.getClass();
                        linkedHashMap.put(str2, F.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void writeSkuDetailsToCache(Map<String, String> map) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = skuDetailSharedPrefs.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + ';' + entry.getValue());
            }
            edit.apply();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final boolean hasFreeTrialPeirod(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            str.getClass();
            try {
                String optString = new JSONObject(str).optString(Constants.GP_IAP_FREE_TRIAL_PERIOD);
                if (optString != null) {
                    if (optString.length() > 0) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
