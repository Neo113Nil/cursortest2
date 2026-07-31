package V0;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9473a = "f";

    public static String a(String str) {
        Context a4 = b.a();
        if (a4 == null) {
            return "";
        }
        try {
            return a4.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            f.d(f9473a, "getVersion NameNotFoundException : " + e4.getMessage());
            return "";
        } catch (Exception e5) {
            f.d(f9473a, "getVersion: " + e5.getMessage());
            return "";
        } catch (Throwable unused) {
            f.d(f9473a, "throwable");
            return "";
        }
    }
}
