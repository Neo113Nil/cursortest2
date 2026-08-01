package M1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f849a;

    /* renamed from: b, reason: collision with root package name */
    public int f850b;

    /* renamed from: c, reason: collision with root package name */
    public int f851c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f852d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public q f853f;

    /* renamed from: g, reason: collision with root package name */
    public q f854g;

    public q() {
        this.f849a = new byte[8192];
        this.e = true;
        this.f852d = false;
    }

    public final q a() {
        q qVar = this.f853f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f854g;
        j1.h.b(qVar2);
        qVar2.f853f = this.f853f;
        q qVar3 = this.f853f;
        j1.h.b(qVar3);
        qVar3.f854g = this.f854g;
        this.f853f = null;
        this.f854g = null;
        return qVar;
    }

    public final void b(q qVar) {
        j1.h.e(qVar, "segment");
        qVar.f854g = this;
        qVar.f853f = this.f853f;
        q qVar2 = this.f853f;
        j1.h.b(qVar2);
        qVar2.f854g = qVar;
        this.f853f = qVar;
    }

    public final q c() {
        this.f852d = true;
        return new q(this.f849a, this.f850b, this.f851c, true);
    }

    public final void d(q qVar, int i) {
        j1.h.e(qVar, "sink");
        if (!qVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = qVar.f851c;
        int i3 = i2 + i;
        byte[] bArr = qVar.f849a;
        if (i3 > 8192) {
            if (qVar.f852d) {
                throw new IllegalArgumentException();
            }
            int i4 = qVar.f850b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            X0.j.m0(0, i4, i2, bArr, bArr);
            qVar.f851c -= qVar.f850b;
            qVar.f850b = 0;
        }
        int i5 = qVar.f851c;
        int i6 = this.f850b;
        X0.j.m0(i5, i6, i6 + i, this.f849a, bArr);
        qVar.f851c += i;
        this.f850b += i;
    }

    public q(byte[] bArr, int i, int i2, boolean z2) {
        j1.h.e(bArr, "data");
        this.f849a = bArr;
        this.f850b = i;
        this.f851c = i2;
        this.f852d = z2;
        this.e = false;
    }
}
