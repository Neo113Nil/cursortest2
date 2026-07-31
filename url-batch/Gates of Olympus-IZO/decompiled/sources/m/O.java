package m;

import e2.AbstractC0381e;
import e2.C0380d;
import j.C0504v;

/* loaded from: classes.dex */
public final class O extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z f5612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(Z z3, int i3) {
        super(1);
        this.f5611e = i3;
        this.f5612f = z3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f5611e) {
            case 0:
                long longValue = ((Number) obj).longValue();
                Z z3 = this.f5612f;
                long j3 = longValue - z3.f5670l;
                z3.f5670l = longValue;
                long N3 = M1.B.N(j3 / z3.p);
                C0504v c0504v = z3.f5671m;
                int i3 = c0504v.f5219b;
                int i4 = 0;
                if (i3 != 0) {
                    Object[] objArr = c0504v.f5218a;
                    for (int i5 = 0; i5 < i3; i5++) {
                        N n3 = (N) objArr[i5];
                        Z.g(z3, n3, N3);
                        n3.f5605c = true;
                    }
                    s0 s0Var = z3.f5663e;
                    if (s0Var != null) {
                        s0Var.p();
                    }
                    int i6 = c0504v.f5219b;
                    Object[] objArr2 = c0504v.f5218a;
                    C0380d Q2 = AbstractC0381e.Q(0, i6);
                    int i7 = Q2.f4768d;
                    int i8 = Q2.f4769e;
                    if (i7 <= i8) {
                        while (true) {
                            objArr2[i7 - i4] = objArr2[i7];
                            if (((N) objArr2[i7]).f5605c) {
                                i4++;
                            }
                            if (i7 != i8) {
                                i7++;
                            }
                        }
                    }
                    M1.k.c0(objArr2, i6 - i4, i6);
                    c0504v.f5219b -= i4;
                }
                N n4 = z3.f5672n;
                if (n4 != null) {
                    n4.f5609g = z3.f5664f;
                    Z.g(z3, n4, N3);
                    z3.o(n4.f5606d);
                    if (n4.f5606d == 1.0f) {
                        z3.f5672n = null;
                    }
                    z3.n();
                }
                break;
            default:
                this.f5612f.f5670l = ((Number) obj).longValue();
                break;
        }
        return L1.z.f2729a;
    }
}
