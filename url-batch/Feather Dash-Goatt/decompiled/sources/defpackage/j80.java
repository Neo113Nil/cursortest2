package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j80 {
    public final eo0 a = new eo0(new h80[16]);
    public final av0 b = gb0.F(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final av0 d = gb0.F(Boolean.TRUE);

    public final void a(int i, hl hlVar) {
        hlVar.Y(-318043801);
        int i2 = (hlVar.h(this) ? 4 : 2) | i;
        if (hlVar.O(i2 & 1, (i2 & 3) != 2)) {
            Object L = hlVar.L();
            j41 j41Var = bl.a;
            if (L == j41Var) {
                L = gb0.F(null);
                hlVar.h0(L);
            }
            ao0 ao0Var = (ao0) L;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                hlVar.W(-144841960);
                boolean h = hlVar.h(this);
                Object L2 = hlVar.L();
                if (h || L2 == j41Var) {
                    L2 = new qk(ao0Var, this, null);
                    hlVar.h0(L2);
                }
                p4.i(hlVar, this, (Function2) L2);
            } else {
                hlVar.W(-151918981);
            }
            hlVar.p(false);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new jl(i, 1, this);
        }
    }
}
