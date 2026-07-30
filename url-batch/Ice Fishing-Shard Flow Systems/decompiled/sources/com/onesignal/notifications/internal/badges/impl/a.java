package com.onesignal.notifications.internal.badges.impl;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.debug.internal.logging.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import l3.InterfaceC0661a;
import m3.c;
import s3.e;
import t3.InterfaceC0926a;
import v2.f;
import x3.C1005a;
import y2.AbstractC1025b;
import y2.InterfaceC1024a;
import y2.InterfaceC1027d;

/* loaded from: classes.dex */
public final class a implements InterfaceC0661a {
    private final f _applicationService;
    private final InterfaceC1027d _databaseProvider;
    private final InterfaceC0926a _queryHelper;
    private int badgesEnabled;

    /* renamed from: com.onesignal.notifications.internal.badges.impl.a$a, reason: collision with other inner class name */
    public static final class C0058a extends p implements Function1 {
        final /* synthetic */ C $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0058a(C c7) {
            super(1);
            this.$notificationCount = c7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1024a) obj);
            return Unit.f6114a;
        }

        public final void invoke(InterfaceC1024a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$notificationCount.f6151d = it.getCount();
        }
    }

    public a(f _applicationService, InterfaceC0926a _queryHelper, InterfaceC1027d _databaseProvider) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_queryHelper, "_queryHelper");
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
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
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            this.badgesEnabled = 0;
            b.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e7);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && e.areNotificationsEnabled$default(e.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        C c7 = new C();
        AbstractC1025b.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(C1005a.INSTANCE.getMaxNumberOfNotifications()), new C0058a(c7), 122, null);
        updateCount(c7.f6151d);
    }

    private final void updateStandard() {
        int i2 = 0;
        for (StatusBarNotification statusBarNotification : e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                i2++;
            }
        }
        updateCount(i2);
    }

    @Override // l3.InterfaceC0661a
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // l3.InterfaceC0661a
    public void updateCount(int i2) {
        if (areBadgeSettingsEnabled()) {
            try {
                c.applyCountOrThrow(this._applicationService.getAppContext(), i2);
            } catch (m3.b unused) {
            }
        }
    }
}
