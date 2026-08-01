package t1;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316b {
    public static final z1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final z1.i f3751e;

    /* renamed from: f, reason: collision with root package name */
    public static final z1.i f3752f;

    /* renamed from: g, reason: collision with root package name */
    public static final z1.i f3753g;
    public static final z1.i h;
    public static final z1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final z1.i f3754a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.i f3755b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3756c;

    static {
        z1.i iVar = z1.i.d;
        d = I0.e.h(":");
        f3751e = I0.e.h(":status");
        f3752f = I0.e.h(":method");
        f3753g = I0.e.h(":path");
        h = I0.e.h(":scheme");
        i = I0.e.h(":authority");
    }

    public C0316b(z1.i iVar, z1.i iVar2) {
        b1.d.e(iVar, "name");
        b1.d.e(iVar2, "value");
        this.f3754a = iVar;
        this.f3755b = iVar2;
        this.f3756c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0316b)) {
            return false;
        }
        C0316b c0316b = (C0316b) obj;
        return b1.d.a(this.f3754a, c0316b.f3754a) && b1.d.a(this.f3755b, c0316b.f3755b);
    }

    public final int hashCode() {
        return this.f3755b.hashCode() + (this.f3754a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3754a.h() + ": " + this.f3755b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0316b(String str, String str2) {
        this(I0.e.h(str), I0.e.h(str2));
        b1.d.e(str, "name");
        b1.d.e(str2, "value");
        z1.i iVar = z1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0316b(z1.i iVar, String str) {
        this(iVar, I0.e.h(str));
        b1.d.e(iVar, "name");
        b1.d.e(str, "value");
        z1.i iVar2 = z1.i.d;
    }
}
