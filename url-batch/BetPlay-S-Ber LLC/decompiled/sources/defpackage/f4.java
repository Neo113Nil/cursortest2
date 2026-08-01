package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class f4 {
    public static final d4 f = new d4(new e4());
    public static final int g = -100;
    public static sr h = null;
    public static sr i = null;
    public static Boolean j = null;
    public static boolean k = false;
    public static final g7 l = new g7();
    public static final Object m = new Object();
    public static final Object n = new Object();

    public static boolean b(Context context) {
        if (j == null) {
            try {
                int i2 = t6.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) t6.class), s6.a() | 128).metaData;
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

    public static void e(t4 t4Var) {
        synchronized (m) {
            try {
                g7 g7Var = l;
                g7Var.getClass();
                a7 a7Var = new a7(g7Var);
                while (a7Var.hasNext()) {
                    f4 f4Var = (f4) ((WeakReference) a7Var.next()).get();
                    if (f4Var == t4Var || f4Var == null) {
                        a7Var.remove();
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

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
