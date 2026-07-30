package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.AccessToken;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventsLogger {
    public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
    public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
    public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = AppEventsLogger.class.getCanonicalName();
    private final AppEventsLoggerImpl loggerImpl;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum ProductAvailability {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum ProductCondition {
        NEW,
        REFURBISHED,
        USED
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.loggerImpl = new AppEventsLoggerImpl(context, str, accessToken);
    }

    public static final void activateApp(Application application) {
        Companion.activateApp(application);
    }

    public static final void augmentWebView(WebView webView, Context context) {
        Companion.augmentWebView(webView, context);
    }

    public static final void clearUserData() {
        Companion.clearUserData();
    }

    public static final void clearUserID() {
        Companion.clearUserID();
    }

    public static final String getAnonymousAppDeviceGUID(Context context) {
        return Companion.getAnonymousAppDeviceGUID(context);
    }

    public static final FlushBehavior getFlushBehavior() {
        return Companion.getFlushBehavior();
    }

    public static final String getUserData() {
        return Companion.getUserData();
    }

    public static final String getUserID() {
        return Companion.getUserID();
    }

    public static final void initializeLib(Context context, String str) {
        Companion.initializeLib(context, str);
    }

    public static final AppEventsLogger newLogger(Context context) {
        return Companion.newLogger(context);
    }

    public static final void onContextStop() {
        Companion.onContextStop();
    }

    public static final void setFlushBehavior(FlushBehavior flushBehavior) {
        Companion.setFlushBehavior(flushBehavior);
    }

    public static final void setInstallReferrer(String str) {
        Companion.setInstallReferrer(str);
    }

    public static final void setPushNotificationsRegistrationId(String str) {
        Companion.setPushNotificationsRegistrationId(str);
    }

    public static final void setUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Companion.setUserData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public static final void setUserID(String str) {
        Companion.setUserID(str);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final String getApplicationId() {
        return this.loggerImpl.getApplicationId();
    }

    public final boolean isValidForAccessToken(AccessToken accessToken) {
        accessToken.getClass();
        return this.loggerImpl.isValidForAccessToken(accessToken);
    }

    public final void logEvent(String str) {
        this.loggerImpl.logEvent(str);
    }

    public final void logProductItem(String str, ProductAvailability productAvailability, ProductCondition productCondition, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        this.loggerImpl.logProductItem(str, productAvailability, productCondition, str2, str3, str4, str5, bigDecimal, currency, str6, str7, str8, bundle);
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency) {
        this.loggerImpl.logPurchase(bigDecimal, currency);
    }

    public final void logPushNotificationOpen(Bundle bundle) {
        bundle.getClass();
        this.loggerImpl.logPushNotificationOpen(bundle, null);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void activateApp(Application application) {
            application.getClass();
            AppEventsLoggerImpl.Companion.activateApp(application, null);
        }

        public final void augmentWebView(WebView webView, Context context) {
            webView.getClass();
            AppEventsLoggerImpl.Companion.augmentWebView(webView, context);
        }

        public final void clearUserData() {
            UserDataStore.clear();
        }

        public final void clearUserID() {
            AnalyticsUserIDStore.setUserID(null);
        }

        public final String getAnonymousAppDeviceGUID(Context context) {
            context.getClass();
            return AppEventsLoggerImpl.Companion.getAnonymousAppDeviceGUID(context);
        }

        public final FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.Companion.getFlushBehavior();
        }

        public final String getUserData() {
            return UserDataStore.getHashedUserData$facebook_core_release();
        }

        public final String getUserID() {
            return AnalyticsUserIDStore.getUserID();
        }

        public final void initializeLib(Context context, String str) {
            context.getClass();
            AppEventsLoggerImpl.Companion.initializeLib(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AppEventsLogger newLogger(Context context) {
            context.getClass();
            return new AppEventsLogger(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final void onContextStop() {
            AppEventsLoggerImpl.Companion.onContextStop();
        }

        public final void setFlushBehavior(FlushBehavior flushBehavior) {
            flushBehavior.getClass();
            AppEventsLoggerImpl.Companion.setFlushBehavior(flushBehavior);
        }

        public final void setInstallReferrer(String str) {
            AppEventsLoggerImpl.Companion.setInstallReferrer(str);
        }

        public final void setPushNotificationsRegistrationId(String str) {
            AppEventsLoggerImpl.Companion.setPushNotificationsRegistrationId(str);
        }

        public final void setUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            UserDataStore.setUserDataAndHash$default(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, null, 1024, null);
        }

        public final void setUserID(String str) {
            AnalyticsUserIDStore.setUserID(str);
        }

        private Companion() {
        }

        public final void activateApp(Application application, String str) {
            application.getClass();
            AppEventsLoggerImpl.Companion.activateApp(application, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AppEventsLogger newLogger(Context context, AccessToken accessToken) {
            context.getClass();
            return new AppEventsLogger(context, null, accessToken, 0 == true ? 1 : 0);
        }

        public final AppEventsLogger newLogger(Context context, String str, AccessToken accessToken) {
            context.getClass();
            return new AppEventsLogger(context, str, accessToken, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AppEventsLogger newLogger(Context context, String str) {
            context.getClass();
            return new AppEventsLogger(context, str, null, 0 == true ? 1 : 0);
        }

        public final void setUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            UserDataStore.setUserDataAndHash(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        }
    }

    public static final void activateApp(Application application, String str) {
        Companion.activateApp(application, str);
    }

    public final void logEvent(String str, double d) {
        this.loggerImpl.logEvent(str, d);
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        this.loggerImpl.logPurchase(bigDecimal, currency, bundle);
    }

    public static final AppEventsLogger newLogger(Context context, AccessToken accessToken) {
        return Companion.newLogger(context, accessToken);
    }

    public final void logEvent(String str, Bundle bundle) {
        this.loggerImpl.logEvent(str, bundle);
    }

    public static final AppEventsLogger newLogger(Context context, String str) {
        return Companion.newLogger(context, str);
    }

    public final void logEvent(String str, double d, Bundle bundle) {
        this.loggerImpl.logEvent(str, d, bundle);
    }

    public static final AppEventsLogger newLogger(Context context, String str, AccessToken accessToken) {
        return Companion.newLogger(context, str, accessToken);
    }

    public final void logPushNotificationOpen(Bundle bundle, String str) {
        bundle.getClass();
        this.loggerImpl.logPushNotificationOpen(bundle, str);
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    public static final void setUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Companion.setUserData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }
}
