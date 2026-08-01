package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class z3 {
    public static final x3 f = new x3(new y3());
    public static final int g = -100;
    public static wt h = null;
    public static wt i = null;
    public static Boolean j = null;
    public static boolean k = false;
    public static final z6 l = new z6();
    public static final Object m = new Object();
    public static final Object n = new Object();

    public static boolean b(Context context) {
        if (j == null) {
            try {
                int i2 = m6.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) m6.class), l6.a() | 128).metaData;
                if (bundle != null) {
                    j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                j = Boolean.FALSE;
            }
        }
        return j.booleanValue();
    }

    public static void e(n4 n4Var) {
        synchronized (m) {
            try {
                z6 z6Var = l;
                z6Var.getClass();
                t6 t6Var = new t6(z6Var);
                while (t6Var.hasNext()) {
                    z3 z3Var = (z3) ((WeakReference) t6Var.next()).get();
                    if (z3Var == n4Var || z3Var == null) {
                        t6Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
