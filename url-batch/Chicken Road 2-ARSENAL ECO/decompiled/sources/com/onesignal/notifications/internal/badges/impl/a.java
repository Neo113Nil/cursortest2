package com.onesignal.notifications.internal.badges.impl;

import K2.c;
import Q2.e;
import T1.f;
import W1.d;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.debug.internal.logging.b;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class a implements J2.a {
    private final f _applicationService;
    private final d _databaseProvider;
    private final R2.a _queryHelper;
    private int badgesEnabled;

    /* renamed from: com.onesignal.notifications.internal.badges.impl.a$a, reason: collision with other inner class name */
    public static final class C0058a extends j implements InterfaceC0743l {
        final /* synthetic */ r $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0058a(r rVar) {
            super(1);
            this.$notificationCount = rVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((W1.a) obj);
            return v.f5219a;
        }

        public final void invoke(W1.a it) {
            i.e(it, "it");
            this.$notificationCount.f5232f = it.getCount();
        }
    }

    public a(f _applicationService, R2.a _queryHelper, d _databaseProvider) {
        i.e(_applicationService, "_applicationService");
        i.e(_queryHelper, "_queryHelper");
        i.e(_databaseProvider, "_databaseProvider");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i7 = this.badgesEnabled;
        if (i7 != -1) {
            return i7 == 1;
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
        } catch (PackageManager.NameNotFoundException e4) {
            this.badgesEnabled = 0;
            b.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e4);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && e.areNotificationsEnabled$default(e.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        r rVar = new r();
        W1.b.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(V2.a.INSTANCE.getMaxNumberOfNotifications()), new C0058a(rVar), 122, null);
        updateCount(rVar.f5232f);
    }

    private final void updateStandard() {
        int i7 = 0;
        for (StatusBarNotification statusBarNotification : e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                i7++;
            }
        }
        updateCount(i7);
    }

    @Override // J2.a
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // J2.a
    public void updateCount(int i7) {
        if (areBadgeSettingsEnabled()) {
            try {
                c.applyCountOrThrow(this._applicationService.getAppContext(), i7);
            } catch (K2.b unused) {
            }
        }
    }
}
