package C0;

import m.AbstractC0625j;

/* renamed from: C0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f585b;

    /* renamed from: c, reason: collision with root package name */
    public final int f586c;

    /* renamed from: d, reason: collision with root package name */
    public final String f587d;

    public /* synthetic */ C0027c(int i3, int i4, Object obj) {
        this(i3, i4, obj, "");
    }

    public final C0029e a(int i3) {
        int i4 = this.f586c;
        if (i4 != Integer.MIN_VALUE) {
            i3 = i4;
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new C0029e(this.f585b, i3, this.f584a, this.f587d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0027c)) {
            return false;
        }
        C0027c c0027c = (C0027c) obj;
        return f2.j.a(this.f584a, c0027c.f584a) && this.f585b == c0027c.f585b && this.f586c == c0027c.f586c && f2.j.a(this.f587d, c0027c.f587d);
    }

    public final int hashCode() {
        Object obj = this.f584a;
        return this.f587d.hashCode() + AbstractC0625j.a(this.f586c, AbstractC0625j.a(this.f585b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.f584a + ", start=" + this.f585b + ", end=" + this.f586c + ", tag=" + this.f587d + ')';
    }

    public C0027c(int i3, int i4, Object obj, String str) {
        this.f584a = obj;
        this.f585b = i3;
        this.f586c = i4;
        this.f587d = str;
    }
}
