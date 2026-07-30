package defpackage;

import com.google.firebase.messaging.ServiceStarter;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hc1 implements zb1 {
    public final /* synthetic */ va1 a;

    public hc1(va1 va1Var) {
        this.a = va1Var;
    }

    @Override // defpackage.zb1
    public final int a() {
        long d;
        va1 va1Var = this.a;
        if (va1Var.g().k == ww1.m) {
            pj1 pj1Var = va1Var.g().n;
            d = zm3.d(pj1Var.e(), pj1Var.c()) & 4294967295L;
        } else {
            pj1 pj1Var2 = va1Var.g().n;
            d = zm3.d(pj1Var2.e(), pj1Var2.c()) >> 32;
        }
        return (int) d;
    }

    @Override // defpackage.zb1
    public final float b() {
        int h = ((iz1) this.a.b.b).h();
        return (h * ServiceStarter.ERROR_UNKNOWN) + ((iz1) r1.b.c).h();
    }

    @Override // defpackage.zb1
    public final nv c() {
        return new nv(-1, -1);
    }

    @Override // defpackage.zb1
    public final Object d(int i, dc1 dc1Var) {
        tt1 tt1Var = va1.t;
        va1 va1Var = this.a;
        va1Var.getClass();
        Object d = va1Var.d(ho1.m, new fj(va1Var, i, (o30) null), dc1Var);
        b50 b50Var = b50.m;
        if (d != b50Var) {
            d = Unit.a;
        }
        return d == b50Var ? d : Unit.a;
    }

    @Override // defpackage.zb1
    public final int e() {
        va1 va1Var = this.a;
        return (-va1Var.g().h) + va1Var.g().l;
    }

    @Override // defpackage.zb1
    public final float f() {
        va1 va1Var = this.a;
        int h = ((iz1) va1Var.b.b).h();
        int h2 = ((iz1) va1Var.b.c).h();
        return va1Var.c() ? (h * ServiceStarter.ERROR_UNKNOWN) + h2 + 100.0f : (h * ServiceStarter.ERROR_UNKNOWN) + h2;
    }
}
