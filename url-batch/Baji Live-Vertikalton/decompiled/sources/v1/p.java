package v1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4070a;

    /* renamed from: b, reason: collision with root package name */
    public int f4071b;

    /* renamed from: c, reason: collision with root package name */
    public int f4072c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4073e;

    /* renamed from: f, reason: collision with root package name */
    public p f4074f;

    /* renamed from: g, reason: collision with root package name */
    public p f4075g;

    public p() {
        this.f4070a = new byte[8192];
        this.f4073e = true;
        this.d = false;
    }

    public final p a() {
        p pVar = this.f4074f;
        if (pVar == this) {
            pVar = null;
        }
        p pVar2 = this.f4075g;
        X0.e.b(pVar2);
        pVar2.f4074f = this.f4074f;
        p pVar3 = this.f4074f;
        X0.e.b(pVar3);
        pVar3.f4075g = this.f4075g;
        this.f4074f = null;
        this.f4075g = null;
        return pVar;
    }

    public final void b(p pVar) {
        X0.e.e(pVar, "segment");
        pVar.f4075g = this;
        pVar.f4074f = this.f4074f;
        p pVar2 = this.f4074f;
        X0.e.b(pVar2);
        pVar2.f4075g = pVar;
        this.f4074f = pVar;
    }

    public final p c() {
        this.d = true;
        return new p(this.f4070a, this.f4071b, this.f4072c, true);
    }

    public final void d(p pVar, int i) {
        X0.e.e(pVar, "sink");
        if (!pVar.f4073e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = pVar.f4072c;
        int i3 = i2 + i;
        byte[] bArr = pVar.f4070a;
        if (i3 > 8192) {
            if (pVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = pVar.f4071b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.c.d0(0, i4, i2, bArr, bArr);
            pVar.f4072c -= pVar.f4071b;
            pVar.f4071b = 0;
        }
        int i5 = pVar.f4072c;
        int i6 = this.f4071b;
        Q0.c.d0(i5, i6, i6 + i, this.f4070a, bArr);
        pVar.f4072c += i;
        this.f4071b += i;
    }

    public p(byte[] bArr, int i, int i2, boolean z2) {
        X0.e.e(bArr, "data");
        this.f4070a = bArr;
        this.f4071b = i;
        this.f4072c = i2;
        this.d = z2;
        this.f4073e = false;
    }
}
