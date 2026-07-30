package com.appsflyer.reactnative;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* loaded from: classes.dex */
public class PCAppsFlyerModule extends ReactContextBaseJavaModule {
    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public PCAppsFlyerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d("AppsFlyer", "PurchaseConnector inclusion status: false");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PCAppsFlyer";
    }
}
