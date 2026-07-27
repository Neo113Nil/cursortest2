package k;

import kotlin.jvm.internal.Intrinsics;
import l.InterfaceC0799z;

/* renamed from: k.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732H {

    /* renamed from: a, reason: collision with root package name */
    public final float f7257a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0799z f7258b;

    public C0732H(float f4, InterfaceC0799z interfaceC0799z) {
        this.f7257a = f4;
        this.f7258b = interfaceC0799z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0732H)) {
            return false;
        }
        C0732H c0732h = (C0732H) obj;
        return Float.compare(this.f7257a, c0732h.f7257a) == 0 && Intrinsics.a(this.f7258b, c0732h.f7258b);
    }

    public final int hashCode() {
        return this.f7258b.hashCode() + (Float.hashCode(this.f7257a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f7257a + ", animationSpec=" + this.f7258b + ')';
    }
}
