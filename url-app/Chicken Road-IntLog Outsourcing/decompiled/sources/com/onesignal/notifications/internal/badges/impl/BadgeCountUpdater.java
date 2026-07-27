package com.onesignal.notifications.internal.badges.impl;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.ShortcutBadgeException;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.ShortcutBadger;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class BadgeCountUpdater implements IBadgeCountUpdater {
    private final IApplicationService _applicationService;
    private final IDatabaseProvider _databaseProvider;
    private final INotificationQueryHelper _queryHelper;
    private int badgesEnabled;

    public BadgeCountUpdater(IApplicationService _applicationService, INotificationQueryHelper _queryHelper, IDatabaseProvider _databaseProvider) {
        i.e(_applicationService, "_applicationService");
        i.e(_queryHelper, "_queryHelper");
        i.e(_databaseProvider, "_databaseProvider");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i2 = this.badgesEnabled;
        if (i2 != -1) {
            return i2 == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), 128);
            i.d(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            this.badgesEnabled = 0;
            Logging.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e3);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        r rVar = new r();
        IDatabase.DefaultImpls.query$default(this._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications()), new BadgeCountUpdater$updateFallback$1(rVar), 122, null);
        updateCount(rVar.f10740a);
    }

    private final void updateStandard() {
        int i2 = 0;
        for (StatusBarNotification statusBarNotification : NotificationHelper.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!NotificationHelper.INSTANCE.isGroupSummary(statusBarNotification)) {
                i2++;
            }
        }
        updateCount(i2);
    }

    @Override // com.onesignal.notifications.internal.badges.IBadgeCountUpdater
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // com.onesignal.notifications.internal.badges.IBadgeCountUpdater
    public void updateCount(int i2) {
        if (areBadgeSettingsEnabled()) {
            try {
                ShortcutBadger.applyCountOrThrow(this._applicationService.getAppContext(), i2);
            } catch (ShortcutBadgeException unused) {
            }
        }
    }
}
