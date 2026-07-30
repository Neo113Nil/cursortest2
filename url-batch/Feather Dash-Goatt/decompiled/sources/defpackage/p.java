package defpackage;

import com.appsflyer.internal.l;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class p extends qb0 implements dn, sn {
    public final CoroutineContext i;

    public p(CoroutineContext coroutineContext, boolean z) {
        super(z);
        U((jb0) coroutineContext.d(j41.m));
        this.i = coroutineContext.i(this);
    }

    @Override // defpackage.qb0
    public final String H() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.qb0
    public final void T(ij ijVar) {
        m90.z(ijVar, this.i);
    }

    @Override // defpackage.qb0
    public final void d0(Object obj) {
        if (!(obj instanceof hj)) {
            q0(obj);
        } else {
            hj hjVar = (hj) obj;
            p0(hjVar.a, hj.b.get(hjVar) != 0);
        }
    }

    @Override // defpackage.sn
    public final CoroutineContext f() {
        return this.i;
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return this.i;
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        Throwable a = k31.a(obj);
        if (a != null) {
            obj = new hj(a, false);
        }
        Object Z = Z(obj);
        if (Z == yr1.j) {
            return;
        }
        C(Z);
    }

    public final void r0(vn vnVar, p pVar, Function2 function2) {
        Object b;
        int ordinal = vnVar.ordinal();
        if (ordinal == 0) {
            m90.M(function2, pVar, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                function2.getClass();
                dn b2 = qa0.b(qa0.a(pVar, this, function2));
                Unit unit = Unit.a;
                i31 i31Var = k31.d;
                b2.l(unit);
                return;
            }
            if (ordinal != 3) {
                l.a();
                return;
            }
            try {
                CoroutineContext coroutineContext = this.i;
                Object c = bi1.c(coroutineContext, null);
                try {
                    if (function2 instanceof yc) {
                        tj1.b(2, function2);
                        b = function2.b(pVar, this);
                    } else {
                        b = qa0.c(function2, pVar, this);
                    }
                    bi1.a(coroutineContext, c);
                    if (b != tn.d) {
                        i31 i31Var2 = k31.d;
                        l(b);
                    }
                } catch (Throwable th) {
                    bi1.a(coroutineContext, c);
                    throw th;
                }
            } catch (Throwable th2) {
                i31 i31Var3 = k31.d;
                l(new j31(th2));
            }
        }
    }

    public void q0(Object obj) {
    }

    public void p0(Throwable th, boolean z) {
    }
}
