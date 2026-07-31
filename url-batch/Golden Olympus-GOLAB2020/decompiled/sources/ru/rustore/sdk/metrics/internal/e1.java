package ru.rustore.sdk.metrics.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e1 {
    public static final PackageInfo a(PackageManager packageManager, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo getPackageInfo = packageManager.getPackageInfo(str, 0);
            Intrinsics.checkNotNullExpressionValue(getPackageInfo, "getPackageInfo");
            return getPackageInfo;
        }
        of = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(str, of);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n        getPackageInfo…ageInfoFlags.of(0))\n    }");
        return packageInfo;
    }
}
