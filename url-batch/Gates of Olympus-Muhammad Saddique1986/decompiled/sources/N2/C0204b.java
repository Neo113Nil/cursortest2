package N2;

import T2.C0234i;

/* renamed from: N2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0234i f3580d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0234i f3581e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0234i f3582f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0234i f3583g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0234i f3584h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0234i f3585i;

    /* renamed from: a, reason: collision with root package name */
    public final C0234i f3586a;

    /* renamed from: b, reason: collision with root package name */
    public final C0234i f3587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3588c;

    static {
        C0234i c0234i = C0234i.f4410g;
        f3580d = A1.i.k(":");
        f3581e = A1.i.k(":status");
        f3582f = A1.i.k(":method");
        f3583g = A1.i.k(":path");
        f3584h = A1.i.k(":scheme");
        f3585i = A1.i.k(":authority");
    }

    public C0204b(C0234i c0234i, C0234i c0234i2) {
        f2.j.f(c0234i, "name");
        f2.j.f(c0234i2, "value");
        this.f3586a = c0234i;
        this.f3587b = c0234i2;
        this.f3588c = c0234i2.b() + c0234i.b() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0204b)) {
            return false;
        }
        C0204b c0204b = (C0204b) obj;
        return f2.j.a(this.f3586a, c0204b.f3586a) && f2.j.a(this.f3587b, c0204b.f3587b);
    }

    public final int hashCode() {
        return this.f3587b.hashCode() + (this.f3586a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3586a.o() + ": " + this.f3587b.o();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0204b(String str, String str2) {
        this(A1.i.k(str), A1.i.k(str2));
        f2.j.f(str, "name");
        f2.j.f(str2, "value");
        C0234i c0234i = C0234i.f4410g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0204b(C0234i c0234i, String str) {
        this(c0234i, A1.i.k(str));
        f2.j.f(c0234i, "name");
        f2.j.f(str, "value");
        C0234i c0234i2 = C0234i.f4410g;
    }
}
