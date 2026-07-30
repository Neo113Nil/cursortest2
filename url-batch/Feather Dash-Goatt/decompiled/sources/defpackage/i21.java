package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i21 {
    public Set a;
    public ql b;
    public final eo0 c;
    public wn0 d;
    public eo0 e;
    public final eo0 f;
    public final eo0 g;
    public wn0 h;
    public vn0 i;
    public ArrayList j;
    public wn0 k;

    public i21() {
        eo0 eo0Var = new eo0(new k21[16]);
        this.c = eo0Var;
        wn0 wn0Var = r61.a;
        this.d = new wn0();
        this.e = eo0Var;
        this.f = new eo0(new Object[16]);
        this.g = new eo0(new Function0[16]);
    }

    public static final boolean f(k21 k21Var, eo0 eo0Var) {
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            j21 j21Var = ((k21) objArr[i2]).a;
            if (j21Var instanceof dw0) {
                eo0 eo0Var2 = ((dw0) j21Var).e;
                if (eo0Var2.j(k21Var) || f(k21Var, eo0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        eo0 eo0Var = this.c;
        eo0Var.g();
        this.d.b();
        this.e = eo0Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                j21 j21Var = (j21) it.next();
                it.remove();
                j21Var.e();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        eo0 eo0Var = this.f;
        int i = 1;
        if (eo0Var.g != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                wn0 wn0Var = this.h;
                for (int i2 = eo0Var.g - 1; -1 < i2; i2--) {
                    Object obj = eo0Var.d[i2];
                    try {
                        if (obj instanceof k21) {
                            j21 j21Var = ((k21) obj).a;
                            set.remove(j21Var);
                            j21Var.g();
                        }
                        if (obj instanceof mk) {
                            if (wn0Var == null || !wn0Var.c(obj)) {
                                ((mk) obj).c();
                            } else {
                                ((mk) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        ql qlVar = this.b;
                        if (qlVar != null) {
                            yr1.e0(th, new vc((rl) qlVar, i, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        eo0 eo0Var2 = this.c;
        if (eo0Var2.g != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = eo0Var2.d;
                    int i3 = eo0Var2.g;
                    for (int i4 = 0; i4 < i3; i4++) {
                        k21 k21Var = (k21) objArr[i4];
                        j21 j21Var2 = k21Var.a;
                        set2.remove(j21Var2);
                        try {
                            j21Var2.c();
                        } catch (Throwable th2) {
                            ql qlVar2 = this.b;
                            if (qlVar2 != null) {
                                yr1.e0(th2, new vc((rl) qlVar2, i, k21Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        eo0 eo0Var = this.g;
        if (eo0Var.g != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eo0Var.d;
                int i = eo0Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                eo0Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(k21 k21Var) {
        if (!this.d.c(k21Var)) {
            wn0 wn0Var = this.k;
            if (wn0Var == null || !wn0Var.c(k21Var)) {
                this.f.b(k21Var);
                return;
            }
            return;
        }
        this.d.l(k21Var);
        if (!this.e.j(k21Var)) {
            eo0 eo0Var = this.c;
            if (!eo0Var.j(k21Var)) {
                f(k21Var, eo0Var);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(k21Var.a);
    }

    public final void g(Set set, rl rlVar) {
        a();
        this.a = set;
        this.b = rlVar;
    }
}
