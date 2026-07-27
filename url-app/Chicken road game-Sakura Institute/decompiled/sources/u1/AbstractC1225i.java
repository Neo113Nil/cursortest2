package u1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: u1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1225i {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
