package p1;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285b {
    public static final v1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final v1.i f3381e;

    /* renamed from: f, reason: collision with root package name */
    public static final v1.i f3382f;

    /* renamed from: g, reason: collision with root package name */
    public static final v1.i f3383g;
    public static final v1.i h;
    public static final v1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final v1.i f3384a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.i f3385b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3386c;

    static {
        v1.i iVar = v1.i.d;
        d = H0.e.i(":");
        f3381e = H0.e.i(":status");
        f3382f = H0.e.i(":method");
        f3383g = H0.e.i(":path");
        h = H0.e.i(":scheme");
        i = H0.e.i(":authority");
    }

    public C0285b(v1.i iVar, v1.i iVar2) {
        X0.e.e(iVar, "name");
        X0.e.e(iVar2, "value");
        this.f3384a = iVar;
        this.f3385b = iVar2;
        this.f3386c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0285b)) {
            return false;
        }
        C0285b c0285b = (C0285b) obj;
        return X0.e.a(this.f3384a, c0285b.f3384a) && X0.e.a(this.f3385b, c0285b.f3385b);
    }

    public final int hashCode() {
        return this.f3385b.hashCode() + (this.f3384a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3384a.h() + ": " + this.f3385b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0285b(String str, String str2) {
        this(H0.e.i(str), H0.e.i(str2));
        X0.e.e(str, "name");
        X0.e.e(str2, "value");
        v1.i iVar = v1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0285b(v1.i iVar, String str) {
        this(iVar, H0.e.i(str));
        X0.e.e(iVar, "name");
        X0.e.e(str, "value");
        v1.i iVar2 = v1.i.d;
    }
}
