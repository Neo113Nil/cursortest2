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
import k.AbstractC4614b;
import k.InterfaceC4613a;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: n, reason: collision with root package name */
    public static final T0.l f38120n = new T0.l(new N1.f(3));

    /* renamed from: u, reason: collision with root package name */
    public static final int f38121u = -100;

    /* renamed from: v, reason: collision with root package name */
    public static K.l f38122v = null;

    /* renamed from: w, reason: collision with root package name */
    public static K.l f38123w = null;

    /* renamed from: x, reason: collision with root package name */
    public static Boolean f38124x = null;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f38125y = false;

    /* renamed from: z, reason: collision with root package name */
    public static final s.c f38126z = new s.c(0);

    /* renamed from: A, reason: collision with root package name */
    public static final Object f38118A = new Object();

    /* renamed from: B, reason: collision with root package name */
    public static final Object f38119B = new Object();

    public static boolean c(Context context) {
        if (f38124x == null) {
            try {
                int i = AbstractServiceC4540G.f38030n;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC4540G.class), AbstractC4539F.a() | 128).metaData;
                if (bundle != null) {
                    f38124x = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f38124x = Boolean.FALSE;
            }
        }
        return f38124x.booleanValue();
    }

    public static void f(LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B) {
        synchronized (f38118A) {
            try {
                Iterator it = f38126z.iterator();
                while (true) {
                    s.f fVar = (s.f) it;
                    if (fVar.hasNext()) {
                        q qVar = (q) ((WeakReference) fVar.next()).get();
                        if (qVar == layoutInflaterFactory2C4535B || qVar == null) {
                            fVar.remove();
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

    public abstract boolean g(int i);

    public abstract void h(int i);

    public abstract void i(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);

    public abstract AbstractC4614b m(InterfaceC4613a interfaceC4613a);
}
