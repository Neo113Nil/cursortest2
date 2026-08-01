package r1;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291b {
    public static final x1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final x1.i f3530e;

    /* renamed from: f, reason: collision with root package name */
    public static final x1.i f3531f;

    /* renamed from: g, reason: collision with root package name */
    public static final x1.i f3532g;
    public static final x1.i h;
    public static final x1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final x1.i f3533a;

    /* renamed from: b, reason: collision with root package name */
    public final x1.i f3534b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3535c;

    static {
        x1.i iVar = x1.i.d;
        d = I0.e.h(":");
        f3530e = I0.e.h(":status");
        f3531f = I0.e.h(":method");
        f3532g = I0.e.h(":path");
        h = I0.e.h(":scheme");
        i = I0.e.h(":authority");
    }

    public C0291b(x1.i iVar, x1.i iVar2) {
        Z0.d.e(iVar, "name");
        Z0.d.e(iVar2, "value");
        this.f3533a = iVar;
        this.f3534b = iVar2;
        this.f3535c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0291b)) {
            return false;
        }
        C0291b c0291b = (C0291b) obj;
        return Z0.d.a(this.f3533a, c0291b.f3533a) && Z0.d.a(this.f3534b, c0291b.f3534b);
    }

    public final int hashCode() {
        return this.f3534b.hashCode() + (this.f3533a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3533a.h() + ": " + this.f3534b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0291b(String str, String str2) {
        this(I0.e.h(str), I0.e.h(str2));
        Z0.d.e(str, "name");
        Z0.d.e(str2, "value");
        x1.i iVar = x1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0291b(x1.i iVar, String str) {
        this(iVar, I0.e.h(str));
        Z0.d.e(iVar, "name");
        Z0.d.e(str, "value");
        x1.i iVar2 = x1.i.d;
    }
}
