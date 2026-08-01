package G1;

/* renamed from: G1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c {
    public static final M1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final M1.i f366e;

    /* renamed from: f, reason: collision with root package name */
    public static final M1.i f367f;

    /* renamed from: g, reason: collision with root package name */
    public static final M1.i f368g;
    public static final M1.i h;
    public static final M1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final M1.i f369a;

    /* renamed from: b, reason: collision with root package name */
    public final M1.i f370b;

    /* renamed from: c, reason: collision with root package name */
    public final int f371c;

    static {
        M1.i iVar = M1.i.d;
        d = R0.e.h(":");
        f366e = R0.e.h(":status");
        f367f = R0.e.h(":method");
        f368g = R0.e.h(":path");
        h = R0.e.h(":scheme");
        i = R0.e.h(":authority");
    }

    public C0002c(M1.i iVar, M1.i iVar2) {
        k1.e.e(iVar, "name");
        k1.e.e(iVar2, "value");
        this.f369a = iVar;
        this.f370b = iVar2;
        this.f371c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0002c)) {
            return false;
        }
        C0002c c0002c = (C0002c) obj;
        return k1.e.a(this.f369a, c0002c.f369a) && k1.e.a(this.f370b, c0002c.f370b);
    }

    public final int hashCode() {
        return this.f370b.hashCode() + (this.f369a.hashCode() * 31);
    }

    public final String toString() {
        return this.f369a.h() + ": " + this.f370b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0002c(String str, String str2) {
        this(R0.e.h(str), R0.e.h(str2));
        k1.e.e(str, "name");
        k1.e.e(str2, "value");
        M1.i iVar = M1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0002c(M1.i iVar, String str) {
        this(iVar, R0.e.h(str));
        k1.e.e(iVar, "name");
        k1.e.e(str, "value");
        M1.i iVar2 = M1.i.d;
    }
}
