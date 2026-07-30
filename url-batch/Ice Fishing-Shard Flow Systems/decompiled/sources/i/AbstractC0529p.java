package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import l.AbstractC0646b;
import l.InterfaceC0645a;
import u.C0930a;
import u.C0935f;

/* renamed from: i.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0529p {

    /* renamed from: d, reason: collision with root package name */
    public static final Q0.m f5470d = new Q0.m(new K1.n(2));

    /* renamed from: e, reason: collision with root package name */
    public static final int f5471e = -100;

    /* renamed from: i, reason: collision with root package name */
    public static E.f f5472i = null;

    /* renamed from: l, reason: collision with root package name */
    public static E.f f5473l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Boolean f5474m = null;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f5475n = false;

    /* renamed from: o, reason: collision with root package name */
    public static final C0935f f5476o = new C0935f(0);

    /* renamed from: p, reason: collision with root package name */
    public static final Object f5477p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final Object f5478q = new Object();

    public static boolean c(Context context) {
        if (f5474m == null) {
            try {
                int i2 = AbstractServiceC0505G.f5367d;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0505G.class), AbstractC0504F.a() | 128).metaData;
                if (bundle != null) {
                    f5474m = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f5474m = Boolean.FALSE;
            }
        }
        return f5474m.booleanValue();
    }

    public static void g(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B) {
        synchronized (f5477p) {
            try {
                C0935f c0935f = f5476o;
                c0935f.getClass();
                C0930a c0930a = new C0930a(c0935f);
                while (c0930a.hasNext()) {
                    AbstractC0529p abstractC0529p = (AbstractC0529p) ((WeakReference) c0930a.next()).get();
                    if (abstractC0529p == layoutInflaterFactory2C0500B || abstractC0529p == null) {
                        c0930a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void e();

    public abstract void f();

    public abstract boolean h(int i2);

    public abstract void i(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract AbstractC0646b n(InterfaceC0645a interfaceC0645a);
}
