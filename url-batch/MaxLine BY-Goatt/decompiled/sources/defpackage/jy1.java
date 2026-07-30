package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jy1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ob1 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ iy1 p;
    public final /* synthetic */ long q;
    public final /* synthetic */ zn r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy1(ob1 ob1Var, long j, iy1 iy1Var, long j2, zn znVar, int i, int i2) {
        super(1);
        this.m = i2;
        this.n = ob1Var;
        this.o = j;
        this.p = iy1Var;
        this.q = j2;
        this.r = znVar;
        this.s = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                int intValue = ((Number) obj).intValue();
                yn ynVar = qb2.B;
                ob1 ob1Var = this.n;
                return zm3.y(ob1Var, intValue, this.o, this.p, this.q, ww1.n, ynVar, this.r, ob1Var.n.getLayoutDirection(), false, this.s);
            default:
                int intValue2 = ((Number) obj).intValue();
                yn ynVar2 = qb2.B;
                ob1 ob1Var2 = this.n;
                return zm3.y(ob1Var2, intValue2, this.o, this.p, this.q, ww1.n, ynVar2, this.r, ob1Var2.n.getLayoutDirection(), false, this.s);
        }
    }
}
