package T;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: T.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031c extends O0.e {
    @Override // O0.e
    public final Signature[] c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
