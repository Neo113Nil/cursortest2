package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qq1 extends o81 implements Function1 {
    public final /* synthetic */ n12 m;
    public final /* synthetic */ n12 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ n12 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq1(n12 n12Var, n12 n12Var2, int i, int i2, n12 n12Var3, int i3, int i4, int i5, int i6) {
        super(1);
        this.m = n12Var;
        this.n = n12Var2;
        this.o = i;
        this.p = i2;
        this.q = n12Var3;
        this.r = i3;
        this.s = i4;
        this.t = i5;
        this.u = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m12 m12Var = (m12) obj;
        n12 n12Var = this.m;
        if (n12Var != null) {
            m12.i(m12Var, n12Var, (this.t - n12Var.m) / 2, (this.u - n12Var.n) / 2);
        }
        m12.i(m12Var, this.n, this.o, this.p);
        m12.i(m12Var, this.q, this.r, this.s);
        return Unit.a;
    }
}
