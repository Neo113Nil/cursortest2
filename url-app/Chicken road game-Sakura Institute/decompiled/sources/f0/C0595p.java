package f0;

import A.AbstractC0017m;

/* renamed from: f0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595p extends AbstractC0571B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6430c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6431d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6432e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6433f;

    public C0595p(float f4, float f5, float f6, float f7) {
        super(2, true, false);
        this.f6430c = f4;
        this.f6431d = f5;
        this.f6432e = f6;
        this.f6433f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0595p)) {
            return false;
        }
        C0595p c0595p = (C0595p) obj;
        return Float.compare(this.f6430c, c0595p.f6430c) == 0 && Float.compare(this.f6431d, c0595p.f6431d) == 0 && Float.compare(this.f6432e, c0595p.f6432e) == 0 && Float.compare(this.f6433f, c0595p.f6433f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6433f) + AbstractC0017m.a(this.f6432e, AbstractC0017m.a(this.f6431d, Float.hashCode(this.f6430c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f6430c);
        sb.append(", y1=");
        sb.append(this.f6431d);
        sb.append(", x2=");
        sb.append(this.f6432e);
        sb.append(", y2=");
        return AbstractC0017m.k(sb, this.f6433f, ')');
    }
}
