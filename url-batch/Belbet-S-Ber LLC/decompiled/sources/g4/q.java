package g4;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1951a;

    /* renamed from: b, reason: collision with root package name */
    public int f1952b;

    /* renamed from: c, reason: collision with root package name */
    public int f1953c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1954e;

    /* renamed from: f, reason: collision with root package name */
    public q f1955f;

    /* renamed from: g, reason: collision with root package name */
    public q f1956g;

    public q() {
        this.f1951a = new byte[8192];
        this.f1954e = true;
        this.d = false;
    }

    public final q a() {
        q qVar = this.f1955f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f1956g;
        i3.d.b(qVar2);
        qVar2.f1955f = this.f1955f;
        q qVar3 = this.f1955f;
        i3.d.b(qVar3);
        qVar3.f1956g = this.f1956g;
        this.f1955f = null;
        this.f1956g = null;
        return qVar;
    }

    public final void b(q qVar) {
        i3.d.e(qVar, "segment");
        qVar.f1956g = this;
        qVar.f1955f = this.f1955f;
        q qVar2 = this.f1955f;
        i3.d.b(qVar2);
        qVar2.f1956g = qVar;
        this.f1955f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f1951a, this.f1952b, this.f1953c, true);
    }

    public final void d(q qVar, int i) {
        i3.d.e(qVar, "sink");
        byte[] bArr = qVar.f1951a;
        if (!qVar.f1954e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = qVar.f1953c;
        int i5 = i4 + i;
        if (i5 > 8192) {
            if (qVar.d) {
                throw new IllegalArgumentException();
            }
            int i6 = qVar.f1952b;
            if (i5 - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            x2.g.F(0, i6, i4, bArr, bArr);
            qVar.f1953c -= qVar.f1952b;
            qVar.f1952b = 0;
        }
        int i7 = qVar.f1953c;
        int i8 = this.f1952b;
        x2.g.F(i7, i8, i8 + i, this.f1951a, bArr);
        qVar.f1953c += i;
        this.f1952b += i;
    }

    public q(byte[] bArr, int i, int i4, boolean z4) {
        i3.d.e(bArr, "data");
        this.f1951a = bArr;
        this.f1952b = i;
        this.f1953c = i4;
        this.d = z4;
        this.f1954e = false;
    }
}
