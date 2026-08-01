package v1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4077a;

    /* renamed from: b, reason: collision with root package name */
    public int f4078b;

    /* renamed from: c, reason: collision with root package name */
    public int f4079c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4080e;

    /* renamed from: f, reason: collision with root package name */
    public q f4081f;

    /* renamed from: g, reason: collision with root package name */
    public q f4082g;

    public q() {
        this.f4077a = new byte[8192];
        this.f4080e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f4081f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f4082g;
        X0.d.b(qVar2);
        qVar2.f4081f = this.f4081f;
        q qVar3 = this.f4081f;
        X0.d.b(qVar3);
        qVar3.f4082g = this.f4082g;
        this.f4081f = null;
        this.f4082g = null;
        return qVar;
    }

    public final void b(q qVar) {
        X0.d.e(qVar, "segment");
        qVar.f4082g = this;
        qVar.f4081f = this.f4081f;
        q qVar2 = this.f4081f;
        X0.d.b(qVar2);
        qVar2.f4082g = qVar;
        this.f4081f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f4077a, this.f4078b, this.f4079c, true);
    }

    public final void d(q qVar, int i) {
        X0.d.e(qVar, "sink");
        if (!qVar.f4080e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f4079c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f4077a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f4078b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Q0.g.d0(0, i4, i2, bArr, bArr);
            qVar.f4079c -= qVar.f4078b;
            qVar.f4078b = 0;
        }
        int i5 = qVar.f4079c;
        int i6 = this.f4078b;
        Q0.g.d0(i5, i6, i6 + i, this.f4077a, bArr);
        qVar.f4079c += i;
        this.f4078b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        X0.d.e(bArr, "data");
        this.f4077a = bArr;
        this.f4078b = i;
        this.f4079c = i2;
        this.d = z2;
        this.f4080e = false;
    }
}
