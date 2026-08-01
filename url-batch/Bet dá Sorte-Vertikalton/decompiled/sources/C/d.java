package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f141e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f143b;

    /* renamed from: c, reason: collision with root package name */
    public final int f144c;
    public final int d;

    public d(int i, int i2, int i3, int i4) {
        this.f142a = i;
        this.f143b = i2;
        this.f144c = i3;
        this.d = i4;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f142a, dVar2.f142a), Math.max(dVar.f143b, dVar2.f143b), Math.max(dVar.f144c, dVar2.f144c), Math.max(dVar.d, dVar2.d));
    }

    public static d b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f141e : new d(i, i2, i3, i4);
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
        return c.a(this.f142a, this.f143b, this.f144c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.d == dVar.d && this.f142a == dVar.f142a && this.f144c == dVar.f144c && this.f143b == dVar.f143b;
    }

    public final int hashCode() {
        return (((((this.f142a * 31) + this.f143b) * 31) + this.f144c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f142a + ", top=" + this.f143b + ", right=" + this.f144c + ", bottom=" + this.d + '}';
    }
}
