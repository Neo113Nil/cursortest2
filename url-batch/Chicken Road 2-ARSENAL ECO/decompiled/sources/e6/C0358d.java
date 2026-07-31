package e6;

import y1.C0760d;

/* renamed from: e6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358d {

    /* renamed from: d, reason: collision with root package name */
    public static final n6.i f4047d;

    /* renamed from: e, reason: collision with root package name */
    public static final n6.i f4048e;

    /* renamed from: f, reason: collision with root package name */
    public static final n6.i f4049f;

    /* renamed from: g, reason: collision with root package name */
    public static final n6.i f4050g;

    /* renamed from: h, reason: collision with root package name */
    public static final n6.i f4051h;

    /* renamed from: i, reason: collision with root package name */
    public static final n6.i f4052i;

    /* renamed from: a, reason: collision with root package name */
    public final n6.i f4053a;

    /* renamed from: b, reason: collision with root package name */
    public final n6.i f4054b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4055c;

    static {
        n6.i iVar = n6.i.f5525i;
        f4047d = C0760d.d(":");
        f4048e = C0760d.d(":status");
        f4049f = C0760d.d(":method");
        f4050g = C0760d.d(":path");
        f4051h = C0760d.d(":scheme");
        f4052i = C0760d.d(":authority");
    }

    public C0358d(n6.i name, n6.i value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        this.f4053a = name;
        this.f4054b = value;
        this.f4055c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0358d)) {
            return false;
        }
        C0358d c0358d = (C0358d) obj;
        return kotlin.jvm.internal.i.a(this.f4053a, c0358d.f4053a) && kotlin.jvm.internal.i.a(this.f4054b, c0358d.f4054b);
    }

    public final int hashCode() {
        return this.f4054b.hashCode() + (this.f4053a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4053a.k() + ": " + this.f4054b.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0358d(String str, String str2) {
        this(C0760d.d(str), C0760d.d(str2));
        n6.i iVar = n6.i.f5525i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0358d(n6.i name, String value) {
        this(name, C0760d.d(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        n6.i iVar = n6.i.f5525i;
    }
}
