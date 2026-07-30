package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pp implements m7 {
    public final o91 a;
    public final c51 b;
    public final Object c;
    public final v7 d;
    public final v7 e;
    public final v7 f;
    public final Object g;
    public final long h;

    public pp(qp qpVar, c51 c51Var, Object obj, v7 v7Var) {
        o91 o91Var = new o91(qpVar.a);
        this.a = o91Var;
        this.b = c51Var;
        this.c = obj;
        v7 v7Var2 = (v7) ((Function1) c51Var.e).invoke(obj);
        this.d = v7Var2;
        this.e = op.w(v7Var);
        Function1 function1 = (Function1) c51Var.g;
        if (((v7) o91Var.h) == null) {
            o91Var.h = v7Var2.c();
        }
        v7 v7Var3 = (v7) o91Var.h;
        if (v7Var3 == null) {
            Intrinsics.e("targetVector");
            throw null;
        }
        int b = v7Var3.b();
        int i = 0;
        while (true) {
            v7 v7Var4 = (v7) o91Var.h;
            if (i >= b) {
                if (v7Var4 == null) {
                    Intrinsics.e("targetVector");
                    throw null;
                }
                this.g = function1.invoke(v7Var4);
                o91 o91Var2 = this.a;
                v7 v7Var5 = this.d;
                if (((v7) o91Var2.g) == null) {
                    o91Var2.g = v7Var5.c();
                }
                v7 v7Var6 = (v7) o91Var2.g;
                if (v7Var6 == null) {
                    Intrinsics.e("velocityVector");
                    throw null;
                }
                int b2 = v7Var6.b();
                long j = 0;
                for (int i2 = 0; i2 < b2; i2++) {
                    nq0 nq0Var = (nq0) o91Var2.d;
                    v7Var5.getClass();
                    j = Math.max(j, ((long) (Math.exp(((vz) nq0Var.e).b(v7Var.a(i2)) / (wz.a - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = j;
                v7 w = op.w(this.a.j(j, this.d, v7Var));
                this.f = w;
                int b3 = w.b();
                for (int i3 = 0; i3 < b3; i3++) {
                    v7 v7Var7 = this.f;
                    float a = v7Var7.a(i3);
                    this.a.getClass();
                    this.a.getClass();
                    v7Var7.e(b11.b(a, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (v7Var4 == null) {
                Intrinsics.e("targetVector");
                throw null;
            }
            nq0 nq0Var2 = (nq0) o91Var.d;
            float a2 = v7Var2.a(i);
            float a3 = v7Var.a(i);
            double b4 = ((vz) nq0Var2.e).b(a3);
            double d = wz.a;
            int i4 = i;
            v7Var4.e((Math.signum(a3) * ((float) (Math.exp((d / (d - 1.0d)) * b4) * r13.a * r13.b))) + a2, i4);
            i = i4 + 1;
        }
    }

    @Override // defpackage.m7
    public final boolean a() {
        return false;
    }

    @Override // defpackage.m7
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        Function1 function1 = (Function1) this.b.g;
        o91 o91Var = this.a;
        v7 v7Var = (v7) o91Var.e;
        v7 v7Var2 = this.d;
        if (v7Var == null) {
            o91Var.e = v7Var2.c();
        }
        v7 v7Var3 = (v7) o91Var.e;
        if (v7Var3 == null) {
            Intrinsics.e("valueVector");
            throw null;
        }
        int b = v7Var3.b();
        int i = 0;
        while (true) {
            v7 v7Var4 = (v7) o91Var.e;
            if (i >= b) {
                if (v7Var4 != null) {
                    return function1.invoke(v7Var4);
                }
                Intrinsics.e("valueVector");
                throw null;
            }
            if (v7Var4 == null) {
                Intrinsics.e("valueVector");
                throw null;
            }
            nq0 nq0Var = (nq0) o91Var.d;
            float a = v7Var2.a(i);
            long j2 = j / 1000000;
            uz a2 = ((vz) nq0Var.e).a(this.e.a(i));
            long j3 = a2.c;
            v7Var4.e((Math.signum(a2.a) * a2.b * n5.a(j3 > 0 ? j2 / j3 : 1.0f).a) + a, i);
            i++;
        }
    }

    @Override // defpackage.m7
    public final long c() {
        return this.h;
    }

    @Override // defpackage.m7
    public final c51 d() {
        return this.b;
    }

    @Override // defpackage.m7
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.m7
    public final v7 f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.j(j, this.d, this.e);
    }
}
