package D;

import A.AbstractC0017m;

/* renamed from: D.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133g0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1795a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1796b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1797c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1798d;

    public C0133g0(float f4, float f5, float f6, float f7) {
        this.f1795a = f4;
        this.f1796b = f5;
        this.f1797c = f6;
        this.f1798d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0133g0)) {
            return false;
        }
        C0133g0 c0133g0 = (C0133g0) obj;
        if (M0.e.a(this.f1795a, c0133g0.f1795a) && M0.e.a(this.f1796b, c0133g0.f1796b) && M0.e.a(this.f1797c, c0133g0.f1797c)) {
            return M0.e.a(this.f1798d, c0133g0.f1798d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1798d) + AbstractC0017m.a(this.f1797c, AbstractC0017m.a(this.f1796b, Float.hashCode(this.f1795a) * 31, 31), 31);
    }
}
