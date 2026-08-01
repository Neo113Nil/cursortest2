package E;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f161e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f162a;

    /* renamed from: b, reason: collision with root package name */
    public final int f163b;

    /* renamed from: c, reason: collision with root package name */
    public final int f164c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f162a = i;
        this.f163b = i2;
        this.f164c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f162a, cVar2.f162a), Math.max(cVar.f163b, cVar2.f163b), Math.max(cVar.f164c, cVar2.f164c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f161e : new c(i, i2, i3, i4);
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
        return b.a(this.f162a, this.f163b, this.f164c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f162a == cVar.f162a && this.f164c == cVar.f164c && this.f163b == cVar.f163b;
    }

    public final int hashCode() {
        return (((((this.f162a * 31) + this.f163b) * 31) + this.f164c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f162a + ", top=" + this.f163b + ", right=" + this.f164c + ", bottom=" + this.d + '}';
    }
}
