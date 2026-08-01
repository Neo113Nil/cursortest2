package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class p3 {
    public static final n3 f = new n3(new o3());
    public static int g = -100;
    public static er h = null;
    public static er i = null;
    public static Boolean j = null;
    public static boolean k = false;
    public static final p6 l = new p6();
    public static final Object m = new Object();
    public static final Object n = new Object();

    public static boolean c(Context context) {
        if (j == null) {
            try {
                int i2 = c6.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) c6.class), b6.a() | 128).metaData;
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

    public static void f(d4 d4Var) {
        synchronized (m) {
            try {
                p6 p6Var = l;
                p6Var.getClass();
                j6 j6Var = new j6(p6Var);
                while (j6Var.hasNext()) {
                    p3 p3Var = (p3) ((WeakReference) j6Var.next()).get();
                    if (p3Var == d4Var || p3Var == null) {
                        j6Var.remove();
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

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
