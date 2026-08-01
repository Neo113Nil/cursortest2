package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import j.AbstractC0169b;
import j.InterfaceC0168a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC0162o f2583a = new ExecutorC0162o(new p());

    /* renamed from: b, reason: collision with root package name */
    public static final int f2584b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static G.g f2585c = null;

    /* renamed from: d, reason: collision with root package name */
    public static G.g f2586d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f2587e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2588f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final o.c f2589g = new o.c();
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean c(Context context) {
        if (f2587e == null) {
            try {
                int i2 = AbstractServiceC0146H.f2495a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0146H.class), AbstractC0145G.a() | 128).metaData;
                if (bundle != null) {
                    f2587e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2587e = Boolean.FALSE;
            }
        }
        return f2587e.booleanValue();
    }

    public static void h(LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C) {
        synchronized (h) {
            try {
                Iterator it = f2589g.iterator();
                while (true) {
                    o.g gVar = (o.g) it;
                    if (gVar.hasNext()) {
                        q qVar = (q) ((WeakReference) gVar.next()).get();
                        if (qVar == layoutInflaterFactory2C0141C || qVar == null) {
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

    public abstract void b();

    public abstract void d();

    public abstract void g();

    public abstract boolean i(int i2);

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract AbstractC0169b n(InterfaceC0168a interfaceC0168a);
}
