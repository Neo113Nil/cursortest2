package p1;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286b {
    public static final v1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final v1.i f3386e;

    /* renamed from: f, reason: collision with root package name */
    public static final v1.i f3387f;

    /* renamed from: g, reason: collision with root package name */
    public static final v1.i f3388g;
    public static final v1.i h;
    public static final v1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final v1.i f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.i f3390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3391c;

    static {
        v1.i iVar = v1.i.d;
        d = H0.e.h(":");
        f3386e = H0.e.h(":status");
        f3387f = H0.e.h(":method");
        f3388g = H0.e.h(":path");
        h = H0.e.h(":scheme");
        i = H0.e.h(":authority");
    }

    public C0286b(v1.i iVar, v1.i iVar2) {
        X0.d.e(iVar, "name");
        X0.d.e(iVar2, "value");
        this.f3389a = iVar;
        this.f3390b = iVar2;
        this.f3391c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0286b)) {
            return false;
        }
        C0286b c0286b = (C0286b) obj;
        return X0.d.a(this.f3389a, c0286b.f3389a) && X0.d.a(this.f3390b, c0286b.f3390b);
    }

    public final int hashCode() {
        return this.f3390b.hashCode() + (this.f3389a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3389a.h() + ": " + this.f3390b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0286b(String str, String str2) {
        this(H0.e.h(str), H0.e.h(str2));
        X0.d.e(str, "name");
        X0.d.e(str2, "value");
        v1.i iVar = v1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0286b(v1.i iVar, String str) {
        this(iVar, H0.e.h(str));
        X0.d.e(iVar, "name");
        X0.d.e(str, "value");
        v1.i iVar2 = v1.i.d;
    }
}
