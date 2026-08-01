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
    public static final m f2224a = new m(new n());

    /* renamed from: b, reason: collision with root package name */
    public static final int f2225b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static G.f f2226c = null;
    public static G.f d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f2227e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2228f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final o.c f2229g = new o.c();
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (f2227e == null) {
            try {
                int i2 = AbstractServiceC0095F.f2145a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0095F.class), AbstractC0094E.a() | 128).metaData;
                if (bundle != null) {
                    f2227e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2227e = Boolean.FALSE;
            }
        }
        return f2227e.booleanValue();
    }

    public static void e(LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A) {
        synchronized (h) {
            try {
                Iterator it = f2229g.iterator();
                while (true) {
                    o.g gVar = (o.g) it;
                    if (gVar.hasNext()) {
                        o oVar = (o) ((WeakReference) gVar.next()).get();
                        if (oVar == layoutInflaterFactory2C0090A || oVar == null) {
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
