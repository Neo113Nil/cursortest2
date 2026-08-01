package y1;

/* loaded from: classes.dex */
public final class b {
    public static final E1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final E1.i f4196e;

    /* renamed from: f, reason: collision with root package name */
    public static final E1.i f4197f;

    /* renamed from: g, reason: collision with root package name */
    public static final E1.i f4198g;
    public static final E1.i h;
    public static final E1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final E1.i f4199a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.i f4200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4201c;

    static {
        E1.i iVar = E1.i.d;
        d = L0.e.e(":");
        f4196e = L0.e.e(":status");
        f4197f = L0.e.e(":method");
        f4198g = L0.e.e(":path");
        h = L0.e.e(":scheme");
        i = L0.e.e(":authority");
    }

    public b(E1.i iVar, E1.i iVar2) {
        g1.d.e(iVar, "name");
        g1.d.e(iVar2, "value");
        this.f4199a = iVar;
        this.f4200b = iVar2;
        this.f4201c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g1.d.a(this.f4199a, bVar.f4199a) && g1.d.a(this.f4200b, bVar.f4200b);
    }

    public final int hashCode() {
        return this.f4200b.hashCode() + (this.f4199a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4199a.h() + ": " + this.f4200b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(L0.e.e(str), L0.e.e(str2));
        g1.d.e(str, "name");
        g1.d.e(str2, "value");
        E1.i iVar = E1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(E1.i iVar, String str) {
        this(iVar, L0.e.e(str));
        g1.d.e(iVar, "name");
        g1.d.e(str, "value");
        E1.i iVar2 = E1.i.d;
    }
}
