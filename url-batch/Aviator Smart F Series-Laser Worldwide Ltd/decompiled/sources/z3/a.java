package z3;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a {
    public static String a() {
        return Build.MANUFACTURER;
    }

    public static String b() {
        return Locale.getDefault().getLanguage();
    }

    public static Locale[] c() {
        return Locale.getAvailableLocales();
    }

    public static String d() {
        return Build.MODEL;
    }

    public static String e() {
        return Build.VERSION.RELEASE;
    }

    public static boolean f() {
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            return true;
        } catch (ClassNotFoundException e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
