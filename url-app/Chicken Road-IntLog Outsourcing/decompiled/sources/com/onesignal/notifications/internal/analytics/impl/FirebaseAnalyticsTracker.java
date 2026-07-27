package com.onesignal.notifications.internal.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.analytics.IAnalyticsTracker;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class FirebaseAnalyticsTracker implements IAnalyticsTracker {
    public static final Companion Companion = new Companion(null);
    private static final String EVENT_NOTIFICATION_INFLUENCE_OPEN = "os_notification_influence_open";
    private static final String EVENT_NOTIFICATION_OPENED = "os_notification_opened";
    private static final String EVENT_NOTIFICATION_RECEIVED = "os_notification_received";
    private static Class<?> firebaseAnalyticsClass;
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final ITime _time;
    private AtomicLong lastOpenedTime;
    private String lastReceivedNotificationCampaign;
    private String lastReceivedNotificationId;
    private AtomicLong lastReceivedTime;
    private Object mFirebaseAnalyticsInstance;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getInstanceMethod(Class<?> cls) {
            try {
                i.b(cls);
                return cls.getMethod("getInstance", Context.class);
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getTrackMethod(Class<?> cls) {
            try {
                i.b(cls);
                return cls.getMethod("logEvent", String.class, Bundle.class);
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
                return null;
            }
        }

        public final boolean canTrack() {
            try {
                FirebaseAnalyticsTracker.firebaseAnalyticsClass = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    public FirebaseAnalyticsTracker(IApplicationService _applicationService, ConfigModelStore _configModelStore, ITime _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_configModelStore, "_configModelStore");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._time = _time;
    }

    private final Object getFirebaseAnalyticsInstance() {
        if (this.mFirebaseAnalyticsInstance == null) {
            Method instanceMethod = Companion.getInstanceMethod(firebaseAnalyticsClass);
            try {
                i.b(instanceMethod);
                this.mFirebaseAnalyticsInstance = instanceMethod.invoke(null, this._applicationService.getAppContext());
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.mFirebaseAnalyticsInstance;
    }

    private final boolean isEnabled() {
        return this._configModelStore.getModel().getFirebaseAnalytics();
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackInfluenceOpenEvent() {
        if (!isEnabled() || this.lastReceivedTime == null || this.lastReceivedNotificationId == null) {
            return;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        AtomicLong atomicLong = this.lastReceivedTime;
        i.b(atomicLong);
        if (currentTimeMillis - atomicLong.get() > 120000) {
            return;
        }
        AtomicLong atomicLong2 = this.lastOpenedTime;
        if (atomicLong2 != null) {
            i.b(atomicLong2);
            if (currentTimeMillis - atomicLong2.get() < 30000) {
                return;
            }
        }
        try {
            Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
            Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
            Bundle bundle = new Bundle();
            bundle.putString(AdRevenueConstants.SOURCE_KEY, "OneSignal");
            bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
            String str = this.lastReceivedNotificationId;
            i.b(str);
            bundle.putString("notification_id", str);
            String str2 = this.lastReceivedNotificationCampaign;
            i.b(str2);
            bundle.putString("campaign", str2);
            i.b(trackMethod);
            trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_INFLUENCE_OPEN, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackOpenedEvent(String notificationId, String campaign) {
        i.e(notificationId, "notificationId");
        i.e(campaign, "campaign");
        if (isEnabled()) {
            if (this.lastOpenedTime == null) {
                this.lastOpenedTime = new AtomicLong();
            }
            AtomicLong atomicLong = this.lastOpenedTime;
            i.b(atomicLong);
            atomicLong.set(this._time.getCurrentTimeMillis());
            try {
                Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
                Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString(AdRevenueConstants.SOURCE_KEY, "OneSignal");
                bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
                bundle.putString("notification_id", notificationId);
                bundle.putString("campaign", campaign);
                i.b(trackMethod);
                trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_OPENED, bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackReceivedEvent(String notificationId, String campaign) {
        i.e(notificationId, "notificationId");
        i.e(campaign, "campaign");
        if (isEnabled()) {
            try {
                Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
                Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString(AdRevenueConstants.SOURCE_KEY, "OneSignal");
                bundle.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
                bundle.putString("notification_id", notificationId);
                bundle.putString("campaign", campaign);
                i.b(trackMethod);
                trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_RECEIVED, bundle);
                if (this.lastReceivedTime == null) {
                    this.lastReceivedTime = new AtomicLong();
                }
                AtomicLong atomicLong = this.lastReceivedTime;
                i.b(atomicLong);
                atomicLong.set(this._time.getCurrentTimeMillis());
                this.lastReceivedNotificationId = notificationId;
                this.lastReceivedNotificationCampaign = campaign;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
