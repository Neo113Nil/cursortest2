package f0;

import android.graphics.Insets;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1265e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1266a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1267b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1268c;
    public final int d;

    public c(int i, int i4, int i5, int i6) {
        this.f1266a = i;
        this.f1267b = i4;
        this.f1268c = i5;
        this.d = i6;
    }

    public static c a(c cVar, c cVar2) {
        return c(Math.max(cVar.f1266a, cVar2.f1266a), Math.max(cVar.f1267b, cVar2.f1267b), Math.max(cVar.f1268c, cVar2.f1268c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(c cVar, c cVar2) {
        return c(Math.min(cVar.f1266a, cVar2.f1266a), Math.min(cVar.f1267b, cVar2.f1267b), Math.min(cVar.f1268c, cVar2.f1268c), Math.min(cVar.d, cVar2.d));
    }

    public static c c(int i, int i4, int i5, int i6) {
        return (i == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f1265e : new c(i, i4, i5, i6);
    }

    public static c d(Insets insets) {
        int i;
        int i4;
        int i5;
        int i6;
        i = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return c(i, i4, i5, i6);
    }

    public final Insets e() {
        return b.a(this.f1266a, this.f1267b, this.f1268c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f1266a == cVar.f1266a && this.f1268c == cVar.f1268c && this.f1267b == cVar.f1267b;
    }

    public final int hashCode() {
        return (((((this.f1266a * 31) + this.f1267b) * 31) + this.f1268c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1266a + ", top=" + this.f1267b + ", right=" + this.f1268c + ", bottom=" + this.d + '}';
    }
}
