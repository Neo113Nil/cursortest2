package h;

import android.graphics.Insets;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f369e = new a(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f370a;

    /* renamed from: b, reason: collision with root package name */
    public final int f371b;

    /* renamed from: c, reason: collision with root package name */
    public final int f372c;

    /* renamed from: d, reason: collision with root package name */
    public final int f373d;

    public a(int i2, int i3, int i4, int i5) {
        this.f370a = i2;
        this.f371b = i3;
        this.f372c = i4;
        this.f373d = i5;
    }

    public static a a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f369e : new a(i2, i3, i4, i5);
    }

    public static a b(Insets insets) {
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f373d == aVar.f373d && this.f370a == aVar.f370a && this.f372c == aVar.f372c && this.f371b == aVar.f371b;
    }

    public final int hashCode() {
        return (((((this.f370a * 31) + this.f371b) * 31) + this.f372c) * 31) + this.f373d;
    }

    public final String toString() {
        return "Insets{left=" + this.f370a + ", top=" + this.f371b + ", right=" + this.f372c + ", bottom=" + this.f373d + '}';
    }
}
