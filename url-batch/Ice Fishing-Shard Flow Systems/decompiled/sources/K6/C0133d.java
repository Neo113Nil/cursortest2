package K6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: K6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133d {

    /* renamed from: d, reason: collision with root package name */
    public static final T6.i f1500d;

    /* renamed from: e, reason: collision with root package name */
    public static final T6.i f1501e;

    /* renamed from: f, reason: collision with root package name */
    public static final T6.i f1502f;

    /* renamed from: g, reason: collision with root package name */
    public static final T6.i f1503g;

    /* renamed from: h, reason: collision with root package name */
    public static final T6.i f1504h;

    /* renamed from: i, reason: collision with root package name */
    public static final T6.i f1505i;

    /* renamed from: a, reason: collision with root package name */
    public final T6.i f1506a;

    /* renamed from: b, reason: collision with root package name */
    public final T6.i f1507b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1508c;

    static {
        T6.i iVar = T6.i.f2618l;
        f1500d = q1.h.n(":");
        f1501e = q1.h.n(":status");
        f1502f = q1.h.n(":method");
        f1503g = q1.h.n(":path");
        f1504h = q1.h.n(":scheme");
        f1505i = q1.h.n(":authority");
    }

    public C0133d(T6.i name, T6.i value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f1506a = name;
        this.f1507b = value;
        this.f1508c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0133d)) {
            return false;
        }
        C0133d c0133d = (C0133d) obj;
        return Intrinsics.a(this.f1506a, c0133d.f1506a) && Intrinsics.a(this.f1507b, c0133d.f1507b);
    }

    public final int hashCode() {
        return this.f1507b.hashCode() + (this.f1506a.hashCode() * 31);
    }

    public final String toString() {
        return this.f1506a.k() + ": " + this.f1507b.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0133d(String name, String value) {
        this(q1.h.n(name), q1.h.n(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        T6.i iVar = T6.i.f2618l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0133d(T6.i name, String value) {
        this(name, q1.h.n(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        T6.i iVar = T6.i.f2618l;
    }
}
