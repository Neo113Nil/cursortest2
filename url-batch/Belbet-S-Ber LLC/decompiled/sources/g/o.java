package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: f, reason: collision with root package name */
    public static final m f1557f = new m(new n());

    /* renamed from: g, reason: collision with root package name */
    public static final int f1558g = -100;
    public static j0.f h = null;
    public static j0.f i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f1559j = null;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f1560k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final q.g f1561l = new q.g();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f1562m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f1563n = new Object();

    public static boolean b(Context context) {
        if (f1559j == null) {
            try {
                int i4 = f0.f1518f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) f0.class), e0.a() | 128).metaData;
                if (bundle != null) {
                    f1559j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1559j = Boolean.FALSE;
            }
        }
        return f1559j.booleanValue();
    }

    public static void e(a0 a0Var) {
        synchronized (f1562m) {
            try {
                q.g gVar = f1561l;
                gVar.getClass();
                q.b bVar = new q.b(gVar);
                while (bVar.hasNext()) {
                    o oVar = (o) ((WeakReference) bVar.next()).get();
                    if (oVar == a0Var || oVar == null) {
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
