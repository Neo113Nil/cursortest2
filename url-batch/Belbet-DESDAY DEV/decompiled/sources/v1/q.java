package v1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4094a;

    /* renamed from: b, reason: collision with root package name */
    public int f4095b;

    /* renamed from: c, reason: collision with root package name */
    public int f4096c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4097e;

    /* renamed from: f, reason: collision with root package name */
    public q f4098f;

    /* renamed from: g, reason: collision with root package name */
    public q f4099g;

    public q() {
        this.f4094a = new byte[8192];
        this.f4097e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f4098f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f4099g;
        X0.d.b(qVar2);
        qVar2.f4098f = this.f4098f;
        q qVar3 = this.f4098f;
        X0.d.b(qVar3);
        qVar3.f4099g = this.f4099g;
        this.f4098f = null;
        this.f4099g = null;
        return qVar;
    }

    public final void b(q qVar) {
        X0.d.e(qVar, "segment");
        qVar.f4099g = this;
        qVar.f4098f = this.f4098f;
        q qVar2 = this.f4098f;
        X0.d.b(qVar2);
        qVar2.f4099g = qVar;
        this.f4098f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f4094a, this.f4095b, this.f4096c, true);
    }

    public final void d(q qVar, int i) {
        X0.d.e(qVar, "sink");
        if (!qVar.f4097e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f4096c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f4094a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f4095b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.g.d0(0, i4, i2, bArr, bArr);
            qVar.f4096c -= qVar.f4095b;
            qVar.f4095b = 0;
        }
        int i5 = qVar.f4096c;
        int i6 = this.f4095b;
        Q0.g.d0(i5, i6, i6 + i, this.f4094a, bArr);
        qVar.f4096c += i;
        this.f4095b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        X0.d.e(bArr, "data");
        this.f4094a = bArr;
        this.f4095b = i;
        this.f4096c = i2;
        this.d = z2;
        this.f4097e = false;
    }
}
