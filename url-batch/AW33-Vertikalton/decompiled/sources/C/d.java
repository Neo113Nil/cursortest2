package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f147e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150c;
    public final int d;

    public d(int i, int i2, int i3, int i4) {
        this.f148a = i;
        this.f149b = i2;
        this.f150c = i3;
        this.d = i4;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f148a, dVar2.f148a), Math.max(dVar.f149b, dVar2.f149b), Math.max(dVar.f150c, dVar2.f150c), Math.max(dVar.d, dVar2.d));
    }

    public static d b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f147e : new d(i, i2, i3, i4);
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
        return c.a(this.f148a, this.f149b, this.f150c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.d == dVar.d && this.f148a == dVar.f148a && this.f150c == dVar.f150c && this.f149b == dVar.f149b;
    }

    public final int hashCode() {
        return (((((this.f148a * 31) + this.f149b) * 31) + this.f150c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f148a + ", top=" + this.f149b + ", right=" + this.f150c + ", bottom=" + this.d + '}';
    }
}
