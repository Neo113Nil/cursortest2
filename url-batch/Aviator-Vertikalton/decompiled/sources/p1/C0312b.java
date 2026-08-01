package p1;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312b {

    /* renamed from: d, reason: collision with root package name */
    public static final v1.j f3768d;

    /* renamed from: e, reason: collision with root package name */
    public static final v1.j f3769e;

    /* renamed from: f, reason: collision with root package name */
    public static final v1.j f3770f;

    /* renamed from: g, reason: collision with root package name */
    public static final v1.j f3771g;
    public static final v1.j h;
    public static final v1.j i;

    /* renamed from: a, reason: collision with root package name */
    public final v1.j f3772a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.j f3773b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3774c;

    static {
        v1.j jVar = v1.j.f4485d;
        f3768d = v1.i.c(":");
        f3769e = v1.i.c(":status");
        f3770f = v1.i.c(":method");
        f3771g = v1.i.c(":path");
        h = v1.i.c(":scheme");
        i = v1.i.c(":authority");
    }

    public C0312b(v1.j jVar, v1.j jVar2) {
        X0.f.e(jVar, "name");
        X0.f.e(jVar2, "value");
        this.f3772a = jVar;
        this.f3773b = jVar2;
        this.f3774c = jVar2.a() + jVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0312b)) {
            return false;
        }
        C0312b c0312b = (C0312b) obj;
        return X0.f.a(this.f3772a, c0312b.f3772a) && X0.f.a(this.f3773b, c0312b.f3773b);
    }

    public final int hashCode() {
        return this.f3773b.hashCode() + (this.f3772a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3772a.h() + ": " + this.f3773b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0312b(String str, String str2) {
        this(v1.i.c(str), v1.i.c(str2));
        X0.f.e(str, "name");
        X0.f.e(str2, "value");
        v1.j jVar = v1.j.f4485d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0312b(v1.j jVar, String str) {
        this(jVar, v1.i.c(str));
        X0.f.e(jVar, "name");
        X0.f.e(str, "value");
        v1.j jVar2 = v1.j.f4485d;
    }
}
