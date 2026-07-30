package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rq1 extends o81 implements Function1 {
    public final /* synthetic */ qj1 A;
    public final /* synthetic */ n12 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ float o;
    public final /* synthetic */ n12 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ n12 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ float v;
    public final /* synthetic */ n12 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ float y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq1(n12 n12Var, boolean z, float f, n12 n12Var2, int i, float f2, float f3, n12 n12Var3, int i2, float f4, n12 n12Var4, int i3, float f5, int i4, qj1 qj1Var) {
        super(1);
        this.m = n12Var;
        this.n = z;
        this.o = f;
        this.p = n12Var2;
        this.q = i;
        this.r = f2;
        this.s = f3;
        this.t = n12Var3;
        this.u = i2;
        this.v = f4;
        this.w = n12Var4;
        this.x = i3;
        this.y = f5;
        this.z = i4;
        this.A = qj1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m12 m12Var = (m12) obj;
        float f = this.v;
        float f2 = this.s;
        n12 n12Var = this.m;
        if (n12Var != null) {
            m12.i(m12Var, n12Var, (this.z - n12Var.m) / 2, si1.b((f - this.A.R(4.0f)) + f2));
        }
        if (this.n || this.o != 0.0f) {
            m12.i(m12Var, this.p, this.q, si1.b(this.r + f2));
        }
        m12.i(m12Var, this.t, this.u, si1.b(f + f2));
        m12.i(m12Var, this.w, this.x, si1.b(this.y + f2));
        return Unit.a;
    }
}
