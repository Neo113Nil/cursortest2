package c4;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends u8.d {
    @Override // u8.d
    public final Signature[] c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
