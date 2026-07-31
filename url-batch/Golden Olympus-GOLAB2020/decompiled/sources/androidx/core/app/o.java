package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes.dex */
public abstract class o {

    static class a {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    public static androidx.core.os.i a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return androidx.core.os.i.b(e.b(context));
        }
        Object b4 = b(context);
        return b4 != null ? androidx.core.os.i.i(a.a(b4)) : androidx.core.os.i.d();
    }

    private static Object b(Context context) {
        return context.getSystemService(CommonUrlParts.LOCALE);
    }
}
