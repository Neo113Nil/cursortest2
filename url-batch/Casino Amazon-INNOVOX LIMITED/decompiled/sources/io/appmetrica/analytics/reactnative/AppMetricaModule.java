package io.appmetrica.analytics.reactnative;

import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

@ReactModule(name = AppMetricaModule.NAME)
/* loaded from: classes3.dex */
public class AppMetricaModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AppMetrica";
    public static final String TAG = "AppMetricaModule";
    private final ReactApplicationContext reactContext;

    public AppMetricaModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void activate(ReadableMap readableMap) {
        AppMetricaConfig appMetricaConfig = Utils.toAppMetricaConfig(readableMap);
        AppMetrica.activate(this.reactContext, appMetricaConfig);
        if (Boolean.FALSE.equals(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            return;
        }
        AppMetrica.resumeSession(getCurrentActivity());
    }

    @ReactMethod
    public void getLibraryApiLevel(Promise promise) {
        promise.resolve(Integer.valueOf(AppMetrica.getLibraryApiLevel()));
    }

    @ReactMethod
    public void getLibraryVersion(Promise promise) {
        promise.resolve(AppMetrica.getLibraryVersion());
    }

    @ReactMethod
    public void pauseSession() {
        AppMetrica.pauseSession(getCurrentActivity());
    }

    @ReactMethod
    public void reportAppOpen(String str) {
        AppMetrica.reportAppOpen(str);
    }

    @ReactMethod
    public void reportError(String str, String str2, ReadableMap readableMap) {
        AppMetrica.getPluginExtension().reportError(str, str2, readableMap != null ? ExceptionSerializer.fromObject(readableMap) : null);
    }

    @ReactMethod
    public void reportEvent(String str, ReadableMap readableMap) {
        if (readableMap == null) {
            AppMetrica.reportEvent(str);
        } else {
            AppMetrica.reportEvent(str, readableMap.toHashMap());
        }
    }

    @ReactMethod
    public void requestStartupParams(ReadableArray readableArray, Callback callback) {
        AppMetrica.requestStartupParams(this.reactContext, new ReactNativeStartupParamsListener(callback), Utils.toStartupKeyList(readableArray));
    }

    @ReactMethod
    public void resumeSession() {
        AppMetrica.resumeSession(getCurrentActivity());
    }

    @ReactMethod
    public void sendEventsBuffer() {
        AppMetrica.sendEventsBuffer();
    }

    @ReactMethod
    public void setLocation(ReadableMap readableMap) {
        AppMetrica.setLocation(Utils.toLocation(readableMap));
    }

    @ReactMethod
    public void setLocationTracking(boolean z) {
        AppMetrica.setLocationTracking(z);
    }

    @ReactMethod
    public void setDataSendingEnabled(boolean z) {
        AppMetrica.setDataSendingEnabled(z);
    }

    @ReactMethod
    public void setUserProfileID(String str) {
        AppMetrica.setUserProfileID(str);
    }

    @ReactMethod
    public void reportECommerce(ReadableMap readableMap) {
        ECommerceEvent eCommerceEvent = Utils.toECommerceEvent(readableMap);
        if (eCommerceEvent != null) {
            AppMetrica.reportECommerce(eCommerceEvent);
        } else {
            Log.w(TAG, "ECommerceEvent is null");
        }
    }

    @ReactMethod
    public void reportRevenue(ReadableMap readableMap) {
        AppMetrica.reportRevenue(Utils.toRevenue(readableMap));
    }

    @ReactMethod
    public void reportAdRevenue(ReadableMap readableMap) {
        AppMetrica.reportAdRevenue(Utils.toAdRevenue(readableMap));
    }

    @ReactMethod
    public void reportUserProfile(ReadableMap readableMap) {
        try {
            AppMetrica.reportUserProfile(Utils.toUserProfile(readableMap));
        } catch (Throwable th) {
            Log.w(TAG, "Cannot parse user profile", th);
        }
    }

    @ReactMethod
    public void putErrorEnvironmentValue(String str, String str2) {
        AppMetrica.putErrorEnvironmentValue(str, str2);
    }

    @ReactMethod
    public void reportErrorWithoutIdentifier(String str, ReadableMap readableMap) {
        PluginErrorDetails fromObject = ExceptionSerializer.fromObject(readableMap);
        if (fromObject.getStacktrace().isEmpty()) {
            AppMetrica.getPluginExtension().reportError("Errors without stacktrace", str, fromObject);
        } else {
            AppMetrica.getPluginExtension().reportError(fromObject, str);
        }
    }

    @ReactMethod
    public void reportUnhandledException(ReadableMap readableMap) {
        AppMetrica.getPluginExtension().reportUnhandledException(ExceptionSerializer.fromObject(readableMap));
    }

    @ReactMethod
    public void reportExternalAttribution(ReadableMap readableMap) {
        ModulesFacade.reportExternalAttribution(ExternalAttributionSerializer.parseSource(readableMap.getString("source")), ExternalAttributionSerializer.parseValue(readableMap.getMap("value")));
    }

    @ReactMethod
    public void putAppEnvironmentValue(String str, String str2) {
        AppMetrica.putAppEnvironmentValue(str, str2);
    }

    @ReactMethod
    public void clearAppEnvironment() {
        AppMetrica.clearAppEnvironment();
    }

    @ReactMethod
    public void activateReporter(ReadableMap readableMap) {
        AppMetrica.activateReporter(this.reactContext, Utils.toReporterConfig(readableMap));
    }

    @ReactMethod
    public void touchReporter(String str) {
        AppMetrica.getReporter(this.reactContext, str);
    }

    @ReactMethod
    public void getDeviceId(Promise promise) {
        promise.resolve(AppMetrica.getDeviceId(this.reactContext));
    }

    @ReactMethod
    public void getUuid(Promise promise) {
        promise.resolve(AppMetrica.getUuid(this.reactContext));
    }

    @ReactMethod
    public void requestDeferredDeeplink(Callback callback, Callback callback2) {
        AppMetrica.requestDeferredDeeplink(new ReactNativeDeferredDeeplinkListener(callback, callback2));
    }

    @ReactMethod
    public void requestDeferredDeeplinkParameters(Callback callback, Callback callback2) {
        AppMetrica.requestDeferredDeeplinkParameters(new ReactNativeDeferredDeeplinkParametersListener(callback, callback2));
    }
}
