package y1;

/* loaded from: classes.dex */
public final class b {
    public static final E1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final E1.i f4225e;

    /* renamed from: f, reason: collision with root package name */
    public static final E1.i f4226f;

    /* renamed from: g, reason: collision with root package name */
    public static final E1.i f4227g;
    public static final E1.i h;
    public static final E1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final E1.i f4228a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.i f4229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4230c;

    static {
        E1.i iVar = E1.i.d;
        d = J0.e.h(":");
        f4225e = J0.e.h(":status");
        f4226f = J0.e.h(":method");
        f4227g = J0.e.h(":path");
        h = J0.e.h(":scheme");
        i = J0.e.h(":authority");
    }

    public b(E1.i iVar, E1.i iVar2) {
        g1.d.e(iVar, "name");
        g1.d.e(iVar2, "value");
        this.f4228a = iVar;
        this.f4229b = iVar2;
        this.f4230c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g1.d.a(this.f4228a, bVar.f4228a) && g1.d.a(this.f4229b, bVar.f4229b);
    }

    public final int hashCode() {
        return this.f4229b.hashCode() + (this.f4228a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4228a.h() + ": " + this.f4229b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(J0.e.h(str), J0.e.h(str2));
        g1.d.e(str, "name");
        g1.d.e(str2, "value");
        E1.i iVar = E1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(E1.i iVar, String str) {
        this(iVar, J0.e.h(str));
        g1.d.e(iVar, "name");
        g1.d.e(str, "value");
        E1.i iVar2 = E1.i.d;
    }
}
