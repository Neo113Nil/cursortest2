package N3;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: N3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079c {

    /* renamed from: d, reason: collision with root package name */
    public static final T3.j f1828d;

    /* renamed from: e, reason: collision with root package name */
    public static final T3.j f1829e;

    /* renamed from: f, reason: collision with root package name */
    public static final T3.j f1830f;

    /* renamed from: g, reason: collision with root package name */
    public static final T3.j f1831g;

    /* renamed from: h, reason: collision with root package name */
    public static final T3.j f1832h;

    /* renamed from: i, reason: collision with root package name */
    public static final T3.j f1833i;

    /* renamed from: a, reason: collision with root package name */
    public final T3.j f1834a;

    /* renamed from: b, reason: collision with root package name */
    public final T3.j f1835b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1836c;

    static {
        T3.j jVar = T3.j.f2976d;
        f1828d = a2.i.n(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f1829e = a2.i.n(":status");
        f1830f = a2.i.n(":method");
        f1831g = a2.i.n(":path");
        f1832h = a2.i.n(":scheme");
        f1833i = a2.i.n(":authority");
    }

    public C0079c(T3.j name, T3.j value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        this.f1834a = name;
        this.f1835b = value;
        this.f1836c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0079c)) {
            return false;
        }
        C0079c c0079c = (C0079c) obj;
        return kotlin.jvm.internal.i.a(this.f1834a, c0079c.f1834a) && kotlin.jvm.internal.i.a(this.f1835b, c0079c.f1835b);
    }

    public final int hashCode() {
        return this.f1835b.hashCode() + (this.f1834a.hashCode() * 31);
    }

    public final String toString() {
        return this.f1834a.h() + ": " + this.f1835b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0079c(String name, String value) {
        this(a2.i.n(name), a2.i.n(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        T3.j jVar = T3.j.f2976d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0079c(T3.j name, String value) {
        this(name, a2.i.n(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        T3.j jVar = T3.j.f2976d;
    }
}
