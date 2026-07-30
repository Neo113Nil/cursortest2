package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InternalAppEventsLogger {
    public static final Companion Companion = new Companion(null);
    private final AppEventsLoggerImpl loggerImpl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalAppEventsLogger(String str, String str2, AccessToken accessToken) {
        this(new AppEventsLoggerImpl(str, str2, accessToken));
        str.getClass();
    }

    public static final InternalAppEventsLogger createInstance(Context context) {
        return Companion.createInstance(context);
    }

    public static final Executor getAnalyticsExecutor() {
        return Companion.getAnalyticsExecutor();
    }

    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        return Companion.getFlushBehavior();
    }

    public static final String getPushNotificationsRegistrationId() {
        return Companion.getPushNotificationsRegistrationId();
    }

    public static /* synthetic */ void logEventImplicitly$default(InternalAppEventsLogger internalAppEventsLogger, String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i, Object obj) {
        if ((i & 16) != 0) {
            operationalData = null;
        }
        internalAppEventsLogger.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
    }

    public static /* synthetic */ void logPurchaseImplicitly$default(InternalAppEventsLogger internalAppEventsLogger, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i, Object obj) {
        if ((i & 8) != 0) {
            operationalData = null;
        }
        internalAppEventsLogger.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
    }

    public static final void setInternalUserData(Map<String, String> map) {
        Companion.setInternalUserData(map);
    }

    public static final void setUserData(Bundle bundle) {
        Companion.setUserData(bundle);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final void logChangedSettingsEvent(Bundle bundle) {
        bundle.getClass();
        if (((bundle.getInt("previous") & 2) != 0) || FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly("fb_sdk_settings_changed", null, bundle);
        }
    }

    public final void logEvent(String str, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(str, bundle);
        }
    }

    public final void logEventFromSE(String str, String str2) {
        this.loggerImpl.logEventFromSE(str, str2);
    }

    public final void logEventImplicitly(String str) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, null, null);
        }
    }

    public final void logPurchaseImplicitly(BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ InternalAppEventsLogger createInstance$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.createInstance(context, str);
        }

        public final InternalAppEventsLogger createInstance(String str, String str2, AccessToken accessToken) {
            str.getClass();
            return new InternalAppEventsLogger(str, str2, accessToken);
        }

        public final Executor getAnalyticsExecutor() {
            return AppEventsLoggerImpl.Companion.getAnalyticsExecutor();
        }

        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.Companion.getFlushBehavior();
        }

        public final String getPushNotificationsRegistrationId() {
            return AppEventsLoggerImpl.Companion.getPushNotificationsRegistrationId();
        }

        public final void setInternalUserData(Map<String, String> map) {
            map.getClass();
            UserDataStore.setInternalUd(map);
        }

        public final void setUserData(Bundle bundle) {
            UserDataStore.setUserDataAndHash(bundle);
        }

        private Companion() {
        }

        public final InternalAppEventsLogger createInstance(Context context, String str) {
            return new InternalAppEventsLogger(context, str);
        }

        public final InternalAppEventsLogger createInstance(Context context) {
            return createInstance$default(this, context, null, 2, null);
        }
    }

    public static final InternalAppEventsLogger createInstance(Context context, String str) {
        return Companion.createInstance(context, str);
    }

    public static final InternalAppEventsLogger createInstance(String str, String str2, AccessToken accessToken) {
        return Companion.createInstance(str, str2, accessToken);
    }

    public InternalAppEventsLogger(Context context) {
        this(new AppEventsLoggerImpl(context, (String) null, (AccessToken) null));
    }

    public final void logEvent(String str, double d, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(str, d, bundle);
        }
    }

    public InternalAppEventsLogger(Context context, String str) {
        this(new AppEventsLoggerImpl(context, str, (AccessToken) null));
    }

    public final void logEventImplicitly(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
        }
    }

    public InternalAppEventsLogger(AppEventsLoggerImpl appEventsLoggerImpl) {
        appEventsLoggerImpl.getClass();
        this.loggerImpl = appEventsLoggerImpl;
    }

    public final void logEventImplicitly(String str, Double d, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, d, bundle);
        }
    }

    public final void logEventImplicitly(String str, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, null, bundle);
        }
    }
}
