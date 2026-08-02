package f1;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415c implements y0.n {

    /* renamed from: a, reason: collision with root package name */
    public final C0414b f8548a = new C0414b(0, 1, null, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final W.u f8549b = new W.u(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8550c;

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f8550c = false;
        this.f8548a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(y0.o oVar) {
        y0.k kVar;
        int i4;
        W.u uVar = new W.u(10);
        int i5 = 0;
        while (true) {
            kVar = (y0.k) oVar;
            kVar.l(uVar.f3351a, 0, 10, false);
            uVar.M(0);
            if (uVar.C() != 4801587) {
                break;
            }
            uVar.N(3);
            int y4 = uVar.y();
            i5 += y4 + 10;
            kVar.a(y4, false);
        }
        kVar.f16171f = 0;
        kVar.a(i5, false);
        int i6 = 0;
        int i7 = i5;
        while (true) {
            int i8 = 7;
            kVar.l(uVar.f3351a, 0, 7, false);
            uVar.M(0);
            int G4 = uVar.G();
            if (G4 == 44096 || G4 == 44097) {
                i6++;
                if (i6 >= 4) {
                    return true;
                }
                byte[] bArr = uVar.f3351a;
                if (bArr.length < 7) {
                    i4 = -1;
                } else {
                    int i9 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i9 == 65535) {
                        i9 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i8 = 4;
                    }
                    if (G4 == 44097) {
                        i8 += 2;
                    }
                    i4 = i9 + i8;
                }
                if (i4 == -1) {
                    break;
                }
                kVar.a(i4 - 7, false);
            } else {
                kVar.f16171f = 0;
                i7++;
                if (i7 - i5 >= 8192) {
                    break;
                }
                kVar.a(i7, false);
                i6 = 0;
            }
        }
    }

    @Override // y0.n
    public final int c(y0.o oVar, T.r rVar) {
        W.u uVar = this.f8549b;
        int read = oVar.read(uVar.f3351a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        uVar.M(0);
        uVar.L(read);
        boolean z = this.f8550c;
        C0414b c0414b = this.f8548a;
        if (!z) {
            c0414b.o = 0L;
            this.f8550c = true;
        }
        c0414b.a(uVar);
        return 0;
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        this.f8548a.e(pVar, new E(0, 1));
        pVar.r();
        pVar.x(new A0.b(-9223372036854775807L));
    }

    @Override // y0.n
    public final void release() {
    }
}
