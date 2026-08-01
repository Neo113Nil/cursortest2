package z1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4290a;

    /* renamed from: b, reason: collision with root package name */
    public int f4291b;

    /* renamed from: c, reason: collision with root package name */
    public int f4292c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4293e;

    /* renamed from: f, reason: collision with root package name */
    public q f4294f;

    /* renamed from: g, reason: collision with root package name */
    public q f4295g;

    public q() {
        this.f4290a = new byte[8192];
        this.f4293e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f4294f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f4295g;
        b1.d.b(qVar2);
        qVar2.f4294f = this.f4294f;
        q qVar3 = this.f4294f;
        b1.d.b(qVar3);
        qVar3.f4295g = this.f4295g;
        this.f4294f = null;
        this.f4295g = null;
        return qVar;
    }

    public final void b(q qVar) {
        b1.d.e(qVar, "segment");
        qVar.f4295g = this;
        qVar.f4294f = this.f4294f;
        q qVar2 = this.f4294f;
        b1.d.b(qVar2);
        qVar2.f4295g = qVar;
        this.f4294f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f4290a, this.f4291b, this.f4292c, true);
    }

    public final void d(q qVar, int i) {
        b1.d.e(qVar, "sink");
        if (!qVar.f4293e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f4292c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f4290a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f4291b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            T0.g.r0(0, i4, i2, bArr, bArr);
            qVar.f4292c -= qVar.f4291b;
            qVar.f4291b = 0;
        }
        int i5 = qVar.f4292c;
        int i6 = this.f4291b;
        T0.g.r0(i5, i6, i6 + i, this.f4290a, bArr);
        qVar.f4292c += i;
        this.f4291b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        b1.d.e(bArr, "data");
        this.f4290a = bArr;
        this.f4291b = i;
        this.f4292c = i2;
        this.d = z2;
        this.f4293e = false;
    }
}
