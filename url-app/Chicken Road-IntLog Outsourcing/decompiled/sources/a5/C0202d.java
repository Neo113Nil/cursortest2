package a5;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: a5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202d {

    /* renamed from: d, reason: collision with root package name */
    public static final j5.i f3926d;

    /* renamed from: e, reason: collision with root package name */
    public static final j5.i f3927e;

    /* renamed from: f, reason: collision with root package name */
    public static final j5.i f3928f;

    /* renamed from: g, reason: collision with root package name */
    public static final j5.i f3929g;

    /* renamed from: h, reason: collision with root package name */
    public static final j5.i f3930h;

    /* renamed from: i, reason: collision with root package name */
    public static final j5.i f3931i;

    /* renamed from: a, reason: collision with root package name */
    public final j5.i f3932a;

    /* renamed from: b, reason: collision with root package name */
    public final j5.i f3933b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3934c;

    static {
        j5.i iVar = j5.i.f10496d;
        f3926d = l1.j.h(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f3927e = l1.j.h(":status");
        f3928f = l1.j.h(":method");
        f3929g = l1.j.h(":path");
        f3930h = l1.j.h(":scheme");
        f3931i = l1.j.h(":authority");
    }

    public C0202d(j5.i name, j5.i value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        this.f3932a = name;
        this.f3933b = value;
        this.f3934c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0202d)) {
            return false;
        }
        C0202d c0202d = (C0202d) obj;
        return kotlin.jvm.internal.i.a(this.f3932a, c0202d.f3932a) && kotlin.jvm.internal.i.a(this.f3933b, c0202d.f3933b);
    }

    public final int hashCode() {
        return this.f3933b.hashCode() + (this.f3932a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3932a.k() + ": " + this.f3933b.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0202d(String str, String str2) {
        this(l1.j.h(str), l1.j.h(str2));
        j5.i iVar = j5.i.f10496d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0202d(j5.i name, String value) {
        this(name, l1.j.h(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        j5.i iVar = j5.i.f10496d;
    }
}
