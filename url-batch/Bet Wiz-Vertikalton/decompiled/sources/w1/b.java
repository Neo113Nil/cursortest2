package w1;

/* loaded from: classes.dex */
public final class b {
    public static final C1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1.i f4081e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1.i f4082f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1.i f4083g;
    public static final C1.i h;
    public static final C1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final C1.i f4084a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.i f4085b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4086c;

    static {
        C1.i iVar = C1.i.d;
        d = I0.e.g(":");
        f4081e = I0.e.g(":status");
        f4082f = I0.e.g(":method");
        f4083g = I0.e.g(":path");
        h = I0.e.g(":scheme");
        i = I0.e.g(":authority");
    }

    public b(C1.i iVar, C1.i iVar2) {
        e1.d.e(iVar, "name");
        e1.d.e(iVar2, "value");
        this.f4084a = iVar;
        this.f4085b = iVar2;
        this.f4086c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e1.d.a(this.f4084a, bVar.f4084a) && e1.d.a(this.f4085b, bVar.f4085b);
    }

    public final int hashCode() {
        return this.f4085b.hashCode() + (this.f4084a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4084a.h() + ": " + this.f4085b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(I0.e.g(str), I0.e.g(str2));
        e1.d.e(str, "name");
        e1.d.e(str2, "value");
        C1.i iVar = C1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(C1.i iVar, String str) {
        this(iVar, I0.e.g(str));
        e1.d.e(iVar, "name");
        e1.d.e(str, "value");
        C1.i iVar2 = C1.i.d;
    }
}
