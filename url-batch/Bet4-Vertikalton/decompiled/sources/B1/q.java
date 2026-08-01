package B1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f90a;

    /* renamed from: b, reason: collision with root package name */
    public int f91b;

    /* renamed from: c, reason: collision with root package name */
    public int f92c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93e;

    /* renamed from: f, reason: collision with root package name */
    public q f94f;

    /* renamed from: g, reason: collision with root package name */
    public q f95g;

    public q() {
        this.f90a = new byte[8192];
        this.f93e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f94f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f95g;
        d1.d.b(qVar2);
        qVar2.f94f = this.f94f;
        q qVar3 = this.f94f;
        d1.d.b(qVar3);
        qVar3.f95g = this.f95g;
        this.f94f = null;
        this.f95g = null;
        return qVar;
    }

    public final void b(q qVar) {
        d1.d.e(qVar, "segment");
        qVar.f95g = this;
        qVar.f94f = this.f94f;
        q qVar2 = this.f94f;
        d1.d.b(qVar2);
        qVar2.f95g = qVar;
        this.f94f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f90a, this.f91b, this.f92c, true);
    }

    public final void d(q qVar, int i) {
        d1.d.e(qVar, "sink");
        if (!qVar.f93e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f92c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f90a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f91b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            S0.f.c0(0, i4, i2, bArr, bArr);
            qVar.f92c -= qVar.f91b;
            qVar.f91b = 0;
        }
        int i5 = qVar.f92c;
        int i6 = this.f91b;
        S0.f.c0(i5, i6, i6 + i, this.f90a, bArr);
        qVar.f92c += i;
        this.f91b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        d1.d.e(bArr, "data");
        this.f90a = bArr;
        this.f91b = i;
        this.f92c = i2;
        this.d = z2;
        this.f93e = false;
    }
}
