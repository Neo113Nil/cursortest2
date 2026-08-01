package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f57e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f58a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f58a = i;
        this.f59b = i2;
        this.f60c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f58a, cVar2.f58a), Math.max(cVar.f59b, cVar2.f59b), Math.max(cVar.f60c, cVar2.f60c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f57e : new c(i, i2, i3, i4);
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
        return b.a(this.f58a, this.f59b, this.f60c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f58a == cVar.f58a && this.f60c == cVar.f60c && this.f59b == cVar.f59b;
    }

    public final int hashCode() {
        return (((((this.f58a * 31) + this.f59b) * 31) + this.f60c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f58a + ", top=" + this.f59b + ", right=" + this.f60c + ", bottom=" + this.d + '}';
    }
}
