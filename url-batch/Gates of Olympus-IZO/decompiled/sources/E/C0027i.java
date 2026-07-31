package E;

import H2.AbstractC0080b;

/* renamed from: E.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027i {

    /* renamed from: a, reason: collision with root package name */
    public final float f660a;

    /* renamed from: b, reason: collision with root package name */
    public final float f661b;

    /* renamed from: c, reason: collision with root package name */
    public final float f662c;

    /* renamed from: d, reason: collision with root package name */
    public final float f663d;

    public C0027i(float f3, float f4, float f5, float f6) {
        this.f660a = f3;
        this.f661b = f4;
        this.f662c = f5;
        this.f663d = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0027i)) {
            return false;
        }
        C0027i c0027i = (C0027i) obj;
        return this.f660a == c0027i.f660a && this.f661b == c0027i.f661b && this.f662c == c0027i.f662c && this.f663d == c0027i.f663d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f663d) + AbstractC0080b.a(this.f662c, AbstractC0080b.a(this.f661b, Float.hashCode(this.f660a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f660a);
        sb.append(", focusedAlpha=");
        sb.append(this.f661b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f662c);
        sb.append(", pressedAlpha=");
        return AbstractC0080b.j(sb, this.f663d, ')');
    }
}
