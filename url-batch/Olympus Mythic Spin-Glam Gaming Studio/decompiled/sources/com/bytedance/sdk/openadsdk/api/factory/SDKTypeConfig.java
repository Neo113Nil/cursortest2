package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* loaded from: classes8.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory zmn;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return zmn;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        zmn = iSDKTypeFactory;
    }
}
