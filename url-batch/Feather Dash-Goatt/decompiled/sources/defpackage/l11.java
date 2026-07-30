package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l11 extends sf1 implements Function2 {
    public m2 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o11 l;
    public final /* synthetic */ n11 m;
    public final /* synthetic */ gm0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l11(o11 o11Var, n11 n11Var, gm0 gm0Var, dn dnVar) {
        super(2, dnVar);
        this.l = o11Var;
        this.m = n11Var;
        this.n = gm0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((l11) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        l11 l11Var = new l11(this.l, this.m, this.n, dnVar);
        l11Var.k = obj;
        return l11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        jb0 t;
        be1 be1Var;
        sw0 sw0Var;
        sw0 sw0Var2;
        m2 m2Var;
        Throwable th;
        List D;
        o11 o11Var;
        tn tnVar = tn.d;
        int i = this.j;
        dn dnVar = null;
        if (i == 0) {
            ca0.v(obj);
            t = t80.t(((sn) this.k).f());
            o11 o11Var2 = this.l;
            synchronized (o11Var2.c) {
                Throwable th2 = o11Var2.e;
                if (th2 != null) {
                    throw th2;
                }
                if (((k11) o11Var2.u.getValue()).compareTo(k11.e) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (o11Var2.d != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                o11Var2.d = t;
                o11Var2.y();
            }
            jl jlVar = new jl(6, this.l);
            pb1.e(pb1.a);
            synchronized (pb1.c) {
                pb1.h = CollectionsKt.v(pb1.h, jlVar);
            }
            m2 m2Var2 = new m2(2, jlVar);
            be1 be1Var2 = o11.z;
            j50 j50Var = this.l.y;
            try {
                do {
                    be1Var = o11.z;
                    sw0Var = (sw0) be1Var.getValue();
                    j41 j41Var = j41.j;
                    lw0 lw0Var = sw0Var.h;
                    if (lw0Var.containsKey(j50Var)) {
                        sw0Var2 = sw0Var;
                    } else if (sw0Var.isEmpty()) {
                        sw0Var2 = new sw0(j50Var, j50Var, lw0Var.f(j50Var, new sh0(j41Var, j41Var)));
                    } else {
                        Object obj2 = sw0Var.g;
                        Object obj3 = lw0Var.get(obj2);
                        obj3.getClass();
                        sw0Var2 = new sw0(sw0Var.e, j50Var, lw0Var.f(obj2, new sh0(((sh0) obj3).a, j50Var)).f(j50Var, new sh0(obj2, j41Var)));
                    }
                    if (sw0Var != sw0Var2) {
                    }
                    break;
                } while (!be1Var.h(sw0Var, sw0Var2));
                break;
                o11 o11Var3 = this.l;
                synchronized (o11Var3.c) {
                    D = o11Var3.D();
                }
                int size = D.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((tl) D.get(i2)).t();
                }
                f fVar = new f(this.m, this.n, dnVar, 10);
                this.k = t;
                this.i = m2Var2;
                this.j = 1;
                if (la0.A(fVar, this) == tnVar) {
                    return tnVar;
                }
                m2Var = m2Var2;
            } catch (Throwable th3) {
                m2Var = m2Var2;
                th = th3;
                m2Var.c();
                o11Var = this.l;
                synchronized (o11Var.c) {
                }
            }
        } else {
            if (i != 1) {
                dd0.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m2Var = this.i;
            t = (jb0) this.k;
            try {
                ca0.v(obj);
            } catch (Throwable th4) {
                th = th4;
                m2Var.c();
                o11Var = this.l;
                synchronized (o11Var.c) {
                    try {
                        if (o11Var.d == t) {
                            o11Var.d = null;
                        }
                        o11Var.y();
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                be1 be1Var3 = o11.z;
                j41.e(this.l.y);
                throw th;
            }
        }
        m2Var.c();
        o11 o11Var4 = this.l;
        synchronized (o11Var4.c) {
            try {
                if (o11Var4.d == t) {
                    o11Var4.d = null;
                }
                o11Var4.y();
            } catch (Throwable th6) {
                throw th6;
            }
        }
        be1 be1Var4 = o11.z;
        j41.e(this.l.y);
        return Unit.a;
    }
}
