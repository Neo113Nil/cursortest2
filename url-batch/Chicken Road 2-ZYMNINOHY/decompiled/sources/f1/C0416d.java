package f1;

/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416d implements y0.n {

    /* renamed from: c, reason: collision with root package name */
    public final W.u f8553c;

    /* renamed from: d, reason: collision with root package name */
    public final W.t f8554d;

    /* renamed from: e, reason: collision with root package name */
    public y0.p f8555e;

    /* renamed from: f, reason: collision with root package name */
    public long f8556f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8558h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8559i;

    /* renamed from: a, reason: collision with root package name */
    public final C0417e f8551a = new C0417e(0, null, "audio/mp4a-latm", true);

    /* renamed from: b, reason: collision with root package name */
    public final W.u f8552b = new W.u(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f8557g = -1;

    public C0416d(int i4) {
        W.u uVar = new W.u(10);
        this.f8553c = uVar;
        byte[] bArr = uVar.f3351a;
        this.f8554d = new W.t(bArr.length, bArr);
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f8558h = false;
        this.f8551a.b();
        this.f8556f = j5;
    }

    @Override // y0.n
    public final boolean b(y0.o oVar) {
        int i4 = 0;
        while (true) {
            W.u uVar = this.f8553c;
            oVar.E(uVar.f3351a, 0, 10);
            uVar.M(0);
            if (uVar.C() != 4801587) {
                break;
            }
            uVar.N(3);
            int y4 = uVar.y();
            i4 += y4 + 10;
            oVar.o(y4);
        }
        oVar.u();
        oVar.o(i4);
        if (this.f8557g == -1) {
            this.f8557g = i4;
        }
        int i5 = i4;
        int i6 = 0;
        int i7 = 0;
        do {
            W.u uVar2 = this.f8553c;
            y0.k kVar = (y0.k) oVar;
            kVar.l(uVar2.f3351a, 0, 2, false);
            uVar2.M(0);
            if ((uVar2.G() & 65526) == 65520) {
                i6++;
                if (i6 >= 4 && i7 > 188) {
                    return true;
                }
                kVar.l(uVar2.f3351a, 0, 4, false);
                W.t tVar = this.f8554d;
                tVar.q(14);
                int i8 = tVar.i(13);
                if (i8 <= 6) {
                    i5++;
                    kVar.f16171f = 0;
                    kVar.a(i5, false);
                } else {
                    kVar.a(i8 - 6, false);
                    i7 += i8;
                }
            } else {
                i5++;
                kVar.f16171f = 0;
                kVar.a(i5, false);
            }
            i6 = 0;
            i7 = 0;
        } while (i5 - i4 < 8192);
        return false;
    }

    @Override // y0.n
    public final int c(y0.o oVar, T.r rVar) {
        this.f8555e.getClass();
        oVar.getLength();
        W.u uVar = this.f8552b;
        int read = oVar.read(uVar.f3351a, 0, 2048);
        boolean z = read == -1;
        if (!this.f8559i) {
            this.f8555e.x(new A0.b(-9223372036854775807L));
            this.f8559i = true;
        }
        if (z) {
            return -1;
        }
        uVar.M(0);
        uVar.L(read);
        boolean z4 = this.f8558h;
        C0417e c0417e = this.f8551a;
        if (!z4) {
            c0417e.f8579u = this.f8556f;
            this.f8558h = true;
        }
        c0417e.a(uVar);
        return 0;
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        this.f8555e = pVar;
        this.f8551a.e(pVar, new E(0, 1));
        pVar.r();
    }

    @Override // y0.n
    public final void release() {
    }
}
