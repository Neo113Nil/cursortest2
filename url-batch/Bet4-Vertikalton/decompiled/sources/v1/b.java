package v1;

/* loaded from: classes.dex */
public final class b {
    public static final B1.i d;

    /* renamed from: e, reason: collision with root package name */
    public static final B1.i f4053e;

    /* renamed from: f, reason: collision with root package name */
    public static final B1.i f4054f;

    /* renamed from: g, reason: collision with root package name */
    public static final B1.i f4055g;
    public static final B1.i h;
    public static final B1.i i;

    /* renamed from: a, reason: collision with root package name */
    public final B1.i f4056a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.i f4057b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4058c;

    static {
        B1.i iVar = B1.i.d;
        d = J0.e.h(":");
        f4053e = J0.e.h(":status");
        f4054f = J0.e.h(":method");
        f4055g = J0.e.h(":path");
        h = J0.e.h(":scheme");
        i = J0.e.h(":authority");
    }

    public b(B1.i iVar, B1.i iVar2) {
        d1.d.e(iVar, "name");
        d1.d.e(iVar2, "value");
        this.f4056a = iVar;
        this.f4057b = iVar2;
        this.f4058c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return d1.d.a(this.f4056a, bVar.f4056a) && d1.d.a(this.f4057b, bVar.f4057b);
    }

    public final int hashCode() {
        return this.f4057b.hashCode() + (this.f4056a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4056a.h() + ": " + this.f4057b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(J0.e.h(str), J0.e.h(str2));
        d1.d.e(str, "name");
        d1.d.e(str2, "value");
        B1.i iVar = B1.i.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(B1.i iVar, String str) {
        this(iVar, J0.e.h(str));
        d1.d.e(iVar, "name");
        d1.d.e(str, "value");
        B1.i iVar2 = B1.i.d;
    }
}
