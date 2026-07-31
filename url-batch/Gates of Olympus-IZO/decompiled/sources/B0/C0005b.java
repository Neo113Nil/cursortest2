package B0;

import H2.AbstractC0080b;

/* renamed from: B0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f248c;

    /* renamed from: d, reason: collision with root package name */
    public final String f249d;

    public C0005b(Object obj, int i3, int i4, String str) {
        this.f246a = obj;
        this.f247b = i3;
        this.f248c = i4;
        this.f249d = str;
        if (i3 > i4) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0005b)) {
            return false;
        }
        C0005b c0005b = (C0005b) obj;
        return Z1.i.a(this.f246a, c0005b.f246a) && this.f247b == c0005b.f247b && this.f248c == c0005b.f248c && Z1.i.a(this.f249d, c0005b.f249d);
    }

    public final int hashCode() {
        Object obj = this.f246a;
        return this.f249d.hashCode() + AbstractC0080b.b(this.f248c, AbstractC0080b.b(this.f247b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.f246a + ", start=" + this.f247b + ", end=" + this.f248c + ", tag=" + this.f249d + ')';
    }

    public C0005b(Object obj, int i3, int i4) {
        this(obj, i3, i4, "");
    }
}
