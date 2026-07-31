package w;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f6126e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f6127a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6129c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6130d;

    public c(int i7, int i8, int i9, int i10) {
        this.f6127a = i7;
        this.f6128b = i8;
        this.f6129c = i9;
        this.f6130d = i10;
    }

    public static c a(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f6126e : new c(i7, i8, i9, i10);
    }

    public static c b(Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return a(i7, i8, i9, i10);
    }

    public final Insets c() {
        return b.a(this.f6127a, this.f6128b, this.f6129c, this.f6130d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6130d == cVar.f6130d && this.f6127a == cVar.f6127a && this.f6129c == cVar.f6129c && this.f6128b == cVar.f6128b;
    }

    public final int hashCode() {
        return (((((this.f6127a * 31) + this.f6128b) * 31) + this.f6129c) * 31) + this.f6130d;
    }

    public final String toString() {
        return "Insets{left=" + this.f6127a + ", top=" + this.f6128b + ", right=" + this.f6129c + ", bottom=" + this.f6130d + '}';
    }
}
