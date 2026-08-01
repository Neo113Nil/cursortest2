package M1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f820a;

    /* renamed from: b, reason: collision with root package name */
    public int f821b;

    /* renamed from: c, reason: collision with root package name */
    public int f822c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f823e;

    /* renamed from: f, reason: collision with root package name */
    public q f824f;

    /* renamed from: g, reason: collision with root package name */
    public q f825g;

    public q() {
        this.f820a = new byte[8192];
        this.f823e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f824f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f825g;
        k1.e.b(qVar2);
        qVar2.f824f = this.f824f;
        q qVar3 = this.f824f;
        k1.e.b(qVar3);
        qVar3.f825g = this.f825g;
        this.f824f = null;
        this.f825g = null;
        return qVar;
    }

    public final void b(q qVar) {
        k1.e.e(qVar, "segment");
        qVar.f825g = this;
        qVar.f824f = this.f824f;
        q qVar2 = this.f824f;
        k1.e.b(qVar2);
        qVar2.f825g = qVar;
        this.f824f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f820a, this.f821b, this.f822c, true);
    }

    public final void d(q qVar, int i) {
        k1.e.e(qVar, "sink");
        if (!qVar.f823e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f822c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f820a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f821b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Y0.i.j0(0, i4, i2, bArr, bArr);
            qVar.f822c -= qVar.f821b;
            qVar.f821b = 0;
        }
        int i5 = qVar.f822c;
        int i6 = this.f821b;
        Y0.i.j0(i5, i6, i6 + i, this.f820a, bArr);
        qVar.f822c += i;
        this.f821b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        k1.e.e(bArr, "data");
        this.f820a = bArr;
        this.f821b = i;
        this.f822c = i2;
        this.d = z2;
        this.f823e = false;
    }
}
