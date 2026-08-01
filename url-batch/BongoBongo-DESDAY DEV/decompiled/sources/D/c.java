package D;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f113e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115b;

    /* renamed from: c, reason: collision with root package name */
    public final int f116c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f114a = i;
        this.f115b = i2;
        this.f116c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f114a, cVar2.f114a), Math.max(cVar.f115b, cVar2.f115b), Math.max(cVar.f116c, cVar2.f116c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f113e : new c(i, i2, i3, i4);
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
        return b.a(this.f114a, this.f115b, this.f116c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f114a == cVar.f114a && this.f116c == cVar.f116c && this.f115b == cVar.f115b;
    }

    public final int hashCode() {
        return (((((this.f114a * 31) + this.f115b) * 31) + this.f116c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f114a + ", top=" + this.f115b + ", right=" + this.f116c + ", bottom=" + this.d + '}';
    }
}
