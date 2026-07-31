package H2;

import N2.C0153i;

/* renamed from: H2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0153i f1928d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0153i f1929e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0153i f1930f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0153i f1931g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0153i f1932h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0153i f1933i;

    /* renamed from: a, reason: collision with root package name */
    public final C0153i f1934a;

    /* renamed from: b, reason: collision with root package name */
    public final C0153i f1935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1936c;

    static {
        C0153i c0153i = C0153i.f2930g;
        f1928d = F0.a.k(":");
        f1929e = F0.a.k(":status");
        f1930f = F0.a.k(":method");
        f1931g = F0.a.k(":path");
        f1932h = F0.a.k(":scheme");
        f1933i = F0.a.k(":authority");
    }

    public C0081c(C0153i c0153i, C0153i c0153i2) {
        Z1.i.f(c0153i, "name");
        Z1.i.f(c0153i2, "value");
        this.f1934a = c0153i;
        this.f1935b = c0153i2;
        this.f1936c = c0153i2.b() + c0153i.b() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0081c)) {
            return false;
        }
        C0081c c0081c = (C0081c) obj;
        return Z1.i.a(this.f1934a, c0081c.f1934a) && Z1.i.a(this.f1935b, c0081c.f1935b);
    }

    public final int hashCode() {
        return this.f1935b.hashCode() + (this.f1934a.hashCode() * 31);
    }

    public final String toString() {
        return this.f1934a.o() + ": " + this.f1935b.o();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0081c(String str, String str2) {
        this(F0.a.k(str), F0.a.k(str2));
        Z1.i.f(str, "name");
        Z1.i.f(str2, "value");
        C0153i c0153i = C0153i.f2930g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0081c(C0153i c0153i, String str) {
        this(c0153i, F0.a.k(str));
        Z1.i.f(c0153i, "name");
        Z1.i.f(str, "value");
        C0153i c0153i2 = C0153i.f2930g;
    }
}
