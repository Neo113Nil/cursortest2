package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x70 extends u30 {
    @Override // defpackage.u30
    public final Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
