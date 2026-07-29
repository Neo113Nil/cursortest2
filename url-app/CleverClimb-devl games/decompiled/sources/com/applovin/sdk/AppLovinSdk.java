package com.applovin.sdk;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.nativeAds.AppLovinNativeAdService;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = "9.1.3";
    public static final int VERSION_CODE = 90103;
    private static AppLovinSdk[] sdkInstances = new AppLovinSdk[0];
    private static final Object sdkInstancesLock = new Object();
    private final j mSdkImpl;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private static class a extends AppLovinSdkSettings {
        public a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.mSdkImpl = jVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(l.a(context), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings == null) {
            throw new IllegalArgumentException("No userSettings specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (sdkInstancesLock) {
            if (sdkInstances.length == 1 && sdkInstances[0].getSdkKey().equals(str)) {
                return sdkInstances[0];
            }
            for (AppLovinSdk appLovinSdk : sdkInstances) {
                if (appLovinSdk.getSdkKey().equals(str)) {
                    return appLovinSdk;
                }
            }
            try {
                j jVar = new j();
                jVar.a(str, appLovinSdkSettings, context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(jVar);
                jVar.a(appLovinSdk2);
                AppLovinSdk[] appLovinSdkArr = new AppLovinSdk[sdkInstances.length + 1];
                System.arraycopy(sdkInstances, 0, appLovinSdkArr, 0, sdkInstances.length);
                appLovinSdkArr[sdkInstances.length] = appLovinSdk2;
                sdkInstances = appLovinSdkArr;
                return appLovinSdk2;
            } catch (Throwable th) {
                Log.e(TAG, "Failed to build AppLovin SDK. Try cleaning application data and starting the application again.", th);
                throw new RuntimeException("Unable to build AppLovin SDK");
            }
        }
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        AppLovinSdk appLovinSdk = getInstance(context);
        if (appLovinSdk != null) {
            appLovinSdk.initializeSdk(sdkInitializationListener);
        } else {
            Log.e(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
        }
    }

    static void reinitializeAll() {
        reinitializeAll(null);
    }

    static void reinitializeAll(Boolean bool) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk appLovinSdk : sdkInstances) {
                appLovinSdk.mSdkImpl.b();
                if (bool != null && bool.booleanValue()) {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("value", bool.toString());
                    appLovinSdk.getEventService().trackEvent("huc", hashMap);
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.mSdkImpl.n();
    }

    Context getApplicationContext() {
        return this.mSdkImpl.w();
    }

    public AppLovinEventService getEventService() {
        return this.mSdkImpl.p();
    }

    public p getLogger() {
        return this.mSdkImpl.u();
    }

    public String getMediationProvider() {
        return this.mSdkImpl.m();
    }

    public AppLovinNativeAdService getNativeAdService() {
        return this.mSdkImpl.o();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.mSdkImpl.J();
    }

    public String getSdkKey() {
        return this.mSdkImpl.s();
    }

    public AppLovinSdkSettings getSettings() {
        return this.mSdkImpl.l();
    }

    public String getUserIdentifier() {
        return this.mSdkImpl.k();
    }

    public AppLovinUserService getUserService() {
        return this.mSdkImpl.q();
    }

    public AppLovinVariableService getVariableService() {
        return this.mSdkImpl.r();
    }

    public boolean hasCriticalErrors() {
        return this.mSdkImpl.t();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.mSdkImpl.a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.mSdkImpl.d();
    }

    public void setMediationProvider(String str) {
        this.mSdkImpl.c(str);
    }

    public void setPluginVersion(String str) {
        this.mSdkImpl.a(str);
    }

    public void setUserIdentifier(String str) {
        this.mSdkImpl.b(str);
    }
}
