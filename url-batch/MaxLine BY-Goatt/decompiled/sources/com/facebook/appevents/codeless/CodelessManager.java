package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.l6;
import defpackage.lv;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CodelessManager {
    private static String deviceSessionID;
    private static volatile boolean isCheckingSession;
    private static SensorManager sensorManager;
    private static ViewIndexer viewIndexer;
    public static final CodelessManager INSTANCE = new CodelessManager();
    private static final ViewIndexingTrigger viewIndexingTrigger = new ViewIndexingTrigger();
    private static final AtomicBoolean isCodelessEnabled = new AtomicBoolean(true);
    private static final AtomicBoolean isAppIndexingEnabled = new AtomicBoolean(false);

    private CodelessManager() {
    }

    private final void checkCodelessSession(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isCheckingSession) {
                return;
            }
            isCheckingSession = true;
            FacebookSdk.getExecutor().execute(new l6(str, 1));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkCodelessSession$lambda$1(String str) {
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
            JSONArray jSONArray = new JSONArray();
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = BuildConfig.FLAVOR;
            }
            jSONArray.put(str3);
            if ((attributionIdentifiers != null ? attributionIdentifiers.getAndroidAdvertiserId() : null) != null) {
                jSONArray.put(attributionIdentifiers.getAndroidAdvertiserId());
            } else {
                jSONArray.put(BuildConfig.FLAVOR);
            }
            jSONArray.put(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            if (AppEventUtility.isEmulator()) {
                str2 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
            }
            jSONArray.put(str2);
            Locale currentLocale = Utility.getCurrentLocale();
            jSONArray.put(currentLocale.getLanguage() + '_' + currentLocale.getCountry());
            String jSONArray2 = jSONArray.toString();
            jSONArray2.getClass();
            bundle.putString(Constants.DEVICE_SESSION_ID, getCurrentDeviceSessionID$facebook_core_release());
            bundle.putString(Constants.EXTINFO, jSONArray2);
            boolean z = true;
            JSONObject jSONObject = GraphRequest.Companion.newPostRequestWithBundle(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, null).executeAndWait().getJSONObject();
            AtomicBoolean atomicBoolean = isAppIndexingEnabled;
            if (jSONObject == null || !jSONObject.optBoolean(Constants.APP_INDEXING_ENABLED, false)) {
                z = false;
            }
            atomicBoolean.set(z);
            if (atomicBoolean.get()) {
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.schedule();
                }
            } else {
                deviceSessionID = null;
            }
            isCheckingSession = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final String getCurrentDeviceSessionID$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return null;
        }
        try {
            if (deviceSessionID == null) {
                deviceSessionID = UUID.randomUUID().toString();
            }
            String str = deviceSessionID;
            str.getClass();
            return str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return null;
        }
    }

    public static final boolean getIsAppIndexingEnabled$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
            return false;
        }
    }

    private final boolean isDebugOnEmulator() {
        CrashShieldHandler.isObjectCrashing(this);
        return false;
    }

    public static final void onActivityDestroyed(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            activity.getClass();
            CodelessMatcher.Companion.getInstance().destroy(activity);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void onActivityPaused(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            activity.getClass();
            if (isCodelessEnabled.get()) {
                CodelessMatcher.Companion.getInstance().remove(activity);
                ViewIndexer viewIndexer2 = viewIndexer;
                if (viewIndexer2 != null) {
                    viewIndexer2.unschedule();
                }
                SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 != null) {
                    sensorManager2.unregisterListener(viewIndexingTrigger);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003d, code lost:
    
        if (com.facebook.appevents.codeless.CodelessManager.INSTANCE.isDebugOnEmulator() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onActivityResumed(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            activity.getClass();
            if (!isCodelessEnabled.get()) {
                return;
            }
            CodelessMatcher.Companion.getInstance().add(activity);
            Context applicationContext = activity.getApplicationContext();
            String applicationId = FacebookSdk.getApplicationId();
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
            if (appSettingsWithoutQuery != null) {
                if (appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                    SensorManager sensorManager2 = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager2 == null) {
                        return;
                    }
                    sensorManager = sensorManager2;
                    Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                    ViewIndexer viewIndexer2 = new ViewIndexer(activity);
                    viewIndexer = viewIndexer2;
                    ViewIndexingTrigger viewIndexingTrigger2 = viewIndexingTrigger;
                    viewIndexingTrigger2.setOnShakeListener(new lv(0, appSettingsWithoutQuery, applicationId));
                    sensorManager2.registerListener(viewIndexingTrigger2, defaultSensor, 2);
                    if (appSettingsWithoutQuery != null && appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                        viewIndexer2.schedule();
                    }
                    CodelessManager codelessManager = INSTANCE;
                    if (!codelessManager.isDebugOnEmulator() || isAppIndexingEnabled.get()) {
                        return;
                    }
                    codelessManager.checkCodelessSession(applicationId);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResumed$lambda$0(FetchedAppSettings fetchedAppSettings, String str) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            str.getClass();
            boolean z = fetchedAppSettings != null && fetchedAppSettings.getCodelessEventsEnabled();
            boolean codelessSetupEnabled = FacebookSdk.getCodelessSetupEnabled();
            if (z && codelessSetupEnabled) {
                INSTANCE.checkCodelessSession(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }

    public static final void updateAppIndexing$facebook_core_release(boolean z) {
        if (CrashShieldHandler.isObjectCrashing(CodelessManager.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(z);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CodelessManager.class);
        }
    }
}
