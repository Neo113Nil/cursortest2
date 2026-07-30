package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class nm2 {
    public rm2 a;
    public long b;
    public boolean c;
    public int d;

    public nm2(long j, rm2 rm2Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = rm2Var;
        this.b = j;
        de2 de2Var = tm2.a;
        if (j != 0) {
            rm2 d = d();
            long j2 = d.o;
            long[] jArr = d.p;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.n;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.m;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (tm2.c) {
                i = tm2.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(nm2 nm2Var) {
        tm2.b.E(nm2Var);
    }

    public final void a() {
        synchronized (tm2.c) {
            b();
            p();
            Unit unit = Unit.a;
        }
    }

    public void b() {
        tm2.d = tm2.d.b(g());
    }

    public void c() {
        this.c = true;
        synchronized (tm2.c) {
            o();
            Unit unit = Unit.a;
        }
    }

    public rm2 d() {
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

    public final nm2 j() {
        mh mhVar = tm2.b;
        nm2 nm2Var = (nm2) mhVar.get();
        mhVar.E(this);
        return nm2Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(yo2 yo2Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            tm2.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(rm2 rm2Var) {
        this.a = rm2Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract nm2 u(Function1 function1);
}
