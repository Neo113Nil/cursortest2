package t;

import android.graphics.Insets;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0307c f3436e = new C0307c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3439c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3440d;

    public C0307c(int i2, int i3, int i4, int i5) {
        this.f3437a = i2;
        this.f3438b = i3;
        this.f3439c = i4;
        this.f3440d = i5;
    }

    public static C0307c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f3436e : new C0307c(i2, i3, i4, i5);
    }

    public final Insets b() {
        return AbstractC0306b.a(this.f3437a, this.f3438b, this.f3439c, this.f3440d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0307c.class != obj.getClass()) {
            return false;
        }
        C0307c c0307c = (C0307c) obj;
        return this.f3440d == c0307c.f3440d && this.f3437a == c0307c.f3437a && this.f3439c == c0307c.f3439c && this.f3438b == c0307c.f3438b;
    }

    public final int hashCode() {
        return (((((this.f3437a * 31) + this.f3438b) * 31) + this.f3439c) * 31) + this.f3440d;
    }

    public final String toString() {
        return "Insets{left=" + this.f3437a + ", top=" + this.f3438b + ", right=" + this.f3439c + ", bottom=" + this.f3440d + '}';
    }
}
