package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ag extends ej {
    @Override // defpackage.ej
    public final Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
