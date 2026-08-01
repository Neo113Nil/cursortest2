package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class h4 {
    public static final f4 f = new f4(new g4());
    public static final int g = -100;
    public static vy h = null;
    public static vy i = null;
    public static Boolean j = null;
    public static boolean k = false;
    public static final i7 l = new i7(0);
    public static final Object m = new Object();
    public static final Object n = new Object();

    public static boolean c(Context context) {
        if (j == null) {
            try {
                int i2 = u6.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) u6.class), t6.a() | 128).metaData;
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

    public static void f(v4 v4Var) {
        synchronized (m) {
            try {
                i7 i7Var = l;
                i7Var.getClass();
                c7 c7Var = new c7(i7Var);
                while (c7Var.hasNext()) {
                    h4 h4Var = (h4) ((WeakReference) c7Var.next()).get();
                    if (h4Var == v4Var || h4Var == null) {
                        c7Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean h(int i2);

    public abstract void i(int i2);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
