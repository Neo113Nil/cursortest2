package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ib1 {
    public mb1 a;
    public long b;
    public boolean c;
    public int d;

    public ib1(long j, mb1 mb1Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = mb1Var;
        this.b = j;
        k61 k61Var = pb1.a;
        if (j != 0) {
            mb1 d = d();
            long j2 = d.g;
            long[] jArr = d.h;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.e;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.d;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (pb1.c) {
                i = pb1.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(ib1 ib1Var) {
        pb1.b.q(ib1Var);
    }

    public final void a() {
        synchronized (pb1.c) {
            b();
            p();
        }
    }

    public void b() {
        pb1.d = pb1.d.b(g());
    }

    public abstract void c();

    public mb1 d() {
        return this.a;
    }

    public abstract Function1 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final ib1 j() {
        i8 i8Var = pb1.b;
        ib1 ib1Var = (ib1) i8Var.get();
        i8Var.q(this);
        return ib1Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(ge1 ge1Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            pb1.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(mb1 mb1Var) {
        this.a = mb1Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ib1 u(Function1 function1);
}
