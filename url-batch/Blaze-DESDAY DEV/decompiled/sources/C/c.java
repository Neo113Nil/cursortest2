package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f71e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f72a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f72a = i;
        this.f73b = i2;
        this.f74c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f72a, cVar2.f72a), Math.max(cVar.f73b, cVar2.f73b), Math.max(cVar.f74c, cVar2.f74c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f71e : new c(i, i2, i3, i4);
    }

    public static c c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return b.a(this.f72a, this.f73b, this.f74c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f72a == cVar.f72a && this.f74c == cVar.f74c && this.f73b == cVar.f73b;
    }

    public final int hashCode() {
        return (((((this.f72a * 31) + this.f73b) * 31) + this.f74c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f72a + ", top=" + this.f73b + ", right=" + this.f74c + ", bottom=" + this.d + '}';
    }
}
