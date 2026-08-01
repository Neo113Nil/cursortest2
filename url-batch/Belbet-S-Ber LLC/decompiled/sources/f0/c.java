package f0;

import android.graphics.Insets;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1414e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1416b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1417c;
    public final int d;

    public c(int i, int i4, int i5, int i6) {
        this.f1415a = i;
        this.f1416b = i4;
        this.f1417c = i5;
        this.d = i6;
    }

    public static c a(c cVar, c cVar2) {
        return c(Math.max(cVar.f1415a, cVar2.f1415a), Math.max(cVar.f1416b, cVar2.f1416b), Math.max(cVar.f1417c, cVar2.f1417c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(c cVar, c cVar2) {
        return c(Math.min(cVar.f1415a, cVar2.f1415a), Math.min(cVar.f1416b, cVar2.f1416b), Math.min(cVar.f1417c, cVar2.f1417c), Math.min(cVar.d, cVar2.d));
    }

    public static c c(int i, int i4, int i5, int i6) {
        return (i == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f1414e : new c(i, i4, i5, i6);
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
        return b.b(this.f1415a, this.f1416b, this.f1417c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f1415a == cVar.f1415a && this.f1417c == cVar.f1417c && this.f1416b == cVar.f1416b;
    }

    public final int hashCode() {
        return (((((this.f1415a * 31) + this.f1416b) * 31) + this.f1417c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1415a + ", top=" + this.f1416b + ", right=" + this.f1417c + ", bottom=" + this.d + '}';
    }
}
