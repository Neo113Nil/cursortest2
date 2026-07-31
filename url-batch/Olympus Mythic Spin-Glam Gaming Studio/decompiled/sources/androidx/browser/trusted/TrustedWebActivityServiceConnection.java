package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;

/* loaded from: classes13.dex */
public final class TrustedWebActivityServiceConnection {
    private final ComponentName mComponentName;
    private final ITrustedWebActivityService mService;

    TrustedWebActivityServiceConnection(ITrustedWebActivityService iTrustedWebActivityService, ComponentName componentName) {
        this.mService = iTrustedWebActivityService;
        this.mComponentName = componentName;
    }

    static class NotifyNotificationArgs {
        public final String channelName;
        public final Notification notification;
        public final int platformId;
        public final String platformTag;

        NotifyNotificationArgs(String str, int i, Notification notification, String str2) {
            this.platformTag = str;
            this.platformId = i;
            this.notification = notification;
            this.channelName = str2;
        }

        public static NotifyNotificationArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new NotifyNotificationArgs(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    static class CancelNotificationArgs {
        public final int platformId;
        public final String platformTag;

        CancelNotificationArgs(String str, int i) {
            this.platformTag = str;
            this.platformId = i;
        }

        public static CancelNotificationArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new CancelNotificationArgs(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    static class ResultArgs {
        public final boolean success;

        ResultArgs(boolean z) {
            this.success = z;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.success);
            return bundle;
        }
    }

    static class ActiveNotificationsArgs {
        public final Parcelable[] notifications;

        ActiveNotificationsArgs(Parcelable[] parcelableArr) {
            this.notifications = parcelableArr;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.notifications);
            return bundle;
        }
    }

    static class NotificationsEnabledArgs {
        public final String channelName;

        NotificationsEnabledArgs(String str) {
            this.channelName = str;
        }

        public static NotificationsEnabledArgs fromBundle(Bundle bundle) {
            TrustedWebActivityServiceConnection.ensureBundleContains(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new NotificationsEnabledArgs(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    static void ensureBundleContains(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends ITrustedWebActivityCallback.Stub {
        final /* synthetic */ TrustedWebActivityCallback val$callback;

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public void onExtraCallback(String str, Bundle bundle) {
            this.val$callback.onExtraCallback(str, bundle);
        }
    }
}
