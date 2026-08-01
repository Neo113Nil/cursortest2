package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import defpackage.aq;
import defpackage.bl;
import defpackage.br;
import defpackage.cr;
import defpackage.e6;
import defpackage.k0;
import defpackage.qf;
import defpackage.t8;
import defpackage.w00;
import defpackage.x00;
import defpackage.z00;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class b {
    public static final Object j = new Object();
    public final Object a = new Object();
    public final z00 b = new z00();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    public b() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        ((e6) e6.b0().i).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        t8.h(str, " on a background thread", "Cannot invoke ");
    }

    public final void b(cr crVar) {
        if (crVar.b) {
            if (!crVar.e()) {
                crVar.c(false);
                return;
            }
            int i = crVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            crVar.c = i2;
            k0 k0Var = crVar.a;
            Object obj = this.e;
            k0Var.getClass();
            aq aqVar = (aq) obj;
            qf qfVar = (qf) k0Var.g;
            if (aqVar == null || !qfVar.f0) {
                return;
            }
            View F = qfVar.F();
            if (F.getParent() != null) {
                t8.t("DialogFragment can not be attached to a container view");
                return;
            }
            if (qfVar.j0 != null) {
                if (bl.G(3)) {
                    Log.d("FragmentManager", "DialogFragment " + k0Var + " setting the content view on " + qfVar.j0);
                }
                qfVar.j0.setContentView(F);
            }
        }
    }

    public final void c(cr crVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (crVar != null) {
                b(crVar);
                crVar = null;
            } else {
                z00 z00Var = this.b;
                z00Var.getClass();
                x00 x00Var = new x00(z00Var);
                z00Var.h.put(x00Var, Boolean.FALSE);
                while (x00Var.hasNext()) {
                    b((cr) ((Map.Entry) x00Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(k0 k0Var) {
        Object obj;
        a("observeForever");
        br brVar = new br(this, k0Var);
        z00 z00Var = this.b;
        w00 a = z00Var.a(k0Var);
        if (a != null) {
            obj = a.g;
        } else {
            w00 w00Var = new w00(k0Var, brVar);
            z00Var.i++;
            w00 w00Var2 = z00Var.g;
            if (w00Var2 == null) {
                z00Var.f = w00Var;
                z00Var.g = w00Var;
            } else {
                w00Var2.h = w00Var;
                w00Var.i = w00Var2;
                z00Var.g = w00Var;
            }
            obj = null;
        }
        cr crVar = (cr) obj;
        if (crVar instanceof LiveData$LifecycleBoundObserver) {
            t8.k("Cannot add the same observer with different lifecycles");
        } else {
            if (crVar != null) {
                return;
            }
            brVar.c(true);
        }
    }

    public final void e(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }
}
