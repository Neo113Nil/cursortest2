package f1;

import W.G;
import W.J;

/* loaded from: classes.dex */
public final class A implements F {

    /* renamed from: a, reason: collision with root package name */
    public final z f8497a;

    /* renamed from: b, reason: collision with root package name */
    public final W.u f8498b = new W.u(32);

    /* renamed from: c, reason: collision with root package name */
    public int f8499c;

    /* renamed from: d, reason: collision with root package name */
    public int f8500d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8501e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8502f;

    public A(z zVar) {
        this.f8497a = zVar;
    }

    @Override // f1.F
    public final void a(int i4, W.u uVar) {
        boolean z = (i4 & 1) != 0;
        int z4 = z ? uVar.f3352b + uVar.z() : -1;
        if (this.f8502f) {
            if (!z) {
                return;
            }
            this.f8502f = false;
            uVar.M(z4);
            this.f8500d = 0;
        }
        while (uVar.a() > 0) {
            int i5 = this.f8500d;
            W.u uVar2 = this.f8498b;
            if (i5 < 3) {
                if (i5 == 0) {
                    int z5 = uVar.z();
                    uVar.M(uVar.f3352b - 1);
                    if (z5 == 255) {
                        this.f8502f = true;
                        return;
                    }
                }
                int min = Math.min(uVar.a(), 3 - this.f8500d);
                uVar.k(uVar2.f3351a, this.f8500d, min);
                int i6 = this.f8500d + min;
                this.f8500d = i6;
                if (i6 == 3) {
                    uVar2.M(0);
                    uVar2.L(3);
                    uVar2.N(1);
                    int z6 = uVar2.z();
                    int z7 = uVar2.z();
                    this.f8501e = (z6 & 128) != 0;
                    int i7 = (((z6 & 15) << 8) | z7) + 3;
                    this.f8499c = i7;
                    byte[] bArr = uVar2.f3351a;
                    if (bArr.length < i7) {
                        uVar2.c(Math.min(4098, Math.max(i7, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(uVar.a(), this.f8499c - this.f8500d);
                uVar.k(uVar2.f3351a, this.f8500d, min2);
                int i8 = this.f8500d + min2;
                this.f8500d = i8;
                int i9 = this.f8499c;
                if (i8 != i9) {
                    continue;
                } else {
                    if (!this.f8501e) {
                        uVar2.L(i9);
                    } else {
                        if (J.n(0, i9, -1, uVar2.f3351a) != 0) {
                            this.f8502f = true;
                            return;
                        }
                        uVar2.L(this.f8499c - 4);
                    }
                    uVar2.M(0);
                    this.f8497a.a(uVar2);
                    this.f8500d = 0;
                }
            }
        }
    }

    @Override // f1.F
    public final void b() {
        this.f8502f = true;
    }

    @Override // f1.F
    public final void d(G g4, y0.p pVar, E e4) {
        this.f8497a.d(g4, pVar, e4);
        this.f8502f = true;
    }
}
