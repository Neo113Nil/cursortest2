package k1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes.dex */
public final class c extends E1.i {
    @Override // E1.i
    public final Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
