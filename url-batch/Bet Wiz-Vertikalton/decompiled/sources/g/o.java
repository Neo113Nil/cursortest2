package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final m f2463a = new m(new n());

    /* renamed from: b, reason: collision with root package name */
    public static final int f2464b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static G.f f2465c = null;
    public static G.f d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f2466e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2467f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final o.c f2468g = new o.c();
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (f2466e == null) {
            try {
                int i2 = AbstractServiceC0121F.f2384a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0121F.class), AbstractC0120E.a() | 128).metaData;
                if (bundle != null) {
                    f2466e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2466e = Boolean.FALSE;
            }
        }
        return f2466e.booleanValue();
    }

    public static void e(LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A) {
        synchronized (h) {
            try {
                Iterator it = f2468g.iterator();
                while (true) {
                    o.g gVar = (o.g) it;
                    if (gVar.hasNext()) {
                        o oVar = (o) ((WeakReference) gVar.next()).get();
                        if (oVar == layoutInflaterFactory2C0116A || oVar == null) {
                            gVar.remove();
                        }
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

    public abstract void g(int i2);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
