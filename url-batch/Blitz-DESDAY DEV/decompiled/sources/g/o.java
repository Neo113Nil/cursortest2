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
    public static final m f2326a = new m(new n());

    /* renamed from: b, reason: collision with root package name */
    public static final int f2327b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static I.f f2328c = null;
    public static I.f d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f2329e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2330f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final q.c f2331g = new q.c();
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (f2329e == null) {
            try {
                int i2 = F.f2247a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) F.class), E.a() | 128).metaData;
                if (bundle != null) {
                    f2329e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2329e = Boolean.FALSE;
            }
        }
        return f2329e.booleanValue();
    }

    public static void e(LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A) {
        synchronized (h) {
            try {
                Iterator it = f2331g.iterator();
                while (true) {
                    q.g gVar = (q.g) it;
                    if (gVar.hasNext()) {
                        o oVar = (o) ((WeakReference) gVar.next()).get();
                        if (oVar == layoutInflaterFactory2C0101A || oVar == null) {
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
