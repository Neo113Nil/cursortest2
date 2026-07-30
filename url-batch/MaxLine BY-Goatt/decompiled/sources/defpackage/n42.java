package defpackage;

import android.os.Trace;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n42 implements wb1 {
    public final int a;
    public final long b;
    public final o42 c;
    public eq2 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public m42 h;
    public boolean i;
    public final /* synthetic */ mh j;

    public n42(mh mhVar, int i, long j, o42 o42Var) {
        this.j = mhVar;
        this.a = i;
        this.b = j;
        this.c = o42Var;
    }

    @Override // defpackage.wb1
    public final void a() {
        this.i = true;
    }

    public final boolean b(db dbVar) {
        List list;
        if (c()) {
            Object e = ((mb1) ((kb1) this.j.n).b.invoke()).e(this.a);
            eq2 eq2Var = this.d;
            o42 o42Var = this.c;
            if (eq2Var == null) {
                long c = (e == null || ((kn1) o42Var.c).b(e) < 0) ? o42Var.a : ((kn1) o42Var.c).c(e);
                long a = dbVar.a();
                if ((!this.i || a <= 0) && c >= a) {
                    return true;
                }
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    d();
                    Unit unit = Unit.a;
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (e != null) {
                        kn1 kn1Var = (kn1) o42Var.c;
                        int b = kn1Var.b(e);
                        ((kn1) o42Var.c).e(o42.a(o42Var, nanoTime2, b >= 0 ? kn1Var.c[b] : 0L), e);
                    }
                    o42Var.a = o42.a(o42Var, nanoTime2, o42Var.a);
                } finally {
                }
            }
            if (!this.i) {
                if (!this.g) {
                    if (dbVar.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        eq2 eq2Var2 = this.d;
                        if (eq2Var2 == null) {
                            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                        }
                        c82 c82Var = new c82();
                        eq2Var2.c(new m7(6, c82Var));
                        List list2 = (List) c82Var.m;
                        m42 m42Var = null;
                        if (list2 != null) {
                            m42 m42Var2 = new m42();
                            m42Var2.e = this;
                            m42Var2.c = list2;
                            m42Var2.d = new List[list2.size()];
                            if (list2.isEmpty()) {
                                lh.e("NestedPrefetchController shouldn't be created with no states");
                                throw null;
                            }
                            m42Var = m42Var2;
                        }
                        this.h = m42Var;
                        this.g = true;
                        Unit unit2 = Unit.a;
                    } finally {
                    }
                }
                m42 m42Var3 = this.h;
                if (m42Var3 != null) {
                    List[] listArr = (List[]) m42Var3.d;
                    int i = m42Var3.a;
                    List list3 = (List) m42Var3.c;
                    if (i < list3.size()) {
                        if (((n42) m42Var3.e).f) {
                            lh.g("Should not execute nested prefetch on canceled request");
                            return false;
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (m42Var3.a < list3.size()) {
                            try {
                                if (listArr[m42Var3.a] == null) {
                                    if (dbVar.a() <= 0) {
                                        return true;
                                    }
                                    int i2 = m42Var3.a;
                                    xb1 xb1Var = (xb1) list3.get(i2);
                                    Function1 function1 = xb1Var.a;
                                    if (function1 == null) {
                                        list = ah0.m;
                                    } else {
                                        vb1 vb1Var = new vb1(xb1Var);
                                        function1.invoke(vb1Var);
                                        list = vb1Var.a;
                                    }
                                    listArr[i2] = list;
                                }
                                List list4 = listArr[m42Var3.a];
                                list4.getClass();
                                while (m42Var3.b < list4.size()) {
                                    if (((n42) list4.get(m42Var3.b)).b(dbVar)) {
                                        return true;
                                    }
                                    m42Var3.b++;
                                }
                                m42Var3.b = 0;
                                m42Var3.a++;
                            } finally {
                            }
                        }
                        Unit unit3 = Unit.a;
                    }
                }
            }
            if (!this.e) {
                long j = this.b;
                if (!u10.k(j)) {
                    long c2 = (e == null || ((kn1) o42Var.d).b(e) < 0) ? o42Var.b : ((kn1) o42Var.d).c(e);
                    long a2 = dbVar.a();
                    if ((!this.i || a2 <= 0) && c2 >= a2) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        if (this.f) {
                            lh.e("Callers should check whether the request is still valid before calling performMeasure()");
                        } else if (this.e) {
                            lh.e("Request was already measured!");
                        } else {
                            this.e = true;
                            eq2 eq2Var3 = this.d;
                            if (eq2Var3 != null) {
                                int b2 = eq2Var3.b();
                                for (int i3 = 0; i3 < b2; i3++) {
                                    eq2Var3.d(j, i3);
                                }
                            } else {
                                lh.e("performComposition() must be called before performMeasure()");
                            }
                        }
                        Unit unit4 = Unit.a;
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (e != null) {
                            kn1 kn1Var2 = (kn1) o42Var.d;
                            int b3 = kn1Var2.b(e);
                            ((kn1) o42Var.d).e(o42.a(o42Var, nanoTime4, b3 >= 0 ? kn1Var2.c[b3] : 0L), e);
                        }
                        o42Var.b = o42.a(o42Var, nanoTime4, o42Var.b);
                        return false;
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (this.f) {
            return false;
        }
        int b = ((mb1) ((kb1) this.j.n).b.invoke()).b();
        int i = this.a;
        return i >= 0 && i < b;
    }

    @Override // defpackage.wb1
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        eq2 eq2Var = this.d;
        if (eq2Var != null) {
            eq2Var.a();
        }
        this.d = null;
    }

    public final void d() {
        if (!c()) {
            lh.e("Callers should check whether the request is still valid before calling performComposition()");
            return;
        }
        if (this.d != null) {
            lh.e("Request was already composed!");
            return;
        }
        mh mhVar = this.j;
        mb1 mb1Var = (mb1) ((kb1) mhVar.n).b.invoke();
        int i = this.a;
        Object d = mb1Var.d(i);
        this.d = ((gq2) mhVar.o).a().g(d, ((kb1) mhVar.n).a(i, d, mb1Var.e(i)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append((Object) u10.l(this.b));
        sb.append(", isComposed = ");
        sb.append(this.d != null);
        sb.append(", isMeasured = ");
        sb.append(this.e);
        sb.append(", isCanceled = ");
        sb.append(this.f);
        sb.append(" }");
        return sb.toString();
    }
}
