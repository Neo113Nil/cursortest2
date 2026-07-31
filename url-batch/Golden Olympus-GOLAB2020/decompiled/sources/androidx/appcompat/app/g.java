package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.g;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    static c f10180a = new c(new d());

    /* renamed from: b, reason: collision with root package name */
    private static int f10181b = -100;

    /* renamed from: c, reason: collision with root package name */
    private static androidx.core.os.i f10182c = null;

    /* renamed from: d, reason: collision with root package name */
    private static androidx.core.os.i f10183d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f10184e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f10185f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final androidx.collection.b f10186g = new androidx.collection.b();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f10187h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f10188i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* renamed from: b, reason: collision with root package name */
        private final Object f10189b = new Object();

        /* renamed from: c, reason: collision with root package name */
        final Queue f10190c = new ArrayDeque();

        /* renamed from: d, reason: collision with root package name */
        final Executor f10191d;

        /* renamed from: e, reason: collision with root package name */
        Runnable f10192e;

        c(Executor executor) {
            this.f10191d = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        protected void b() {
            synchronized (this.f10189b) {
                try {
                    Runnable runnable = (Runnable) this.f10190c.poll();
                    this.f10192e = runnable;
                    if (runnable != null) {
                        this.f10191d.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f10189b) {
                try {
                    this.f10190c.add(new Runnable() { // from class: androidx.appcompat.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.c.a(g.c.this, runnable);
                        }
                    });
                    if (this.f10192e == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    g() {
    }

    static void E(g gVar) {
        synchronized (f10187h) {
            F(gVar);
        }
    }

    private static void F(g gVar) {
        synchronized (f10187h) {
            try {
                Iterator it = f10186g.iterator();
                while (it.hasNext()) {
                    g gVar2 = (g) ((WeakReference) it.next()).get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void P(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (k().e()) {
                    String b4 = androidx.core.app.e.b(context);
                    Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                    if (systemService != null) {
                        b.b(systemService, a.a(b4));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void Q(final Context context) {
        if (v(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f10185f) {
                    return;
                }
                f10180a.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.c(context);
                    }
                });
                return;
            }
            synchronized (f10188i) {
                try {
                    androidx.core.os.i iVar = f10182c;
                    if (iVar == null) {
                        if (f10183d == null) {
                            f10183d = androidx.core.os.i.b(androidx.core.app.e.b(context));
                        }
                        if (f10183d.e()) {
                        } else {
                            f10182c = f10183d;
                        }
                    } else if (!iVar.equals(f10183d)) {
                        androidx.core.os.i iVar2 = f10182c;
                        f10183d = iVar2;
                        androidx.core.app.e.a(context, iVar2.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        P(context);
        f10185f = true;
    }

    static void d(g gVar) {
        synchronized (f10187h) {
            F(gVar);
            f10186g.add(new WeakReference(gVar));
        }
    }

    public static g h(Activity activity, e eVar) {
        return new AppCompatDelegateImpl(activity, eVar);
    }

    public static g i(Dialog dialog, e eVar) {
        return new AppCompatDelegateImpl(dialog, eVar);
    }

    public static androidx.core.os.i k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object p4 = p();
            if (p4 != null) {
                return androidx.core.os.i.i(b.a(p4));
            }
        } else {
            androidx.core.os.i iVar = f10182c;
            if (iVar != null) {
                return iVar;
            }
        }
        return androidx.core.os.i.d();
    }

    public static int m() {
        return f10181b;
    }

    static Object p() {
        Context l4;
        Iterator it = f10186g.iterator();
        while (it.hasNext()) {
            g gVar = (g) ((WeakReference) it.next()).get();
            if (gVar != null && (l4 = gVar.l()) != null) {
                return l4.getSystemService(CommonUrlParts.LOCALE);
            }
        }
        return null;
    }

    static androidx.core.os.i r() {
        return f10182c;
    }

    static boolean v(Context context) {
        if (f10184e == null) {
            try {
                Bundle bundle = u.a(context).metaData;
                if (bundle != null) {
                    f10184e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f10184e = Boolean.FALSE;
            }
        }
        return f10184e.booleanValue();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D();

    public abstract boolean G(int i4);

    public abstract void H(int i4);

    public abstract void I(View view);

    public abstract void J(View view, ViewGroup.LayoutParams layoutParams);

    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void L(Toolbar toolbar);

    public abstract void M(int i4);

    public abstract void N(CharSequence charSequence);

    public abstract androidx.appcompat.view.b O(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i4);

    public abstract Context l();

    public abstract InterfaceC1251b n();

    public abstract int o();

    public abstract MenuInflater q();

    public abstract AbstractC1250a s();

    public abstract void t();

    public abstract void u();

    public abstract void w(Configuration configuration);

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z(Bundle bundle);
}
