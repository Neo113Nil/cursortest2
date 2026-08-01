package a4;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {
    public static final g4.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final g4.i f145e;

    /* renamed from: f, reason: collision with root package name */
    public static final g4.i f146f;

    /* renamed from: g, reason: collision with root package name */
    public static final g4.i f147g;
    public static final g4.i h;
    public static final g4.i i;

    /* renamed from: a, reason: collision with root package name */
    public final g4.i f148a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.i f149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150c;

    static {
        g4.i iVar = g4.i.i;
        d = o2.f.g(":");
        f145e = o2.f.g(":status");
        f146f = o2.f.g(":method");
        f147g = o2.f.g(":path");
        h = o2.f.g(":scheme");
        i = o2.f.g(":authority");
    }

    public c(g4.i iVar, g4.i iVar2) {
        i3.d.e(iVar, "name");
        i3.d.e(iVar2, "value");
        this.f148a = iVar;
        this.f149b = iVar2;
        this.f150c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i3.d.a(this.f148a, cVar.f148a) && i3.d.a(this.f149b, cVar.f149b);
    }

    public final int hashCode() {
        return this.f149b.hashCode() + (this.f148a.hashCode() * 31);
    }

    public final String toString() {
        return this.f148a.h() + ": " + this.f149b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(o2.f.g(str), o2.f.g(str2));
        i3.d.e(str, "name");
        i3.d.e(str2, "value");
        g4.i iVar = g4.i.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(g4.i iVar, String str) {
        this(iVar, o2.f.g(str));
        i3.d.e(iVar, "name");
        i3.d.e(str, "value");
        g4.i iVar2 = g4.i.i;
    }
}
