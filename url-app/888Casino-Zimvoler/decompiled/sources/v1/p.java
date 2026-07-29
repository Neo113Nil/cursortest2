package v1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4071a;

    /* renamed from: b, reason: collision with root package name */
    public int f4072b;

    /* renamed from: c, reason: collision with root package name */
    public int f4073c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4074e;

    /* renamed from: f, reason: collision with root package name */
    public p f4075f;

    /* renamed from: g, reason: collision with root package name */
    public p f4076g;

    public p() {
        this.f4071a = new byte[8192];
        this.f4074e = true;
        this.d = false;
    }

    public final p a() {
        p pVar = this.f4075f;
        if (pVar == this) {
            pVar = null;
        }
        p pVar2 = this.f4076g;
        X0.e.b(pVar2);
        pVar2.f4075f = this.f4075f;
        p pVar3 = this.f4075f;
        X0.e.b(pVar3);
        pVar3.f4076g = this.f4076g;
        this.f4075f = null;
        this.f4076g = null;
        return pVar;
    }

    public final void b(p pVar) {
        X0.e.e(pVar, "segment");
        pVar.f4076g = this;
        pVar.f4075f = this.f4075f;
        p pVar2 = this.f4075f;
        X0.e.b(pVar2);
        pVar2.f4076g = pVar;
        this.f4075f = pVar;
    }

    public final p c() {
        this.d = true;
        return new p(this.f4071a, this.f4072b, this.f4073c, true);
    }

    public final void d(p pVar, int i) {
        X0.e.e(pVar, "sink");
        if (!pVar.f4074e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = pVar.f4073c;
        int i3 = i2 + i;
        byte[] bArr = pVar.f4071a;
        if (i3 > 8192) {
            if (pVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = pVar.f4072b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.c.d0(0, i4, i2, bArr, bArr);
            pVar.f4073c -= pVar.f4072b;
            pVar.f4072b = 0;
        }
        int i5 = pVar.f4073c;
        int i6 = this.f4072b;
        Q0.c.d0(i5, i6, i6 + i, this.f4071a, bArr);
        pVar.f4073c += i;
        this.f4072b += i;
    }

    public p(byte[] bArr, int i, int i2, boolean z2) {
        X0.e.e(bArr, "data");
        this.f4071a = bArr;
        this.f4072b = i;
        this.f4073c = i2;
        this.d = z2;
        this.f4074e = false;
    }
}
