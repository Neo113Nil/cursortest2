package D;

import A.AbstractC0017m;

/* renamed from: D.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137h1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1813a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1814b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1815c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1816d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1817e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1818f;

    public C0137h1(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f1813a = f4;
        this.f1814b = f5;
        this.f1815c = f6;
        this.f1816d = f7;
        this.f1817e = f8;
        this.f1818f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0137h1)) {
            return false;
        }
        C0137h1 c0137h1 = (C0137h1) obj;
        return M0.e.a(this.f1813a, c0137h1.f1813a) && M0.e.a(this.f1814b, c0137h1.f1814b) && M0.e.a(this.f1815c, c0137h1.f1815c) && M0.e.a(this.f1816d, c0137h1.f1816d) && M0.e.a(this.f1818f, c0137h1.f1818f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1818f) + AbstractC0017m.a(this.f1816d, AbstractC0017m.a(this.f1815c, AbstractC0017m.a(this.f1814b, Float.hashCode(this.f1813a) * 31, 31), 31), 31);
    }
}
