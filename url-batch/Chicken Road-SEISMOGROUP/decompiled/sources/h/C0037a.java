package h;

import android.graphics.Insets;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0037a f585e = new C0037a(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f586a;

    /* renamed from: b, reason: collision with root package name */
    public final int f587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f588c;

    /* renamed from: d, reason: collision with root package name */
    public final int f589d;

    public C0037a(int i2, int i3, int i4, int i5) {
        this.f586a = i2;
        this.f587b = i3;
        this.f588c = i4;
        this.f589d = i5;
    }

    public static C0037a a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f585e : new C0037a(i2, i3, i4, i5);
    }

    public static C0037a b(Insets insets) {
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
        if (obj == null || C0037a.class != obj.getClass()) {
            return false;
        }
        C0037a c0037a = (C0037a) obj;
        return this.f589d == c0037a.f589d && this.f586a == c0037a.f586a && this.f588c == c0037a.f588c && this.f587b == c0037a.f587b;
    }

    public final int hashCode() {
        return (((((this.f586a * 31) + this.f587b) * 31) + this.f588c) * 31) + this.f589d;
    }

    public final String toString() {
        return "Insets{left=" + this.f586a + ", top=" + this.f587b + ", right=" + this.f588c + ", bottom=" + this.f589d + '}';
    }
}
