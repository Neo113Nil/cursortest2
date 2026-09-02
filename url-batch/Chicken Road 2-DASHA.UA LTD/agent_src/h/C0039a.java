package h;

import android.graphics.Insets;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0039a f529e = new C0039a(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f530a;

    /* renamed from: b, reason: collision with root package name */
    public final int f531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f532c;

    /* renamed from: d, reason: collision with root package name */
    public final int f533d;

    public C0039a(int i2, int i3, int i4, int i5) {
        this.f530a = i2;
        this.f531b = i3;
        this.f532c = i4;
        this.f533d = i5;
    }

    public static C0039a a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f529e : new C0039a(i2, i3, i4, i5);
    }

    public static C0039a b(Insets insets) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0039a.class != obj.getClass()) {
            return false;
        }
        C0039a c0039a = (C0039a) obj;
        return this.f533d == c0039a.f533d && this.f530a == c0039a.f530a && this.f532c == c0039a.f532c && this.f531b == c0039a.f531b;
    }

    public final int hashCode() {
        return (((((this.f530a * 31) + this.f531b) * 31) + this.f532c) * 31) + this.f533d;
    }

    public final String toString() {
        return "Insets{left=" + this.f530a + ", top=" + this.f531b + ", right=" + this.f532c + ", bottom=" + this.f533d + '}';
    }
}
