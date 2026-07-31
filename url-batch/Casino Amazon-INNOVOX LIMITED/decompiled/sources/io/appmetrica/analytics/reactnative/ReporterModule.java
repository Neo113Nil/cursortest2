package io.appmetrica.analytics.reactnative;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public class ReporterModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AppMetricaReporter";
    private static final String TAG = "ReporterModule";
    private final ReactApplicationContext reactContext;

    public ReporterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void reportError(String str, String str2, String str3, ReadableMap readableMap) {
        AppMetrica.getReporter(this.reactContext, str).getPluginExtension().reportError(str2, str3, readableMap != null ? ExceptionSerializer.fromObject(readableMap) : null);
    }

    @ReactMethod
    public void reportErrorWithoutIdentifier(String str, String str2, ReadableMap readableMap) {
        PluginErrorDetails fromObject = ExceptionSerializer.fromObject(readableMap);
        if (fromObject.getStacktrace().isEmpty()) {
            AppMetrica.getReporter(this.reactContext, str).getPluginExtension().reportError("Errors without stacktrace", str2, fromObject);
        } else {
            AppMetrica.getReporter(this.reactContext, str).getPluginExtension().reportError(fromObject, str2);
        }
    }

    @ReactMethod
    public void reportUnhandledException(String str, ReadableMap readableMap) {
        AppMetrica.getReporter(this.reactContext, str).getPluginExtension().reportUnhandledException(ExceptionSerializer.fromObject(readableMap));
    }

    @ReactMethod
    public void reportEvent(String str, String str2, ReadableMap readableMap) {
        if (readableMap == null) {
            AppMetrica.getReporter(this.reactContext, str).reportEvent(str2);
        } else {
            AppMetrica.getReporter(this.reactContext, str).reportEvent(str2, readableMap.toHashMap());
        }
    }

    @ReactMethod
    public void pauseSession(String str) {
        AppMetrica.getReporter(this.reactContext, str).pauseSession();
    }

    @ReactMethod
    public void resumeSession(String str) {
        AppMetrica.getReporter(this.reactContext, str).resumeSession();
    }

    @ReactMethod
    public void sendEventsBuffer(String str) {
        AppMetrica.getReporter(this.reactContext, str).sendEventsBuffer();
    }

    @ReactMethod
    public void clearAppEnvironment(String str) {
        AppMetrica.getReporter(this.reactContext, str).clearAppEnvironment();
    }

    @ReactMethod
    public void putAppEnvironmentValue(String str, String str2, String str3) {
        AppMetrica.getReporter(this.reactContext, str).putAppEnvironmentValue(str2, str3);
    }

    @ReactMethod
    public void setUserProfileID(String str, String str2) {
        AppMetrica.getReporter(this.reactContext, str).setUserProfileID(str2);
    }

    @ReactMethod
    public void reportUserProfile(String str, ReadableMap readableMap) {
        try {
            AppMetrica.getReporter(this.reactContext, str).reportUserProfile(Utils.toUserProfile(readableMap));
        } catch (Throwable th) {
            Log.w(TAG, "Cannot parse user profile", th);
        }
    }

    @ReactMethod
    public void setDataSendingEnabled(String str, boolean z) {
        AppMetrica.getReporter(this.reactContext, str).setDataSendingEnabled(z);
    }

    @ReactMethod
    public void reportAdRevenue(String str, ReadableMap readableMap) {
        AppMetrica.getReporter(this.reactContext, str).reportAdRevenue(Utils.toAdRevenue(readableMap));
    }

    @ReactMethod
    public void reportECommerce(String str, ReadableMap readableMap) {
        ECommerceEvent eCommerceEvent = Utils.toECommerceEvent(readableMap);
        if (eCommerceEvent != null) {
            AppMetrica.getReporter(this.reactContext, str).reportECommerce(eCommerceEvent);
        } else {
            Log.w(TAG, "ECommerceEvent is null");
        }
    }

    @ReactMethod
    public void reportRevenue(String str, ReadableMap readableMap) {
        AppMetrica.getReporter(this.reactContext, str).reportRevenue(Utils.toRevenue(readableMap));
    }
}
