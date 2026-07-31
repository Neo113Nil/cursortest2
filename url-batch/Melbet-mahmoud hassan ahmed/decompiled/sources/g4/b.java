package g4;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import r3.o;

/* loaded from: classes.dex */
public final class b {
    public static String a(Context context, String str, String str2) {
        o.i(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = a.a(context);
        }
        return a.b("google_app_id", resources, str2);
    }
}
