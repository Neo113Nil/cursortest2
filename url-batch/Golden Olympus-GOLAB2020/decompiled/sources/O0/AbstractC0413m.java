package O0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Map;

/* renamed from: O0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0413m {
    public static long a(Context context, String str, String str2, long j4) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            j0.m("hmsSdk", "context is null or spName empty or spkey is empty");
            return j4;
        }
        SharedPreferences e4 = e(context, str);
        return e4 != null ? e4.getLong(str2, j4) : j4;
    }

    public static String b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            j0.m("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences e4 = e(context, str);
        return e4 != null ? e4.getString(str2, str3) : str3;
    }

    public static Map c(Context context, String str) {
        return e(context, str).getAll();
    }

    public static void d(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            j0.m("hmsSdk", "clearData(): parameter error.context,spname");
            return;
        }
        if (strArr == null) {
            j0.m("hmsSdk", "clearData(): No data need to be deleted,keys is null");
            return;
        }
        SharedPreferences e4 = e(context, str);
        if (e4 != null) {
            SharedPreferences.Editor edit = e4.edit();
            if (strArr.length == 0) {
                edit.clear();
                edit.commit();
                return;
            }
            for (String str2 : strArr) {
                if (e4.contains(str2)) {
                    edit.remove(str2);
                    edit.commit();
                }
            }
        }
    }

    private static SharedPreferences e(Context context, String str) {
        return context.getSharedPreferences(h(context, str), 0);
    }

    public static void f(Context context, String str, String str2, long j4) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            j0.m("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences e4 = e(context, str);
        if (e4 != null) {
            SharedPreferences.Editor edit = e4.edit();
            edit.putLong(str2, j4);
            edit.commit();
        }
    }

    public static void g(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            j0.l("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences e4 = e(context, str);
        if (e4 != null) {
            SharedPreferences.Editor edit = e4.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    public static String h(Context context, String str) {
        String packageName = context.getPackageName();
        String o4 = AbstractC0403c.o("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(o4)) {
            return "hms_" + str + BundleUtil.UNDERLINE_TAG + packageName;
        }
        return "hms_" + str + BundleUtil.UNDERLINE_TAG + packageName + BundleUtil.UNDERLINE_TAG + o4;
    }
}
