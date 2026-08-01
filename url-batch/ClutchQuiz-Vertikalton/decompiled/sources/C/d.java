package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f93e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f94a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96c;
    public final int d;

    public d(int i, int i2, int i3, int i4) {
        this.f94a = i;
        this.f95b = i2;
        this.f96c = i3;
        this.d = i4;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f94a, dVar2.f94a), Math.max(dVar.f95b, dVar2.f95b), Math.max(dVar.f96c, dVar2.f96c), Math.max(dVar.d, dVar2.d));
    }

    public static d b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f93e : new d(i, i2, i3, i4);
    }

    public static d c(Insets insets) {
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
        return c.a(this.f94a, this.f95b, this.f96c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.d == dVar.d && this.f94a == dVar.f94a && this.f96c == dVar.f96c && this.f95b == dVar.f95b;
    }

    public final int hashCode() {
        return (((((this.f94a * 31) + this.f95b) * 31) + this.f96c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f94a + ", top=" + this.f95b + ", right=" + this.f96c + ", bottom=" + this.d + '}';
    }
}
