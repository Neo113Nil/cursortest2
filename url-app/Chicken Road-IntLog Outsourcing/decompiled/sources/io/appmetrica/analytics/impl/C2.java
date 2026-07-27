package io.appmetrica.analytics.impl;

import E.C0028c;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* loaded from: classes.dex */
public final class C2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2 f6615a = new C2();

    private C2() {
    }

    public static final F2 a(Context context, C0786l2 c0786l2) {
        return new F2((E2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new D3.g(25, c0786l2)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new C0028c(25)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E2 a(C0786l2 c0786l2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket;
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c0786l2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return E2.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return E2.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return E2.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return E2.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return E2.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return E2.RARE;
        }
        return E2.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        boolean isBackgroundRestricted;
        isBackgroundRestricted = activityManager.isBackgroundRestricted();
        return Boolean.valueOf(isBackgroundRestricted);
    }
}
