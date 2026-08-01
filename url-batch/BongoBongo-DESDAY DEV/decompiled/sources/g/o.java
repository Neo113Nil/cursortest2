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
    public static final m f2344a = new m(new n());

    /* renamed from: b, reason: collision with root package name */
    public static final int f2345b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static H.f f2346c = null;
    public static H.f d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f2347e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2348f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final p.c f2349g = new p.c();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2350h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (f2347e == null) {
            try {
                int i2 = F.f2261a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) F.class), E.a() | 128).metaData;
                if (bundle != null) {
                    f2347e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2347e = Boolean.FALSE;
            }
        }
        return f2347e.booleanValue();
    }

    public static void e(A a2) {
        synchronized (f2350h) {
            try {
                Iterator it = f2349g.iterator();
                while (true) {
                    p.g gVar = (p.g) it;
                    if (gVar.hasNext()) {
                        o oVar = (o) ((WeakReference) gVar.next()).get();
                        if (oVar == a2 || oVar == null) {
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
