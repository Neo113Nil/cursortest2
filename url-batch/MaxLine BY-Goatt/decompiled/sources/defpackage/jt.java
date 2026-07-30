package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class jt implements hu0 {
    public final CoroutineContext m;
    public final int n;
    public final hq o;

    public jt(CoroutineContext coroutineContext, int i, hq hqVar) {
        this.m = coroutineContext;
        this.n = i;
        this.o = hqVar;
    }

    @Override // defpackage.xm0
    public Object a(ym0 ym0Var, o30 o30Var) {
        Object t = j8.t(new ed(ym0Var, this, (o30) null, 2), o30Var);
        return t == b50.m ? t : Unit.a;
    }

    @Override // defpackage.hu0
    public final xm0 b(CoroutineContext coroutineContext, int i, hq hqVar) {
        CoroutineContext coroutineContext2 = this.m;
        CoroutineContext p = coroutineContext.p(coroutineContext2);
        hq hqVar2 = hq.m;
        hq hqVar3 = this.o;
        int i2 = this.n;
        if (hqVar == hqVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            hqVar = hqVar3;
        }
        return (Intrinsics.b(p, coroutineContext2) && i == i2 && hqVar == hqVar3) ? this : e(p, i, hqVar);
    }

    public String c() {
        return null;
    }

    public abstract Object d(e52 e52Var, v vVar);

    public abstract jt e(CoroutineContext coroutineContext, int i, hq hqVar);

    public xm0 f() {
        return null;
    }

    public gt g(a50 a50Var) {
        int i = this.n;
        if (i == -3) {
            i = -2;
        }
        d50 d50Var = d50.o;
        Function2 vVar = new v(10, null, this);
        e52 e52Var = new e52(r40.b(a50Var, this.m), s93.g(i, 4, this.o));
        e52Var.n0(d50Var, e52Var, vVar);
        return e52Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c = c();
        if (c != null) {
            arrayList.add(c);
        }
        h hVar = h.m;
        CoroutineContext coroutineContext = this.m;
        if (coroutineContext != hVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.n;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        hq hqVar = hq.m;
        hq hqVar2 = this.o;
        if (hqVar2 != hqVar) {
            arrayList.add("onBufferOverflow=" + hqVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return in1.m(sb, zv.A(arrayList, ", ", null, null, null, 62), ']');
    }
}
