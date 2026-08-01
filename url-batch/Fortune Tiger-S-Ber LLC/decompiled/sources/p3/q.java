package p3;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3041a;

    /* renamed from: b, reason: collision with root package name */
    public int f3042b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3043d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3044e;

    /* renamed from: f, reason: collision with root package name */
    public q f3045f;
    public q g;

    public q() {
        this.f3041a = new byte[8192];
        this.f3044e = true;
        this.f3043d = false;
    }

    public final q a() {
        q qVar = this.f3045f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.g;
        u2.c.b(qVar2);
        qVar2.f3045f = this.f3045f;
        q qVar3 = this.f3045f;
        u2.c.b(qVar3);
        qVar3.g = this.g;
        this.f3045f = null;
        this.g = null;
        return qVar;
    }

    public final void b(q qVar) {
        u2.c.e(qVar, "segment");
        qVar.g = this;
        qVar.f3045f = this.f3045f;
        q qVar2 = this.f3045f;
        u2.c.b(qVar2);
        qVar2.g = qVar;
        this.f3045f = qVar;
    }

    public final q c() {
        this.f3043d = true;
        return new q(this.f3041a, this.f3042b, this.c, true);
    }

    public final void d(q qVar, int i4) {
        u2.c.e(qVar, "sink");
        byte[] bArr = qVar.f3041a;
        if (!qVar.f3044e) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = qVar.c;
        int i6 = i5 + i4;
        if (i6 > 8192) {
            if (qVar.f3043d) {
                throw new IllegalArgumentException();
            }
            int i7 = qVar.f3042b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            n2.f.B(0, i7, i5, bArr, bArr);
            qVar.c -= qVar.f3042b;
            qVar.f3042b = 0;
        }
        int i8 = qVar.c;
        int i9 = this.f3042b;
        n2.f.B(i8, i9, i9 + i4, this.f3041a, bArr);
        qVar.c += i4;
        this.f3042b += i4;
    }

    public q(byte[] bArr, int i4, int i5, boolean z3) {
        u2.c.e(bArr, "data");
        this.f3041a = bArr;
        this.f3042b = i4;
        this.c = i5;
        this.f3043d = z3;
        this.f3044e = false;
    }
}
