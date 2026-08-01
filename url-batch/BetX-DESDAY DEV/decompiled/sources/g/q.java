package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import j.AbstractC0170b;
import j.InterfaceC0169a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC0163o f2587a = new ExecutorC0163o(new p());

    /* renamed from: b, reason: collision with root package name */
    public static final int f2588b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static G.g f2589c = null;

    /* renamed from: d, reason: collision with root package name */
    public static G.g f2590d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f2591e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2592f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final o.c f2593g = new o.c();
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean c(Context context) {
        if (f2591e == null) {
            try {
                int i2 = AbstractServiceC0147H.f2499a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0147H.class), AbstractC0146G.a() | 128).metaData;
                if (bundle != null) {
                    f2591e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2591e = Boolean.FALSE;
            }
        }
        return f2591e.booleanValue();
    }

    public static void f(LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C) {
        synchronized (h) {
            try {
                Iterator it = f2593g.iterator();
                while (true) {
                    o.g gVar = (o.g) it;
                    if (gVar.hasNext()) {
                        q qVar = (q) ((WeakReference) gVar.next()).get();
                        if (qVar == layoutInflaterFactory2C0142C || qVar == null) {
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

    public abstract void e();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);

    public abstract AbstractC0170b l(InterfaceC0169a interfaceC0169a);
}
