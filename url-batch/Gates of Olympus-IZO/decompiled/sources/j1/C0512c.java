package j1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512c extends F0.a {
    @Override // F0.a
    public final Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
