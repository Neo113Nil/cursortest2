package m1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645c extends A1.i {
    @Override // A1.i
    public final Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
