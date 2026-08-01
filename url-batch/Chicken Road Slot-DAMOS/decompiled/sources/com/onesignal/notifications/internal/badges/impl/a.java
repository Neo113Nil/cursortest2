package com.onesignal.notifications.internal.badges.impl;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import bc.e;
import com.onesignal.debug.internal.logging.b;
import ea.f;
import ha.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vb.c;
import wd.a0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ub.a {
    private final f _applicationService;
    private final d _databaseProvider;
    private final cc.a _queryHelper;
    private int badgesEnabled;

    public a(f fVar, cc.a aVar, d dVar) {
        fVar.getClass();
        aVar.getClass();
        dVar.getClass();
        this._applicationService = fVar;
        this._queryHelper = aVar;
        this._databaseProvider = dVar;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i3 = this.badgesEnabled;
        if (i3 != -1) {
            return i3 == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            this.badgesEnabled = 0;
            b.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e2);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && e.areNotificationsEnabled$default(e.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        a0 a0Var = new a0();
        ha.b.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(gc.a.INSTANCE.getMaxNumberOfNotifications()), new C0050a(a0Var), 122, null);
        updateCount(a0Var.f10139d);
    }

    private final void updateStandard() {
        int i3 = 0;
        for (StatusBarNotification statusBarNotification : e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                i3++;
            }
        }
        updateCount(i3);
    }

    @Override // ub.a
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // ub.a
    public void updateCount(int i3) {
        if (areBadgeSettingsEnabled()) {
            try {
                c.applyCountOrThrow(this._applicationService.getAppContext(), i3);
            } catch (vb.b unused) {
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.badges.impl.a$a, reason: collision with other inner class name */
    public static final class C0050a extends p implements Function1 {
        final /* synthetic */ a0 $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0050a(a0 a0Var) {
            super(1);
            this.$notificationCount = a0Var;
        }

        public final void invoke(ha.a aVar) {
            aVar.getClass();
            this.$notificationCount.f10139d = aVar.getCount();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ha.a) obj);
            return Unit.f5554a;
        }
    }
}
