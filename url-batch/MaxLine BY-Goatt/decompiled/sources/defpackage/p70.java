package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p70 implements hd {
    public final js0 a;
    public final k03 b;
    public final Object c;
    public final sd d;
    public final sd e;
    public final sd f;
    public final Object g;
    public final long h;

    public p70(q70 q70Var, k03 k03Var, Object obj, sd sdVar) {
        js0 js0Var = new js0(q70Var.a);
        this.a = js0Var;
        this.b = k03Var;
        this.c = obj;
        sd sdVar2 = (sd) k03Var.a.invoke(obj);
        this.d = sdVar2;
        this.e = yk3.A(sdVar);
        this.g = k03Var.b.invoke(js0Var.v(sdVar2, sdVar));
        if (((sd) js0Var.o) == null) {
            js0Var.o = sdVar2.c();
        }
        sd sdVar3 = (sd) js0Var.o;
        if (sdVar3 == null) {
            Intrinsics.f("velocityVector");
            throw null;
        }
        int b = sdVar3.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            at0 at0Var = (at0) js0Var.m;
            sdVar2.getClass();
            j = Math.max(j, ((long) (Math.exp(((qm0) at0Var.m).b(sdVar.a(i)) / (rm0.a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = j;
        sd A = yk3.A(this.a.w(j, this.d, sdVar));
        this.f = A;
        int b2 = A.b();
        for (int i2 = 0; i2 < b2; i2++) {
            sd sdVar4 = this.f;
            float a = sdVar4.a(i2);
            this.a.getClass();
            this.a.getClass();
            sdVar4.e(i2, d.b(a, -0.0f, 0.0f));
        }
    }

    @Override // defpackage.hd
    public final boolean a() {
        return false;
    }

    @Override // defpackage.hd
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        Function1 function1 = this.b.b;
        js0 js0Var = this.a;
        sd sdVar = (sd) js0Var.n;
        sd sdVar2 = this.d;
        if (sdVar == null) {
            js0Var.n = sdVar2.c();
        }
        sd sdVar3 = (sd) js0Var.n;
        if (sdVar3 == null) {
            Intrinsics.f("valueVector");
            throw null;
        }
        int b = sdVar3.b();
        int i = 0;
        while (true) {
            sd sdVar4 = (sd) js0Var.n;
            if (i >= b) {
                if (sdVar4 != null) {
                    return function1.invoke(sdVar4);
                }
                Intrinsics.f("valueVector");
                throw null;
            }
            if (sdVar4 == null) {
                Intrinsics.f("valueVector");
                throw null;
            }
            at0 at0Var = (at0) js0Var.m;
            float a = sdVar2.a(i);
            long j2 = j / 1000000;
            pm0 a2 = ((qm0) at0Var.m).a(this.e.a(i));
            long j3 = a2.c;
            sdVar4.e(i, (Math.signum(a2.a) * a2.b * t9.a(j3 > 0 ? j2 / j3 : 1.0f).a) + a);
            i++;
        }
    }

    @Override // defpackage.hd
    public final long c() {
        return this.h;
    }

    @Override // defpackage.hd
    public final k03 d() {
        return this.b;
    }

    @Override // defpackage.hd
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.hd
    public final sd f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.w(j, this.d, this.e);
    }
}
