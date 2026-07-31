package E;

/* renamed from: E.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080h {

    /* renamed from: a, reason: collision with root package name */
    public final float f960a;

    /* renamed from: b, reason: collision with root package name */
    public final float f961b;

    /* renamed from: c, reason: collision with root package name */
    public final float f962c;

    /* renamed from: d, reason: collision with root package name */
    public final float f963d;

    public C0080h(float f3, float f4, float f5, float f6) {
        this.f960a = f3;
        this.f961b = f4;
        this.f962c = f5;
        this.f963d = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0080h)) {
            return false;
        }
        C0080h c0080h = (C0080h) obj;
        return this.f960a == c0080h.f960a && this.f961b == c0080h.f961b && this.f962c == c0080h.f962c && this.f963d == c0080h.f963d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f963d) + A.k.a(this.f962c, A.k.a(this.f961b, Float.hashCode(this.f960a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f960a);
        sb.append(", focusedAlpha=");
        sb.append(this.f961b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f962c);
        sb.append(", pressedAlpha=");
        return A.k.i(sb, this.f963d, ')');
    }
}
