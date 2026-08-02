package c2;

import java.util.Arrays;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5650a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.e f5651b;

    /* renamed from: c, reason: collision with root package name */
    public final b2.b f5652c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5653d;

    public C0284a(l2.e eVar, b2.b bVar, String str) {
        this.f5651b = eVar;
        this.f5652c = bVar;
        this.f5653d = str;
        this.f5650a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0284a)) {
            return false;
        }
        C0284a c0284a = (C0284a) obj;
        return d2.s.e(this.f5651b, c0284a.f5651b) && d2.s.e(this.f5652c, c0284a.f5652c) && d2.s.e(this.f5653d, c0284a.f5653d);
    }

    public final int hashCode() {
        return this.f5650a;
    }
}
