package N2;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2892a;

    /* renamed from: b, reason: collision with root package name */
    public int f2893b;

    /* renamed from: c, reason: collision with root package name */
    public int f2894c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2895d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2896e;

    /* renamed from: f, reason: collision with root package name */
    public A f2897f;

    /* renamed from: g, reason: collision with root package name */
    public A f2898g;

    public A() {
        this.f2892a = new byte[8192];
        this.f2896e = true;
        this.f2895d = false;
    }

    public final A a() {
        A a3 = this.f2897f;
        if (a3 == this) {
            a3 = null;
        }
        A a4 = this.f2898g;
        Z1.i.c(a4);
        a4.f2897f = this.f2897f;
        A a5 = this.f2897f;
        Z1.i.c(a5);
        a5.f2898g = this.f2898g;
        this.f2897f = null;
        this.f2898g = null;
        return a3;
    }

    public final void b(A a3) {
        Z1.i.f(a3, "segment");
        a3.f2898g = this;
        a3.f2897f = this.f2897f;
        A a4 = this.f2897f;
        Z1.i.c(a4);
        a4.f2898g = a3;
        this.f2897f = a3;
    }

    public final A c() {
        this.f2895d = true;
        return new A(this.f2892a, this.f2893b, this.f2894c, true);
    }

    public final void d(A a3, int i3) {
        Z1.i.f(a3, "sink");
        if (!a3.f2896e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = a3.f2894c;
        int i5 = i4 + i3;
        byte[] bArr = a3.f2892a;
        if (i5 > 8192) {
            if (a3.f2895d) {
                throw new IllegalArgumentException();
            }
            int i6 = a3.f2893b;
            if (i5 - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            M1.k.V(0, i6, i4, bArr, bArr);
            a3.f2894c -= a3.f2893b;
            a3.f2893b = 0;
        }
        int i7 = a3.f2894c;
        int i8 = this.f2893b;
        M1.k.V(i7, i8, i8 + i3, this.f2892a, bArr);
        a3.f2894c += i3;
        this.f2893b += i3;
    }

    public A(byte[] bArr, int i3, int i4, boolean z3) {
        Z1.i.f(bArr, "data");
        this.f2892a = bArr;
        this.f2893b = i3;
        this.f2894c = i4;
        this.f2895d = z3;
        this.f2896e = false;
    }
}
