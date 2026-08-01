package j3;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final p3.i f2402d;

    /* renamed from: e, reason: collision with root package name */
    public static final p3.i f2403e;

    /* renamed from: f, reason: collision with root package name */
    public static final p3.i f2404f;
    public static final p3.i g;
    public static final p3.i h;

    /* renamed from: i, reason: collision with root package name */
    public static final p3.i f2405i;

    /* renamed from: a, reason: collision with root package name */
    public final p3.i f2406a;

    /* renamed from: b, reason: collision with root package name */
    public final p3.i f2407b;
    public final int c;

    static {
        p3.i iVar = p3.i.f3029i;
        f2402d = g2.f.k(":");
        f2403e = g2.f.k(":status");
        f2404f = g2.f.k(":method");
        g = g2.f.k(":path");
        h = g2.f.k(":scheme");
        f2405i = g2.f.k(":authority");
    }

    public b(p3.i iVar, p3.i iVar2) {
        u2.c.e(iVar, "name");
        u2.c.e(iVar2, "value");
        this.f2406a = iVar;
        this.f2407b = iVar2;
        this.c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return u2.c.a(this.f2406a, bVar.f2406a) && u2.c.a(this.f2407b, bVar.f2407b);
    }

    public final int hashCode() {
        return this.f2407b.hashCode() + (this.f2406a.hashCode() * 31);
    }

    public final String toString() {
        return this.f2406a.h() + ": " + this.f2407b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(g2.f.k(str), g2.f.k(str2));
        u2.c.e(str, "name");
        u2.c.e(str2, "value");
        p3.i iVar = p3.i.f3029i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(p3.i iVar, String str) {
        this(iVar, g2.f.k(str));
        u2.c.e(iVar, "name");
        u2.c.e(str, "value");
        p3.i iVar2 = p3.i.f3029i;
    }
}
