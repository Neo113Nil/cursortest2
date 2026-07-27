package y3;

import b2.AbstractC0279e;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12380a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12381b;

    public C1567a(int i2, String str) {
        this.f12380a = i2;
        this.f12381b = str;
    }

    public final int a() {
        return this.f12380a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1567a)) {
            return false;
        }
        C1567a c1567a = (C1567a) obj;
        return this.f12380a == c1567a.f12380a && this.f12381b.equals(c1567a.f12381b);
    }

    public final int hashCode() {
        return this.f12381b.hashCode() ^ ((this.f12380a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoEnumInfo{enumNumber=");
        sb.append(this.f12380a);
        sb.append(", jsonName=");
        return AbstractC0279e.h(sb, this.f12381b, "}");
    }
}
