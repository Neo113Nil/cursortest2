package com.onesignal.core.internal.purchases.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.lifecycle.d0;
import ea.e;
import ea.f;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zc.g;
import zc.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ra.b, e {
    private static Class<?> iInAppBillingServiceClass;
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final yc.b _identityModelStore;
    private final na.f _operationRepo;
    private final qa.b _prefs;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest;
    private Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting;
    private final List<String> purchaseTokens;
    public static final C0022a Companion = new C0022a(null);
    private static int iapEnabled = -99;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            componentName.getClass();
            iBinder.getClass();
            try {
                Method asInterfaceMethod = a.Companion.getAsInterfaceMethod(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                asInterfaceMethod.getClass();
                asInterfaceMethod.setAccessible(true);
                a.this.mIInAppBillingService = asInterfaceMethod.invoke(null, iBinder);
                a.this.queryBoughtItems();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            componentName.getClass();
            a.iapEnabled = -99;
            a.this.mIInAppBillingService = null;
        }
    }

    public a(f fVar, qa.b bVar, na.f fVar2, com.onesignal.core.internal.config.b bVar2, yc.b bVar3) {
        fVar.getClass();
        bVar.getClass();
        fVar2.getClass();
        bVar2.getClass();
        bVar3.getClass();
        this._applicationService = fVar;
        this._prefs = bVar;
        this._operationRepo = fVar2;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
        this.purchaseTokens = new ArrayList();
        this.newAsExisting = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryBoughtItems() {
        if (this.isWaitingForPurchasesRequest) {
            return;
        }
        new Thread(new d0(6, this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryBoughtItems$lambda$0(a aVar) {
        aVar.getClass();
        aVar.isWaitingForPurchasesRequest = true;
        try {
            if (aVar.getPurchasesMethod == null) {
                Method getPurchasesMethod = Companion.getGetPurchasesMethod(iInAppBillingServiceClass);
                aVar.getPurchasesMethod = getPurchasesMethod;
                getPurchasesMethod.getClass();
                getPurchasesMethod.setAccessible(true);
            }
            Method method = aVar.getPurchasesMethod;
            method.getClass();
            Object invoke = method.invoke(aVar.mIInAppBillingService, 3, aVar._applicationService.getAppContext().getPackageName(), "inapp", null);
            invoke.getClass();
            Bundle bundle = (Bundle) invoke;
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                stringArrayList2.getClass();
                int size = stringArrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String str = stringArrayList2.get(i3);
                    stringArrayList.getClass();
                    String str2 = stringArrayList.get(i3);
                    String string = new JSONObject(str).getString("purchaseToken");
                    if (!aVar.purchaseTokens.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    aVar.sendPurchases(arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    aVar.newAsExisting = false;
                    aVar._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.FALSE);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aVar.isWaitingForPurchasesRequest = false;
    }

    private final void sendPurchases(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.getSkuDetailsMethod == null) {
                Method getSkuDetailsMethod = Companion.getGetSkuDetailsMethod(iInAppBillingServiceClass);
                this.getSkuDetailsMethod = getSkuDetailsMethod;
                getSkuDetailsMethod.getClass();
                getSkuDetailsMethod.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Method method = this.getSkuDetailsMethod;
            method.getClass();
            Object invoke = method.invoke(this.mIInAppBillingService, 3, this._applicationService.getAppContext().getPackageName(), "inapp", bundle);
            invoke.getClass();
            Bundle bundle2 = (Bundle) invoke;
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                stringArrayList.getClass();
                int size = stringArrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    String str = stringArrayList.get(i3);
                    i3++;
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    String string2 = jSONObject.getString("price_currency_code");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    divide.getClass();
                    string.getClass();
                    string2.getClass();
                    linkedHashMap.put(string, new g(string, string2, divide));
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    String str2 = arrayList.get(i10);
                    i10++;
                    String str3 = str2;
                    if (linkedHashMap.containsKey(str3)) {
                        Object obj = linkedHashMap.get(str3);
                        obj.getClass();
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                na.e.enqueue$default(this._operationRepo, new m(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((yc.a) this._identityModelStore.getModel()).getOnesignalId(), this.newAsExisting, new BigDecimal(0), arrayList3), false, 2, null);
                this.purchaseTokens.addAll(arrayList2);
                this._prefs.saveString("GTPlayerPurchases", "purchaseTokens", this.purchaseTokens.toString());
                this._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                this.newAsExisting = false;
                this.isWaitingForPurchasesRequest = false;
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("Failed to track IAP purchases", th);
        }
    }

    private final void trackIAP() {
        if (this.mServiceConn != null) {
            if (this.mIInAppBillingService != null) {
                queryBoughtItems();
            }
        } else {
            b bVar = new b();
            this.mServiceConn = bVar;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this._applicationService.getAppContext().getApplicationContext().bindService(intent, bVar, 1);
        }
    }

    @Override // ea.e
    public void onFocus(boolean z10) {
        trackIAP();
    }

    @Override // ra.b
    public void start() {
        if (Companion.canTrack(this._applicationService.getAppContext())) {
            try {
                JSONArray jSONArray = new JSONArray(this._prefs.getString("GTPlayerPurchases", "purchaseTokens", "[]"));
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    this.purchaseTokens.add(jSONArray.get(i3).toString());
                }
                boolean z10 = jSONArray.length() == 0;
                this.newAsExisting = z10;
                if (z10) {
                    Boolean bool = this._prefs.getBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                    bool.getClass();
                    this.newAsExisting = bool.booleanValue();
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this._applicationService.addApplicationLifecycleHandler(this);
            trackIAP();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.purchases.impl.a$a, reason: collision with other inner class name */
    public static final class C0022a {
        public /* synthetic */ C0022a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getAsInterfaceMethod(Class<?> cls) {
            Method[] methods = cls.getMethods();
            methods.getClass();
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && Intrinsics.a(parameterTypes[0], IBinder.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetPurchasesMethod(Class<?> cls) {
            cls.getClass();
            Method[] methods = cls.getMethods();
            methods.getClass();
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 4 && Intrinsics.a(parameterTypes[0], Integer.TYPE) && Intrinsics.a(parameterTypes[1], String.class) && Intrinsics.a(parameterTypes[2], String.class) && Intrinsics.a(parameterTypes[3], String.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetSkuDetailsMethod(Class<?> cls) {
            cls.getClass();
            Method[] methods = cls.getMethods();
            methods.getClass();
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (parameterTypes.length == 4 && Intrinsics.a(parameterTypes[0], Integer.TYPE) && Intrinsics.a(parameterTypes[1], String.class) && Intrinsics.a(parameterTypes[2], String.class) && Intrinsics.a(parameterTypes[3], Bundle.class) && Intrinsics.a(returnType, Bundle.class)) {
                    return method;
                }
            }
            return null;
        }

        public final boolean canTrack(Context context) {
            context.getClass();
            if (a.iapEnabled == -99) {
                a.iapEnabled = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
            }
            try {
                if (a.iapEnabled == 0) {
                    a.iInAppBillingServiceClass = Class.forName("com.android.vending.billing.IInAppBillingService");
                }
                return a.iapEnabled == 0;
            } catch (Throwable unused) {
                a.iapEnabled = 0;
                return false;
            }
        }

        private C0022a() {
        }
    }

    @Override // ea.e
    public void onUnfocused() {
    }
}
