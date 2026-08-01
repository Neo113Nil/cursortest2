package x1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4257a;

    /* renamed from: b, reason: collision with root package name */
    public int f4258b;

    /* renamed from: c, reason: collision with root package name */
    public int f4259c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4260e;

    /* renamed from: f, reason: collision with root package name */
    public q f4261f;

    /* renamed from: g, reason: collision with root package name */
    public q f4262g;

    public q() {
        this.f4257a = new byte[8192];
        this.f4260e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f4261f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f4262g;
        Z0.d.b(qVar2);
        qVar2.f4261f = this.f4261f;
        q qVar3 = this.f4261f;
        Z0.d.b(qVar3);
        qVar3.f4262g = this.f4262g;
        this.f4261f = null;
        this.f4262g = null;
        return qVar;
    }

    public final void b(q qVar) {
        Z0.d.e(qVar, "segment");
        qVar.f4262g = this;
        qVar.f4261f = this.f4261f;
        q qVar2 = this.f4261f;
        Z0.d.b(qVar2);
        qVar2.f4262g = qVar;
        this.f4261f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f4257a, this.f4258b, this.f4259c, true);
    }

    public final void d(q qVar, int i) {
        Z0.d.e(qVar, "sink");
        if (!qVar.f4260e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f4259c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f4257a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f4258b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            R0.g.n0(0, i4, i2, bArr, bArr);
            qVar.f4259c -= qVar.f4258b;
            qVar.f4258b = 0;
        }
        int i5 = qVar.f4259c;
        int i6 = this.f4258b;
        R0.g.n0(i5, i6, i6 + i, this.f4257a, bArr);
        qVar.f4259c += i;
        this.f4258b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        Z0.d.e(bArr, "data");
        this.f4257a = bArr;
        this.f4258b = i;
        this.f4259c = i2;
        this.d = z2;
        this.f4260e = false;
    }
}
