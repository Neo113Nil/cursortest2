package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xb1 {
    public final Function1 a;
    public final o42 b = new o42();
    public mh c;

    public xb1(oo0 oo0Var) {
        this.a = oo0Var;
    }

    public final wb1 a(long j, int i) {
        mh mhVar = this.c;
        if (mhVar == null) {
            return qe0.a;
        }
        n42 n42Var = new n42(mhVar, i, j, this.b);
        eb ebVar = (eb) mhVar.p;
        ebVar.n.b(n42Var);
        if (!ebVar.o) {
            ebVar.o = true;
            ebVar.m.post(ebVar);
        }
        return n42Var;
    }
}
