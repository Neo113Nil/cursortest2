package z1;

/* loaded from: classes.dex */
public final class b {
    public static final F1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final F1.i f4420e;

    /* renamed from: f, reason: collision with root package name */
    public static final F1.i f4421f;

    /* renamed from: g, reason: collision with root package name */
    public static final F1.i f4422g;

    /* renamed from: h, reason: collision with root package name */
    public static final F1.i f4423h;
    public static final F1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final F1.i f4424a;

    /* renamed from: b, reason: collision with root package name */
    public final F1.i f4425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4426c;

    static {
        F1.i iVar = F1.i.d;
        d = K0.e.g(":");
        f4420e = K0.e.g(":status");
        f4421f = K0.e.g(":method");
        f4422g = K0.e.g(":path");
        f4423h = K0.e.g(":scheme");
        i = K0.e.g(":authority");
    }

    public b(F1.i iVar, F1.i iVar2) {
        h1.d.e(iVar, "name");
        h1.d.e(iVar2, "value");
        this.f4424a = iVar;
        this.f4425b = iVar2;
        this.f4426c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h1.d.a(this.f4424a, bVar.f4424a) && h1.d.a(this.f4425b, bVar.f4425b);
    }

    public final int hashCode() {
        return this.f4425b.hashCode() + (this.f4424a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4424a.h() + ": " + this.f4425b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(K0.e.g(str), K0.e.g(str2));
        h1.d.e(str, "name");
        h1.d.e(str2, "value");
        F1.i iVar = F1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(F1.i iVar, String str) {
        this(iVar, K0.e.g(str));
        h1.d.e(iVar, "name");
        h1.d.e(str, "value");
        F1.i iVar2 = F1.i.d;
    }
}
