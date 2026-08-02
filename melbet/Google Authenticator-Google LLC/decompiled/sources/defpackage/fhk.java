package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.google.android.apps.authenticator2.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fhk {
    private static final int[] a = {R.attr.dynamicColorThemeOverlay};
    private static final fhj b;
    private static final fhj c;
    private static final Map d;
    private static final Map e;

    static {
        fhh fhhVar = new fhh();
        b = fhhVar;
        fhi fhiVar = new fhi();
        c = fhiVar;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", fhhVar);
        hashMap.put("google", fhhVar);
        hashMap.put("hmd global", fhhVar);
        hashMap.put("infinix", fhhVar);
        hashMap.put("infinix mobility limited", fhhVar);
        hashMap.put("itel", fhhVar);
        hashMap.put("kyocera", fhhVar);
        hashMap.put("lenovo", fhhVar);
        hashMap.put("lge", fhhVar);
        hashMap.put("meizu", fhhVar);
        hashMap.put("motorola", fhhVar);
        hashMap.put("nothing", fhhVar);
        hashMap.put("oneplus", fhhVar);
        hashMap.put("oppo", fhhVar);
        hashMap.put("realme", fhhVar);
        hashMap.put("robolectric", fhhVar);
        hashMap.put("samsung", fhiVar);
        hashMap.put("sharp", fhhVar);
        hashMap.put("shift", fhhVar);
        hashMap.put("sony", fhhVar);
        hashMap.put("tcl", fhhVar);
        hashMap.put("tecno", fhhVar);
        hashMap.put("tecno mobile limited", fhhVar);
        hashMap.put("vivo", fhhVar);
        hashMap.put("wingtech", fhhVar);
        hashMap.put("xiaomi", fhhVar);
        d = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", fhhVar);
        hashMap2.put("jio", fhhVar);
        e = DesugarCollections.unmodifiableMap(hashMap2);
    }

    private fhk() {
    }

    public static void a(Activity activity) {
        View peekDecorView;
        Context context;
        if (b()) {
            int d2 = d(activity, a);
            activity.getTheme().applyStyle(d2, true);
            Window window = activity.getWindow();
            Resources.Theme theme = null;
            if (window != null && (peekDecorView = window.peekDecorView()) != null && (context = peekDecorView.getContext()) != null) {
                theme = context.getTheme();
            }
            if (theme != null) {
                theme.applyStyle(d2, true);
            }
        }
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        int i = vq.a;
        if (Build.VERSION.SDK_INT < 33) {
            if (Build.VERSION.SDK_INT >= 32) {
                String str = Build.VERSION.CODENAME;
                str.getClass();
                if (!ksp.b("REL", str)) {
                    Locale locale = Locale.US;
                    locale.getClass();
                    String upperCase = str.toUpperCase(locale);
                    upperCase.getClass();
                    Locale locale2 = Locale.US;
                    locale2.getClass();
                    String upperCase2 = "Tiramisu".toUpperCase(locale2);
                    upperCase2.getClass();
                    Integer a2 = vq.a(upperCase);
                    Integer a3 = vq.a(upperCase2);
                    if (a2 != null && a3 != null) {
                        a2.intValue();
                        a3.intValue();
                    } else if (a2 == null) {
                    }
                }
            }
            fhj fhjVar = (fhj) d.get(Build.MANUFACTURER.toLowerCase(Locale.ROOT));
            if (fhjVar == null) {
                fhjVar = (fhj) e.get(Build.BRAND.toLowerCase(Locale.ROOT));
            }
            return fhjVar != null && fhjVar.a();
        }
        return true;
    }

    public static Context c(Context context) {
        int d2;
        return (b() && (d2 = d(context, a)) != 0) ? new ContextThemeWrapper(context, d2) : context;
    }

    private static int d(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
