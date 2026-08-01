package h;

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
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.room.D f2808a = new androidx.room.D(new m());

    /* renamed from: b, reason: collision with root package name */
    public static final int f2809b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static I.f f2810c = null;

    /* renamed from: d, reason: collision with root package name */
    public static I.f f2811d = null;
    public static Boolean e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2812f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final q.c f2813g = new q.c();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2814h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (e == null) {
            try {
                int i2 = F.f2732a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) F.class), E.a() | 128).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void g(z zVar) {
        synchronized (f2814h) {
            try {
                Iterator it = f2813g.iterator();
                while (true) {
                    q.g gVar = (q.g) it;
                    if (gVar.hasNext()) {
                        n nVar = (n) ((WeakReference) gVar.next()).get();
                        if (nVar == zVar || nVar == null) {
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

    public abstract void d();

    public abstract void e();

    public abstract boolean h(int i2);

    public abstract void i(int i2);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
