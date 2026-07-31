package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata
@TargetApi(AvailableCode.APP_IS_BACKGROUND_OR_LOCKED)
/* loaded from: classes3.dex */
public final class G2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final G2 f37553a = new G2();

    private G2() {
    }

    @NotNull
    public static final J2 a(@NotNull Context context, @NotNull final C2692i2 c2692i2) {
        return new J2((I2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.No
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                I2 a4;
                a4 = G2.a(C2692i2.this, (UsageStatsManager) obj);
                return a4;
            }
        }), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.Oo
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                Boolean a4;
                a4 = G2.a((ActivityManager) obj);
                return a4;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I2 a(C2692i2 c2692i2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket;
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c2692i2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return I2.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return I2.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return I2.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return I2.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return I2.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return I2.RARE;
        }
        return I2.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        boolean isBackgroundRestricted;
        isBackgroundRestricted = activityManager.isBackgroundRestricted();
        return Boolean.valueOf(isBackgroundRestricted);
    }
}
