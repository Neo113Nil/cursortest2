package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dk {
    static final ayo h = new ayo(new oo(1), 1, null);
    public static final int a = -100;
    public static vv b = null;
    public static vv c = null;
    private static Boolean i = null;
    public static boolean d = false;
    public static final qk e = new qk(0);
    public static final Object f = new Object();
    public static final Object g = new Object();

    public static void i(dk dkVar) {
        synchronized (f) {
            qj qjVar = new qj(e);
            while (qjVar.hasNext()) {
                dk dkVar2 = (dk) ((WeakReference) qjVar.next()).get();
                if (dkVar2 == dkVar || dkVar2 == null) {
                    qjVar.remove();
                }
            }
        }
    }

    static boolean n(Context context) {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ed.class), 640);
                if (serviceInfo.metaData != null) {
                    i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                i = false;
            }
        }
        return i.booleanValue();
    }

    public Context a() {
        throw null;
    }

    public abstract cs b();

    public abstract View c(int i2);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract void o();

    public abstract void p(int i2);
}
