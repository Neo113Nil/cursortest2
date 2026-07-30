package z7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final f8.i f10133d;

    /* renamed from: e, reason: collision with root package name */
    public static final f8.i f10134e;

    /* renamed from: f, reason: collision with root package name */
    public static final f8.i f10135f;

    /* renamed from: g, reason: collision with root package name */
    public static final f8.i f10136g;

    /* renamed from: h, reason: collision with root package name */
    public static final f8.i f10137h;

    /* renamed from: i, reason: collision with root package name */
    public static final f8.i f10138i;

    /* renamed from: a, reason: collision with root package name */
    public final f8.i f10139a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.i f10140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10141c;

    static {
        f8.i iVar = f8.i.f3600i;
        f10133d = m4.f.j(":");
        f10134e = m4.f.j(":status");
        f10135f = m4.f.j(":method");
        f10136g = m4.f.j(":path");
        f10137h = m4.f.j(":scheme");
        f10138i = m4.f.j(":authority");
    }

    public b(f8.i iVar, f8.i iVar2) {
        r6.k.f(iVar, "name");
        r6.k.f(iVar2, "value");
        this.f10139a = iVar;
        this.f10140b = iVar2;
        this.f10141c = iVar2.e() + iVar.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r6.k.a(this.f10139a, bVar.f10139a) && r6.k.a(this.f10140b, bVar.f10140b);
    }

    public final int hashCode() {
        return this.f10140b.hashCode() + (this.f10139a.hashCode() * 31);
    }

    public final String toString() {
        return this.f10139a.C() + ": " + this.f10140b.C();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(m4.f.j(str), m4.f.j(str2));
        r6.k.f(str, "name");
        r6.k.f(str2, "value");
        f8.i iVar = f8.i.f3600i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f8.i iVar, String str) {
        this(iVar, m4.f.j(str));
        r6.k.f(iVar, "name");
        r6.k.f(str, "value");
        f8.i iVar2 = f8.i.f3600i;
    }
}
