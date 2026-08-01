package E1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f223a;

    /* renamed from: b, reason: collision with root package name */
    public int f224b;

    /* renamed from: c, reason: collision with root package name */
    public int f225c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f226e;

    /* renamed from: f, reason: collision with root package name */
    public q f227f;

    /* renamed from: g, reason: collision with root package name */
    public q f228g;

    public q() {
        this.f223a = new byte[8192];
        this.f226e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f227f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f228g;
        g1.d.b(qVar2);
        qVar2.f227f = this.f227f;
        q qVar3 = this.f227f;
        g1.d.b(qVar3);
        qVar3.f228g = this.f228g;
        this.f227f = null;
        this.f228g = null;
        return qVar;
    }

    public final void b(q qVar) {
        g1.d.e(qVar, "segment");
        qVar.f228g = this;
        qVar.f227f = this.f227f;
        q qVar2 = this.f227f;
        g1.d.b(qVar2);
        qVar2.f228g = qVar;
        this.f227f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f223a, this.f224b, this.f225c, true);
    }

    public final void d(q qVar, int i) {
        g1.d.e(qVar, "sink");
        if (!qVar.f226e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f225c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f223a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f224b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            X0.i.g0(0, i4, i2, bArr, bArr);
            qVar.f225c -= qVar.f224b;
            qVar.f224b = 0;
        }
        int i5 = qVar.f225c;
        int i6 = this.f224b;
        X0.i.g0(i5, i6, i6 + i, this.f223a, bArr);
        qVar.f225c += i;
        this.f224b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        g1.d.e(bArr, "data");
        this.f223a = bArr;
        this.f224b = i;
        this.f225c = i2;
        this.d = z2;
        this.f226e = false;
    }
}
