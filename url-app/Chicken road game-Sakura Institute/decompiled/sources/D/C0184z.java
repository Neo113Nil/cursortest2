package D;

import A.AbstractC0017m;

/* renamed from: D.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184z {

    /* renamed from: a, reason: collision with root package name */
    public final float f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2120b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2121c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2122d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2123e;

    public C0184z(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f2119a = f4;
        this.f2120b = f5;
        this.f2121c = f6;
        this.f2122d = f7;
        this.f2123e = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0184z)) {
            return false;
        }
        C0184z c0184z = (C0184z) obj;
        return M0.e.a(this.f2119a, c0184z.f2119a) && M0.e.a(this.f2120b, c0184z.f2120b) && M0.e.a(this.f2121c, c0184z.f2121c) && M0.e.a(this.f2122d, c0184z.f2122d) && M0.e.a(this.f2123e, c0184z.f2123e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2123e) + AbstractC0017m.a(this.f2122d, AbstractC0017m.a(this.f2121c, AbstractC0017m.a(this.f2120b, Float.hashCode(this.f2119a) * 31, 31), 31), 31);
    }
}
