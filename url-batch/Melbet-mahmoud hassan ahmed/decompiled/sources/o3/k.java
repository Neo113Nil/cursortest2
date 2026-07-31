package o3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private static k f19864b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f19865a;

    public k(@RecentlyNonNull Context context) {
        this.f19865a = context.getApplicationContext();
    }

    @RecentlyNonNull
    public static k a(@RecentlyNonNull Context context) {
        r3.o.i(context);
        synchronized (k.class) {
            if (f19864b == null) {
                z.a(context);
                f19864b = new k(context);
            }
        }
        return f19864b;
    }

    static final v b(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        w wVar = new w(packageInfo.signatures[0].toByteArray());
        for (int i7 = 0; i7 < vVarArr.length; i7++) {
            if (vVarArr[i7].equals(wVar)) {
                return vVarArr[i7];
            }
        }
        return null;
    }

    public static final boolean c(@RecentlyNonNull PackageInfo packageInfo, boolean z6) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z6 ? b(packageInfo, y.f19876a) : b(packageInfo, y.f19876a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
