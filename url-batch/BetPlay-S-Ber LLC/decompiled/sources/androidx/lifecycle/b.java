package androidx.lifecycle;

import android.app.Dialog;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.g;
import androidx.fragment.app.n;
import defpackage.j1;
import defpackage.m10;
import defpackage.n10;
import defpackage.nq;
import defpackage.nr;
import defpackage.o8;
import defpackage.or;
import defpackage.p10;
import defpackage.v6;
import defpackage.yv;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class b {
    public static final Object j = new Object();
    public final Object a = new Object();
    public final p10 b = new p10();
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
        ((v6) v6.e0().o).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        o8.r(str, " on a background thread", "Cannot invoke ");
    }

    public final void b(or orVar) {
        boolean z;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (orVar.b) {
            if (!orVar.e()) {
                orVar.c(false);
                return;
            }
            int i = orVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            orVar.c = i2;
            yv yvVar = orVar.a;
            Object obj = this.e;
            j1 j1Var = (j1) yvVar;
            j1Var.getClass();
            nq nqVar = (nq) obj;
            g gVar = (g) j1Var.g;
            if (nqVar != null) {
                z = gVar.mShowsDialog;
                if (z) {
                    View requireView = gVar.requireView();
                    if (requireView.getParent() != null) {
                        o8.t("DialogFragment can not be attached to a container view");
                        return;
                    }
                    dialog = gVar.mDialog;
                    if (dialog != null) {
                        if (n.G(3)) {
                            StringBuilder sb = new StringBuilder("DialogFragment ");
                            sb.append(j1Var);
                            sb.append(" setting the content view on ");
                            dialog3 = gVar.mDialog;
                            sb.append(dialog3);
                            Log.d("FragmentManager", sb.toString());
                        }
                        dialog2 = gVar.mDialog;
                        dialog2.setContentView(requireView);
                    }
                }
            }
        }
    }

    public final void c(or orVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (orVar != null) {
                b(orVar);
                orVar = null;
            } else {
                p10 p10Var = this.b;
                p10Var.getClass();
                n10 n10Var = new n10(p10Var);
                p10Var.h.put(n10Var, Boolean.FALSE);
                while (n10Var.hasNext()) {
                    b((or) ((Map.Entry) n10Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(yv yvVar) {
        Object obj;
        a("observeForever");
        nr nrVar = new nr(this, yvVar);
        p10 p10Var = this.b;
        m10 a = p10Var.a(yvVar);
        if (a != null) {
            obj = a.g;
        } else {
            m10 m10Var = new m10(yvVar, nrVar);
            p10Var.i++;
            m10 m10Var2 = p10Var.g;
            if (m10Var2 == null) {
                p10Var.f = m10Var;
                p10Var.g = m10Var;
            } else {
                m10Var2.h = m10Var;
                m10Var.i = m10Var2;
                p10Var.g = m10Var;
            }
            obj = null;
        }
        or orVar = (or) obj;
        if (orVar instanceof LiveData$LifecycleBoundObserver) {
            o8.j("Cannot add the same observer with different lifecycles");
        } else {
            if (orVar != null) {
                return;
            }
            nrVar.c(true);
        }
    }
}
