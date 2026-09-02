package x;

import android.graphics.Insets;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1513b f15954e = new C1513b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f15955a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15956b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15957c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15958d;

    public C1513b(int i4, int i5, int i6, int i7) {
        this.f15955a = i4;
        this.f15956b = i5;
        this.f15957c = i6;
        this.f15958d = i7;
    }

    public static C1513b a(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f15954e : new C1513b(i4, i5, i6, i7);
    }

    public static C1513b b(Insets insets) {
        int i4;
        int i5;
        int i6;
        int i7;
        i4 = insets.left;
        i5 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return a(i4, i5, i6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1513b.class != obj.getClass()) {
            return false;
        }
        C1513b c1513b = (C1513b) obj;
        return this.f15958d == c1513b.f15958d && this.f15955a == c1513b.f15955a && this.f15957c == c1513b.f15957c && this.f15956b == c1513b.f15956b;
    }

    public final int hashCode() {
        return (((((this.f15955a * 31) + this.f15956b) * 31) + this.f15957c) * 31) + this.f15958d;
    }

    public final String toString() {
        return "Insets{left=" + this.f15955a + ", top=" + this.f15956b + ", right=" + this.f15957c + ", bottom=" + this.f15958d + '}';
    }
}
