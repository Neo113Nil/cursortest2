package x;

import android.text.TextUtils;
import com.blankj.utilcode.util.r;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static String f17284a = "LogCatUtils";

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = f17284a;
        if (TextUtils.isEmpty(str)) {
            str = str3;
        }
        r.i(str, str2);
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = f17284a;
        if (TextUtils.isEmpty(str)) {
            str = str3;
        }
        r.i(str, str2);
    }
}
