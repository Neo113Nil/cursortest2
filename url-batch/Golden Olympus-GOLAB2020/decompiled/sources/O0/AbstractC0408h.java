package O0;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;

/* renamed from: O0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0408h {
    public static boolean a(Context context) {
        return System.currentTimeMillis() - AbstractC0413m.a(context, "Privacy_MY", "flashKeyTime", -1L) > 43200000;
    }

    public static boolean b(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (context.checkSelfPermission(str) == 0) {
            return false;
        }
        j0.m("hmsSdk", "not have read phone permission!");
        return true;
    }

    public static boolean c(Context context, String str, int i4) {
        String str2 = AbstractC0413m.h(context, str) + ".xml";
        File file = new File(context.getFilesDir(), "../shared_prefs/" + str2);
        if (!file.exists()) {
            String str3 = context.getPackageName() + BundleUtil.UNDERLINE_TAG + str2;
            file = new File(context.getFilesDir(), "../../shared_prefs/" + str3);
        }
        long length = file.length();
        if (length <= i4) {
            return false;
        }
        j0.h("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i4)));
        return true;
    }

    public static boolean d(String str, long j4, long j5) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j4 - Long.parseLong(str) > j5;
        } catch (NumberFormatException unused) {
            j0.m("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
