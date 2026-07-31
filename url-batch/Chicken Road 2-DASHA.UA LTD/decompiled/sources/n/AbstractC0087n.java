package n;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: n.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0087n {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
