package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ao0 extends o81 implements Function1 {
    public final /* synthetic */ int[] m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ n12[] q;
    public final /* synthetic */ bo0 r;
    public final /* synthetic */ int s;
    public final /* synthetic */ qj1 t;
    public final /* synthetic */ int[] u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(int[] iArr, int i, int i2, int i3, n12[] n12VarArr, bo0 bo0Var, int i4, qj1 qj1Var, int[] iArr2) {
        super(1);
        this.m = iArr;
        this.n = i;
        this.o = i2;
        this.p = i3;
        this.q = n12VarArr;
        this.r = bo0Var;
        this.s = i4;
        this.t = qj1Var;
        this.u = iArr2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ap apVar;
        m12 m12Var = (m12) obj;
        int[] iArr = this.m;
        int i = iArr != null ? iArr[this.n] : 0;
        int i2 = this.o;
        for (int i3 = i2; i3 < this.p; i3++) {
            n12 n12Var = this.q[i3];
            n12Var.getClass();
            Object i4 = n12Var.i();
            dc2 dc2Var = i4 instanceof dc2 ? (dc2) i4 : null;
            this.t.getLayoutDirection();
            if (dc2Var == null || (apVar = dc2Var.c) == null) {
                apVar = this.r.d;
            }
            m12.g(m12Var, n12Var, this.u[i3 - i2], apVar.o(this.s - n12Var.d0(), u81.m) + i);
        }
        return Unit.a;
    }
}
