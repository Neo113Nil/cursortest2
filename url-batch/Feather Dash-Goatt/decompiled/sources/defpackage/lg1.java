package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lg1 implements m7 {
    public final qm1 a;
    public final c51 b;
    public final Object c;
    public final Object d;
    public final v7 e;
    public final v7 f;
    public final v7 g;
    public long h;
    public v7 i;

    public lg1(p7 p7Var, c51 c51Var, Object obj, Object obj2, v7 v7Var) {
        this.a = p7Var.a(c51Var);
        this.b = c51Var;
        this.c = obj2;
        this.d = obj;
        this.e = (v7) ((Function1) c51Var.e).invoke(obj);
        Function1 function1 = (Function1) c51Var.e;
        this.f = (v7) function1.invoke(obj2);
        this.g = v7Var != null ? op.w(v7Var) : ((v7) function1.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.m7
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.m7
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        v7 m = this.a.m(j, this.e, this.f, this.g);
        int b = m.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(m.a(i))) {
                ey0.b("AnimationVector cannot contain a NaN. " + m + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((Function1) this.b.g).invoke(m);
    }

    @Override // defpackage.m7
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.m7
    public final c51 d() {
        return this.b;
    }

    @Override // defpackage.m7
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.m7
    public final v7 f(long j) {
        if (!g(j)) {
            return this.a.h(j, this.e, this.f, this.g);
        }
        v7 v7Var = this.i;
        if (v7Var != null) {
            return v7Var;
        }
        v7 n = this.a.n(this.e, this.f, this.g);
        this.i = n;
        return n;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
