package G1;

/* renamed from: G1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c {

    /* renamed from: d, reason: collision with root package name */
    public static final M1.i f348d;
    public static final M1.i e;

    /* renamed from: f, reason: collision with root package name */
    public static final M1.i f349f;

    /* renamed from: g, reason: collision with root package name */
    public static final M1.i f350g;

    /* renamed from: h, reason: collision with root package name */
    public static final M1.i f351h;
    public static final M1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final M1.i f352a;

    /* renamed from: b, reason: collision with root package name */
    public final M1.i f353b;

    /* renamed from: c, reason: collision with root package name */
    public final int f354c;

    static {
        M1.i iVar = M1.i.f828d;
        f348d = N0.e.h(":");
        e = N0.e.h(":status");
        f349f = N0.e.h(":method");
        f350g = N0.e.h(":path");
        f351h = N0.e.h(":scheme");
        i = N0.e.h(":authority");
    }

    public C0002c(M1.i iVar, M1.i iVar2) {
        j1.h.e(iVar, "name");
        j1.h.e(iVar2, "value");
        this.f352a = iVar;
        this.f353b = iVar2;
        this.f354c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0002c)) {
            return false;
        }
        C0002c c0002c = (C0002c) obj;
        return j1.h.a(this.f352a, c0002c.f352a) && j1.h.a(this.f353b, c0002c.f353b);
    }

    public final int hashCode() {
        return this.f353b.hashCode() + (this.f352a.hashCode() * 31);
    }

    public final String toString() {
        return this.f352a.h() + ": " + this.f353b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0002c(String str, String str2) {
        this(N0.e.h(str), N0.e.h(str2));
        j1.h.e(str, "name");
        j1.h.e(str2, "value");
        M1.i iVar = M1.i.f828d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0002c(M1.i iVar, String str) {
        this(iVar, N0.e.h(str));
        j1.h.e(iVar, "name");
        j1.h.e(str, "value");
        M1.i iVar2 = M1.i.f828d;
    }
}
