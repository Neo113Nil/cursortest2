package r;

import android.graphics.Insets;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0224c f2960e = new C0224c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2962b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2963c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2964d;

    public C0224c(int i2, int i3, int i4, int i5) {
        this.f2961a = i2;
        this.f2962b = i3;
        this.f2963c = i4;
        this.f2964d = i5;
    }

    public static C0224c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2960e : new C0224c(i2, i3, i4, i5);
    }

    public static C0224c b(Insets insets) {
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
        return AbstractC0223b.a(this.f2961a, this.f2962b, this.f2963c, this.f2964d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0224c.class != obj.getClass()) {
            return false;
        }
        C0224c c0224c = (C0224c) obj;
        return this.f2964d == c0224c.f2964d && this.f2961a == c0224c.f2961a && this.f2963c == c0224c.f2963c && this.f2962b == c0224c.f2962b;
    }

    public final int hashCode() {
        return (((((this.f2961a * 31) + this.f2962b) * 31) + this.f2963c) * 31) + this.f2964d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2961a + ", top=" + this.f2962b + ", right=" + this.f2963c + ", bottom=" + this.f2964d + '}';
    }
}
