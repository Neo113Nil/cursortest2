package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import com.facebook.FacebookActivity;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.iap.InAppPurchaseLoggerManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.ck0;
import defpackage.dk0;
import defpackage.ey;
import defpackage.fa0;
import defpackage.lh;
import defpackage.oi;
import defpackage.q1;
import defpackage.rj2;
import defpackage.tp2;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FacebookSdk {
    public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    public static final String APPLICATION_INTENT_URI_PACKAGE_TARGET = "com.facebook.sdk.IntentUriPackageTarget";
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
    public static final String APPLICATION_REDIRECT_URI = "com.facebook.sdk.RedirectURI";
    public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";
    public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";
    public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";
    public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
    public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
    public static final String CLOUDBRIDGE_SAVED_CREDENTIALS = "com.facebook.sdk.CloudBridgeSavedCredentials";
    public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";
    public static final String DATA_PROCESSING_OPTIONS = "data_processing_options";
    public static final String DATA_PROCESSING_OPTIONS_COUNTRY = "data_processing_options_country";
    public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";
    public static final String DATA_PROCESSING_OPTIONS_STATE = "data_processing_options_state";
    public static final String FB_GG = "fb.gg";
    public static final String GAMING = "gaming";
    public static final String INSTAGRAM = "instagram";
    private static final int MAX_REQUEST_CODE_RANGE = 100;
    public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
    private static volatile String appClientToken;
    private static Context applicationContext;
    private static volatile String applicationId;
    private static volatile String applicationName;
    public static boolean bypassAppSwitch;
    private static LockOnGetVariable<File> cacheDir;
    private static volatile Boolean codelessDebugLogEnabled;
    private static Executor executor;
    public static boolean hasCustomTabsPrefetching;
    public static boolean ignoreAppSwitchToLoggedOut;
    private static String intentUriPackageTarget;
    private static volatile boolean isDebugEnabledField;
    private static boolean isFullyInitialized;
    private static boolean isLegacyTokenUpgradeSupported;
    private static String redirectURI;
    public static final FacebookSdk INSTANCE = new FacebookSdk();
    private static final String TAG = FacebookSdk.class.getCanonicalName();
    private static final HashSet<LoggingBehavior> loggingBehaviors = rj2.c(LoggingBehavior.DEVELOPER_ERRORS);
    private static AtomicLong onProgressThreshold = new AtomicLong(65536);
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static String graphApiVersion = ServerProtocol.getDefaultAPIVersion();
    private static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);
    public static final String INSTAGRAM_COM = "instagram.com";
    private static volatile String instagramDomain = INSTAGRAM_COM;
    public static final String FACEBOOK_COM = "facebook.com";
    private static volatile String facebookDomain = FACEBOOK_COM;
    private static GraphRequestCreator graphRequestCreator = new ey(20);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface GraphRequestCreator {
        GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface InitializeCallback {
        void onInitialized();
    }

    private FacebookSdk() {
    }

    public static final void addLoggingBehavior(LoggingBehavior loggingBehavior) {
        loggingBehavior.getClass();
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(loggingBehavior);
            INSTANCE.updateGraphDebugBehavior();
            Unit unit = Unit.a;
        }
    }

    public static final void clearLoggingBehaviors() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
            Unit unit = Unit.a;
        }
    }

    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    public static final Boolean getAddToMessagingCustomerBaseForWhatsApp() {
        return UserSettingsManager.getAddToMessagingCustomerBaseForWhatsApp();
    }

    public static final boolean getAdvertiserIDCollectionEnabled() {
        return UserSettingsManager.getAdvertiserIDCollectionEnabled();
    }

    public static final Context getApplicationContext() {
        Validate.sdkInitialized();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.f("applicationContext");
        throw null;
    }

    public static final String getApplicationId() {
        Validate.sdkInitialized();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        ey.i("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        return null;
    }

    public static final String getApplicationName() {
        Validate.sdkInitialized();
        return applicationName;
    }

    public static final String getApplicationSignature(Context context) {
        PackageManager packageManager;
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return null;
        }
        try {
            Validate.sdkInitialized();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(packageInfo.signatures[0].toByteArray());
                    return Base64.encodeToString(messageDigest.digest(), 9);
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
            return null;
        }
    }

    public static final boolean getAutoInitEnabled() {
        return UserSettingsManager.getAutoInitEnabled();
    }

    public static final boolean getAutoLogAppEventsEnabled() {
        return UserSettingsManager.getAutoLogAppEventsEnabled();
    }

    public static final File getCacheDir() {
        Validate.sdkInitialized();
        LockOnGetVariable<File> lockOnGetVariable = cacheDir;
        if (lockOnGetVariable != null) {
            return lockOnGetVariable.getValue();
        }
        Intrinsics.f("cacheDir");
        throw null;
    }

    public static final int getCallbackRequestCodeOffset() {
        Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    public static final String getClientToken() {
        Validate.sdkInitialized();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        ey.i("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        return null;
    }

    public static final boolean getCodelessDebugLogEnabled() {
        Validate.sdkInitialized();
        Boolean bool = codelessDebugLogEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean getCodelessSetupEnabled() {
        return UserSettingsManager.getCodelessSetupEnabled();
    }

    public static final Executor getExecutor() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            lh.g("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String getFacebookDomain() {
        return facebookDomain;
    }

    public static final String getFacebookGamingDomain() {
        return "fb.gg";
    }

    public static final String getGraphApiVersion() {
        Utility.logd(TAG, String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1)));
        return graphApiVersion;
    }

    public static final String getGraphDomain() {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        return Utility.getGraphDomainFromTokenDomain(currentAccessToken != null ? currentAccessToken.getGraphDomain() : null);
    }

    public static final String getInstagramDomain() {
        return instagramDomain;
    }

    public static final String getIntentUriPackageTarget() {
        Validate.sdkInitialized();
        String str = intentUriPackageTarget;
        return str == null ? com.google.firebase.encoders.json.BuildConfig.FLAVOR : str;
    }

    public static final boolean getLimitEventAndDataUsage(Context context) {
        context.getClass();
        Validate.sdkInitialized();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    public static final Set<LoggingBehavior> getLoggingBehaviors() {
        Set<LoggingBehavior> unmodifiableSet;
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            unmodifiableSet.getClass();
        }
        return unmodifiableSet;
    }

    public static final boolean getMonitorEnabled() {
        return UserSettingsManager.getMonitorEnabled();
    }

    public static final long getOnProgressThreshold() {
        Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    public static final String getRedirectURI() {
        Validate.sdkInitialized();
        String str = redirectURI;
        return str == null ? com.google.firebase.encoders.json.BuildConfig.FLAVOR : str;
    }

    public static final String getSdkVersion() {
        return FacebookSdkVersion.BUILD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GraphRequest graphRequestCreator$lambda$0(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return GraphRequest.Companion.newPostRequest(accessToken, str, jSONObject, callback);
    }

    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    public static final boolean isFacebookRequestCode(int i) {
        int i2 = callbackRequestCodeOffset;
        return i >= i2 && i < i2 + MAX_REQUEST_CODE_RANGE;
    }

    public static final synchronized boolean isFullyInitialized() {
        boolean z;
        synchronized (FacebookSdk.class) {
            z = isFullyInitialized;
        }
        return z;
    }

    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    public static final boolean isLoggingBehaviorEnabled(LoggingBehavior loggingBehavior) {
        boolean z;
        loggingBehavior.getClass();
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            if (isDebugEnabled()) {
                z = hashSet.contains(loggingBehavior);
            }
        }
        return z;
    }

    public static final void loadDefaultsFromMetadata$facebook_core_release(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (tp2.o(lowerCase, "fb", false)) {
                        applicationId = str.substring(2);
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    ey.i("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                    return;
                }
            }
            redirectURI = applicationInfo.metaData.getString(APPLICATION_REDIRECT_URI);
            intentUriPackageTarget = applicationInfo.metaData.getString(APPLICATION_INTENT_URI_PACKAGE_TARGET);
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
            }
            if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void publishInstallAndWaitForResponse(Context context, String str) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                String str2 = str + "ping";
                long j = sharedPreferences.getLong(str2, 0L);
                try {
                    JSONObject jSONObjectForGraphAPICall = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiers, AppEventsLogger.Companion.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context);
                    String installReferrer = AppEventsLoggerImpl.Companion.getInstallReferrer();
                    if (installReferrer != null) {
                        jSONObjectForGraphAPICall.put("install_referrer", installReferrer);
                    }
                    GraphRequest createPostRequest = graphRequestCreator.createPostRequest(null, String.format(PUBLISH_ACTIVITY_PATH, Arrays.copyOf(new Object[]{str}, 1)), jSONObjectForGraphAPICall, null);
                    if (j == 0 && createPostRequest.executeAndWait().getError() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(str2, System.currentTimeMillis());
                        edit.apply();
                        Logger.Companion companion = Logger.Companion;
                        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                        String str3 = TAG;
                        str3.getClass();
                        companion.log(loggingBehavior, str3, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e) {
                    throw new FacebookException("An error occurred while publishing install.", e);
                }
            } catch (Exception e2) {
                Utility.logd("Facebook-publish", e2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void publishInstallAsync(Context context, String str) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            context.getClass();
            str.getClass();
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                return;
            }
            if (!FetchedAppGateKeepersManager.getGateKeeperForKey(AppEventsLoggerImpl.APP_EVENTS_KILLSWITCH, getApplicationId(), false)) {
                getExecutor().execute(new q1(8, applicationContext2, str));
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.OnDeviceEventProcessing) && OnDeviceProcessingManager.isOnDeviceProcessingEnabled()) {
                OnDeviceProcessingManager.sendInstallEventAsync(str, ATTRIBUTION_PREFERENCES);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void publishInstallAsync$lambda$15(Context context, String str) {
        context.getClass();
        str.getClass();
        INSTANCE.publishInstallAndWaitForResponse(context, str);
    }

    public static final void removeLoggingBehavior(LoggingBehavior loggingBehavior) {
        loggingBehavior.getClass();
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(loggingBehavior);
        }
    }

    @fa0
    public static final synchronized void sdkInitialize(Context context, InitializeCallback initializeCallback) {
        synchronized (FacebookSdk.class) {
            context.getClass();
            if (sdkInitialized.get()) {
                if (initializeCallback != null) {
                    initializeCallback.onInitialized();
                }
                return;
            }
            int i = 0;
            try {
                FacebookActivity.Companion companion = FacebookActivity.Companion;
                Validate.hasFacebookActivity(context, false);
            } catch (ClassNotFoundException unused) {
            }
            Validate.hasInternetPermissions(context, false);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            applicationContext = applicationContext2;
            AppEventsLogger.Companion.getAnonymousAppDeviceGUID(context);
            Context context2 = applicationContext;
            if (context2 == null) {
                Intrinsics.f("applicationContext");
                throw null;
            }
            loadDefaultsFromMetadata$facebook_core_release(context2);
            String str = applicationId;
            if (str == null || str.length() == 0) {
                throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            String str2 = appClientToken;
            if (str2 == null || str2.length() == 0) {
                throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            sdkInitialized.set(true);
            if (getAutoInitEnabled()) {
                fullyInitialize();
            }
            Context context3 = applicationContext;
            if (context3 == null) {
                Intrinsics.f("applicationContext");
                throw null;
            }
            if ((context3 instanceof Application) && UserSettingsManager.getAutoLogAppEventsEnabled()) {
                Context context4 = applicationContext;
                if (context4 == null) {
                    Intrinsics.f("applicationContext");
                    throw null;
                }
                ActivityLifecycleTracker.startTracking((Application) context4, applicationId);
            } else {
                InAppPurchaseLoggerManager.updateLatestPossiblePurchaseTime();
            }
            AppLinkManager companion2 = AppLinkManager.Companion.getInstance();
            if (companion2 != null) {
                Context context5 = applicationContext;
                if (context5 == null) {
                    Intrinsics.f("applicationContext");
                    throw null;
                }
                companion2.setupLifecycleListener((Application) context5);
            }
            FetchedAppSettingsManager.loadAppSettingsAsync();
            NativeProtocol.updateAllAvailableProtocolVersionsAsync();
            BoltsMeasurementEventListener.Companion companion3 = BoltsMeasurementEventListener.Companion;
            Context context6 = applicationContext;
            if (context6 == null) {
                Intrinsics.f("applicationContext");
                throw null;
            }
            companion3.getInstance(context6);
            cacheDir = new LockOnGetVariable<>((Callable) new ck0());
            FeatureManager.checkFeature(FeatureManager.Feature.Instrument, new ey(21));
            FeatureManager.checkFeature(FeatureManager.Feature.AppEvents, new ey(22));
            FeatureManager.checkFeature(FeatureManager.Feature.ChromeCustomTabsPrefetching, new ey(23));
            FeatureManager.checkFeature(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new ey(24));
            FeatureManager.checkFeature(FeatureManager.Feature.BypassAppSwitch, new ey(25));
            getExecutor().execute(new FutureTask(new dk0(i, initializeCallback)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File sdkInitialize$lambda$3() {
        Context context = applicationContext;
        if (context != null) {
            return context.getCacheDir();
        }
        Intrinsics.f("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$4(boolean z) {
        if (z) {
            InstrumentManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$5(boolean z) {
        if (z) {
            AppEventsManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$6(boolean z) {
        if (z) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$7(boolean z) {
        if (z) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sdkInitialize$lambda$8(boolean z) {
        if (z) {
            bypassAppSwitch = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void sdkInitialize$lambda$9(InitializeCallback initializeCallback) {
        AccessTokenManager.Companion.getInstance().loadCurrentAccessToken();
        ProfileManager.Companion.getInstance().loadCurrentProfile();
        if (AccessToken.Companion.isCurrentAccessTokenActive()) {
            Profile.Companion companion = Profile.Companion;
            if (companion.getCurrentProfile() == null) {
                companion.fetchProfileForCurrentAccessToken();
            }
        }
        if (initializeCallback != null) {
            initializeCallback.onInitialized();
        }
        AppEventsLogger.Companion companion2 = AppEventsLogger.Companion;
        companion2.initializeLib(getApplicationContext(), applicationId);
        UserSettingsManager.logIfAutoAppLinkEnabled();
        Context applicationContext2 = getApplicationContext().getApplicationContext();
        applicationContext2.getClass();
        companion2.newLogger(applicationContext2).flush();
        return null;
    }

    public static final void setAddToMessagingCustomerBaseForWhatsApp(Boolean bool) {
        UserSettingsManager.setAddToMessagingCustomerBaseForWhatsApp(bool);
    }

    public static final void setAdvertiserIDCollectionEnabled(boolean z) {
        UserSettingsManager.setAdvertiserIDCollectionEnabled(z);
    }

    public static final void setApplicationId(String str) {
        str.getClass();
        Validate.notEmpty(str, "applicationId");
        applicationId = str;
    }

    public static final void setApplicationName(String str) {
        applicationName = str;
    }

    public static final void setAutoInitEnabled(boolean z) {
        UserSettingsManager.setAutoInitEnabled(z);
        if (z) {
            fullyInitialize();
        }
    }

    public static final void setAutoLogAppEventsEnabled(boolean z) {
        UserSettingsManager.setAutoLogAppEventsEnabled(z);
        if (z) {
            Context applicationContext2 = getApplicationContext();
            applicationContext2.getClass();
            ActivityLifecycleTracker.startTracking((Application) applicationContext2, getApplicationId());
        }
    }

    public static final void setCacheDir(File file) {
        file.getClass();
        cacheDir = new LockOnGetVariable<>(file);
    }

    public static final void setClientToken(String str) {
        appClientToken = str;
    }

    public static final void setCodelessDebugLogEnabled(boolean z) {
        codelessDebugLogEnabled = Boolean.valueOf(z);
    }

    public static final void setDataProcessingOptions(String[] strArr, int i, int i2) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        if (strArr == null) {
            try {
                strArr = new String[0];
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DATA_PROCESSING_OPTIONS, new JSONArray((Collection) oi.y(strArr)));
            jSONObject.put(DATA_PROCESSING_OPTIONS_COUNTRY, i);
            jSONObject.put(DATA_PROCESSING_OPTIONS_STATE, i2);
            Context context = applicationContext;
            if (context != null) {
                context.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSING_OPTIONS, jSONObject.toString()).apply();
            } else {
                Intrinsics.f("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    public static final void setExecutor(Executor executor2) {
        executor2.getClass();
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
            Unit unit = Unit.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void setFacebookDomain(String str) {
        str.getClass();
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = str;
    }

    public static final void setGraphApiVersion(String str) {
        str.getClass();
        Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (Utility.isNullOrEmpty(str) || Intrinsics.b(graphApiVersion, str)) {
            return;
        }
        graphApiVersion = str;
    }

    public static final void setGraphRequestCreator$facebook_core_release(GraphRequestCreator graphRequestCreator2) {
        graphRequestCreator2.getClass();
        graphRequestCreator = graphRequestCreator2;
    }

    public static final void setIsDebugEnabled(boolean z) {
        isDebugEnabledField = z;
    }

    public static final void setLegacyTokenUpgradeSupported(boolean z) {
        isLegacyTokenUpgradeSupported = z;
    }

    public static final void setLimitEventAndDataUsage(Context context, boolean z) {
        context.getClass();
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", z).apply();
    }

    public static final void setMonitorEnabled(boolean z) {
        UserSettingsManager.setMonitorEnabled(z);
    }

    public static final void setOnProgressThreshold(long j) {
        onProgressThreshold.set(j);
    }

    private final void updateGraphDebugBehavior() {
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        if (hashSet.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
            if (hashSet.contains(loggingBehavior)) {
                return;
            }
            hashSet.add(loggingBehavior);
        }
    }

    public static final void setDataProcessingOptions(String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(FacebookSdk.class)) {
            return;
        }
        try {
            setDataProcessingOptions(strArr, 0, 0);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookSdk.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        com.facebook.FacebookSdk.callbackRequestCodeOffset = r3;
        sdkInitialize(r2, r4);
     */
    @fa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void sdkInitialize(Context context, int i, InitializeCallback initializeCallback) {
        synchronized (FacebookSdk.class) {
            try {
                context.getClass();
                if (sdkInitialized.get() && i != callbackRequestCodeOffset) {
                    throw new FacebookException(CALLBACK_OFFSET_CHANGED_AFTER_INIT);
                }
                throw new FacebookException(CALLBACK_OFFSET_NEGATIVE);
            } finally {
            }
        }
    }

    @fa0
    public static final synchronized void sdkInitialize(Context context) {
        synchronized (FacebookSdk.class) {
            context.getClass();
            sdkInitialize(context, (InitializeCallback) null);
        }
    }

    @fa0
    public static final synchronized void sdkInitialize(Context context, int i) {
        synchronized (FacebookSdk.class) {
            context.getClass();
            sdkInitialize(context, i, null);
        }
    }
}
