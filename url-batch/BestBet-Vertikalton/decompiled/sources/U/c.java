package U;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: classes.dex */
public final class c extends R0.e {
    @Override // R0.e
    public final Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
