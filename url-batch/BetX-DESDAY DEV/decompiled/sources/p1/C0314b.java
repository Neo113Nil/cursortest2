package p1;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314b {

    /* renamed from: d, reason: collision with root package name */
    public static final v1.j f3772d;

    /* renamed from: e, reason: collision with root package name */
    public static final v1.j f3773e;

    /* renamed from: f, reason: collision with root package name */
    public static final v1.j f3774f;

    /* renamed from: g, reason: collision with root package name */
    public static final v1.j f3775g;
    public static final v1.j h;
    public static final v1.j i;

    /* renamed from: a, reason: collision with root package name */
    public final v1.j f3776a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.j f3777b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3778c;

    static {
        v1.j jVar = v1.j.f4489d;
        f3772d = v1.i.c(":");
        f3773e = v1.i.c(":status");
        f3774f = v1.i.c(":method");
        f3775g = v1.i.c(":path");
        h = v1.i.c(":scheme");
        i = v1.i.c(":authority");
    }

    public C0314b(v1.j jVar, v1.j jVar2) {
        X0.f.e(jVar, "name");
        X0.f.e(jVar2, "value");
        this.f3776a = jVar;
        this.f3777b = jVar2;
        this.f3778c = jVar2.a() + jVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0314b)) {
            return false;
        }
        C0314b c0314b = (C0314b) obj;
        return X0.f.a(this.f3776a, c0314b.f3776a) && X0.f.a(this.f3777b, c0314b.f3777b);
    }

    public final int hashCode() {
        return this.f3777b.hashCode() + (this.f3776a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3776a.h() + ": " + this.f3777b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0314b(String str, String str2) {
        this(v1.i.c(str), v1.i.c(str2));
        X0.f.e(str, "name");
        X0.f.e(str2, "value");
        v1.j jVar = v1.j.f4489d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0314b(v1.j jVar, String str) {
        this(jVar, v1.i.c(str));
        X0.f.e(jVar, "name");
        X0.f.e(str, "value");
        v1.j jVar2 = v1.j.f4489d;
    }
}
