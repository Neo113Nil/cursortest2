package v1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4508a;

    /* renamed from: b, reason: collision with root package name */
    public int f4509b;

    /* renamed from: c, reason: collision with root package name */
    public int f4510c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4511d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4512e;

    /* renamed from: f, reason: collision with root package name */
    public r f4513f;

    /* renamed from: g, reason: collision with root package name */
    public r f4514g;

    public r() {
        this.f4508a = new byte[8192];
        this.f4512e = true;
        this.f4511d = false;
    }

    public final r a() {
        r rVar = this.f4513f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f4514g;
        X0.f.b(rVar2);
        rVar2.f4513f = this.f4513f;
        r rVar3 = this.f4513f;
        X0.f.b(rVar3);
        rVar3.f4514g = this.f4514g;
        this.f4513f = null;
        this.f4514g = null;
        return rVar;
    }

    public final void b(r rVar) {
        X0.f.e(rVar, "segment");
        rVar.f4514g = this;
        rVar.f4513f = this.f4513f;
        r rVar2 = this.f4513f;
        X0.f.b(rVar2);
        rVar2.f4514g = rVar;
        this.f4513f = rVar;
    }

    public final r c() {
        this.f4511d = true;
        return new r(this.f4508a, this.f4509b, this.f4510c, true);
    }

    public final void d(r rVar, int i) {
        X0.f.e(rVar, "sink");
        if (!rVar.f4512e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = rVar.f4510c;
        int i3 = i2 + i;
        byte[] bArr = rVar.f4508a;
        if (i3 > 8192) {
            if (rVar.f4511d) {
                throw new IllegalArgumentException();
            }
            int i4 = rVar.f4509b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            O0.g.u0(0, i4, i2, bArr, bArr);
            rVar.f4510c -= rVar.f4509b;
            rVar.f4509b = 0;
        }
        int i5 = rVar.f4510c;
        int i6 = this.f4509b;
        O0.g.u0(i5, i6, i6 + i, this.f4508a, bArr);
        rVar.f4510c += i;
        this.f4509b += i;
    }

    public r(byte[] bArr, int i, int i2, boolean z2) {
        X0.f.e(bArr, "data");
        this.f4508a = bArr;
        this.f4509b = i;
        this.f4510c = i2;
        this.f4511d = z2;
        this.f4512e = false;
    }
}
