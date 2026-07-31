package T2;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4372a;

    /* renamed from: b, reason: collision with root package name */
    public int f4373b;

    /* renamed from: c, reason: collision with root package name */
    public int f4374c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4375d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4376e;

    /* renamed from: f, reason: collision with root package name */
    public A f4377f;

    /* renamed from: g, reason: collision with root package name */
    public A f4378g;

    public A() {
        this.f4372a = new byte[8192];
        this.f4376e = true;
        this.f4375d = false;
    }

    public final A a() {
        A a3 = this.f4377f;
        if (a3 == this) {
            a3 = null;
        }
        A a4 = this.f4378g;
        f2.j.c(a4);
        a4.f4377f = this.f4377f;
        A a5 = this.f4377f;
        f2.j.c(a5);
        a5.f4378g = this.f4378g;
        this.f4377f = null;
        this.f4378g = null;
        return a3;
    }

    public final void b(A a3) {
        f2.j.f(a3, "segment");
        a3.f4378g = this;
        a3.f4377f = this.f4377f;
        A a4 = this.f4377f;
        f2.j.c(a4);
        a4.f4378g = a3;
        this.f4377f = a3;
    }

    public final A c() {
        this.f4375d = true;
        return new A(this.f4372a, this.f4373b, this.f4374c, true);
    }

    public final void d(A a3, int i3) {
        f2.j.f(a3, "sink");
        if (!a3.f4376e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = a3.f4374c;
        int i5 = i4 + i3;
        byte[] bArr = a3.f4372a;
        if (i5 > 8192) {
            if (a3.f4375d) {
                throw new IllegalArgumentException();
            }
            int i6 = a3.f4373b;
            if (i5 - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            S1.k.j0(0, i6, i4, bArr, bArr);
            a3.f4374c -= a3.f4373b;
            a3.f4373b = 0;
        }
        int i7 = a3.f4374c;
        int i8 = this.f4373b;
        S1.k.j0(i7, i8, i8 + i3, this.f4372a, bArr);
        a3.f4374c += i3;
        this.f4373b += i3;
    }

    public A(byte[] bArr, int i3, int i4, boolean z3) {
        f2.j.f(bArr, "data");
        this.f4372a = bArr;
        this.f4373b = i3;
        this.f4374c = i4;
        this.f4375d = z3;
        this.f4376e = false;
    }
}
