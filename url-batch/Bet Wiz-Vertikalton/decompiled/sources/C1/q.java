package C1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f203a;

    /* renamed from: b, reason: collision with root package name */
    public int f204b;

    /* renamed from: c, reason: collision with root package name */
    public int f205c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f206e;

    /* renamed from: f, reason: collision with root package name */
    public q f207f;

    /* renamed from: g, reason: collision with root package name */
    public q f208g;

    public q() {
        this.f203a = new byte[8192];
        this.f206e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f207f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f208g;
        e1.d.b(qVar2);
        qVar2.f207f = this.f207f;
        q qVar3 = this.f207f;
        e1.d.b(qVar3);
        qVar3.f208g = this.f208g;
        this.f207f = null;
        this.f208g = null;
        return qVar;
    }

    public final void b(q qVar) {
        e1.d.e(qVar, "segment");
        qVar.f208g = this;
        qVar.f207f = this.f207f;
        q qVar2 = this.f207f;
        e1.d.b(qVar2);
        qVar2.f208g = qVar;
        this.f207f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f203a, this.f204b, this.f205c, true);
    }

    public final void d(q qVar, int i) {
        e1.d.e(qVar, "sink");
        if (!qVar.f206e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f205c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f203a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f204b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            W0.g.o0(0, i4, i2, bArr, bArr);
            qVar.f205c -= qVar.f204b;
            qVar.f204b = 0;
        }
        int i5 = qVar.f205c;
        int i6 = this.f204b;
        W0.g.o0(i5, i6, i6 + i, this.f203a, bArr);
        qVar.f205c += i;
        this.f204b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        e1.d.e(bArr, "data");
        this.f203a = bArr;
        this.f204b = i;
        this.f205c = i2;
        this.d = z2;
        this.f206e = false;
    }
}
