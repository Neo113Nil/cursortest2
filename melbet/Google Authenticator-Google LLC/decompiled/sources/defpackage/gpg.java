package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.system.Os;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gpg implements gjj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gpg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gjj
    public final hvi a() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            gaj.d(92, ((fuq) obj).a(), "Failed account invalidation.", new Object[0]);
            return hve.a;
        }
        try {
            PackageInfo packageInfo = ((Context) obj).getPackageManager().getPackageInfo(((Context) obj).getPackageName(), 0);
            if (packageInfo.applicationInfo.targetSdkVersion < 24) {
                try {
                    Os.chmod(packageInfo.applicationInfo.dataDir, 448);
                } catch (Exception e) {
                    throw new IOException(e);
                }
            }
        } catch (PackageManager.NameNotFoundException | IOException unused) {
        }
        return hve.a;
    }
}
