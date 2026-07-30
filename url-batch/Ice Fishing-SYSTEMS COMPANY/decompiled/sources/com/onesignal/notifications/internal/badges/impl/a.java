package com.onesignal.notifications.internal.badges.impl;

import E7.l;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.debug.internal.logging.b;
import i5.InterfaceC4577a;
import j5.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import p5.e;
import q5.InterfaceC4929a;
import q7.v;
import t4.f;
import u5.C5113a;
import w4.AbstractC5171b;
import w4.InterfaceC5170a;
import w4.d;

/* loaded from: classes2.dex */
public final class a implements InterfaceC4577a {
    private final f _applicationService;
    private final d _databaseProvider;
    private final InterfaceC4929a _queryHelper;
    private int badgesEnabled;

    /* renamed from: com.onesignal.notifications.internal.badges.impl.a$a, reason: collision with other inner class name */
    public static final class C0227a extends i implements l {
        final /* synthetic */ q $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0227a(q qVar) {
            super(1);
            this.$notificationCount = qVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC5170a) obj);
            return v.f40183a;
        }

        public final void invoke(InterfaceC5170a it) {
            h.e(it, "it");
            this.$notificationCount.f38860n = it.getCount();
        }
    }

    public a(f _applicationService, InterfaceC4929a _queryHelper, d _databaseProvider) {
        h.e(_applicationService, "_applicationService");
        h.e(_queryHelper, "_queryHelper");
        h.e(_databaseProvider, "_databaseProvider");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i = this.badgesEnabled;
        if (i != -1) {
            return i == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), 128);
            h.d(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e6) {
            this.badgesEnabled = 0;
            b.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e6);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && e.areNotificationsEnabled$default(e.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        q qVar = new q();
        AbstractC5171b.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(C5113a.INSTANCE.getMaxNumberOfNotifications()), new C0227a(qVar), 122, null);
        updateCount(qVar.f38860n);
    }

    private final void updateStandard() {
        int i = 0;
        for (StatusBarNotification statusBarNotification : e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                i++;
            }
        }
        updateCount(i);
    }

    @Override // i5.InterfaceC4577a
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // i5.InterfaceC4577a
    public void updateCount(int i) {
        if (areBadgeSettingsEnabled()) {
            try {
                c.applyCountOrThrow(this._applicationService.getAppContext(), i);
            } catch (j5.b unused) {
            }
        }
    }
}
