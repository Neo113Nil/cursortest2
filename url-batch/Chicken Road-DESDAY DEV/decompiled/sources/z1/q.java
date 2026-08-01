package z1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4289a;

    /* renamed from: b, reason: collision with root package name */
    public int f4290b;

    /* renamed from: c, reason: collision with root package name */
    public int f4291c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4292e;

    /* renamed from: f, reason: collision with root package name */
    public q f4293f;

    /* renamed from: g, reason: collision with root package name */
    public q f4294g;

    public q() {
        this.f4289a = new byte[8192];
        this.f4292e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f4293f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f4294g;
        b1.d.b(qVar2);
        qVar2.f4293f = this.f4293f;
        q qVar3 = this.f4293f;
        b1.d.b(qVar3);
        qVar3.f4294g = this.f4294g;
        this.f4293f = null;
        this.f4294g = null;
        return qVar;
    }

    public final void b(q qVar) {
        b1.d.e(qVar, "segment");
        qVar.f4294g = this;
        qVar.f4293f = this.f4293f;
        q qVar2 = this.f4293f;
        b1.d.b(qVar2);
        qVar2.f4294g = qVar;
        this.f4293f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f4289a, this.f4290b, this.f4291c, true);
    }

    public final void d(q qVar, int i) {
        b1.d.e(qVar, "sink");
        if (!qVar.f4292e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f4291c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f4289a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f4290b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            T0.g.j0(0, i4, i2, bArr, bArr);
            qVar.f4291c -= qVar.f4290b;
            qVar.f4290b = 0;
        }
        int i5 = qVar.f4291c;
        int i6 = this.f4290b;
        T0.g.j0(i5, i6, i6 + i, this.f4289a, bArr);
        qVar.f4291c += i;
        this.f4290b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        b1.d.e(bArr, "data");
        this.f4289a = bArr;
        this.f4290b = i;
        this.f4291c = i2;
        this.d = z2;
        this.f4292e = false;
    }
}
