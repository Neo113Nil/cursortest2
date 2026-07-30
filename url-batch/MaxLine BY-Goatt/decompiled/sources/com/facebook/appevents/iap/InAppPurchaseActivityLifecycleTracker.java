package com.facebook.appevents.iap;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseActivityLifecycleTracker {
    private static final String BILLING_ACTIVITY_NAME = "com.android.billingclient.api.ProxyBillingActivity";
    private static final String SERVICE_INTERFACE_NAME = "com.android.vending.billing.IInAppBillingService$Stub";
    private static InAppPurchaseUtils.BillingClientVersion billingClientVersion;
    private static Application.ActivityLifecycleCallbacks callbacks;
    private static Boolean hasBillingActivity;
    private static Boolean hasBillingService;
    private static Object inAppBillingObj;
    private static Intent intent;
    private static ServiceConnection serviceConnection;
    public static final InAppPurchaseActivityLifecycleTracker INSTANCE = new InAppPurchaseActivityLifecycleTracker();
    private static final String TAG = InAppPurchaseActivityLifecycleTracker.class.getCanonicalName();
    private static final AtomicBoolean isTracking = new AtomicBoolean(false);

    private InAppPurchaseActivityLifecycleTracker() {
    }

    private final void initializeIfNotInitialized() {
        if (hasBillingService != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(InAppPurchaseUtils.getClass(SERVICE_INTERFACE_NAME) != null);
        hasBillingService = valueOf;
        if (Intrinsics.b(valueOf, Boolean.FALSE)) {
            return;
        }
        hasBillingActivity = Boolean.valueOf(InAppPurchaseUtils.getClass(BILLING_ACTIVITY_NAME) != null);
        InAppPurchaseEventManager.clearSkuDetailsCache();
        Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        intent2.getClass();
        intent = intent2;
        serviceConnection = new ServiceConnection() { // from class: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                componentName.getClass();
                iBinder.getClass();
                InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
                InAppPurchaseActivityLifecycleTracker.inAppBillingObj = InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), iBinder);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                componentName.getClass();
            }
        };
        callbacks = new InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPurchase(Context context, ArrayList<String> arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String str = arrayList.get(i);
            try {
                String string = new JSONObject(str).getString("productId");
                string.getClass();
                str.getClass();
                hashMap.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e) {
                Log.e(TAG, "Error parsing in-app purchase data.", e);
            }
            i = i2;
        }
        for (Map.Entry<String, String> entry : InAppPurchaseEventManager.getSkuDetails(context, arrayList2, inAppBillingObj, z).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str2 = (String) hashMap.get(key);
            if (str2 != null) {
                AutomaticAnalyticsLogger.logPurchase$default(str2, value, z, billingClientVersion, false, 16, null);
            }
        }
    }

    public static final void startIapLogging(InAppPurchaseUtils.BillingClientVersion billingClientVersion2) {
        billingClientVersion2.getClass();
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = INSTANCE;
        inAppPurchaseActivityLifecycleTracker.initializeIfNotInitialized();
        if (!Intrinsics.b(hasBillingService, Boolean.FALSE) && AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
            billingClientVersion = billingClientVersion2;
            inAppPurchaseActivityLifecycleTracker.startTracking();
        }
    }

    private final void startTracking() {
        if (isTracking.compareAndSet(false, true)) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            if (applicationContext instanceof Application) {
                Application application = (Application) applicationContext;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.f("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent2 = intent;
                if (intent2 == null) {
                    Intrinsics.f(SDKConstants.PARAM_INTENT);
                    throw null;
                }
                ServiceConnection serviceConnection2 = serviceConnection;
                if (serviceConnection2 != null) {
                    applicationContext.bindService(intent2, serviceConnection2, 1);
                } else {
                    Intrinsics.f("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
