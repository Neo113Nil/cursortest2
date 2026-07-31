package F;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1054a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1055b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1056c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1057d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1058e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1059f;

    public M0(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f1054a = f3;
        this.f1055b = f4;
        this.f1056c = f5;
        this.f1057d = f6;
        this.f1058e = f7;
        this.f1059f = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        return M0.e.a(this.f1054a, m02.f1054a) && M0.e.a(this.f1055b, m02.f1055b) && M0.e.a(this.f1056c, m02.f1056c) && M0.e.a(this.f1057d, m02.f1057d) && M0.e.a(this.f1059f, m02.f1059f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1059f) + AbstractC0080b.a(this.f1057d, AbstractC0080b.a(this.f1056c, AbstractC0080b.a(this.f1055b, Float.hashCode(this.f1054a) * 31, 31), 31), 31);
    }
}
