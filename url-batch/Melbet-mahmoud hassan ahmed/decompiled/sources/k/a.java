package k;

import android.content.pm.PackageInfo;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {
    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }
}
