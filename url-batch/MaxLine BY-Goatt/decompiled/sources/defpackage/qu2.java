package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qu2 {
    public final sc1 a;
    public final gv2 b;
    public final nv2 c;
    public final boolean d;
    public final boolean e;
    public final iw2 f;
    public final cu1 g;
    public final z13 h;
    public final m70 i;
    public final u30 j;
    public final Function1 k;
    public final int l;

    public qu2(sc1 sc1Var, gv2 gv2Var, nv2 nv2Var, boolean z, boolean z2, iw2 iw2Var, cu1 cu1Var, z13 z13Var, m70 m70Var, Function1 function1, int i) {
        u30 u30Var = ap.d;
        this.a = sc1Var;
        this.b = gv2Var;
        this.c = nv2Var;
        this.d = z;
        this.e = z2;
        this.f = iw2Var;
        this.g = cu1Var;
        this.h = z13Var;
        this.i = m70Var;
        this.j = u30Var;
        this.k = function1;
        this.l = i;
    }

    public final void a(List list) {
        t21 t21Var = this.a.d;
        ArrayList N = zv.N(list);
        N.add(0, new am0());
        this.k.invoke(t21Var.f(N));
    }
}
