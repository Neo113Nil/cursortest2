package F1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f268a;

    /* renamed from: b, reason: collision with root package name */
    public int f269b;

    /* renamed from: c, reason: collision with root package name */
    public int f270c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f271e;

    /* renamed from: f, reason: collision with root package name */
    public q f272f;

    /* renamed from: g, reason: collision with root package name */
    public q f273g;

    public q() {
        this.f268a = new byte[8192];
        this.f271e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f272f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f273g;
        h1.d.b(qVar2);
        qVar2.f272f = this.f272f;
        q qVar3 = this.f272f;
        h1.d.b(qVar3);
        qVar3.f273g = this.f273g;
        this.f272f = null;
        this.f273g = null;
        return qVar;
    }

    public final void b(q qVar) {
        h1.d.e(qVar, "segment");
        qVar.f273g = this;
        qVar.f272f = this.f272f;
        q qVar2 = this.f272f;
        h1.d.b(qVar2);
        qVar2.f273g = qVar;
        this.f272f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f268a, this.f269b, this.f270c, true);
    }

    public final void d(q qVar, int i) {
        h1.d.e(qVar, "sink");
        if (!qVar.f271e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f270c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f268a;
        if (i3 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f269b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            W0.f.q0(0, i4, i2, bArr, bArr);
            qVar.f270c -= qVar.f269b;
            qVar.f269b = 0;
        }
        int i5 = qVar.f270c;
        int i6 = this.f269b;
        W0.f.q0(i5, i6, i6 + i, this.f268a, bArr);
        qVar.f270c += i;
        this.f269b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        h1.d.e(bArr, "data");
        this.f268a = bArr;
        this.f269b = i;
        this.f270c = i2;
        this.d = z2;
        this.f271e = false;
    }
}
