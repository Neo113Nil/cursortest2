package l;

import m.InterfaceC0640z;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final float f6457a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0640z f6458b;

    public I(float f3, InterfaceC0640z interfaceC0640z) {
        this.f6457a = f3;
        this.f6458b = interfaceC0640z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return Float.compare(this.f6457a, i3.f6457a) == 0 && f2.j.a(this.f6458b, i3.f6458b);
    }

    public final int hashCode() {
        return this.f6458b.hashCode() + (Float.hashCode(this.f6457a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f6457a + ", animationSpec=" + this.f6458b + ')';
    }
}
