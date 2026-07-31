package c4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* loaded from: classes.dex */
public final class f1 {
    public static e1 a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        if (split.length != 1) {
            if (split.length == 2) {
                str2 = split[0];
                str3 = split[1];
            }
            return null;
        }
        str2 = String.valueOf(context.getPackageName()).concat("_preferences");
        str3 = split[0];
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            return new e1(str2, str3);
        }
        return null;
    }

    public static void b(Context context, Set<String> set) {
        SharedPreferences.Editor b7;
        h1 h1Var = new h1(context);
        for (String str : set) {
            e1 a7 = a(context, str);
            if (a7 == null) {
                String valueOf = String.valueOf(str);
                Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "clearKeys: unable to process key: ".concat(valueOf) : new String("clearKeys: unable to process key: "));
            } else {
                b7 = h1Var.b(a7.f1954a);
                b7.remove(a7.f1955b);
            }
        }
        h1Var.c();
    }
}
