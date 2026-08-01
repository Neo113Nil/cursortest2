package v1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4512a;

    /* renamed from: b, reason: collision with root package name */
    public int f4513b;

    /* renamed from: c, reason: collision with root package name */
    public int f4514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4515d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4516e;

    /* renamed from: f, reason: collision with root package name */
    public r f4517f;

    /* renamed from: g, reason: collision with root package name */
    public r f4518g;

    public r() {
        this.f4512a = new byte[8192];
        this.f4516e = true;
        this.f4515d = false;
    }

    public final r a() {
        r rVar = this.f4517f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f4518g;
        X0.f.b(rVar2);
        rVar2.f4517f = this.f4517f;
        r rVar3 = this.f4517f;
        X0.f.b(rVar3);
        rVar3.f4518g = this.f4518g;
        this.f4517f = null;
        this.f4518g = null;
        return rVar;
    }

    public final void b(r rVar) {
        X0.f.e(rVar, "segment");
        rVar.f4518g = this;
        rVar.f4517f = this.f4517f;
        r rVar2 = this.f4517f;
        X0.f.b(rVar2);
        rVar2.f4518g = rVar;
        this.f4517f = rVar;
    }

    public final r c() {
        this.f4515d = true;
        return new r(this.f4512a, this.f4513b, this.f4514c, true);
    }

    public final void d(r rVar, int i) {
        X0.f.e(rVar, "sink");
        if (!rVar.f4516e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = rVar.f4514c;
        int i3 = i2 + i;
        byte[] bArr = rVar.f4512a;
        if (i3 > 8192) {
            if (rVar.f4515d) {
                throw new IllegalArgumentException();
            }
            int i4 = rVar.f4513b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            O0.g.u0(0, i4, i2, bArr, bArr);
            rVar.f4514c -= rVar.f4513b;
            rVar.f4513b = 0;
        }
        int i5 = rVar.f4514c;
        int i6 = this.f4513b;
        O0.g.u0(i5, i6, i6 + i, this.f4512a, bArr);
        rVar.f4514c += i;
        this.f4513b += i;
    }

    public r(byte[] bArr, int i, int i2, boolean z2) {
        X0.f.e(bArr, "data");
        this.f4512a = bArr;
        this.f4513b = i;
        this.f4514c = i2;
        this.f4515d = z2;
        this.f4516e = false;
    }
}
