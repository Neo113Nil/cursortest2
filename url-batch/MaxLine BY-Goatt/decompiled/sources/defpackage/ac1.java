package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ac1 implements zb1 {
    public final /* synthetic */ q80 a;
    public final /* synthetic */ boolean b;

    public ac1(q80 q80Var, boolean z) {
        this.a = q80Var;
        this.b = z;
    }

    @Override // defpackage.zb1
    public final int a() {
        q80 q80Var = this.a;
        return (int) (q80Var.l().e == ww1.m ? q80Var.l().f() & 4294967295L : q80Var.l().f() >> 32);
    }

    @Override // defpackage.zb1
    public final float b() {
        q80 q80Var = this.a;
        return si1.c(q80Var.k() * q80Var.o()) + (q80Var.j() * q80Var.o());
    }

    @Override // defpackage.zb1
    public final nv c() {
        boolean z = this.b;
        q80 q80Var = this.a;
        return z ? new nv(q80Var.m(), 1) : new nv(1, q80Var.m());
    }

    @Override // defpackage.zb1
    public final Object d(int i, dc1 dc1Var) {
        q80 q80Var = this.a;
        Object d = q80Var.d(ho1.m, new dc1(q80Var, i, null, 1), dc1Var);
        b50 b50Var = b50.m;
        if (d != b50Var) {
            d = Unit.a;
        }
        return d == b50Var ? d : Unit.a;
    }

    @Override // defpackage.zb1
    public final int e() {
        q80 q80Var = this.a;
        return (-q80Var.l().f) + q80Var.l().d;
    }

    @Override // defpackage.zb1
    public final float f() {
        q80 q80Var = this.a;
        return uy1.a(q80Var.l(), q80Var.m());
    }
}
