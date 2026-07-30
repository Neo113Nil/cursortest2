package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class df {
    public static final cf m = new cf(new of3(2));
    public static int n = -100;
    public static tf1 o = null;
    public static tf1 p = null;
    public static Boolean q = null;
    public static boolean r = false;
    public static final ii s = new ii(0);
    public static final Object t = new Object();
    public static final Object u = new Object();

    public static void a() {
        tf1 tf1Var;
        ii iiVar = s;
        iiVar.getClass();
        di diVar = new di(iiVar);
        while (diVar.hasNext()) {
            df dfVar = (df) ((WeakReference) diVar.next()).get();
            if (dfVar != null) {
                qf qfVar = (qf) dfVar;
                Context context = qfVar.w;
                int i = 1;
                if (f(context) && (tf1Var = o) != null && !tf1Var.equals(p)) {
                    m.execute(new ze(context, i));
                }
                qfVar.q(true, true);
            }
        }
    }

    public static Object b() {
        Context context;
        ii iiVar = s;
        iiVar.getClass();
        di diVar = new di(iiVar);
        while (diVar.hasNext()) {
            df dfVar = (df) ((WeakReference) diVar.next()).get();
            if (dfVar != null && (context = ((qf) dfVar).w) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean f(Context context) {
        if (q == null) {
            try {
                int i = AppLocalesMetadataHolderService.m;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), oh.a() | 128).metaData;
                if (bundle != null) {
                    q = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                q = Boolean.FALSE;
            }
        }
        return q.booleanValue();
    }

    public static void i(qf qfVar) {
        synchronized (t) {
            try {
                ii iiVar = s;
                iiVar.getClass();
                di diVar = new di(iiVar);
                while (diVar.hasNext()) {
                    df dfVar = (df) ((WeakReference) diVar.next()).get();
                    if (dfVar == qfVar || dfVar == null) {
                        diVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(Context context) {
        if (f(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (r) {
                    return;
                }
                m.execute(new ze(context, 0));
                return;
            }
            synchronized (u) {
                try {
                    tf1 tf1Var = o;
                    if (tf1Var == null) {
                        if (p == null) {
                            p = tf1.a(iv1.R(context));
                        }
                        if (p.a.a.isEmpty()) {
                        } else {
                            o = p;
                        }
                    } else if (!tf1Var.equals(p)) {
                        tf1 tf1Var2 = o;
                        p = tf1Var2;
                        iv1.O(context, tf1Var2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void g();

    public abstract void h();

    public abstract boolean j(int i);

    public abstract void l(int i);

    public abstract void m(View view);

    public abstract void n(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o(CharSequence charSequence);
}
