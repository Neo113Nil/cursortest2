package io.appmetrica.analytics.impl;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0990u2 f12796a = new C0990u2();

    private C0990u2() {
    }

    public static final C1068x2 a(Context context, C0525c2 c0525c2) {
        return new C1068x2((EnumC1042w2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new io.appmetrica.analytics.flutter.pigeon.a(3, c0525c2)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new Zo(2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC1042w2 a(C0525c2 c0525c2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket;
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c0525c2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return EnumC1042w2.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return EnumC1042w2.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return EnumC1042w2.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return EnumC1042w2.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return EnumC1042w2.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return EnumC1042w2.RARE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        boolean isBackgroundRestricted;
        isBackgroundRestricted = activityManager.isBackgroundRestricted();
        return Boolean.valueOf(isBackgroundRestricted);
    }
}
