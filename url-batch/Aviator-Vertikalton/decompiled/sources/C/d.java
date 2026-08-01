package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f157e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f158a;

    /* renamed from: b, reason: collision with root package name */
    public final int f159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f160c;

    /* renamed from: d, reason: collision with root package name */
    public final int f161d;

    public d(int i, int i2, int i3, int i4) {
        this.f158a = i;
        this.f159b = i2;
        this.f160c = i3;
        this.f161d = i4;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f158a, dVar2.f158a), Math.max(dVar.f159b, dVar2.f159b), Math.max(dVar.f160c, dVar2.f160c), Math.max(dVar.f161d, dVar2.f161d));
    }

    public static d b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f157e : new d(i, i2, i3, i4);
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
        return c.a(this.f158a, this.f159b, this.f160c, this.f161d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f161d == dVar.f161d && this.f158a == dVar.f158a && this.f160c == dVar.f160c && this.f159b == dVar.f159b;
    }

    public final int hashCode() {
        return (((((this.f158a * 31) + this.f159b) * 31) + this.f160c) * 31) + this.f161d;
    }

    public final String toString() {
        return "Insets{left=" + this.f158a + ", top=" + this.f159b + ", right=" + this.f160c + ", bottom=" + this.f161d + '}';
    }
}
