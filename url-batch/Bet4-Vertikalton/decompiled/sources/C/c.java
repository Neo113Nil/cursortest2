package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f106e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108b;

    /* renamed from: c, reason: collision with root package name */
    public final int f109c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.f107a = i;
        this.f108b = i2;
        this.f109c = i3;
        this.d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f107a, cVar2.f107a), Math.max(cVar.f108b, cVar2.f108b), Math.max(cVar.f109c, cVar2.f109c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f106e : new c(i, i2, i3, i4);
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
        return b.a(this.f107a, this.f108b, this.f109c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f107a == cVar.f107a && this.f109c == cVar.f109c && this.f108b == cVar.f108b;
    }

    public final int hashCode() {
        return (((((this.f107a * 31) + this.f108b) * 31) + this.f109c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f107a + ", top=" + this.f108b + ", right=" + this.f109c + ", bottom=" + this.d + '}';
    }
}
