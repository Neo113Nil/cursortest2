package t3;

import kotlin.jvm.internal.Intrinsics;
import z3.C1451i;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212c {

    /* renamed from: d, reason: collision with root package name */
    public static final C1451i f10756d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1451i f10757e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1451i f10758f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1451i f10759g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1451i f10760h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1451i f10761i;

    /* renamed from: a, reason: collision with root package name */
    public final C1451i f10762a;

    /* renamed from: b, reason: collision with root package name */
    public final C1451i f10763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10764c;

    static {
        C1451i c1451i = C1451i.f12000j;
        f10756d = H1.f.n(":");
        f10757e = H1.f.n(":status");
        f10758f = H1.f.n(":method");
        f10759g = H1.f.n(":path");
        f10760h = H1.f.n(":scheme");
        f10761i = H1.f.n(":authority");
    }

    public C1212c(C1451i name, C1451i value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10762a = name;
        this.f10763b = value;
        this.f10764c = value.c() + name.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1212c)) {
            return false;
        }
        C1212c c1212c = (C1212c) obj;
        return Intrinsics.a(this.f10762a, c1212c.f10762a) && Intrinsics.a(this.f10763b, c1212c.f10763b);
    }

    public final int hashCode() {
        return this.f10763b.hashCode() + (this.f10762a.hashCode() * 31);
    }

    public final String toString() {
        return this.f10762a.C() + ": " + this.f10763b.C();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1212c(String name, String value) {
        this(H1.f.n(name), H1.f.n(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C1451i c1451i = C1451i.f12000j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1212c(C1451i name, String value) {
        this(name, H1.f.n(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C1451i c1451i = C1451i.f12000j;
    }
}
