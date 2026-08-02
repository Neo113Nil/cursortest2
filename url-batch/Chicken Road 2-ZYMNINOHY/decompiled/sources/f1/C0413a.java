package f1;

import y0.AbstractC1569a;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413a implements y0.n {

    /* renamed from: a, reason: collision with root package name */
    public final C0414b f8532a = new C0414b("audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    public final W.u f8533b = new W.u(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8534c;

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f8534c = false;
        this.f8532a.b();
    }

    @Override // y0.n
    public final boolean b(y0.o oVar) {
        y0.k kVar;
        int h2;
        W.u uVar = new W.u(10);
        int i4 = 0;
        while (true) {
            kVar = (y0.k) oVar;
            kVar.l(uVar.f3351a, 0, 10, false);
            uVar.M(0);
            if (uVar.C() != 4801587) {
                break;
            }
            uVar.N(3);
            int y4 = uVar.y();
            i4 += y4 + 10;
            kVar.a(y4, false);
        }
        kVar.f16171f = 0;
        kVar.a(i4, false);
        int i5 = 0;
        int i6 = i4;
        while (true) {
            kVar.l(uVar.f3351a, 0, 6, false);
            uVar.M(0);
            if (uVar.G() != 2935) {
                kVar.f16171f = 0;
                i6++;
                if (i6 - i4 >= 8192) {
                    break;
                }
                kVar.a(i6, false);
                i5 = 0;
            } else {
                i5++;
                if (i5 >= 4) {
                    return true;
                }
                byte[] bArr = uVar.f3351a;
                if (bArr.length < 6) {
                    h2 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    h2 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b4 = bArr[4];
                    h2 = AbstractC1569a.h((b4 & 192) >> 6, b4 & 63);
                }
                if (h2 == -1) {
                    break;
                }
                kVar.a(h2 - 6, false);
            }
        }
        return false;
    }

    @Override // y0.n
    public final int c(y0.o oVar, T.r rVar) {
        W.u uVar = this.f8533b;
        int read = oVar.read(uVar.f3351a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        uVar.M(0);
        uVar.L(read);
        boolean z = this.f8534c;
        C0414b c0414b = this.f8532a;
        if (!z) {
            c0414b.o = 0L;
            this.f8534c = true;
        }
        c0414b.a(uVar);
        return 0;
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        this.f8532a.e(pVar, new E(0, 1));
        pVar.r();
        pVar.x(new A0.b(-9223372036854775807L));
    }

    @Override // y0.n
    public final void release() {
    }
}
