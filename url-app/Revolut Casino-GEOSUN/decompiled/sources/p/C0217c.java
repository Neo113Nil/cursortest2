package p;

import android.graphics.Insets;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0217c f2807e = new C0217c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2808a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2809b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2810c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2811d;

    public C0217c(int i2, int i3, int i4, int i5) {
        this.f2808a = i2;
        this.f2809b = i3;
        this.f2810c = i4;
        this.f2811d = i5;
    }

    public static C0217c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2807e : new C0217c(i2, i3, i4, i5);
    }

    public static C0217c b(Insets insets) {
        int i2;
        int i3;
        int i4;
        int i5;
        i2 = insets.left;
        i3 = insets.top;
        i4 = insets.right;
        i5 = insets.bottom;
        return a(i2, i3, i4, i5);
    }

    public final Insets c() {
        return AbstractC0216b.a(this.f2808a, this.f2809b, this.f2810c, this.f2811d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0217c.class != obj.getClass()) {
            return false;
        }
        C0217c c0217c = (C0217c) obj;
        return this.f2811d == c0217c.f2811d && this.f2808a == c0217c.f2808a && this.f2810c == c0217c.f2810c && this.f2809b == c0217c.f2809b;
    }

    public final int hashCode() {
        return (((((this.f2808a * 31) + this.f2809b) * 31) + this.f2810c) * 31) + this.f2811d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2808a + ", top=" + this.f2809b + ", right=" + this.f2810c + ", bottom=" + this.f2811d + '}';
    }
}
