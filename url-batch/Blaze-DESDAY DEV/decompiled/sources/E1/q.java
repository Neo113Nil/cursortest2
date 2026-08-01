package E1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f224a;

    /* renamed from: b, reason: collision with root package name */
    public int f225b;

    /* renamed from: c, reason: collision with root package name */
    public int f226c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f227e;

    /* renamed from: f, reason: collision with root package name */
    public q f228f;

    /* renamed from: g, reason: collision with root package name */
    public q f229g;

    public q() {
        this.f224a = new byte[8192];
        this.f227e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f228f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f229g;
        g1.d.b(qVar2);
        qVar2.f228f = this.f228f;
        q qVar3 = this.f228f;
        g1.d.b(qVar3);
        qVar3.f229g = this.f229g;
        this.f228f = null;
        this.f229g = null;
        return qVar;
    }

    public final void b(q qVar) {
        g1.d.e(qVar, "segment");
        qVar.f229g = this;
        qVar.f228f = this.f228f;
        q qVar2 = this.f228f;
        g1.d.b(qVar2);
        qVar2.f229g = qVar;
        this.f228f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f224a, this.f225b, this.f226c, true);
    }

    public final void d(q qVar, int i) {
        g1.d.e(qVar, "sink");
        if (!qVar.f227e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f226c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f224a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f225b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            V0.f.d0(0, i4, i2, bArr, bArr);
            qVar.f226c -= qVar.f225b;
            qVar.f225b = 0;
        }
        int i5 = qVar.f226c;
        int i6 = this.f225b;
        V0.f.d0(i5, i6, i6 + i, this.f224a, bArr);
        qVar.f226c += i;
        this.f225b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        g1.d.e(bArr, "data");
        this.f224a = bArr;
        this.f225b = i;
        this.f226c = i2;
        this.d = z2;
        this.f227e = false;
    }
}
