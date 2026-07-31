package g3;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    public static final PackageInfo a(PackageManager packageManager, String packageName, int i4) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i4);
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "getPackageInfo(packageName, flags)");
            return packageInfo2;
        }
        of = PackageManager.PackageInfoFlags.of(i4);
        packageInfo = packageManager.getPackageInfo(packageName, of);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(packageNa…er.PackageInfoFlags::of))");
        return packageInfo;
    }
}
