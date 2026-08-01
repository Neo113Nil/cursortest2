package k1;

import c2.i1;
import c2.o0;
import c2.x1;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends d1.k implements c2.v, x1 {
    public Function1 C;

    @Override // c2.x1
    public final boolean b() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.C + ')';
    }

    @Override // c2.x1
    public final void u(j2.u uVar) {
        boolean z10;
        f0 f0Var;
        i1 s3 = c2.k.s(this, 2);
        if (s3.S) {
            f0 f0Var2 = s3.Q;
            z10 = s3.R;
            f0Var = f0Var2;
        } else {
            d0 d0Var = v.f5350a;
            if (d0Var == null) {
                v.f5350a = new d0();
            } else {
                d0Var.a();
            }
            d0 d0Var2 = v.f5350a;
            d0Var2.getClass();
            d0Var2.f5313z = s3.B.L;
            d0Var2.f5312y = z4.m.b(s3.f133i);
            b1.i e2 = b1.x.e();
            Function1 e9 = e2 != null ? e2.e() : null;
            b1.i h10 = b1.x.h(e2);
            try {
                this.C.invoke(d0Var2);
                b1.x.k(e2, h10, e9);
                f0Var = d0Var2.f5310w;
                z10 = d0Var2.f5311x;
            } catch (Throwable th) {
                b1.x.k(e2, h10, e9);
                throw th;
            }
        }
        if (z10) {
            wd.y[] yVarArr = j2.s.f5019a;
            j2.t tVar = j2.q.M;
            wd.y yVar = j2.s.f5019a[30];
            uVar.b(tVar, f0Var);
        }
    }

    @Override // c2.v
    public final a2.h0 v(o0 o0Var, a2.f0 f0Var, long j) {
        a2.o0 c10 = f0Var.c(j);
        return a2.i0.V(o0Var, c10.f131d, c10.f132e, new a3.d(5, c10, this));
    }

    @Override // d1.k
    public final boolean x() {
        return false;
    }
}
