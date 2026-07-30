package f8;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3571a;

    /* renamed from: b, reason: collision with root package name */
    public int f3572b;

    /* renamed from: c, reason: collision with root package name */
    public int f3573c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3574d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3575e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f3576f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f3577g;

    public b0() {
        this.f3571a = new byte[8192];
        this.f3575e = true;
        this.f3574d = false;
    }

    public final b0 a() {
        b0 b0Var = this.f3576f;
        if (b0Var == this) {
            b0Var = null;
        }
        b0 b0Var2 = this.f3577g;
        r6.k.c(b0Var2);
        b0Var2.f3576f = this.f3576f;
        b0 b0Var3 = this.f3576f;
        r6.k.c(b0Var3);
        b0Var3.f3577g = this.f3577g;
        this.f3576f = null;
        this.f3577g = null;
        return b0Var;
    }

    public final void b(b0 b0Var) {
        r6.k.f(b0Var, "segment");
        b0Var.f3577g = this;
        b0Var.f3576f = this.f3576f;
        b0 b0Var2 = this.f3576f;
        r6.k.c(b0Var2);
        b0Var2.f3577g = b0Var;
        this.f3576f = b0Var;
    }

    public final b0 c() {
        this.f3574d = true;
        return new b0(this.f3571a, this.f3572b, this.f3573c, true);
    }

    public final void d(b0 b0Var, int i7) {
        r6.k.f(b0Var, "sink");
        byte[] bArr = b0Var.f3571a;
        if (!b0Var.f3575e) {
            throw new IllegalStateException("only owner can write");
        }
        int i8 = b0Var.f3573c;
        int i9 = i8 + i7;
        if (i9 > 8192) {
            if (b0Var.f3574d) {
                throw new IllegalArgumentException();
            }
            int i10 = b0Var.f3572b;
            if (i9 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            e6.k.U(0, i10, i8, bArr, bArr);
            b0Var.f3573c -= b0Var.f3572b;
            b0Var.f3572b = 0;
        }
        int i11 = b0Var.f3573c;
        int i12 = this.f3572b;
        e6.k.U(i11, i12, i12 + i7, this.f3571a, bArr);
        b0Var.f3573c += i7;
        this.f3572b += i7;
    }

    public b0(byte[] bArr, int i7, int i8, boolean z8) {
        r6.k.f(bArr, "data");
        this.f3571a = bArr;
        this.f3572b = i7;
        this.f3573c = i8;
        this.f3574d = z8;
        this.f3575e = false;
    }
}
