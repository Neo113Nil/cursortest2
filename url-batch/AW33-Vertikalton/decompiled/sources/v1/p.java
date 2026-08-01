package v1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4088a;

    /* renamed from: b, reason: collision with root package name */
    public int f4089b;

    /* renamed from: c, reason: collision with root package name */
    public int f4090c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4091e;

    /* renamed from: f, reason: collision with root package name */
    public p f4092f;

    /* renamed from: g, reason: collision with root package name */
    public p f4093g;

    public p() {
        this.f4088a = new byte[8192];
        this.f4091e = true;
        this.d = false;
    }

    public final p a() {
        p pVar = this.f4092f;
        if (pVar == this) {
            pVar = null;
        }
        p pVar2 = this.f4093g;
        X0.e.b(pVar2);
        pVar2.f4092f = this.f4092f;
        p pVar3 = this.f4092f;
        X0.e.b(pVar3);
        pVar3.f4093g = this.f4093g;
        this.f4092f = null;
        this.f4093g = null;
        return pVar;
    }

    public final void b(p pVar) {
        X0.e.e(pVar, "segment");
        pVar.f4093g = this;
        pVar.f4092f = this.f4092f;
        p pVar2 = this.f4092f;
        X0.e.b(pVar2);
        pVar2.f4093g = pVar;
        this.f4092f = pVar;
    }

    public final p c() {
        this.d = true;
        return new p(this.f4088a, this.f4089b, this.f4090c, true);
    }

    public final void d(p pVar, int i) {
        X0.e.e(pVar, "sink");
        if (!pVar.f4091e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = pVar.f4090c;
        int i3 = i2 + i;
        byte[] bArr = pVar.f4088a;
        if (i3 > 8192) {
            if (pVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = pVar.f4089b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.c.d0(0, i4, i2, bArr, bArr);
            pVar.f4090c -= pVar.f4089b;
            pVar.f4089b = 0;
        }
        int i5 = pVar.f4090c;
        int i6 = this.f4089b;
        Q0.c.d0(i5, i6, i6 + i, this.f4088a, bArr);
        pVar.f4090c += i;
        this.f4089b += i;
    }

    public p(byte[] bArr, int i, int i2, boolean z2) {
        X0.e.e(bArr, "data");
        this.f4088a = bArr;
        this.f4089b = i;
        this.f4090c = i2;
        this.d = z2;
        this.f4091e = false;
    }
}
