package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.browser.trusted.TrustedWebActivityServiceConnection;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class TrustedWebActivityService extends Service {
    private final ITrustedWebActivityService.Stub mBinder;
    private NotificationManager mNotificationManager;
    int mVerifiedUid;

    public abstract TokenStore getTokenStore();

    public Bundle onExtraCommand(String str, Bundle bundle, TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        return null;
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$1, reason: invalid class name */
    class AnonymousClass1 extends ITrustedWebActivityService.Stub {
        final /* synthetic */ TrustedWebActivityService this$0;

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle areNotificationsEnabled(Bundle bundle) {
            checkCaller();
            return new TrustedWebActivityServiceConnection.ResultArgs(this.this$0.onAreNotificationsEnabled(TrustedWebActivityServiceConnection.NotificationsEnabledArgs.fromBundle(bundle).channelName)).toBundle();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle notifyNotificationWithChannel(Bundle bundle) {
            checkCaller();
            TrustedWebActivityServiceConnection.NotifyNotificationArgs fromBundle = TrustedWebActivityServiceConnection.NotifyNotificationArgs.fromBundle(bundle);
            return new TrustedWebActivityServiceConnection.ResultArgs(this.this$0.onNotifyNotificationWithChannel(fromBundle.platformTag, fromBundle.platformId, fromBundle.notification, fromBundle.channelName)).toBundle();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(Bundle bundle) {
            checkCaller();
            TrustedWebActivityServiceConnection.CancelNotificationArgs fromBundle = TrustedWebActivityServiceConnection.CancelNotificationArgs.fromBundle(bundle);
            this.this$0.onCancelNotification(fromBundle.platformTag, fromBundle.platformId);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getActiveNotifications() {
            checkCaller();
            return new TrustedWebActivityServiceConnection.ActiveNotificationsArgs(this.this$0.onGetActiveNotifications()).toBundle();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() {
            checkCaller();
            return this.this$0.onGetSmallIconId();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getSmallIconBitmap() {
            checkCaller();
            return this.this$0.onGetSmallIconBitmap();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            checkCaller();
            return this.this$0.onExtraCommand(str, bundle, TrustedWebActivityCallbackRemote.fromBinder(iBinder));
        }

        private void checkCaller() {
            TrustedWebActivityService trustedWebActivityService = this.this$0;
            if (trustedWebActivityService.mVerifiedUid == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                int i = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                Token load = this.this$0.getTokenStore().load();
                PackageManager packageManager = this.this$0.getPackageManager();
                if (load != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (load.matches(packagesForUid[i], packageManager)) {
                            this.this$0.mVerifiedUid = Binder.getCallingUid();
                            break;
                        }
                        i++;
                    }
                }
            }
            if (this.this$0.mVerifiedUid != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
    }

    public boolean onAreNotificationsEnabled(String str) {
        ensureOnCreateCalled();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return NotificationApiHelperForO.isChannelEnabled(this.mNotificationManager, channelNameToId(str));
    }

    public boolean onNotifyNotificationWithChannel(String str, int i, Notification notification, String str2) {
        ensureOnCreateCalled();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String channelNameToId = channelNameToId(str2);
            notification = NotificationApiHelperForO.copyNotificationOntoChannel(this, this.mNotificationManager, notification, channelNameToId, str2);
            if (!NotificationApiHelperForO.isChannelEnabled(this.mNotificationManager, channelNameToId)) {
                return false;
            }
        }
        this.mNotificationManager.notify(str, i, notification);
        return true;
    }

    public void onCancelNotification(String str, int i) {
        ensureOnCreateCalled();
        this.mNotificationManager.cancel(str, i);
    }

    public Parcelable[] onGetActiveNotifications() {
        ensureOnCreateCalled();
        return NotificationApiHelperForM.getActiveNotifications(this.mNotificationManager);
    }

    public Bundle onGetSmallIconBitmap() {
        int onGetSmallIconId = onGetSmallIconId();
        Bundle bundle = new Bundle();
        if (onGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), onGetSmallIconId));
        return bundle;
    }

    public int onGetSmallIconId() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.mVerifiedUid = -1;
        return super.onUnbind(intent);
    }

    private static String channelNameToId(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void ensureOnCreateCalled() {
        if (this.mNotificationManager == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }
}
