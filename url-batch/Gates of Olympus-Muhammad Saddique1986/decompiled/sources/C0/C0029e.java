package C0;

import m.AbstractC0625j;

/* renamed from: C0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f593b;

    /* renamed from: c, reason: collision with root package name */
    public final int f594c;

    /* renamed from: d, reason: collision with root package name */
    public final String f595d;

    public C0029e(int i3, int i4, Object obj, String str) {
        this.f592a = obj;
        this.f593b = i3;
        this.f594c = i4;
        this.f595d = str;
        if (i3 > i4) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0029e)) {
            return false;
        }
        C0029e c0029e = (C0029e) obj;
        return f2.j.a(this.f592a, c0029e.f592a) && this.f593b == c0029e.f593b && this.f594c == c0029e.f594c && f2.j.a(this.f595d, c0029e.f595d);
    }

    public final int hashCode() {
        Object obj = this.f592a;
        return this.f595d.hashCode() + AbstractC0625j.a(this.f594c, AbstractC0625j.a(this.f593b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.f592a + ", start=" + this.f593b + ", end=" + this.f594c + ", tag=" + this.f595d + ')';
    }

    public C0029e(int i3, int i4, Object obj) {
        this(i3, i4, obj, "");
    }
}
