package f;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: f, reason: collision with root package name */
    public static final n f1638f = new n(new o());
    public static final int g = -100;
    public static g0.d h = null;

    /* renamed from: i, reason: collision with root package name */
    public static g0.d f1639i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f1640j = null;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f1641k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final n.g f1642l = new n.g();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f1643m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f1644n = new Object();

    public static boolean b(Context context) {
        if (f1640j == null) {
            try {
                int i4 = g0.f1600f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) g0.class), f0.a() | 128).metaData;
                if (bundle != null) {
                    f1640j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1640j = Boolean.FALSE;
            }
        }
        return f1640j.booleanValue();
    }

    public static void e(b0 b0Var) {
        synchronized (f1643m) {
            try {
                n.g gVar = f1642l;
                gVar.getClass();
                n.b bVar = new n.b(gVar);
                while (bVar.hasNext()) {
                    p pVar = (p) ((WeakReference) bVar.next()).get();
                    if (pVar == b0Var || pVar == null) {
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

    public abstract void k(CharSequence charSequence);
}
