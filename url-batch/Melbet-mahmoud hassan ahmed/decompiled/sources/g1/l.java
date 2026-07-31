package g1;

import g1.i0;
import java.util.Collections;
import java.util.List;
import r0.s1;

/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    private final List<i0.a> f16393a;

    /* renamed from: b, reason: collision with root package name */
    private final w0.e0[] f16394b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16395c;

    /* renamed from: d, reason: collision with root package name */
    private int f16396d;

    /* renamed from: e, reason: collision with root package name */
    private int f16397e;

    /* renamed from: f, reason: collision with root package name */
    private long f16398f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f16393a = list;
        this.f16394b = new w0.e0[list.size()];
    }

    private boolean b(o2.a0 a0Var, int i7) {
        if (a0Var.a() == 0) {
            return false;
        }
        if (a0Var.C() != i7) {
            this.f16395c = false;
        }
        this.f16396d--;
        return this.f16395c;
    }

    @Override // g1.m
    public void a() {
        this.f16395c = false;
        this.f16398f = -9223372036854775807L;
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        if (this.f16395c) {
            if (this.f16396d != 2 || b(a0Var, 32)) {
                if (this.f16396d != 1 || b(a0Var, 0)) {
                    int e7 = a0Var.e();
                    int a7 = a0Var.a();
                    for (w0.e0 e0Var : this.f16394b) {
                        a0Var.O(e7);
                        e0Var.d(a0Var, a7);
                    }
                    this.f16397e += a7;
                }
            }
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        for (int i7 = 0; i7 < this.f16394b.length; i7++) {
            i0.a aVar = this.f16393a.get(i7);
            dVar.a();
            w0.e0 d7 = nVar.d(dVar.c(), 3);
            d7.e(new s1.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f16368c)).V(aVar.f16366a).E());
            this.f16394b[i7] = d7;
        }
    }

    @Override // g1.m
    public void e() {
        if (this.f16395c) {
            if (this.f16398f != -9223372036854775807L) {
                for (w0.e0 e0Var : this.f16394b) {
                    e0Var.b(this.f16398f, 1, this.f16397e, 0, null);
                }
            }
            this.f16395c = false;
        }
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f16395c = true;
        if (j7 != -9223372036854775807L) {
            this.f16398f = j7;
        }
        this.f16397e = 0;
        this.f16396d = 2;
    }
}
