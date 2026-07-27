package C;

import A.AbstractC0017m;

/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113h {

    /* renamed from: a, reason: collision with root package name */
    public final float f1089a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1090b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1091c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1092d;

    public C0113h(float f4, float f5, float f6, float f7) {
        this.f1089a = f4;
        this.f1090b = f5;
        this.f1091c = f6;
        this.f1092d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0113h)) {
            return false;
        }
        C0113h c0113h = (C0113h) obj;
        return this.f1089a == c0113h.f1089a && this.f1090b == c0113h.f1090b && this.f1091c == c0113h.f1091c && this.f1092d == c0113h.f1092d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1092d) + AbstractC0017m.a(this.f1091c, AbstractC0017m.a(this.f1090b, Float.hashCode(this.f1089a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f1089a);
        sb.append(", focusedAlpha=");
        sb.append(this.f1090b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f1091c);
        sb.append(", pressedAlpha=");
        return AbstractC0017m.k(sb, this.f1092d, ')');
    }
}
