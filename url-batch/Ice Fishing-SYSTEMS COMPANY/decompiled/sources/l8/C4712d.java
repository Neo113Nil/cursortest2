package l8;

/* renamed from: l8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4712d {

    /* renamed from: d, reason: collision with root package name */
    public static final u8.h f39106d;

    /* renamed from: e, reason: collision with root package name */
    public static final u8.h f39107e;

    /* renamed from: f, reason: collision with root package name */
    public static final u8.h f39108f;

    /* renamed from: g, reason: collision with root package name */
    public static final u8.h f39109g;

    /* renamed from: h, reason: collision with root package name */
    public static final u8.h f39110h;
    public static final u8.h i;

    /* renamed from: a, reason: collision with root package name */
    public final u8.h f39111a;

    /* renamed from: b, reason: collision with root package name */
    public final u8.h f39112b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39113c;

    static {
        u8.h hVar = u8.h.f41278w;
        f39106d = L2.i.n(":");
        f39107e = L2.i.n(com.anythink.core.common.n.b.a.e.c.f15282b);
        f39108f = L2.i.n(com.anythink.core.common.n.b.a.e.c.f15283c);
        f39109g = L2.i.n(com.anythink.core.common.n.b.a.e.c.f15284d);
        f39110h = L2.i.n(com.anythink.core.common.n.b.a.e.c.f15285e);
        i = L2.i.n(com.anythink.core.common.n.b.a.e.c.f15286f);
    }

    public C4712d(u8.h name, u8.h value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        this.f39111a = name;
        this.f39112b = value;
        this.f39113c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4712d)) {
            return false;
        }
        C4712d c4712d = (C4712d) obj;
        return kotlin.jvm.internal.h.a(this.f39111a, c4712d.f39111a) && kotlin.jvm.internal.h.a(this.f39112b, c4712d.f39112b);
    }

    public final int hashCode() {
        return this.f39112b.hashCode() + (this.f39111a.hashCode() * 31);
    }

    public final String toString() {
        return this.f39111a.l() + ": " + this.f39112b.l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4712d(String str, String str2) {
        this(L2.i.n(str), L2.i.n(str2));
        u8.h hVar = u8.h.f41278w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4712d(u8.h name, String value) {
        this(name, L2.i.n(value));
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        u8.h hVar = u8.h.f41278w;
    }
}
