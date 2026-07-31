package O0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class S {

    private static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    private static Object a(Class cls, String str, Class[] clsArr, Object[] objArr) {
        String str2;
        if (cls == null) {
            throw new a("class is null in invokeStaticFun");
        }
        if (clsArr == null) {
            if (objArr != null) {
                throw new a("paramsType is null, but params is not null");
            }
        } else {
            if (objArr == null) {
                throw new a("paramsType or params should be same");
            }
            if (clsArr.length != objArr.length) {
                throw new a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
            }
        }
        try {
        } catch (NoSuchMethodException unused) {
            j0.m("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
        }
        try {
            return cls.getMethod(str, clsArr).invoke(null, objArr);
        } catch (IllegalAccessException unused2) {
            str2 = "invokeStaticFun(): method invoke Exception!";
            j0.m("hmsSdk", str2);
            return null;
        } catch (IllegalArgumentException unused3) {
            str2 = "invokeStaticFun(): Illegal Argument!";
            j0.m("hmsSdk", str2);
            return null;
        } catch (InvocationTargetException unused4) {
            str2 = "invokeStaticFun(): Invocation Target Exception!";
            j0.m("hmsSdk", str2);
            return null;
        }
    }

    private static Object b(String str, String str2, Class[] clsArr, Object[] objArr) {
        String str3;
        try {
            return a(Class.forName(str), str2, clsArr, objArr);
        } catch (a unused) {
            str3 = "invokeStaticFun(): Static function call Exception ";
            j0.m("hmsSdk", str3);
            return null;
        } catch (ClassNotFoundException unused2) {
            str3 = "invokeStaticFun() Not found class!";
            j0.m("hmsSdk", str3);
            return null;
        }
    }

    public static String c() {
        return e("ro.build.version.emui", "");
    }

    public static String d(Context context) {
        return context == null ? "" : Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String f4 = f("android.os.SystemProperties", str, str2);
        return TextUtils.isEmpty(f4) ? f("com.huawei.android.os.SystemPropertiesEx", str, str2) : f4;
    }

    private static String f(String str, String str2, String str3) {
        Object b4 = b(str, "get", new Class[]{String.class, String.class}, new Object[]{str2, str3});
        return b4 != null ? (String) b4 : str3;
    }

    public static String g() {
        String f4 = f("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id", "");
        j0.b("hmsSdk", "SystemPropertiesEx: get rom_ver: " + f4);
        if (!TextUtils.isEmpty(f4)) {
            return f4;
        }
        String str = Build.DISPLAY;
        j0.h("hmsSdk", "SystemProperties: get rom_ver: " + str);
        return str;
    }

    public static String h(Context context) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("CHANNEL")) != null) {
                String obj2 = obj.toString();
                return obj2.length() > 256 ? "Unknown" : obj2;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            j0.m("hmsSdk", "getChannel(): The packageName is not correct!");
        }
        return "Unknown";
    }

    public static String i(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    public static String j(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(i(context), 16384);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (PackageManager.NameNotFoundException unused) {
            j0.m("hmsSdk", "getVersion(): The package name is not correct!");
            return "";
        }
    }
}
