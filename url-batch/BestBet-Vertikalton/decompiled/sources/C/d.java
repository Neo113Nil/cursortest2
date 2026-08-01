package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f67e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f68a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70c;
    public final int d;

    public d(int i, int i2, int i3, int i4) {
        this.f68a = i;
        this.f69b = i2;
        this.f70c = i3;
        this.d = i4;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f68a, dVar2.f68a), Math.max(dVar.f69b, dVar2.f69b), Math.max(dVar.f70c, dVar2.f70c), Math.max(dVar.d, dVar2.d));
    }

    public static d b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f67e : new d(i, i2, i3, i4);
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
        return c.a(this.f68a, this.f69b, this.f70c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.d == dVar.d && this.f68a == dVar.f68a && this.f70c == dVar.f70c && this.f69b == dVar.f69b;
    }

    public final int hashCode() {
        return (((((this.f68a * 31) + this.f69b) * 31) + this.f70c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f68a + ", top=" + this.f69b + ", right=" + this.f70c + ", bottom=" + this.d + '}';
    }
}
