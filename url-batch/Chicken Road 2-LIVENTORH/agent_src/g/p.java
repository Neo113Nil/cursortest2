package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: f, reason: collision with root package name */
    public static final n f1676f = new n(new o());

    /* renamed from: g, reason: collision with root package name */
    public static final int f1677g = -100;

    /* renamed from: h, reason: collision with root package name */
    public static j0.e f1678h = null;
    public static j0.e i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f1679j = null;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f1680k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final q.g f1681l = new q.g();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f1682m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f1683n = new Object();

    public static boolean b(Context context) {
        if (f1679j == null) {
            try {
                int i4 = h0.f1645f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) h0.class), g0.a() | 128).metaData;
                if (bundle != null) {
                    f1679j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1679j = Boolean.FALSE;
            }
        }
        return f1679j.booleanValue();
    }

    public static void e(c0 c0Var) {
        synchronized (f1682m) {
            try {
                q.g gVar = f1681l;
                gVar.getClass();
                q.b bVar = new q.b(gVar);
                while (bVar.hasNext()) {
                    p pVar = (p) ((WeakReference) bVar.next()).get();
                    if (pVar == c0Var || pVar == null) {
                        bVar.remove();
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

    public abstract boolean f(int i4);

    public abstract void g(int i4);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
