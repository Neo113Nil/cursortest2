package y;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.artillery.ctc.uitls.StringUtils;

/* loaded from: classes.dex */
public abstract class a {
    public static String a() {
        return d.a().getPackageName();
    }

    public static String b(String str) {
        if (StringUtils.isSpace(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = d.a().getPackageManager().getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String c() {
        return b(d.a().getPackageName());
    }

    public static int a(String str) {
        if (StringUtils.isSpace(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = d.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public static int b() {
        return a(d.a().getPackageName());
    }
}
