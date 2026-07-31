package l;

import m.InterfaceC0615z;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final float f5436a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0615z f5437b;

    public H(float f3, InterfaceC0615z interfaceC0615z) {
        this.f5436a = f3;
        this.f5437b = interfaceC0615z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return Float.compare(this.f5436a, h3.f5436a) == 0 && Z1.i.a(this.f5437b, h3.f5437b);
    }

    public final int hashCode() {
        return this.f5437b.hashCode() + (Float.hashCode(this.f5436a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f5436a + ", animationSpec=" + this.f5437b + ')';
    }
}
