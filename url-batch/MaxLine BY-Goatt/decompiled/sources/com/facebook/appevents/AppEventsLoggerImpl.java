package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.UserSettingsManager;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.pa.PACustomAudienceClient;
import com.facebook.appevents.iap.InAppPurchase;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.iap.InAppPurchaseDedupeConfig;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.integrity.BannedParamManager;
import com.facebook.appevents.integrity.BlocklistEventsManager;
import com.facebook.appevents.integrity.MACARuleMatchingManager;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.integrity.SensitiveParamsManager;
import com.facebook.appevents.integrity.StdParamsEnforcementManager;
import com.facebook.appevents.integrity.VVPManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InstallReferrerUtil;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.ey;
import defpackage.lh;
import defpackage.m;
import defpackage.pv;
import defpackage.q1;
import defpackage.tp2;
import defpackage.up2;
import defpackage.w6;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventsLoggerImpl {
    private static final String ACCOUNT_KIT_EVENT_NAME_PREFIX = "fb_ak";
    public static final String APP_EVENTS_KILLSWITCH = "app_events_killswitch";
    private static final String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
    private static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
    private static final String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
    private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;
    public static final Companion Companion = new Companion(null);
    private static final String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
    private static final String PUSH_PAYLOAD_KEY = "fb_push_payload";
    private static final String TAG;
    private static volatile String anonymousAppDeviceGUID;
    private static ScheduledThreadPoolExecutor backgroundExecutor;
    private static AppEventsLogger.FlushBehavior flushBehaviorField;
    private static final InstallReferrerUtil.Callback installReferrerCallback;
    private static boolean isActivateAppEventRequested;
    private static String pushNotificationsRegistrationIdField;
    private static final Object staticLock;
    private AccessTokenAppIdPair accessTokenAppId;
    private final String contextName;

    static {
        String canonicalName = AppEventsLoggerImpl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        TAG = canonicalName;
        flushBehaviorField = AppEventsLogger.FlushBehavior.AUTO;
        staticLock = new Object();
        installReferrerCallback = new w6(26);
    }

    public AppEventsLoggerImpl(String str, String str2, AccessToken accessToken) {
        str.getClass();
        Validate.sdkInitialized();
        this.contextName = str;
        accessToken = accessToken == null ? AccessToken.Companion.getCurrentAccessToken() : accessToken;
        if (accessToken == null || accessToken.isExpired() || !(str2 == null || str2.equals(accessToken.getApplicationId()))) {
            str2 = str2 == null ? Utility.getMetadataApplicationId(FacebookSdk.getApplicationContext()) : str2;
            if (str2 == null) {
                lh.g("Required value was null.");
                throw null;
            }
            this.accessTokenAppId = new AccessTokenAppIdPair(null, str2);
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(accessToken);
        }
        Companion.initializeTimersIfNeeded();
    }

    public static final /* synthetic */ String access$getAnonymousAppDeviceGUID$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return anonymousAppDeviceGUID;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return backgroundExecutor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return flushBehaviorField;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ InstallReferrerUtil.Callback access$getInstallReferrerCallback$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return installReferrerCallback;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getPushNotificationsRegistrationIdField$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return pushNotificationsRegistrationIdField;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ Object access$getStaticLock$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return staticLock;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isActivateAppEventRequested$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return false;
        }
        try {
            return isActivateAppEventRequested;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return false;
        }
    }

    public static final /* synthetic */ void access$setActivateAppEventRequested$cp(boolean z) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            isActivateAppEventRequested = z;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setAnonymousAppDeviceGUID$cp(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            anonymousAppDeviceGUID = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setBackgroundExecutor$cp(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            backgroundExecutor = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setFlushBehaviorField$cp(AppEventsLogger.FlushBehavior flushBehavior) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            flushBehaviorField = flushBehavior;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final /* synthetic */ void access$setPushNotificationsRegistrationIdField$cp(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            pushNotificationsRegistrationIdField = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void activateApp(Application application, String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.activateApp(application, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final Pair<Bundle, OperationalData> addImplicitPurchaseParameters(Bundle bundle, OperationalData operationalData, boolean z) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.addImplicitPurchaseParameters(bundle, operationalData, z);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final void augmentWebView(WebView webView, Context context) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.augmentWebView(webView, context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void functionDEPRECATED(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.functionDEPRECATED(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final Executor getAnalyticsExecutor() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getAnalyticsExecutor();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final String getAnonymousAppDeviceGUID(Context context) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getAnonymousAppDeviceGUID(context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getFlushBehavior();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final String getInstallReferrer() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getInstallReferrer();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final String getInstallReferrerBlocking() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getInstallReferrerBlocking();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final String getPushNotificationsRegistrationId() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return Companion.getPushNotificationsRegistrationId();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
            return null;
        }
    }

    public static final void initializeLib(Context context, String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.initializeLib(context, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installReferrerCallback$lambda$0(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.setInstallReferrer(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Double d, Bundle bundle, boolean z, UUID uuid, OperationalData operationalData, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i & 32) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logEvent(str, d, bundle, z, uuid, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logEventImplicitly$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i & 16) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z, OperationalData operationalData, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i & 16) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle, z, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logPurchaseImplicitly$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i & 8) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void onContextStop() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.onContextStop();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.setFlushBehavior(flushBehavior);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void setInstallReferrer(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.setInstallReferrer(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static final void setPushNotificationsRegistrationId(String str) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            Companion.setPushNotificationsRegistrationId(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public final void flush() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            AppEventQueue.flush(FlushReason.EXPLICIT);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final String getApplicationId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.accessTokenAppId.getApplicationId();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean isValidForAccessToken(AccessToken accessToken) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            accessToken.getClass();
            return Intrinsics.b(this.accessTokenAppId, new AccessTokenAppIdPair(accessToken));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #2 {all -> 0x0038, blocks: (B:5:0x0010, B:12:0x001b, B:14:0x0021, B:17:0x002b, B:19:0x0031, B:22:0x003c, B:24:0x004b, B:26:0x0065, B:29:0x0073, B:30:0x00a2, B:33:0x00b0, B:35:0x00be, B:39:0x00c5, B:41:0x00d5, B:43:0x00dd, B:44:0x00e7, B:49:0x010b, B:53:0x011d, B:55:0x0051, B:57:0x0059, B:59:0x005f), top: B:4:0x0010, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:5:0x0010, B:12:0x001b, B:14:0x0021, B:17:0x002b, B:19:0x0031, B:22:0x003c, B:24:0x004b, B:26:0x0065, B:29:0x0073, B:30:0x00a2, B:33:0x00b0, B:35:0x00be, B:39:0x00c5, B:41:0x00d5, B:43:0x00dd, B:44:0x00e7, B:49:0x010b, B:53:0x011d, B:55:0x0051, B:57:0x0059, B:59:0x005f), top: B:4:0x0010, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void logEvent(String str, Double d, Bundle bundle, boolean z, UUID uuid, OperationalData operationalData) {
        Bundle bundle2;
        OperationalData operationalData2 = operationalData;
        if (CrashShieldHandler.isObjectCrashing(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (!z) {
                if (AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
                    if (!Intrinsics.b(str, AppEventsConstants.EVENT_NAME_PURCHASED)) {
                        if (!Intrinsics.b(str, AppEventsConstants.EVENT_NAME_SUBSCRIBE)) {
                            if (Intrinsics.b(str, AppEventsConstants.EVENT_NAME_START_TRIAL)) {
                            }
                        }
                    }
                    Log.w(TAG, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                    if ((FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe) && Intrinsics.b(str, AppEventsConstants.EVENT_NAME_PURCHASED)) || (FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitSubsDedupe) && (Intrinsics.b(str, AppEventsConstants.EVENT_NAME_SUBSCRIBE) || Intrinsics.b(str, AppEventsConstants.EVENT_NAME_START_TRIAL)))) {
                        InAppPurchaseDedupeConfig inAppPurchaseDedupeConfig = InAppPurchaseDedupeConfig.INSTANCE;
                        Double valueOfManualEvent = inAppPurchaseDedupeConfig.getValueOfManualEvent(d, bundle);
                        Currency currencyOfManualEvent = inAppPurchaseDedupeConfig.getCurrencyOfManualEvent(bundle);
                        if (valueOfManualEvent != null && currencyOfManualEvent != null) {
                            Pair<Bundle, OperationalData> addDedupeParameters = inAppPurchaseDedupeConfig.addDedupeParameters(InAppPurchaseManager.performDedupe(pv.c(new InAppPurchase(str, valueOfManualEvent.doubleValue(), currencyOfManualEvent)), System.currentTimeMillis(), false, pv.c(new Pair(bundle, operationalData2))), bundle, operationalData2);
                            Bundle bundle3 = (Bundle) addDedupeParameters.m;
                            operationalData2 = (OperationalData) addDedupeParameters.n;
                            bundle2 = bundle3;
                            if (!FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_KILLSWITCH, FacebookSdk.getApplicationId(), false)) {
                                Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                                return;
                            }
                            if (BlocklistEventsManager.isInBlocklist(str)) {
                                return;
                            }
                            Companion companion = Companion;
                            Pair<Bundle, OperationalData> addImplicitPurchaseParameters = companion.addImplicitPurchaseParameters(bundle2, operationalData2, z);
                            Bundle bundle4 = (Bundle) addImplicitPurchaseParameters.m;
                            OperationalData operationalData3 = (OperationalData) addImplicitPurchaseParameters.n;
                            try {
                                if (!ProtectedModeManager.INSTANCE.protectedModeIsApplied(bundle4)) {
                                    SensitiveParamsManager.processFilterSensitiveParams(bundle4, str);
                                }
                                BannedParamManager.processFilterBannedParams(bundle4);
                                MACARuleMatchingManager.processParameters(bundle4, str);
                                StdParamsEnforcementManager.processFilterParamSchemaBlocking(bundle4);
                                ProtectedModeManager.processParametersForProtectedMode(bundle4);
                                VVPManager.processParametersForVVP(str, bundle4);
                                companion.logEvent(new AppEvent(this.contextName, str, d, bundle4, z, ActivityLifecycleTracker.isInBackground(), uuid, operationalData3), this.accessTokenAppId);
                                return;
                            } catch (FacebookException e) {
                                Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
                                return;
                            } catch (JSONException e2) {
                                Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
                                return;
                            }
                        }
                    }
                }
            }
            bundle2 = bundle;
            if (!FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_KILLSWITCH, FacebookSdk.getApplicationId(), false)) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEventFromSE(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            bundle.putString("_button_text", str2);
            logEvent(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEventImplicitly(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        Throwable th;
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                Utility.logd(TAG, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th2) {
                    th = th2;
                    appEventsLoggerImpl = this;
                    CrashShieldHandler.handleThrowable(th, appEventsLoggerImpl);
                }
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
                logEvent(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, ActivityLifecycleTracker.getCurrentSessionGuid(), operationalData);
            } catch (Throwable th3) {
                th = th3;
                appEventsLoggerImpl = this;
                th = th;
                CrashShieldHandler.handleThrowable(th, appEventsLoggerImpl);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void logProductItem(String str, AppEventsLogger.ProductAvailability productAvailability, AppEventsLogger.ProductCondition productCondition, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (str == null) {
                Companion.notifyDeveloperError("itemID cannot be null");
                return;
            }
            if (productAvailability == null) {
                Companion.notifyDeveloperError("availability cannot be null");
                return;
            }
            if (productCondition == null) {
                Companion.notifyDeveloperError("condition cannot be null");
                return;
            }
            if (str2 == null) {
                Companion.notifyDeveloperError("description cannot be null");
                return;
            }
            if (str3 == null) {
                Companion.notifyDeveloperError("imageLink cannot be null");
                return;
            }
            if (str4 == null) {
                Companion.notifyDeveloperError("link cannot be null");
                return;
            }
            if (str5 == null) {
                Companion.notifyDeveloperError("title cannot be null");
                return;
            }
            if (bigDecimal == null) {
                Companion.notifyDeveloperError("priceAmount cannot be null");
                return;
            }
            if (currency == null) {
                Companion.notifyDeveloperError("currency cannot be null");
                return;
            }
            if (str6 == null && str7 == null && str8 == null) {
                Companion.notifyDeveloperError("Either gtin, mpn or brand is required");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_ITEM_ID, str);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_AVAILABILITY, productAvailability.name());
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_CONDITION, productCondition.name());
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_DESCRIPTION, str2);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_IMAGE_LINK, str3);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_LINK, str4);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_TITLE, str5);
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_PRICE_AMOUNT, bigDecimal.setScale(3, RoundingMode.HALF_UP).toString());
            bundle.putString(Constants.EVENT_PARAM_PRODUCT_PRICE_CURRENCY, currency.getCurrencyCode());
            if (str6 != null) {
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_GTIN, str6);
            }
            if (str7 != null) {
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_MPN, str7);
            }
            if (str8 != null) {
                bundle.putString(Constants.EVENT_PARAM_PRODUCT_BRAND, str8);
            }
            logEvent(AppEventsConstants.EVENT_NAME_PRODUCT_CATALOG_UPDATE, bundle);
            Companion.eagerFlush();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z, OperationalData operationalData) {
        Throwable th;
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                Companion.notifyDeveloperError("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                Companion.notifyDeveloperError("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
                appEventsLoggerImpl = this;
                try {
                    appEventsLoggerImpl.logEvent(AppEventsConstants.EVENT_NAME_PURCHASED, Double.valueOf(bigDecimal.doubleValue()), bundle2, z, ActivityLifecycleTracker.getCurrentSessionGuid(), operationalData);
                    Companion.eagerFlush();
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    CrashShieldHandler.handleThrowable(th, appEventsLoggerImpl);
                }
            } catch (Throwable th3) {
                th = th3;
                appEventsLoggerImpl = this;
            }
        } catch (Throwable th4) {
            th = th4;
            appEventsLoggerImpl = this;
        }
    }

    public final void logPurchaseImplicitly(BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logPurchase(bigDecimal, currency, bundle, true, operationalData);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPushNotificationOpen(Bundle bundle, String str) {
        String str2;
        String string;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            bundle.getClass();
            try {
                string = bundle.getString(PUSH_PAYLOAD_KEY);
            } catch (JSONException unused) {
                str2 = null;
            }
            if (Utility.isNullOrEmpty(string)) {
                return;
            }
            str2 = new JSONObject(string).getString("campaign");
            if (str2 == null) {
                Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Malformed payload specified for logging a push notification open.");
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(APP_EVENT_PUSH_PARAMETER_CAMPAIGN, str2);
            if (str != null) {
                bundle2.putString(APP_EVENT_PUSH_PARAMETER_ACTION, str);
            }
            logEvent(APP_EVENT_NAME_PUSH_OPENED, bundle2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logSdkEvent(String str, Double d, Bundle bundle) {
        AppEventsLoggerImpl appEventsLoggerImpl;
        Throwable th;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            str.getClass();
            if (!tp2.o(str, ACCOUNT_KIT_EVENT_NAME_PREFIX, false)) {
                try {
                    Log.e(TAG, "logSdkEvent is deprecated and only supports account kit for legacy, please use logEvent instead");
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    appEventsLoggerImpl = this;
                    CrashShieldHandler.handleThrowable(th, appEventsLoggerImpl);
                }
            }
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                appEventsLoggerImpl = this;
                try {
                    logEvent$default(appEventsLoggerImpl, str, d, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    CrashShieldHandler.handleThrowable(th, appEventsLoggerImpl);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            appEventsLoggerImpl = this;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initializeLib$lambda$4(Context context, AppEventsLoggerImpl appEventsLoggerImpl) {
            context.getClass();
            appEventsLoggerImpl.getClass();
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT, "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                appEventsLoggerImpl.logEventImplicitly(AnalyticsEvents.EVENT_SDK_INITIALIZE, null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initializeTimersIfNeeded() {
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                if (AppEventsLoggerImpl.access$getBackgroundExecutor$cp() != null) {
                    return;
                }
                AppEventsLoggerImpl.access$setBackgroundExecutor$cp(new ScheduledThreadPoolExecutor(1));
                Unit unit = Unit.a;
                m mVar = new m(9);
                ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (access$getBackgroundExecutor$cp != null) {
                    access$getBackgroundExecutor$cp.scheduleAtFixedRate(mVar, 0L, 86400L, TimeUnit.SECONDS);
                } else {
                    lh.g("Required value was null.");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initializeTimersIfNeeded$lambda$6() {
            HashSet hashSet = new HashSet();
            Iterator<AccessTokenAppIdPair> it = AppEventQueue.getKeySet().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getApplicationId());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                FetchedAppSettingsManager.queryAppSettings((String) it2.next(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            AppEventQueue.add(accessTokenAppIdPair, appEvent);
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                OnDeviceProcessingManager.sendCustomEventAsync(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.registerTriggerAsync(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSPACAProcessing)) {
                PACustomAudienceClient.INSTANCE.joinCustomAudience(accessTokenAppIdPair.getApplicationId(), appEvent);
            }
            if (appEvent.getIsImplicit() || AppEventsLoggerImpl.access$isActivateAppEventRequested$cp()) {
                return;
            }
            if (Intrinsics.b(appEvent.getName(), AppEventsConstants.EVENT_NAME_ACTIVATED_APP)) {
                AppEventsLoggerImpl.access$setActivateAppEventRequested$cp(true);
            } else {
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void notifyDeveloperError(String str) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
        }

        private final String readInstallReferrerFromPrefs() {
            return FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final void activateApp(Application application, String str) {
            application.getClass();
            if (!FacebookSdk.isInitialized()) {
                ey.i("The Facebook sdk must be initialized before calling activateApp");
                return;
            }
            AnalyticsUserIDStore.initStore();
            UserDataStore.initStore();
            if (str == null) {
                str = FacebookSdk.getApplicationId();
            }
            FacebookSdk.publishInstallAsync(application, str);
            ActivityLifecycleTracker.startTracking(application, str);
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSPACAProcessing)) {
                PACustomAudienceClient.INSTANCE.joinCustomAudience(str, "fb_mobile_app_install");
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.registerTriggerAsync(str, new AppEvent("unknown", "MOBILE_INSTALL_EVENT", null, null, false, ActivityLifecycleTracker.isInBackground(), ActivityLifecycleTracker.getCurrentSessionGuid(), null));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Pair<Bundle, OperationalData> addImplicitPurchaseParameters(Bundle bundle, OperationalData operationalData, boolean z) {
            OperationalData.Companion companion;
            OperationalDataEnum operationalDataEnum;
            String str = AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO;
            OperationalData.Companion companion2 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
            Pair<Bundle, OperationalData> addParameterAndReturn = companion2.addParameterAndReturn(operationalDataEnum2, Constants.EVENT_PARAM_IS_IMPLICIT_PURCHASE_LOGGING_ENABLED, str, bundle, operationalData);
            Object parameter = companion2.getParameter(operationalDataEnum2, Constants.IAP_PRODUCT_ID, bundle, operationalData);
            String str2 = parameter instanceof String ? (String) parameter : null;
            if (!z) {
                if ((bundle != null ? bundle.getString(AppEventsConstants.EVENT_PARAM_CONTENT_ID) : null) == null && str2 != null) {
                    companion = companion2;
                    operationalDataEnum = operationalDataEnum2;
                    Pair<Bundle, OperationalData> addParameterAndReturn2 = companion.addParameterAndReturn(operationalDataEnum, AppEventsConstants.EVENT_PARAM_CONTENT_ID, str2, bundle, operationalData);
                    addParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, Constants.ANDROID_DYNAMIC_ADS_CONTENT_ID, "client_manual", (Bundle) addParameterAndReturn2.m, (OperationalData) addParameterAndReturn2.n);
                    Pair<Bundle, OperationalData> addParameterAndReturn3 = companion.addParameterAndReturn(operationalDataEnum, Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, !UserSettingsManager.getAutoLogAppEventsEnabled() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO, (Bundle) addParameterAndReturn.m, (OperationalData) addParameterAndReturn.n);
                    return new Pair<>((Bundle) addParameterAndReturn3.m, (OperationalData) addParameterAndReturn3.n);
                }
            }
            companion = companion2;
            operationalDataEnum = operationalDataEnum2;
            Pair<Bundle, OperationalData> addParameterAndReturn32 = companion.addParameterAndReturn(operationalDataEnum, Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, !UserSettingsManager.getAutoLogAppEventsEnabled() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO, (Bundle) addParameterAndReturn.m, (OperationalData) addParameterAndReturn.n);
            return new Pair<>((Bundle) addParameterAndReturn32.m, (OperationalData) addParameterAndReturn32.n);
        }

        public final void augmentWebView(WebView webView, Context context) {
            webView.getClass();
            String str = Build.VERSION.RELEASE;
            str.getClass();
            String[] strArr = (String[]) up2.F(0, 6, str, new String[]{"."}).toArray(new String[0]);
            int parseInt = strArr.length == 0 ? 0 : Integer.parseInt(strArr[0]);
            int parseInt2 = strArr.length > 1 ? Integer.parseInt(strArr[1]) : 0;
            if (parseInt < 4 || (parseInt == 4 && parseInt2 <= 1)) {
                Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, AppEventsLoggerImpl.access$getTAG$cp(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
                return;
            }
            webView.addJavascriptInterface(new FacebookSDKJSInterface(context), "fbmq_" + FacebookSdk.getApplicationId());
        }

        public final void eagerFlush() {
            if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        public final void functionDEPRECATED(String str) {
            str.getClass();
            Log.w(AppEventsLoggerImpl.access$getTAG$cp(), "This function is deprecated. " + str);
        }

        public final Executor getAnalyticsExecutor() {
            if (AppEventsLoggerImpl.access$getBackgroundExecutor$cp() == null) {
                initializeTimersIfNeeded();
            }
            ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
            if (access$getBackgroundExecutor$cp != null) {
                return access$getBackgroundExecutor$cp;
            }
            lh.g("Required value was null.");
            return null;
        }

        public final String getAnonymousAppDeviceGUID(Context context) {
            context.getClass();
            if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                    try {
                        if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                            AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp() == null) {
                                AppEventsLoggerImpl.access$setAnonymousAppDeviceGUID$cp("XZ" + UUID.randomUUID());
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp()).apply();
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String access$getAnonymousAppDeviceGUID$cp = AppEventsLoggerImpl.access$getAnonymousAppDeviceGUID$cp();
            if (access$getAnonymousAppDeviceGUID$cp != null) {
                return access$getAnonymousAppDeviceGUID$cp;
            }
            lh.g("Required value was null.");
            return null;
        }

        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            AppEventsLogger.FlushBehavior access$getFlushBehaviorField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                access$getFlushBehaviorField$cp = AppEventsLoggerImpl.access$getFlushBehaviorField$cp();
            }
            return access$getFlushBehaviorField$cp;
        }

        public final String getInstallReferrer() {
            InstallReferrerUtil.tryUpdateReferrerInfo(AppEventsLoggerImpl.access$getInstallReferrerCallback$cp());
            return readInstallReferrerFromPrefs();
        }

        public final String getInstallReferrerBlocking() {
            InstallReferrerUtil.tryUpdateReferrerInfoBlocking(AppEventsLoggerImpl.access$getInstallReferrerCallback$cp());
            return readInstallReferrerFromPrefs();
        }

        public final String getPushNotificationsRegistrationId() {
            String access$getPushNotificationsRegistrationIdField$cp;
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                access$getPushNotificationsRegistrationIdField$cp = AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp();
            }
            return access$getPushNotificationsRegistrationIdField$cp;
        }

        public final void initializeLib(Context context, String str) {
            context.getClass();
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor access$getBackgroundExecutor$cp = AppEventsLoggerImpl.access$getBackgroundExecutor$cp();
                if (access$getBackgroundExecutor$cp != null) {
                    access$getBackgroundExecutor$cp.execute(new q1(5, context, appEventsLoggerImpl));
                } else {
                    lh.g("Required value was null.");
                }
            }
        }

        public final void onContextStop() {
            AppEventQueue.persistToDisk();
        }

        public final void setFlushBehavior(AppEventsLogger.FlushBehavior flushBehavior) {
            flushBehavior.getClass();
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                AppEventsLoggerImpl.access$setFlushBehaviorField$cp(flushBehavior);
                Unit unit = Unit.a;
            }
        }

        public final void setInstallReferrer(String str) {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        public final void setPushNotificationsRegistrationId(String str) {
            synchronized (AppEventsLoggerImpl.access$getStaticLock$cp()) {
                try {
                    if (!Utility.stringsEqualOrEmpty(AppEventsLoggerImpl.access$getPushNotificationsRegistrationIdField$cp(), str)) {
                        AppEventsLoggerImpl.access$setPushNotificationsRegistrationIdField$cp(str);
                        AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(FacebookSdk.getApplicationContext(), (String) null, (AccessToken) null);
                        appEventsLoggerImpl.logEvent(AppEventsConstants.EVENT_NAME_PUSH_TOKEN_OBTAINED);
                        if (AppEventsLoggerImpl.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                            appEventsLoggerImpl.flush();
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void logPurchase$default(AppEventsLoggerImpl appEventsLoggerImpl, BigDecimal bigDecimal, Currency currency, Bundle bundle, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        try {
            appEventsLoggerImpl.logPurchase(bigDecimal, currency, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public static /* synthetic */ void logEvent$default(AppEventsLoggerImpl appEventsLoggerImpl, String str, Bundle bundle, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        try {
            appEventsLoggerImpl.logEvent(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsLoggerImpl.class);
        }
    }

    public final void logEventImplicitly(String str, Double d, Bundle bundle) {
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            appEventsLoggerImpl = this;
            try {
                logEvent$default(appEventsLoggerImpl, str, d, bundle, true, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                CrashShieldHandler.handleThrowable(th, appEventsLoggerImpl);
            }
        } catch (Throwable th2) {
            th = th2;
            appEventsLoggerImpl = this;
        }
    }

    public AppEventsLoggerImpl(Context context, String str, AccessToken accessToken) {
        this(Utility.getActivityName(context), str, accessToken);
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logPurchase$default(this, bigDecimal, currency, bundle, false, null, 16, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logPurchase(bigDecimal, currency, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEvent(String str, Bundle bundle) {
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            appEventsLoggerImpl = this;
            try {
                logEvent$default(appEventsLoggerImpl, str, null, bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                CrashShieldHandler.handleThrowable(th, appEventsLoggerImpl);
            }
        } catch (Throwable th2) {
            th = th2;
            appEventsLoggerImpl = this;
        }
    }

    public final void logEvent(String str, double d) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent(str, d, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void logEvent(String str, double d, Bundle bundle) {
        AppEventsLoggerImpl appEventsLoggerImpl;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            appEventsLoggerImpl = this;
            try {
                logEvent$default(appEventsLoggerImpl, str, Double.valueOf(d), bundle, false, ActivityLifecycleTracker.getCurrentSessionGuid(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                CrashShieldHandler.handleThrowable(th, appEventsLoggerImpl);
            }
        } catch (Throwable th2) {
            th = th2;
            appEventsLoggerImpl = this;
        }
    }

    public final void logEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            logEvent(str, (Bundle) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
