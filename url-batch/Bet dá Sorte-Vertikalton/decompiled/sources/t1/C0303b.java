package t1;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303b {
    public static final z1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final z1.i f3833e;

    /* renamed from: f, reason: collision with root package name */
    public static final z1.i f3834f;

    /* renamed from: g, reason: collision with root package name */
    public static final z1.i f3835g;
    public static final z1.i h;
    public static final z1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final z1.i f3836a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.i f3837b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3838c;

    static {
        z1.i iVar = z1.i.d;
        d = M0.e.h(":");
        f3833e = M0.e.h(":status");
        f3834f = M0.e.h(":method");
        f3835g = M0.e.h(":path");
        h = M0.e.h(":scheme");
        i = M0.e.h(":authority");
    }

    public C0303b(z1.i iVar, z1.i iVar2) {
        b1.d.e(iVar, "name");
        b1.d.e(iVar2, "value");
        this.f3836a = iVar;
        this.f3837b = iVar2;
        this.f3838c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0303b)) {
            return false;
        }
        C0303b c0303b = (C0303b) obj;
        return b1.d.a(this.f3836a, c0303b.f3836a) && b1.d.a(this.f3837b, c0303b.f3837b);
    }

    public final int hashCode() {
        return this.f3837b.hashCode() + (this.f3836a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3836a.h() + ": " + this.f3837b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0303b(String str, String str2) {
        this(M0.e.h(str), M0.e.h(str2));
        b1.d.e(str, "name");
        b1.d.e(str2, "value");
        z1.i iVar = z1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0303b(z1.i iVar, String str) {
        this(iVar, M0.e.h(str));
        b1.d.e(iVar, "name");
        b1.d.e(str, "value");
        z1.i iVar2 = z1.i.d;
    }
}
