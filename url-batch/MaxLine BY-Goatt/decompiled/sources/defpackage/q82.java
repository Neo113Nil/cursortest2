package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q82 {
    public Set a;
    public g00 b;
    public final eo1 c;
    public un1 d;
    public eo1 e;
    public final eo1 f;
    public final eo1 g;
    public un1 h;
    public tn1 i;
    public ArrayList j;
    public un1 k;

    public q82() {
        eo1 eo1Var = new eo1(new s82[16]);
        this.c = eo1Var;
        int i = pe2.a;
        this.d = new un1();
        this.e = eo1Var;
        this.f = new eo1(new Object[16]);
        this.g = new eo1(new Function0[16]);
    }

    public final void a() {
        this.a = null;
        this.b = null;
        eo1 eo1Var = this.c;
        eo1Var.g();
        this.d.b();
        this.e = eo1Var;
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
                r82 r82Var = (r82) it.next();
                it.remove();
                r82Var.c();
            }
            Unit unit = Unit.a;
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
        eo1 eo1Var = this.f;
        int i = 0;
        if (eo1Var.o != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                un1 un1Var = this.h;
                int i2 = eo1Var.o;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = eo1Var.m[i2];
                    try {
                        if (obj instanceof s82) {
                            r82 r82Var = ((s82) obj).a;
                            set.remove(r82Var);
                            r82Var.d();
                        }
                        if (obj instanceof gz) {
                            if (un1Var == null || !un1Var.c(obj)) {
                                ((gz) obj).b();
                            } else {
                                ((gz) obj).a();
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        g00 g00Var = this.b;
                        if (g00Var != null) {
                            s93.T(th, new h00(i, (i00) g00Var, obj));
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.a;
            } finally {
            }
        }
        eo1 eo1Var2 = this.c;
        if (eo1Var2.o != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = eo1Var2.m;
                    int i3 = eo1Var2.o;
                    for (int i4 = 0; i4 < i3; i4++) {
                        s82 s82Var = (s82) objArr[i4];
                        r82 r82Var2 = s82Var.a;
                        set2.remove(r82Var2);
                        try {
                            r82Var2.a();
                            Unit unit3 = Unit.a;
                        } catch (Throwable th2) {
                            g00 g00Var2 = this.b;
                            if (g00Var2 != null) {
                                s93.T(th2, new h00(i, (i00) g00Var2, s82Var));
                            }
                            throw th2;
                        }
                    }
                }
                Unit unit4 = Unit.a;
            } finally {
            }
        }
    }

    public final void d(s82 s82Var) {
        if (this.d.c(s82Var)) {
            this.d.k(s82Var);
            if (!this.e.k(s82Var)) {
                eo1 eo1Var = this.c;
                if (!eo1Var.k(s82Var)) {
                    Object[] objArr = eo1Var.m;
                    int i = eo1Var.o;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (((s82) objArr[i2]).a instanceof o02) {
                            throw null;
                        }
                    }
                }
            }
            Set set = this.a;
            if (set == null) {
                return;
            } else {
                set.add(s82Var.a);
            }
        }
        un1 un1Var = this.k;
        if (un1Var == null || !un1Var.c(s82Var)) {
            this.f.b(s82Var);
        }
    }

    public final void e(Set set, i00 i00Var) {
        a();
        this.a = set;
        this.b = i00Var;
    }
}
